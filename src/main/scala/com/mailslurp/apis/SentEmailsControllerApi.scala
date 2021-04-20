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

import com.mailslurp.modelspackageVersion&#x3D;11.7.203.PageSentEmailProjection
import com.mailslurp.modelspackageVersion&#x3D;11.7.203.SentEmailDto
import java.util.UUID
import com.mailslurp.client.core.JsonSupport._
import sttp.client._
import sttp.model.Method

object SentEmailsControllerApi {

def apply(baseUrl: String = "https://api.mailslurp.com") = new SentEmailsControllerApi(baseUrl)
}

class SentEmailsControllerApi(baseUrl: String) {

  /**
   * Expected answers:
   *   code 200 : SentEmailDto (OK)
   *   code 401 :  (Unauthorized)
   *   code 403 :  (Forbidden)
   *   code 404 :  (Not Found)
   * 
   * Available security schemes:
   *   API_KEY (apiKey)
   * 
   * @param id id
   */
  def getSentEmail(apiKey: String)(id: UUID
): Request[Either[ResponseError[Exception], SentEmailDto], Nothing] =
    basicRequest
      .method(Method.GET, uri"$baseUrl/sent/${id}")
      .contentType("application/json")
      .header("x-api-key", apiKey)
      .response(asJson[SentEmailDto])

  /**
   * Expected answers:
   *   code 200 : PageSentEmailProjection (OK)
   *   code 401 :  (Unauthorized)
   *   code 403 :  (Forbidden)
   *   code 404 :  (Not Found)
   * 
   * Available security schemes:
   *   API_KEY (apiKey)
   * 
   * @param inboxId Optional inboxId to filter sender of sent emails by
   * @param page Optional page index in inbox sent email list pagination
   * @param size Optional page size in inbox sent email list pagination
   * @param sort Optional createdAt sort direction ASC or DESC
   */
  def getSentEmails(apiKey: String)(inboxId: Option[UUID] = None, page: Option[Int] = None, size: Option[Int] = None, sort: Option[String] = None
): Request[Either[ResponseError[Exception], PageSentEmailProjection], Nothing] =
    basicRequest
      .method(Method.GET, uri"$baseUrl/sent?inboxId=${ inboxId }&page=${ page }&size=${ size }&sort=${ sort }")
      .contentType("application/json")
      .header("x-api-key", apiKey)
      .response(asJson[PageSentEmailProjection])

  /**
   * Expected answers:
   *   code 200 : PageSentEmailProjection (OK)
   *   code 401 :  (Unauthorized)
   *   code 403 :  (Forbidden)
   *   code 404 :  (Not Found)
   * 
   * Available security schemes:
   *   API_KEY (apiKey)
   * 
   * @param inboxId Optional inboxId to filter sender of sent emails by
   * @param page Optional page index in inbox sent email list pagination
   * @param size Optional page size in inbox sent email list pagination
   * @param sort Optional createdAt sort direction ASC or DESC
   */
  def getSentOrganizationEmails(apiKey: String)(inboxId: Option[UUID] = None, page: Option[Int] = None, size: Option[Int] = None, sort: Option[String] = None
): Request[Either[ResponseError[Exception], PageSentEmailProjection], Nothing] =
    basicRequest
      .method(Method.GET, uri"$baseUrl/sent/organization?inboxId=${ inboxId }&page=${ page }&size=${ size }&sort=${ sort }")
      .contentType("application/json")
      .header("x-api-key", apiKey)
      .response(asJson[PageSentEmailProjection])

}
