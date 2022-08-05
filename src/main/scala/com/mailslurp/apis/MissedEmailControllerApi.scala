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

import com.mailslurp.modelspackageVersion&#x3D;15.13.7.MissedEmail
import java.time.OffsetDateTime
import com.mailslurp.modelspackageVersion&#x3D;15.13.7.PageMissedEmailProjection
import com.mailslurp.modelspackageVersion&#x3D;15.13.7.PageUnknownMissedEmailProjection
import java.util.UUID
import com.mailslurp.client.core.JsonSupport._
import sttp.client._
import sttp.model.Method

object MissedEmailControllerApi {

def apply(baseUrl: String = "https://api.mailslurp.com") = new MissedEmailControllerApi(baseUrl)
}

class MissedEmailControllerApi(baseUrl: String) {

  /**
   * Expected answers:
   *   code 200 : PageMissedEmailProjection (OK)
   * 
   * Available security schemes:
   *   API_KEY (apiKey)
   * 
   * @param page Optional page index in list pagination
   * @param size Optional page size in list pagination
   * @param sort Optional createdAt sort direction ASC or DESC
   * @param searchFilter Optional search filter
   * @param since Filter by created at after the given timestamp
   * @param before Filter by created at before the given timestamp
   * @param inboxId Optional inbox ID filter
   */
  def getAllMissedEmails(apiKey: String)(page: Option[Int] = None, size: Option[Int] = None, sort: Option[String] = None, searchFilter: Option[String] = None, since: Option[OffsetDateTime] = None, before: Option[OffsetDateTime] = None, inboxId: Option[UUID] = None
): Request[Either[ResponseError[Exception], PageMissedEmailProjection], Nothing] =
    basicRequest
      .method(Method.GET, uri"$baseUrl/missed-emails?page=${ page }&size=${ size }&sort=${ sort }&searchFilter=${ searchFilter }&since=${ since }&before=${ before }&inboxId=${ inboxId }")
      .contentType("application/json")
      .header("x-api-key", apiKey)
      .response(asJson[PageMissedEmailProjection])

  /**
   * Unknown missed emails are emails that were sent to MailSlurp but could not be assigned to an existing inbox.
   * 
   * Expected answers:
   *   code 200 : PageUnknownMissedEmailProjection (OK)
   * 
   * Available security schemes:
   *   API_KEY (apiKey)
   * 
   * @param page Optional page index in list pagination
   * @param size Optional page size in list pagination
   * @param sort Optional createdAt sort direction ASC or DESC
   * @param searchFilter Optional search filter
   * @param since Filter by created at after the given timestamp
   * @param before Filter by created at before the given timestamp
   * @param inboxId Optional inbox ID filter
   */
  def getAllUnknownMissedEmails(apiKey: String)(page: Option[Int] = None, size: Option[Int] = None, sort: Option[String] = None, searchFilter: Option[String] = None, since: Option[OffsetDateTime] = None, before: Option[OffsetDateTime] = None, inboxId: Option[UUID] = None
): Request[Either[ResponseError[Exception], PageUnknownMissedEmailProjection], Nothing] =
    basicRequest
      .method(Method.GET, uri"$baseUrl/missed-emails/unknown?page=${ page }&size=${ size }&sort=${ sort }&searchFilter=${ searchFilter }&since=${ since }&before=${ before }&inboxId=${ inboxId }")
      .contentType("application/json")
      .header("x-api-key", apiKey)
      .response(asJson[PageUnknownMissedEmailProjection])

  /**
   * List emails that were missed due to plan limits.
   * 
   * Expected answers:
   *   code 200 : MissedEmail (OK)
   * 
   * Available security schemes:
   *   API_KEY (apiKey)
   * 
   * @param missedEmailId 
   */
  def getMissedEmail(apiKey: String)(missedEmailId: UUID
): Request[Either[ResponseError[Exception], MissedEmail], Nothing] =
    basicRequest
      .method(Method.GET, uri"$baseUrl/missed-emails/${missedEmailId}")
      .contentType("application/json")
      .header("x-api-key", apiKey)
      .response(asJson[MissedEmail])

  /**
   * If emails were missed due to a plan limit they are saved as missed emails. If support team enables the canRestore flag these emails can be reload into your account using this method.
   * 
   * Expected answers:
   *   code 200 :  (OK)
   * 
   * Available security schemes:
   *   API_KEY (apiKey)
   */
  def restoreMissedEmails(apiKey: String)(
): Request[Either[ResponseError[Exception], Unit], Nothing] =
    basicRequest
      .method(Method.POST, uri"$baseUrl/missed-emails/restore")
      .contentType("application/json")
      .header("x-api-key", apiKey)
      .response(asJson[Unit])

  /**
   * Wait for 0 based index missed email
   * 
   * Expected answers:
   *   code 200 : MissedEmail (OK)
   * 
   * Available security schemes:
   *   API_KEY (apiKey)
   * 
   * @param index Zero based index of the email to wait for. If 1 missed email already and you want to wait for the 2nd email pass index=1
   * @param inboxId Optional inbox ID filter
   * @param timeout Optional timeout milliseconds
   * @param since Filter by created at after the given timestamp
   * @param before Filter by created at before the given timestamp
   */
  def waitForNthMissedEmail(apiKey: String)(index: Int, inboxId: Option[UUID] = None, timeout: Option[Long] = None, since: Option[OffsetDateTime] = None, before: Option[OffsetDateTime] = None
): Request[Either[ResponseError[Exception], MissedEmail], Nothing] =
    basicRequest
      .method(Method.GET, uri"$baseUrl/missed-emails/waitForNthMissedEmail?inboxId=${ inboxId }&timeout=${ timeout }&index=${ index }&since=${ since }&before=${ before }")
      .contentType("application/json")
      .header("x-api-key", apiKey)
      .response(asJson[MissedEmail])

}
