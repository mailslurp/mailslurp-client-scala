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

import com.mailslurp.modelspackageVersion&#x3D;15.17.24.CreateInboxRulesetOptions
import com.mailslurp.modelspackageVersion&#x3D;15.17.24.InboxRulesetDto
import com.mailslurp.modelspackageVersion&#x3D;15.17.24.InboxRulesetTestOptions
import com.mailslurp.modelspackageVersion&#x3D;15.17.24.InboxRulesetTestResult
import java.time.OffsetDateTime
import com.mailslurp.modelspackageVersion&#x3D;15.17.24.PageInboxRulesetDto
import com.mailslurp.modelspackageVersion&#x3D;15.17.24.TestInboxRulesetReceivingOptions
import com.mailslurp.modelspackageVersion&#x3D;15.17.24.TestInboxRulesetReceivingResult
import com.mailslurp.modelspackageVersion&#x3D;15.17.24.TestInboxRulesetSendingOptions
import com.mailslurp.modelspackageVersion&#x3D;15.17.24.TestInboxRulesetSendingResult
import com.mailslurp.modelspackageVersion&#x3D;15.17.24.TestNewInboxRulesetOptions
import java.util.UUID
import com.mailslurp.client.core.JsonSupport._
import sttp.client._
import sttp.model.Method

object InboxRulesetControllerApi {

def apply(baseUrl: String = "https://api.mailslurp.com") = new InboxRulesetControllerApi(baseUrl)
}

class InboxRulesetControllerApi(baseUrl: String) {

  /**
   * Create a new inbox rule for forwarding, blocking, and allowing emails when sending and receiving
   * 
   * Expected answers:
   *   code 200 : InboxRulesetDto (OK)
   * 
   * Available security schemes:
   *   API_KEY (apiKey)
   * 
   * @param createInboxRulesetOptions 
   * @param inboxId Inbox id to attach ruleset to
   */
  def createNewInboxRuleset(apiKey: String)(createInboxRulesetOptions: CreateInboxRulesetOptions, inboxId: Option[UUID] = None
): Request[Either[ResponseError[Exception], InboxRulesetDto], Nothing] =
    basicRequest
      .method(Method.POST, uri"$baseUrl/rulesets?inboxId=${ inboxId }")
      .contentType("application/json")
      .header("x-api-key", apiKey)
      .body(createInboxRulesetOptions)
      .response(asJson[InboxRulesetDto])

  /**
   * Delete inbox ruleset
   * 
   * Expected answers:
   *   code 204 :  (No Content)
   * 
   * Available security schemes:
   *   API_KEY (apiKey)
   * 
   * @param id ID of inbox ruleset
   */
  def deleteInboxRuleset(apiKey: String)(id: UUID
): Request[Either[ResponseError[Exception], Unit], Nothing] =
    basicRequest
      .method(Method.DELETE, uri"$baseUrl/rulesets/${id}")
      .contentType("application/json")
      .header("x-api-key", apiKey)
      .response(asJson[Unit])

  /**
   * Delete inbox rulesets. Accepts optional inboxId filter.
   * 
   * Expected answers:
   *   code 204 :  (No Content)
   * 
   * Available security schemes:
   *   API_KEY (apiKey)
   * 
   * @param inboxId Optional inbox id to attach ruleset to
   */
  def deleteInboxRulesets(apiKey: String)(inboxId: Option[UUID] = None
): Request[Either[ResponseError[Exception], Unit], Nothing] =
    basicRequest
      .method(Method.DELETE, uri"$baseUrl/rulesets?inboxId=${ inboxId }")
      .contentType("application/json")
      .header("x-api-key", apiKey)
      .response(asJson[Unit])

  /**
   * Get inbox ruleset
   * 
   * Expected answers:
   *   code 200 : InboxRulesetDto (OK)
   * 
   * Available security schemes:
   *   API_KEY (apiKey)
   * 
   * @param id ID of inbox ruleset
   */
  def getInboxRuleset(apiKey: String)(id: UUID
): Request[Either[ResponseError[Exception], InboxRulesetDto], Nothing] =
    basicRequest
      .method(Method.GET, uri"$baseUrl/rulesets/${id}")
      .contentType("application/json")
      .header("x-api-key", apiKey)
      .response(asJson[InboxRulesetDto])

  /**
   * List all rulesets attached to an inbox
   * 
   * Expected answers:
   *   code 200 : PageInboxRulesetDto (OK)
   * 
   * Available security schemes:
   *   API_KEY (apiKey)
   * 
   * @param inboxId Optional inbox id to get rulesets from
   * @param page Optional page index in inbox ruleset list pagination
   * @param size Optional page size in inbox ruleset list pagination
   * @param sort Optional createdAt sort direction ASC or DESC
   * @param searchFilter Optional search filter
   * @param since Filter by created at after the given timestamp
   * @param before Filter by created at before the given timestamp
   */
  def getInboxRulesets(apiKey: String)(inboxId: Option[UUID] = None, page: Option[Int] = None, size: Option[Int] = None, sort: Option[String] = None, searchFilter: Option[String] = None, since: Option[OffsetDateTime] = None, before: Option[OffsetDateTime] = None
): Request[Either[ResponseError[Exception], PageInboxRulesetDto], Nothing] =
    basicRequest
      .method(Method.GET, uri"$baseUrl/rulesets?inboxId=${ inboxId }&page=${ page }&size=${ size }&sort=${ sort }&searchFilter=${ searchFilter }&since=${ since }&before=${ before }")
      .contentType("application/json")
      .header("x-api-key", apiKey)
      .response(asJson[PageInboxRulesetDto])

  /**
   * Test an inbox ruleset
   * 
   * Expected answers:
   *   code 200 : InboxRulesetTestResult (OK)
   * 
   * Available security schemes:
   *   API_KEY (apiKey)
   * 
   * @param id ID of inbox ruleset
   * @param inboxRulesetTestOptions 
   */
  def testInboxRuleset(apiKey: String)(id: UUID, inboxRulesetTestOptions: InboxRulesetTestOptions
): Request[Either[ResponseError[Exception], InboxRulesetTestResult], Nothing] =
    basicRequest
      .method(Method.POST, uri"$baseUrl/rulesets/${id}/test")
      .contentType("application/json")
      .header("x-api-key", apiKey)
      .body(inboxRulesetTestOptions)
      .response(asJson[InboxRulesetTestResult])

  /**
   * Test whether inbound emails from an email address would be blocked or allowed by inbox rulesets
   * 
   * Expected answers:
   *   code 200 : TestInboxRulesetReceivingResult (OK)
   * 
   * Available security schemes:
   *   API_KEY (apiKey)
   * 
   * @param testInboxRulesetReceivingOptions 
   */
  def testInboxRulesetReceiving(apiKey: String)(testInboxRulesetReceivingOptions: TestInboxRulesetReceivingOptions
): Request[Either[ResponseError[Exception], TestInboxRulesetReceivingResult], Nothing] =
    basicRequest
      .method(Method.POST, uri"$baseUrl/rulesets/test-receiving")
      .contentType("application/json")
      .header("x-api-key", apiKey)
      .body(testInboxRulesetReceivingOptions)
      .response(asJson[TestInboxRulesetReceivingResult])

  /**
   * Test whether outbound emails to an email address would be blocked or allowed by inbox rulesets
   * 
   * Expected answers:
   *   code 200 : TestInboxRulesetSendingResult (OK)
   * 
   * Available security schemes:
   *   API_KEY (apiKey)
   * 
   * @param testInboxRulesetSendingOptions 
   */
  def testInboxRulesetSending(apiKey: String)(testInboxRulesetSendingOptions: TestInboxRulesetSendingOptions
): Request[Either[ResponseError[Exception], TestInboxRulesetSendingResult], Nothing] =
    basicRequest
      .method(Method.POST, uri"$baseUrl/rulesets/test-sending")
      .contentType("application/json")
      .header("x-api-key", apiKey)
      .body(testInboxRulesetSendingOptions)
      .response(asJson[TestInboxRulesetSendingResult])

  /**
   * Test inbox rulesets for inbox
   * 
   * Expected answers:
   *   code 200 : InboxRulesetTestResult (OK)
   * 
   * Available security schemes:
   *   API_KEY (apiKey)
   * 
   * @param inboxId ID of inbox
   * @param inboxRulesetTestOptions 
   */
  def testInboxRulesetsForInbox(apiKey: String)(inboxId: UUID, inboxRulesetTestOptions: InboxRulesetTestOptions
): Request[Either[ResponseError[Exception], InboxRulesetTestResult], Nothing] =
    basicRequest
      .method(Method.PUT, uri"$baseUrl/rulesets?inboxId=${ inboxId }")
      .contentType("application/json")
      .header("x-api-key", apiKey)
      .body(inboxRulesetTestOptions)
      .response(asJson[InboxRulesetTestResult])

  /**
   * Test new inbox ruleset
   * 
   * Expected answers:
   *   code 200 : InboxRulesetTestResult (OK)
   * 
   * Available security schemes:
   *   API_KEY (apiKey)
   * 
   * @param testNewInboxRulesetOptions 
   */
  def testNewInboxRuleset(apiKey: String)(testNewInboxRulesetOptions: TestNewInboxRulesetOptions
): Request[Either[ResponseError[Exception], InboxRulesetTestResult], Nothing] =
    basicRequest
      .method(Method.PATCH, uri"$baseUrl/rulesets")
      .contentType("application/json")
      .header("x-api-key", apiKey)
      .body(testNewInboxRulesetOptions)
      .response(asJson[InboxRulesetTestResult])

}
