/**
 * MailSlurp API
 * MailSlurp is an API for sending and receiving emails and SMS from dynamically allocated email addresses and phone numbers. It's designed for developers and QA teams to test applications, process inbound emails, send templated notifications, attachments, and more.  ## Resources  - [Homepage](https://www.mailslurp.com) - Get an [API KEY](https://app.mailslurp.com/sign-up/) - Generated [SDK Clients](https://docs.mailslurp.com/) - [Examples](https://github.com/mailslurp/examples) repository
 *
 * The version of the OpenAPI document: 6.5.2
 * Contact: contact@mailslurp.dev
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package com.mailslurp.apis

import com.mailslurp.modelspackageVersion&#x3D;16.2.1.CreateGroupOptions
import com.mailslurp.modelspackageVersion&#x3D;16.2.1.GroupContactsDto
import com.mailslurp.modelspackageVersion&#x3D;16.2.1.GroupDto
import com.mailslurp.modelspackageVersion&#x3D;16.2.1.GroupProjection
import java.time.OffsetDateTime
import com.mailslurp.modelspackageVersion&#x3D;16.2.1.PageContactProjection
import com.mailslurp.modelspackageVersion&#x3D;16.2.1.PageGroupProjection
import java.util.UUID
import com.mailslurp.modelspackageVersion&#x3D;16.2.1.UpdateGroupContacts
import com.mailslurp.client.core.JsonSupport._
import sttp.client._
import sttp.model.Method

object GroupControllerApi {

def apply(baseUrl: String = "https://api.mailslurp.com") = new GroupControllerApi(baseUrl)
}

class GroupControllerApi(baseUrl: String) {

  /**
   * Expected answers:
   *   code 200 : GroupContactsDto (OK)
   * 
   * Available security schemes:
   *   API_KEY (apiKey)
   * 
   * @param groupId 
   * @param updateGroupContacts 
   */
  def addContactsToGroup(apiKey: String)(groupId: UUID, updateGroupContacts: UpdateGroupContacts
): Request[Either[ResponseError[Exception], GroupContactsDto], Nothing] =
    basicRequest
      .method(Method.PUT, uri"$baseUrl/groups/${groupId}/contacts")
      .contentType("application/json")
      .header("x-api-key", apiKey)
      .body(updateGroupContacts)
      .response(asJson[GroupContactsDto])

  /**
   * Expected answers:
   *   code 201 : GroupDto (Created)
   * 
   * Available security schemes:
   *   API_KEY (apiKey)
   * 
   * @param createGroupOptions 
   */
  def createGroup(apiKey: String)(createGroupOptions: CreateGroupOptions
): Request[Either[ResponseError[Exception], GroupDto], Nothing] =
    basicRequest
      .method(Method.POST, uri"$baseUrl/groups")
      .contentType("application/json")
      .header("x-api-key", apiKey)
      .body(createGroupOptions)
      .response(asJson[GroupDto])

  /**
   * Expected answers:
   *   code 204 :  (No Content)
   * 
   * Available security schemes:
   *   API_KEY (apiKey)
   * 
   * @param groupId 
   */
  def deleteGroup(apiKey: String)(groupId: UUID
): Request[Either[ResponseError[Exception], Unit], Nothing] =
    basicRequest
      .method(Method.DELETE, uri"$baseUrl/groups/${groupId}")
      .contentType("application/json")
      .header("x-api-key", apiKey)
      .response(asJson[Unit])

  /**
   * Expected answers:
   *   code 200 : PageGroupProjection (OK)
   * 
   * Available security schemes:
   *   API_KEY (apiKey)
   * 
   * @param page Optional page index in list pagination
   * @param size Optional page size in list pagination
   * @param sort Optional createdAt sort direction ASC or DESC
   * @param since Filter by created at after the given timestamp
   * @param before Filter by created at before the given timestamp
   */
  def getAllGroups(apiKey: String)(page: Option[Int] = None, size: Option[Int] = None, sort: Option[String] = None, since: Option[OffsetDateTime] = None, before: Option[OffsetDateTime] = None
): Request[Either[ResponseError[Exception], PageGroupProjection], Nothing] =
    basicRequest
      .method(Method.GET, uri"$baseUrl/groups/paginated?page=${ page }&size=${ size }&sort=${ sort }&since=${ since }&before=${ before }")
      .contentType("application/json")
      .header("x-api-key", apiKey)
      .response(asJson[PageGroupProjection])

  /**
   * Expected answers:
   *   code 200 : GroupDto (OK)
   * 
   * Available security schemes:
   *   API_KEY (apiKey)
   * 
   * @param groupId 
   */
  def getGroup(apiKey: String)(groupId: UUID
): Request[Either[ResponseError[Exception], GroupDto], Nothing] =
    basicRequest
      .method(Method.GET, uri"$baseUrl/groups/${groupId}")
      .contentType("application/json")
      .header("x-api-key", apiKey)
      .response(asJson[GroupDto])

  /**
   * Expected answers:
   *   code 200 : GroupContactsDto (OK)
   * 
   * Available security schemes:
   *   API_KEY (apiKey)
   * 
   * @param groupId 
   */
  def getGroupWithContacts(apiKey: String)(groupId: UUID
): Request[Either[ResponseError[Exception], GroupContactsDto], Nothing] =
    basicRequest
      .method(Method.GET, uri"$baseUrl/groups/${groupId}/contacts")
      .contentType("application/json")
      .header("x-api-key", apiKey)
      .response(asJson[GroupContactsDto])

  /**
   * Get group and paginated contacts belonging to it
   * 
   * Expected answers:
   *   code 200 : PageContactProjection (OK)
   * 
   * Available security schemes:
   *   API_KEY (apiKey)
   * 
   * @param groupId 
   * @param page Optional page index in group contact pagination
   * @param size Optional page size in group contact pagination
   * @param sort Optional createdAt sort direction ASC or DESC
   * @param since Filter by created at after the given timestamp
   * @param before Filter by created at before the given timestamp
   */
  def getGroupWithContactsPaginated(apiKey: String)(groupId: UUID, page: Option[Int] = None, size: Option[Int] = None, sort: Option[String] = None, since: Option[OffsetDateTime] = None, before: Option[OffsetDateTime] = None
): Request[Either[ResponseError[Exception], PageContactProjection], Nothing] =
    basicRequest
      .method(Method.GET, uri"$baseUrl/groups/${groupId}/contacts-paginated?page=${ page }&size=${ size }&sort=${ sort }&since=${ since }&before=${ before }")
      .contentType("application/json")
      .header("x-api-key", apiKey)
      .response(asJson[PageContactProjection])

  /**
   * Expected answers:
   *   code 200 : Seq[GroupProjection] (OK)
   * 
   * Available security schemes:
   *   API_KEY (apiKey)
   */
  def getGroups(apiKey: String)(
): Request[Either[ResponseError[Exception], Seq[GroupProjection]], Nothing] =
    basicRequest
      .method(Method.GET, uri"$baseUrl/groups")
      .contentType("application/json")
      .header("x-api-key", apiKey)
      .response(asJson[Seq[GroupProjection]])

  /**
   * Expected answers:
   *   code 200 : GroupContactsDto (OK)
   * 
   * Available security schemes:
   *   API_KEY (apiKey)
   * 
   * @param groupId 
   * @param updateGroupContacts 
   */
  def removeContactsFromGroup(apiKey: String)(groupId: UUID, updateGroupContacts: UpdateGroupContacts
): Request[Either[ResponseError[Exception], GroupContactsDto], Nothing] =
    basicRequest
      .method(Method.DELETE, uri"$baseUrl/groups/${groupId}/contacts")
      .contentType("application/json")
      .header("x-api-key", apiKey)
      .body(updateGroupContacts)
      .response(asJson[GroupContactsDto])

}
