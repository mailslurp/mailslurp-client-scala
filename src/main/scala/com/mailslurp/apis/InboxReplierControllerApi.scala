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

import com.mailslurp.modelspackageVersion&#x3D;15.19.12.CreateInboxReplierOptions
import com.mailslurp.modelspackageVersion&#x3D;15.19.12.InboxReplierDto
import java.time.OffsetDateTime
import com.mailslurp.modelspackageVersion&#x3D;15.19.12.PageInboxReplierDto
import com.mailslurp.modelspackageVersion&#x3D;15.19.12.PageInboxReplierEvents
import java.util.UUID
import com.mailslurp.modelspackageVersion&#x3D;15.19.12.UpdateInboxReplierOptions
import com.mailslurp.client.core.JsonSupport._
import sttp.client._
import sttp.model.Method

object InboxReplierControllerApi {

def apply(baseUrl: String = "https://api.mailslurp.com") = new InboxReplierControllerApi(baseUrl)
}

class InboxReplierControllerApi(baseUrl: String) {

  /**
   * Create a new inbox rule for reply toing, blocking, and allowing emails when sending and receiving
   * 
   * Expected answers:
   *   code 200 : InboxReplierDto (OK)
   * 
   * Available security schemes:
   *   API_KEY (apiKey)
   * 
   * @param createInboxReplierOptions 
   */
  def createNewInboxReplier(apiKey: String)(createInboxReplierOptions: CreateInboxReplierOptions
): Request[Either[ResponseError[Exception], InboxReplierDto], Nothing] =
    basicRequest
      .method(Method.POST, uri"$baseUrl/repliers")
      .contentType("application/json")
      .header("x-api-key", apiKey)
      .body(createInboxReplierOptions)
      .response(asJson[InboxReplierDto])

  /**
   * Delete inbox replier
   * 
   * Expected answers:
   *   code 204 :  (No Content)
   * 
   * Available security schemes:
   *   API_KEY (apiKey)
   * 
   * @param id ID of inbox replier
   */
  def deleteInboxReplier(apiKey: String)(id: UUID
): Request[Either[ResponseError[Exception], Unit], Nothing] =
    basicRequest
      .method(Method.DELETE, uri"$baseUrl/repliers/${id}")
      .contentType("application/json")
      .header("x-api-key", apiKey)
      .response(asJson[Unit])

  /**
   * Delete inbox repliers. Accepts optional inboxId filter.
   * 
   * Expected answers:
   *   code 204 :  (No Content)
   * 
   * Available security schemes:
   *   API_KEY (apiKey)
   * 
   * @param inboxId Optional inbox id to attach replier to
   */
  def deleteInboxRepliers(apiKey: String)(inboxId: Option[UUID] = None
): Request[Either[ResponseError[Exception], Unit], Nothing] =
    basicRequest
      .method(Method.DELETE, uri"$baseUrl/repliers?inboxId=${ inboxId }")
      .contentType("application/json")
      .header("x-api-key", apiKey)
      .response(asJson[Unit])

  /**
   * Get inbox ruleset
   * 
   * Expected answers:
   *   code 200 : InboxReplierDto (OK)
   * 
   * Available security schemes:
   *   API_KEY (apiKey)
   * 
   * @param id ID of inbox replier
   */
  def getInboxReplier(apiKey: String)(id: UUID
): Request[Either[ResponseError[Exception], InboxReplierDto], Nothing] =
    basicRequest
      .method(Method.GET, uri"$baseUrl/repliers/${id}")
      .contentType("application/json")
      .header("x-api-key", apiKey)
      .response(asJson[InboxReplierDto])

  /**
   * Get inbox ruleset events
   * 
   * Expected answers:
   *   code 200 : PageInboxReplierEvents (OK)
   * 
   * Available security schemes:
   *   API_KEY (apiKey)
   * 
   * @param id ID of inbox replier
   * @param page Optional page index in inbox replier event list pagination
   * @param size Optional page size in inbox replier event list pagination
   * @param sort Optional createdAt sort direction ASC or DESC
   */
  def getInboxReplierEvents(apiKey: String)(id: UUID, page: Option[Int] = None, size: Option[Int] = None, sort: Option[String] = None
): Request[Either[ResponseError[Exception], PageInboxReplierEvents], Nothing] =
    basicRequest
      .method(Method.GET, uri"$baseUrl/repliers/${id}/events?page=${ page }&size=${ size }&sort=${ sort }")
      .contentType("application/json")
      .header("x-api-key", apiKey)
      .response(asJson[PageInboxReplierEvents])

  /**
   * List all repliers attached to an inbox
   * 
   * Expected answers:
   *   code 200 : PageInboxReplierDto (OK)
   * 
   * Available security schemes:
   *   API_KEY (apiKey)
   * 
   * @param inboxId Optional inbox id to get repliers from
   * @param page Optional page index in inbox replier list pagination
   * @param size Optional page size in inbox replier list pagination
   * @param sort Optional createdAt sort direction ASC or DESC
   * @param since Filter by created at after the given timestamp
   * @param before Filter by created at before the given timestamp
   */
  def getInboxRepliers(apiKey: String)(inboxId: Option[UUID] = None, page: Option[Int] = None, size: Option[Int] = None, sort: Option[String] = None, since: Option[OffsetDateTime] = None, before: Option[OffsetDateTime] = None
): Request[Either[ResponseError[Exception], PageInboxReplierDto], Nothing] =
    basicRequest
      .method(Method.GET, uri"$baseUrl/repliers?inboxId=${ inboxId }&page=${ page }&size=${ size }&sort=${ sort }&since=${ since }&before=${ before }")
      .contentType("application/json")
      .header("x-api-key", apiKey)
      .response(asJson[PageInboxReplierDto])

  /**
   * Update inbox ruleset
   * 
   * Expected answers:
   *   code 200 : InboxReplierDto (OK)
   * 
   * Available security schemes:
   *   API_KEY (apiKey)
   * 
   * @param id ID of inbox replier
   * @param updateInboxReplierOptions 
   */
  def updateInboxReplier(apiKey: String)(id: UUID, updateInboxReplierOptions: UpdateInboxReplierOptions
): Request[Either[ResponseError[Exception], InboxReplierDto], Nothing] =
    basicRequest
      .method(Method.PUT, uri"$baseUrl/repliers/${id}")
      .contentType("application/json")
      .header("x-api-key", apiKey)
      .body(updateInboxReplierOptions)
      .response(asJson[InboxReplierDto])

}
