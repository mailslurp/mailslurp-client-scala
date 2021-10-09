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

import com.mailslurp.modelspackageVersion&#x3D;15.0.0.BouncedEmailDto
import com.mailslurp.modelspackageVersion&#x3D;15.0.0.BouncedRecipientDto
import java.time.OffsetDateTime
import com.mailslurp.modelspackageVersion&#x3D;15.0.0.PageBouncedEmail
import com.mailslurp.modelspackageVersion&#x3D;15.0.0.PageBouncedRecipients
import java.util.UUID
import com.mailslurp.client.core.JsonSupport._
import sttp.client._
import sttp.model.Method

object BounceControllerApi {

def apply(baseUrl: String = "https://api.mailslurp.com") = new BounceControllerApi(baseUrl)
}

class BounceControllerApi(baseUrl: String) {

  /**
   * Bounced emails are email you have sent that were rejected by a recipient
   * 
   * Expected answers:
   *   code 200 : BouncedEmailDto (OK)
   *   code 401 :  (Unauthorized)
   *   code 403 :  (Forbidden)
   *   code 404 :  (Not Found)
   * 
   * Available security schemes:
   *   API_KEY (apiKey)
   * 
   * @param id ID of the bounced email to fetch
   */
  def getBouncedEmail(apiKey: String)(id: UUID
): Request[Either[ResponseError[Exception], BouncedEmailDto], Nothing] =
    basicRequest
      .method(Method.GET, uri"$baseUrl/bounce/emails/${id}")
      .contentType("application/json")
      .header("x-api-key", apiKey)
      .response(asJson[BouncedEmailDto])

  /**
   * Bounced emails are email you have sent that were rejected by a recipient
   * 
   * Expected answers:
   *   code 200 : PageBouncedEmail (OK)
   *   code 401 :  (Unauthorized)
   *   code 403 :  (Forbidden)
   *   code 404 :  (Not Found)
   * 
   * Available security schemes:
   *   API_KEY (apiKey)
   * 
   * @param before Filter by created at before the given timestamp
   * @param page Optional page index 
   * @param since Filter by created at after the given timestamp
   * @param size Optional page size 
   * @param sort Optional createdAt sort direction ASC or DESC
   */
  def getBouncedEmails(apiKey: String)(before: Option[OffsetDateTime] = None, page: Option[Int] = None, since: Option[OffsetDateTime] = None, size: Option[Int] = None, sort: Option[String] = None
): Request[Either[ResponseError[Exception], PageBouncedEmail], Nothing] =
    basicRequest
      .method(Method.GET, uri"$baseUrl/bounce/emails?before=${ before }&page=${ page }&since=${ since }&size=${ size }&sort=${ sort }")
      .contentType("application/json")
      .header("x-api-key", apiKey)
      .response(asJson[PageBouncedEmail])

  /**
   * Bounced emails are email you have sent that were rejected by a recipient
   * 
   * Expected answers:
   *   code 200 : BouncedRecipientDto (OK)
   *   code 401 :  (Unauthorized)
   *   code 403 :  (Forbidden)
   *   code 404 :  (Not Found)
   * 
   * Available security schemes:
   *   API_KEY (apiKey)
   * 
   * @param id ID of the bounced recipient
   */
  def getBouncedRecipient(apiKey: String)(id: UUID
): Request[Either[ResponseError[Exception], BouncedRecipientDto], Nothing] =
    basicRequest
      .method(Method.GET, uri"$baseUrl/bounce/recipients/${id}")
      .contentType("application/json")
      .header("x-api-key", apiKey)
      .response(asJson[BouncedRecipientDto])

  /**
   * Bounced recipients are email addresses that you have sent emails to that did not accept the sent email. Once a recipient is bounced you cannot send emails to that address.
   * 
   * Expected answers:
   *   code 200 : PageBouncedRecipients (OK)
   *   code 401 :  (Unauthorized)
   *   code 403 :  (Forbidden)
   *   code 404 :  (Not Found)
   * 
   * Available security schemes:
   *   API_KEY (apiKey)
   * 
   * @param before Filter by created at before the given timestamp
   * @param page Optional page index 
   * @param since Filter by created at after the given timestamp
   * @param size Optional page size 
   * @param sort Optional createdAt sort direction ASC or DESC
   */
  def getBouncedRecipients(apiKey: String)(before: Option[OffsetDateTime] = None, page: Option[Int] = None, since: Option[OffsetDateTime] = None, size: Option[Int] = None, sort: Option[String] = None
): Request[Either[ResponseError[Exception], PageBouncedRecipients], Nothing] =
    basicRequest
      .method(Method.GET, uri"$baseUrl/bounce/recipients?before=${ before }&page=${ page }&since=${ since }&size=${ size }&sort=${ sort }")
      .contentType("application/json")
      .header("x-api-key", apiKey)
      .response(asJson[PageBouncedRecipients])

}
