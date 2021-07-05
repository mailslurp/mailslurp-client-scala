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

import com.mailslurp.modelspackageVersion&#x3D;12.6.4.MissedEmail
import com.mailslurp.modelspackageVersion&#x3D;12.6.4.PageMissedEmailProjection
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
   *   code 401 :  (Unauthorized)
   *   code 403 :  (Forbidden)
   *   code 404 :  (Not Found)
   * 
   * Available security schemes:
   *   API_KEY (apiKey)
   * 
   * @param inboxId Optional inbox ID filter
   * @param page Optional page index in list pagination
   * @param searchFilter Optional search filter
   * @param size Optional page size in list pagination
   * @param sort Optional createdAt sort direction ASC or DESC
   */
  def getAllMissedEmails(apiKey: String)(inboxId: Option[UUID] = None, page: Option[Int] = None, searchFilter: Option[String] = None, size: Option[Int] = None, sort: Option[String] = None
): Request[Either[ResponseError[Exception], PageMissedEmailProjection], Nothing] =
    basicRequest
      .method(Method.GET, uri"$baseUrl/missed-emails?inboxId=${ inboxId }&page=${ page }&searchFilter=${ searchFilter }&size=${ size }&sort=${ sort }")
      .contentType("application/json")
      .header("x-api-key", apiKey)
      .response(asJson[PageMissedEmailProjection])

  /**
   * Expected answers:
   *   code 200 : MissedEmail (OK)
   *   code 401 :  (Unauthorized)
   *   code 403 :  (Forbidden)
   *   code 404 :  (Not Found)
   * 
   * Available security schemes:
   *   API_KEY (apiKey)
   * 
   * @param missedEmailId missedEmailId
   */
  def getMissedEmail(apiKey: String)(missedEmailId: UUID
): Request[Either[ResponseError[Exception], MissedEmail], Nothing] =
    basicRequest
      .method(Method.GET, uri"$baseUrl/missed-emails/${missedEmailId}")
      .contentType("application/json")
      .header("x-api-key", apiKey)
      .response(asJson[MissedEmail])

  /**
   * Wait for 0 based index missed email
   * 
   * Expected answers:
   *   code 200 : MissedEmail (OK)
   *   code 401 :  (Unauthorized)
   *   code 403 :  (Forbidden)
   *   code 404 :  (Not Found)
   * 
   * Available security schemes:
   *   API_KEY (apiKey)
   * 
   * @param inboxId Optional inbox ID filter
   * @param index Zero based index of the email to wait for. If 1 missed email already and you want to wait for the 2nd email pass index=1
   * @param timeout Optional timeout milliseconds
   */
  def waitForNthMissedEmail(apiKey: String)(inboxId: Option[UUID] = None, index: Option[Int] = None, timeout: Option[Long] = None
): Request[Either[ResponseError[Exception], MissedEmail], Nothing] =
    basicRequest
      .method(Method.GET, uri"$baseUrl/missed-emails/waitForNthMissedEmail?inboxId=${ inboxId }&index=${ index }&timeout=${ timeout }")
      .contentType("application/json")
      .header("x-api-key", apiKey)
      .response(asJson[MissedEmail])

}
