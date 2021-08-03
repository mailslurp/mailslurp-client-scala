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

import com.mailslurp.modelspackageVersion&#x3D;13.0.0.CreateInboxForwarderOptions
import com.mailslurp.modelspackageVersion&#x3D;13.0.0.InboxForwarderDto
import com.mailslurp.modelspackageVersion&#x3D;13.0.0.InboxForwarderTestOptions
import com.mailslurp.modelspackageVersion&#x3D;13.0.0.InboxForwarderTestResult
import com.mailslurp.modelspackageVersion&#x3D;13.0.0.PageInboxForwarderDto
import com.mailslurp.modelspackageVersion&#x3D;13.0.0.TestNewInboxForwarderOptions
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
   *   code 201 :  (Created)
   *   code 401 :  (Unauthorized)
   *   code 403 :  (Forbidden)
   *   code 404 :  (Not Found)
   * 
   * Available security schemes:
   *   API_KEY (apiKey)
   * 
   * @param createInboxForwarderOptions createInboxForwarderOptions
   * @param inboxId Inbox id to attach forwarder to
   */
  def createNewInboxForwarder(apiKey: String)(createInboxForwarderOptions: CreateInboxForwarderOptions, inboxId: Option[UUID] = None
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
   *   code 401 :  (Unauthorized)
   *   code 403 :  (Forbidden)
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
   *   code 401 :  (Unauthorized)
   *   code 403 :  (Forbidden)
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
   *   code 401 :  (Unauthorized)
   *   code 403 :  (Forbidden)
   *   code 404 :  (Not Found)
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
   *   code 401 :  (Unauthorized)
   *   code 403 :  (Forbidden)
   *   code 404 :  (Not Found)
   * 
   * Available security schemes:
   *   API_KEY (apiKey)
   * 
   * @param inboxId Optional inbox id to get forwarders from
   * @param page Optional page index in inbox forwarder list pagination
   * @param searchFilter Optional search filter
   * @param size Optional page size in inbox forwarder list pagination
   * @param sort Optional createdAt sort direction ASC or DESC
   */
  def getInboxForwarders(apiKey: String)(inboxId: Option[UUID] = None, page: Option[Int] = None, searchFilter: Option[String] = None, size: Option[Int] = None, sort: Option[String] = None
): Request[Either[ResponseError[Exception], PageInboxForwarderDto], Nothing] =
    basicRequest
      .method(Method.GET, uri"$baseUrl/forwarders?inboxId=${ inboxId }&page=${ page }&searchFilter=${ searchFilter }&size=${ size }&sort=${ sort }")
      .contentType("application/json")
      .header("x-api-key", apiKey)
      .response(asJson[PageInboxForwarderDto])

  /**
   * Test an inbox forwarder
   * 
   * Expected answers:
   *   code 200 : InboxForwarderTestResult (OK)
   *   code 201 :  (Created)
   *   code 401 :  (Unauthorized)
   *   code 403 :  (Forbidden)
   *   code 404 :  (Not Found)
   * 
   * Available security schemes:
   *   API_KEY (apiKey)
   * 
   * @param id ID of inbox forwarder
   * @param inboxForwarderTestOptions inboxForwarderTestOptions
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
   *   code 201 :  (Created)
   *   code 401 :  (Unauthorized)
   *   code 403 :  (Forbidden)
   *   code 404 :  (Not Found)
   * 
   * Available security schemes:
   *   API_KEY (apiKey)
   * 
   * @param inboxId ID of inbox
   * @param inboxForwarderTestOptions inboxForwarderTestOptions
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
   *   code 204 :  (No Content)
   *   code 401 :  (Unauthorized)
   *   code 403 :  (Forbidden)
   * 
   * Available security schemes:
   *   API_KEY (apiKey)
   * 
   * @param testNewInboxForwarderOptions testNewInboxForwarderOptions
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
