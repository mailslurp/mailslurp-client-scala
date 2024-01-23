/**
 * MailSlurp API
 * MailSlurp is an API for sending and receiving emails from dynamically allocated email addresses. It's designed for developers and QA teams to test applications, process inbound emails, send templated notifications, attachments, and more.  ## Resources  - [Homepage](https://www.mailslurp.com) - Get an [API KEY](https://app.mailslurp.com/sign-up/) - Generated [SDK Clients](https://docs.mailslurp.com/) - [Examples](https://github.com/mailslurp/examples) repository
 *
 * The version of the OpenAPI document: 6.5.2
 * Contact: contact@mailslurp.dev
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package com.mailslurp.apis

import com.mailslurp.modelspackageVersion&#x3D;15.17.30.ContactDto
import com.mailslurp.modelspackageVersion&#x3D;15.17.30.ContactProjection
import com.mailslurp.modelspackageVersion&#x3D;15.17.30.CreateContactOptions
import java.time.OffsetDateTime
import com.mailslurp.modelspackageVersion&#x3D;15.17.30.PageContactProjection
import java.util.UUID
import com.mailslurp.client.core.JsonSupport._
import sttp.client._
import sttp.model.Method

object ContactControllerApi {

def apply(baseUrl: String = "https://api.mailslurp.com") = new ContactControllerApi(baseUrl)
}

class ContactControllerApi(baseUrl: String) {

  /**
   * Expected answers:
   *   code 201 : ContactDto (Created)
   * 
   * Available security schemes:
   *   API_KEY (apiKey)
   * 
   * @param createContactOptions 
   */
  def createContact(apiKey: String)(createContactOptions: CreateContactOptions
): Request[Either[ResponseError[Exception], ContactDto], Nothing] =
    basicRequest
      .method(Method.POST, uri"$baseUrl/contacts")
      .contentType("application/json")
      .header("x-api-key", apiKey)
      .body(createContactOptions)
      .response(asJson[ContactDto])

  /**
   * Expected answers:
   *   code 204 :  (No Content)
   * 
   * Available security schemes:
   *   API_KEY (apiKey)
   * 
   * @param contactId 
   */
  def deleteContact(apiKey: String)(contactId: UUID
): Request[Either[ResponseError[Exception], Unit], Nothing] =
    basicRequest
      .method(Method.DELETE, uri"$baseUrl/contacts/${contactId}")
      .contentType("application/json")
      .header("x-api-key", apiKey)
      .response(asJson[Unit])

  /**
   * Expected answers:
   *   code 200 : PageContactProjection (OK)
   * 
   * Available security schemes:
   *   API_KEY (apiKey)
   * 
   * @param page Optional page index in list pagination
   * @param size Optional page size in list pagination
   * @param sort Optional createdAt sort direction ASC or DESC
   * @param since Filter by created at after the given timestamp
   * @param before Filter by created at before the given timestamp
   * @param search Search terms
   */
  def getAllContacts(apiKey: String)(page: Option[Int] = None, size: Option[Int] = None, sort: Option[String] = None, since: Option[OffsetDateTime] = None, before: Option[OffsetDateTime] = None, search: Option[String] = None
): Request[Either[ResponseError[Exception], PageContactProjection], Nothing] =
    basicRequest
      .method(Method.GET, uri"$baseUrl/contacts/paginated?page=${ page }&size=${ size }&sort=${ sort }&since=${ since }&before=${ before }&search=${ search }")
      .contentType("application/json")
      .header("x-api-key", apiKey)
      .response(asJson[PageContactProjection])

  /**
   * Expected answers:
   *   code 200 : ContactDto (OK)
   * 
   * Available security schemes:
   *   API_KEY (apiKey)
   * 
   * @param contactId 
   */
  def getContact(apiKey: String)(contactId: UUID
): Request[Either[ResponseError[Exception], ContactDto], Nothing] =
    basicRequest
      .method(Method.GET, uri"$baseUrl/contacts/${contactId}")
      .contentType("application/json")
      .header("x-api-key", apiKey)
      .response(asJson[ContactDto])

  /**
   * Expected answers:
   *   code 200 :  (OK)
   * 
   * Available security schemes:
   *   API_KEY (apiKey)
   * 
   * @param contactId 
   */
  def getContactVCard(apiKey: String)(contactId: UUID
): Request[Either[ResponseError[Exception], Unit], Nothing] =
    basicRequest
      .method(Method.GET, uri"$baseUrl/contacts/${contactId}/download")
      .contentType("application/json")
      .header("x-api-key", apiKey)
      .response(asJson[Unit])

  /**
   * Expected answers:
   *   code 200 : Seq[ContactProjection] (OK)
   * 
   * Available security schemes:
   *   API_KEY (apiKey)
   */
  def getContacts(apiKey: String)(
): Request[Either[ResponseError[Exception], Seq[ContactProjection]], Nothing] =
    basicRequest
      .method(Method.GET, uri"$baseUrl/contacts")
      .contentType("application/json")
      .header("x-api-key", apiKey)
      .response(asJson[Seq[ContactProjection]])

}
