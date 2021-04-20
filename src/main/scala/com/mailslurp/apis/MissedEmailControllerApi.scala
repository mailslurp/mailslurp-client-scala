/**
 * MailSlurp API
 * MailSlurp is an API for sending and receiving emails from dynamically allocated email addresses. It's designed for developers and QA teams to test applications, process inbound emails, send templated notifications, attachments, and more.   ## Resources - [Homepage](https://www.mailslurp.com) - Get an [API KEY](https://app.mailslurp.com/sign-up/) - Generated [SDK Clients](https://www.mailslurp.com/docs/) - [Examples](https://github.com/mailslurp/examples) repository 
 *
 * The version of the OpenAPI document: 6.5.2
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package com.mailslurp.apis

import com.mailslurp.modelspackageVersion&#x3D;11.7.202.MissedEmail
import com.mailslurp.modelspackageVersion&#x3D;11.7.202.PageMissedEmailProjection
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
   * @param page Optional page index in inbox list pagination
   * @param size Optional page size in inbox list pagination
   * @param sort Optional createdAt sort direction ASC or DESC
   */
  def getAllMissedEmails(apiKey: String)(page: Option[Int] = None, size: Option[Int] = None, sort: Option[String] = None
): Request[Either[ResponseError[Exception], PageMissedEmailProjection], Nothing] =
    basicRequest
      .method(Method.GET, uri"$baseUrl/missed-emails?page=${ page }&size=${ size }&sort=${ sort }")
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
   * @param missedEmailId MissedEmailId
   */
  def getMissedEmail(apiKey: String)(missedEmailId: UUID
): Request[Either[ResponseError[Exception], MissedEmail], Nothing] =
    basicRequest
      .method(Method.GET, uri"$baseUrl/missed-emails/${MissedEmailId}")
      .contentType("application/json")
      .header("x-api-key", apiKey)
      .response(asJson[MissedEmail])

}
