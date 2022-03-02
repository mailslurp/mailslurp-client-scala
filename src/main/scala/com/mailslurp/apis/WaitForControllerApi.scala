/**
 * MailSlurp API
 * MailSlurp is an API for sending and receiving emails from dynamically allocated email addresses. It's designed for developers and QA teams to test applications, process inbound emails, send templated notifications, attachments, and more.  ## Resources  - [Homepage](https://www.mailslurp.com) - Get an [API KEY](https://app.mailslurp.com/sign-up/) - Generated [SDK Clients](https://www.mailslurp.com/docs/) - [Examples](https://github.com/mailslurp/examples) repository
 *
 * The version of the OpenAPI document: 6.5.2
 * Contact: contact@mailslurp.dev
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package com.mailslurp.apis

import com.mailslurp.modelspackageVersion&#x3D;15.6.0.Email
import com.mailslurp.modelspackageVersion&#x3D;15.6.0.EmailPreview
import com.mailslurp.modelspackageVersion&#x3D;15.6.0.MatchOptions
import java.time.OffsetDateTime
import java.util.UUID
import com.mailslurp.modelspackageVersion&#x3D;15.6.0.WaitForConditions
import com.mailslurp.client.core.JsonSupport._
import sttp.client._
import sttp.model.Method

object WaitForControllerApi {

def apply(baseUrl: String = "https://api.mailslurp.com") = new WaitForControllerApi(baseUrl)
}

class WaitForControllerApi(baseUrl: String) {

  /**
   * Generic waitFor method that will wait until an inbox meets given conditions or return immediately if already met
   * 
   * Expected answers:
   *   code 200 : Seq[EmailPreview] (OK)
   * 
   * Available security schemes:
   *   API_KEY (apiKey)
   * 
   * @param waitForConditions 
   */
  def waitFor(apiKey: String)(waitForConditions: WaitForConditions
): Request[Either[ResponseError[Exception], Seq[EmailPreview]], Nothing] =
    basicRequest
      .method(Method.POST, uri"$baseUrl/waitFor")
      .contentType("application/json")
      .header("x-api-key", apiKey)
      .body(waitForConditions)
      .response(asJson[Seq[EmailPreview]])

  /**
   * If inbox contains count or more emails at time of request then return count worth of emails. If not wait until the count is reached and return those or return an error if timeout is exceeded.
   * 
   * Expected answers:
   *   code 200 : Seq[EmailPreview] (OK)
   * 
   * Available security schemes:
   *   API_KEY (apiKey)
   * 
   * @param inboxId Id of the inbox we are fetching emails from
   * @param count Number of emails to wait for. Must be greater that 1
   * @param timeout Max milliseconds to wait
   * @param unreadOnly Optional filter for unread only
   * @param before Filter for emails that were received before the given timestamp
   * @param since Filter for emails that were received after the given timestamp
   * @param sort Sort direction
   * @param delay Max milliseconds delay between calls
   */
  def waitForEmailCount(apiKey: String)(inboxId: UUID, count: Int, timeout: Option[Long] = None, unreadOnly: Option[Boolean] = None, before: Option[OffsetDateTime] = None, since: Option[OffsetDateTime] = None, sort: Option[String] = None, delay: Option[Long] = None
): Request[Either[ResponseError[Exception], Seq[EmailPreview]], Nothing] =
    basicRequest
      .method(Method.GET, uri"$baseUrl/waitForEmailCount?inboxId=${ inboxId }&count=${ count }&timeout=${ timeout }&unreadOnly=${ unreadOnly }&before=${ before }&since=${ since }&sort=${ sort }&delay=${ delay }")
      .contentType("application/json")
      .header("x-api-key", apiKey)
      .response(asJson[Seq[EmailPreview]])

  /**
   * Will return either the last received email or wait for an email to arrive and return that. If you need to wait for an email for a non-empty inbox set `unreadOnly=true` or see the other receive methods such as `waitForNthEmail` or `waitForEmailCount`.
   * 
   * Expected answers:
   *   code 200 : Email (OK)
   * 
   * Available security schemes:
   *   API_KEY (apiKey)
   * 
   * @param inboxId Id of the inbox we are fetching emails from
   * @param timeout Max milliseconds to wait
   * @param unreadOnly Optional filter for unread only.
   * @param before Filter for emails that were before after the given timestamp
   * @param since Filter for emails that were received after the given timestamp
   * @param sort Sort direction
   * @param delay Max milliseconds delay between calls
   */
  def waitForLatestEmail(apiKey: String)(inboxId: Option[UUID] = None, timeout: Option[Long] = None, unreadOnly: Option[Boolean] = None, before: Option[OffsetDateTime] = None, since: Option[OffsetDateTime] = None, sort: Option[String] = None, delay: Option[Long] = None
): Request[Either[ResponseError[Exception], Email], Nothing] =
    basicRequest
      .method(Method.GET, uri"$baseUrl/waitForLatestEmail?inboxId=${ inboxId }&timeout=${ timeout }&unreadOnly=${ unreadOnly }&before=${ before }&since=${ since }&sort=${ sort }&delay=${ delay }")
      .contentType("application/json")
      .header("x-api-key", apiKey)
      .response(asJson[Email])

  /**
   * Perform a search of emails in an inbox with the given patterns. If results match expected count then return or else retry the search until results are found or timeout is reached. Match options allow simple CONTAINS or EQUALS filtering on SUBJECT, TO, BCC, CC, and FROM. See the `MatchOptions` object for options. An example payload is `{ matches: [{field: 'SUBJECT',should:'CONTAIN',value:'needle'}] }`. You can use an array of matches and they will be applied sequentially to filter out emails. If you want to perform matches and extractions of content using Regex patterns see the EmailController `getEmailContentMatch` method.
   * 
   * Expected answers:
   *   code 200 : Seq[EmailPreview] (OK)
   * 
   * Available security schemes:
   *   API_KEY (apiKey)
   * 
   * @param inboxId Id of the inbox we are fetching emails from
   * @param count Number of emails to wait for. Must be greater or equal to 1
   * @param matchOptions 
   * @param before Filter for emails that were received before the given timestamp
   * @param since Filter for emails that were received after the given timestamp
   * @param sort Sort direction
   * @param delay Max milliseconds delay between calls
   * @param timeout Max milliseconds to wait
   * @param unreadOnly Optional filter for unread only
   */
  def waitForMatchingEmails(apiKey: String)(inboxId: UUID, count: Int, matchOptions: MatchOptions, before: Option[OffsetDateTime] = None, since: Option[OffsetDateTime] = None, sort: Option[String] = None, delay: Option[Long] = None, timeout: Option[Long] = None, unreadOnly: Option[Boolean] = None
): Request[Either[ResponseError[Exception], Seq[EmailPreview]], Nothing] =
    basicRequest
      .method(Method.POST, uri"$baseUrl/waitForMatchingEmails?inboxId=${ inboxId }&count=${ count }&before=${ before }&since=${ since }&sort=${ sort }&delay=${ delay }&timeout=${ timeout }&unreadOnly=${ unreadOnly }")
      .contentType("application/json")
      .header("x-api-key", apiKey)
      .body(matchOptions)
      .response(asJson[Seq[EmailPreview]])

  /**
   * Perform a search of emails in an inbox with the given patterns. If a result if found then return or else retry the search until a result is found or timeout is reached. Match options allow simple CONTAINS or EQUALS filtering on SUBJECT, TO, BCC, CC, and FROM. See the `MatchOptions` object for options. An example payload is `{ matches: [{field: 'SUBJECT',should:'CONTAIN',value:'needle'}] }`. You can use an array of matches and they will be applied sequentially to filter out emails. If you want to perform matches and extractions of content using Regex patterns see the EmailController `getEmailContentMatch` method.
   * 
   * Expected answers:
   *   code 200 : Email (OK)
   * 
   * Available security schemes:
   *   API_KEY (apiKey)
   * 
   * @param inboxId Id of the inbox we are matching an email for
   * @param matchOptions 
   * @param timeout Max milliseconds to wait
   * @param unreadOnly Optional filter for unread only
   * @param since Filter for emails that were received after the given timestamp
   * @param before Filter for emails that were received before the given timestamp
   * @param sort Sort direction
   * @param delay Max milliseconds delay between calls
   */
  def waitForMatchingFirstEmail(apiKey: String)(inboxId: UUID, matchOptions: MatchOptions, timeout: Option[Long] = None, unreadOnly: Option[Boolean] = None, since: Option[OffsetDateTime] = None, before: Option[OffsetDateTime] = None, sort: Option[String] = None, delay: Option[Long] = None
): Request[Either[ResponseError[Exception], Email], Nothing] =
    basicRequest
      .method(Method.POST, uri"$baseUrl/waitForMatchingFirstEmail?inboxId=${ inboxId }&timeout=${ timeout }&unreadOnly=${ unreadOnly }&since=${ since }&before=${ before }&sort=${ sort }&delay=${ delay }")
      .contentType("application/json")
      .header("x-api-key", apiKey)
      .body(matchOptions)
      .response(asJson[Email])

  /**
   * If nth email is already present in inbox then return it. If not hold the connection open until timeout expires or the nth email is received and returned.
   * 
   * Expected answers:
   *   code 200 : Email (OK)
   * 
   * Available security schemes:
   *   API_KEY (apiKey)
   * 
   * @param inboxId Id of the inbox you are fetching emails from
   * @param index Zero based index of the email to wait for. If an inbox has 1 email already and you want to wait for the 2nd email pass index=1
   * @param timeout Max milliseconds to wait for the nth email if not already present
   * @param unreadOnly Optional filter for unread only
   * @param since Filter for emails that were received after the given timestamp
   * @param before Filter for emails that were received before the given timestamp
   * @param sort Sort direction
   * @param delay Max milliseconds delay between calls
   */
  def waitForNthEmail(apiKey: String)(inboxId: Option[UUID] = None, index: Option[Int] = None, timeout: Option[Long] = None, unreadOnly: Option[Boolean] = None, since: Option[OffsetDateTime] = None, before: Option[OffsetDateTime] = None, sort: Option[String] = None, delay: Option[Long] = None
): Request[Either[ResponseError[Exception], Email], Nothing] =
    basicRequest
      .method(Method.GET, uri"$baseUrl/waitForNthEmail?inboxId=${ inboxId }&index=${ index }&timeout=${ timeout }&unreadOnly=${ unreadOnly }&since=${ since }&before=${ before }&sort=${ sort }&delay=${ delay }")
      .contentType("application/json")
      .header("x-api-key", apiKey)
      .response(asJson[Email])

}
