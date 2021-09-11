/**
 * MailSlurp API
 * MailSlurp is an API for sending and receiving emails from dynamically allocated email addresses. It's designed for developers and QA teams to test applications, process inbound emails, send templated notifications, attachments, and more.  ## Resources  - [Homepage](https://www.mailslurp.com) - Get an [API KEY](https://app.mailslurp.com/sign-up/) - Generated [SDK Clients](https://www.mailslurp.com/docs/) - [Examples](https://github.com/mailslurp/examples) repository
 *
 * The version of the OpenAPI document: 6.5.2
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package com.mailslurp.apis

import com.mailslurp.modelspackageVersion&#x3D;14.0.0.CreateGroupOptions
import com.mailslurp.modelspackageVersion&#x3D;14.0.0.GroupContactsDto
import com.mailslurp.modelspackageVersion&#x3D;14.0.0.GroupDto
import com.mailslurp.modelspackageVersion&#x3D;14.0.0.GroupProjection
import java.time.OffsetDateTime
import com.mailslurp.modelspackageVersion&#x3D;14.0.0.PageContactProjection
import com.mailslurp.modelspackageVersion&#x3D;14.0.0.PageGroupProjection
import java.util.UUID
import com.mailslurp.modelspackageVersion&#x3D;14.0.0.UpdateGroupContacts
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
   *   code 201 :  (Created)
   *   code 401 :  (Unauthorized)
   *   code 403 :  (Forbidden)
   *   code 404 :  (Not Found)
   * 
   * Available security schemes:
   *   API_KEY (apiKey)
   * 
   * @param groupId groupId
   * @param updateGroupContactsOption updateGroupContactsOption
   */
  def addContactsToGroup(apiKey: String)(groupId: UUID, updateGroupContactsOption: UpdateGroupContacts
): Request[Either[ResponseError[Exception], GroupContactsDto], Nothing] =
    basicRequest
      .method(Method.PUT, uri"$baseUrl/groups/${groupId}/contacts")
      .contentType("application/json")
      .header("x-api-key", apiKey)
      .body(updateGroupContactsOption)
      .response(asJson[GroupContactsDto])

  /**
   * Expected answers:
   *   code 201 : GroupDto (Created)
   *   code 401 :  (Unauthorized)
   *   code 403 :  (Forbidden)
   *   code 404 :  (Not Found)
   * 
   * Available security schemes:
   *   API_KEY (apiKey)
   * 
   * @param createGroupOptions createGroupOptions
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
   *   code 401 :  (Unauthorized)
   *   code 403 :  (Forbidden)
   * 
   * Available security schemes:
   *   API_KEY (apiKey)
   * 
   * @param groupId groupId
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
   *   code 401 :  (Unauthorized)
   *   code 403 :  (Forbidden)
   *   code 404 :  (Not Found)
   * 
   * Available security schemes:
   *   API_KEY (apiKey)
   * 
   * @param before Filter by created at before the given timestamp
   * @param page Optional page index in list pagination
   * @param since Filter by created at after the given timestamp
   * @param size Optional page size in list pagination
   * @param sort Optional createdAt sort direction ASC or DESC
   */
  def getAllGroups(apiKey: String)(before: Option[OffsetDateTime] = None, page: Option[Int] = None, since: Option[OffsetDateTime] = None, size: Option[Int] = None, sort: Option[String] = None
): Request[Either[ResponseError[Exception], PageGroupProjection], Nothing] =
    basicRequest
      .method(Method.GET, uri"$baseUrl/groups/paginated?before=${ before }&page=${ page }&since=${ since }&size=${ size }&sort=${ sort }")
      .contentType("application/json")
      .header("x-api-key", apiKey)
      .response(asJson[PageGroupProjection])

  /**
   * Expected answers:
   *   code 200 : GroupDto (OK)
   *   code 401 :  (Unauthorized)
   *   code 403 :  (Forbidden)
   *   code 404 :  (Not Found)
   * 
   * Available security schemes:
   *   API_KEY (apiKey)
   * 
   * @param groupId groupId
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
   *   code 401 :  (Unauthorized)
   *   code 403 :  (Forbidden)
   *   code 404 :  (Not Found)
   * 
   * Available security schemes:
   *   API_KEY (apiKey)
   * 
   * @param groupId groupId
   */
  def getGroupWithContacts(apiKey: String)(groupId: UUID
): Request[Either[ResponseError[Exception], GroupContactsDto], Nothing] =
    basicRequest
      .method(Method.GET, uri"$baseUrl/groups/${groupId}/contacts")
      .contentType("application/json")
      .header("x-api-key", apiKey)
      .response(asJson[GroupContactsDto])

  /**
   * Expected answers:
   *   code 200 : PageContactProjection (OK)
   *   code 401 :  (Unauthorized)
   *   code 403 :  (Forbidden)
   *   code 404 :  (Not Found)
   * 
   * Available security schemes:
   *   API_KEY (apiKey)
   * 
   * @param groupId groupId
   * @param before Filter by created at before the given timestamp
   * @param page Optional page index in group contact pagination
   * @param since Filter by created at after the given timestamp
   * @param size Optional page size in group contact pagination
   * @param sort Optional createdAt sort direction ASC or DESC
   */
  def getGroupWithContactsPaginated(apiKey: String)(groupId: UUID, before: Option[OffsetDateTime] = None, page: Option[Int] = None, since: Option[OffsetDateTime] = None, size: Option[Int] = None, sort: Option[String] = None
): Request[Either[ResponseError[Exception], PageContactProjection], Nothing] =
    basicRequest
      .method(Method.GET, uri"$baseUrl/groups/${groupId}/contacts-paginated?before=${ before }&page=${ page }&since=${ since }&size=${ size }&sort=${ sort }")
      .contentType("application/json")
      .header("x-api-key", apiKey)
      .response(asJson[PageContactProjection])

  /**
   * Expected answers:
   *   code 200 : Seq[GroupProjection] (OK)
   *   code 401 :  (Unauthorized)
   *   code 403 :  (Forbidden)
   *   code 404 :  (Not Found)
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
   *   code 204 :  (No Content)
   *   code 401 :  (Unauthorized)
   *   code 403 :  (Forbidden)
   * 
   * Available security schemes:
   *   API_KEY (apiKey)
   * 
   * @param groupId groupId
   * @param updateGroupContactsOption updateGroupContactsOption
   */
  def removeContactsFromGroup(apiKey: String)(groupId: UUID, updateGroupContactsOption: UpdateGroupContacts
): Request[Either[ResponseError[Exception], GroupContactsDto], Nothing] =
    basicRequest
      .method(Method.DELETE, uri"$baseUrl/groups/${groupId}/contacts")
      .contentType("application/json")
      .header("x-api-key", apiKey)
      .body(updateGroupContactsOption)
      .response(asJson[GroupContactsDto])

}
