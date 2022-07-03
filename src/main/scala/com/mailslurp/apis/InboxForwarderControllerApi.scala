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

import com.mailslurp.modelspackageVersion&#x3D;15.12.13.CreateInboxForwarderOptions
import com.mailslurp.modelspackageVersion&#x3D;15.12.13.InboxForwarderDto
import com.mailslurp.modelspackageVersion&#x3D;15.12.13.InboxForwarderTestOptions
import com.mailslurp.modelspackageVersion&#x3D;15.12.13.InboxForwarderTestResult
import java.time.OffsetDateTime
import com.mailslurp.modelspackageVersion&#x3D;15.12.13.PageInboxForwarderDto
import com.mailslurp.modelspackageVersion&#x3D;15.12.13.TestNewInboxForwarderOptions
import java.util.UUID
import com.mailslurp.client.core.JsonSupport._
import sttp.client._
import sttp.model.Method

object InboxForwarderControllerApi {

def apply(baseUrl: String = "https://api.mailslurp.com") = new InboxForwarderControllerApi(baseUrl)
}

class InboxForwarderControllerApi(baseUrl: String) {

  /**
   * Create a new inbox rule for forwarding, blocking, and allowing emails when sending and receiving
   * 
   * Expected answers:
   *   code 200 : InboxForwarderDto (OK)
   * 
   * Available security schemes:
   *   API_KEY (apiKey)
   * 
   * @param inboxId Inbox id to attach forwarder to
   * @param createInboxForwarderOptions 
   */
  def createNewInboxForwarder(apiKey: String)(inboxId: UUID, createInboxForwarderOptions: CreateInboxForwarderOptions
): Request[Either[ResponseError[Exception], InboxForwarderDto], Nothing] =
    basicRequest
      .method(Method.POST, uri"$baseUrl/forwarders?inboxId=${ inboxId }")
      .contentType("application/json")
      .header("x-api-key", apiKey)
      .body(createInboxForwarderOptions)
      .response(asJson[InboxForwarderDto])

  /**
   * Delete inbox forwarder
   * 
   * Expected answers:
   *   code 204 :  (No Content)
   * 
   * Available security schemes:
   *   API_KEY (apiKey)
   * 
   * @param id ID of inbox forwarder
   */
  def deleteInboxForwarder(apiKey: String)(id: UUID
): Request[Either[ResponseError[Exception], Unit], Nothing] =
    basicRequest
      .method(Method.DELETE, uri"$baseUrl/forwarders/${id}")
      .contentType("application/json")
      .header("x-api-key", apiKey)
      .response(asJson[Unit])

  /**
   * Delete inbox forwarders. Accepts optional inboxId filter.
   * 
   * Expected answers:
   *   code 204 :  (No Content)
   * 
   * Available security schemes:
   *   API_KEY (apiKey)
   * 
   * @param inboxId Optional inbox id to attach forwarder to
   */
  def deleteInboxForwarders(apiKey: String)(inboxId: Option[UUID] = None
): Request[Either[ResponseError[Exception], Unit], Nothing] =
    basicRequest
      .method(Method.DELETE, uri"$baseUrl/forwarders?inboxId=${ inboxId }")
      .contentType("application/json")
      .header("x-api-key", apiKey)
      .response(asJson[Unit])

  /**
   * Get inbox ruleset
   * 
   * Expected answers:
   *   code 200 : InboxForwarderDto (OK)
   * 
   * Available security schemes:
   *   API_KEY (apiKey)
   * 
   * @param id ID of inbox forwarder
   */
  def getInboxForwarder(apiKey: String)(id: UUID
): Request[Either[ResponseError[Exception], InboxForwarderDto], Nothing] =
    basicRequest
      .method(Method.GET, uri"$baseUrl/forwarders/${id}")
      .contentType("application/json")
      .header("x-api-key", apiKey)
      .response(asJson[InboxForwarderDto])

  /**
   * List all forwarders attached to an inbox
   * 
   * Expected answers:
   *   code 200 : PageInboxForwarderDto (OK)
   * 
   * Available security schemes:
   *   API_KEY (apiKey)
   * 
   * @param inboxId Optional inbox id to get forwarders from
   * @param page Optional page index in inbox forwarder list pagination
   * @param size Optional page size in inbox forwarder list pagination
   * @param sort Optional createdAt sort direction ASC or DESC
   * @param searchFilter Optional search filter
   * @param since Filter by created at after the given timestamp
   * @param before Filter by created at before the given timestamp
   */
  def getInboxForwarders(apiKey: String)(inboxId: Option[UUID] = None, page: Option[Int] = None, size: Option[Int] = None, sort: Option[String] = None, searchFilter: Option[String] = None, since: Option[OffsetDateTime] = None, before: Option[OffsetDateTime] = None
): Request[Either[ResponseError[Exception], PageInboxForwarderDto], Nothing] =
    basicRequest
      .method(Method.GET, uri"$baseUrl/forwarders?inboxId=${ inboxId }&page=${ page }&size=${ size }&sort=${ sort }&searchFilter=${ searchFilter }&since=${ since }&before=${ before }")
      .contentType("application/json")
      .header("x-api-key", apiKey)
      .response(asJson[PageInboxForwarderDto])

  /**
   * Test an inbox forwarder
   * 
   * Expected answers:
   *   code 200 : InboxForwarderTestResult (OK)
   * 
   * Available security schemes:
   *   API_KEY (apiKey)
   * 
   * @param id ID of inbox forwarder
   * @param inboxForwarderTestOptions 
   */
  def testInboxForwarder(apiKey: String)(id: UUID, inboxForwarderTestOptions: InboxForwarderTestOptions
): Request[Either[ResponseError[Exception], InboxForwarderTestResult], Nothing] =
    basicRequest
      .method(Method.POST, uri"$baseUrl/forwarders/${id}/test")
      .contentType("application/json")
      .header("x-api-key", apiKey)
      .body(inboxForwarderTestOptions)
      .response(asJson[InboxForwarderTestResult])

  /**
   * Test inbox forwarders for inbox
   * 
   * Expected answers:
   *   code 200 : InboxForwarderTestResult (OK)
   * 
   * Available security schemes:
   *   API_KEY (apiKey)
   * 
   * @param inboxId ID of inbox
   * @param inboxForwarderTestOptions 
   */
  def testInboxForwardersForInbox(apiKey: String)(inboxId: UUID, inboxForwarderTestOptions: InboxForwarderTestOptions
): Request[Either[ResponseError[Exception], InboxForwarderTestResult], Nothing] =
    basicRequest
      .method(Method.PUT, uri"$baseUrl/forwarders?inboxId=${ inboxId }")
      .contentType("application/json")
      .header("x-api-key", apiKey)
      .body(inboxForwarderTestOptions)
      .response(asJson[InboxForwarderTestResult])

  /**
   * Test new inbox forwarder
   * 
   * Expected answers:
   *   code 200 : InboxForwarderTestResult (OK)
   * 
   * Available security schemes:
   *   API_KEY (apiKey)
   * 
   * @param testNewInboxForwarderOptions 
   */
  def testNewInboxForwarder(apiKey: String)(testNewInboxForwarderOptions: TestNewInboxForwarderOptions
): Request[Either[ResponseError[Exception], InboxForwarderTestResult], Nothing] =
    basicRequest
      .method(Method.PATCH, uri"$baseUrl/forwarders")
      .contentType("application/json")
      .header("x-api-key", apiKey)
      .body(testNewInboxForwarderOptions)
      .response(asJson[InboxForwarderTestResult])

}
