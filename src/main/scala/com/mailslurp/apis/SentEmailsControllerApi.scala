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

import com.mailslurp.modelspackageVersion&#x3D;15.7.14.EmailPreviewUrls
import java.time.OffsetDateTime
import com.mailslurp.modelspackageVersion&#x3D;15.7.14.PageSentEmailProjection
import com.mailslurp.modelspackageVersion&#x3D;15.7.14.PageTrackingPixelProjection
import com.mailslurp.modelspackageVersion&#x3D;15.7.14.RawEmailJson
import com.mailslurp.modelspackageVersion&#x3D;15.7.14.SentEmailDto
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
   *   code 204 :  (No Content)
   * 
   * Available security schemes:
   *   API_KEY (apiKey)
   */
  def deleteAllSentEmails(apiKey: String)(
): Request[Either[ResponseError[Exception], Unit], Nothing] =
    basicRequest
      .method(Method.DELETE, uri"$baseUrl/sent")
      .contentType("application/json")
      .header("x-api-key", apiKey)
      .response(asJson[Unit])

  /**
   * Expected answers:
   *   code 204 :  (No Content)
   * 
   * Available security schemes:
   *   API_KEY (apiKey)
   * 
   * @param id 
   */
  def deleteSentEmail(apiKey: String)(id: UUID
): Request[Either[ResponseError[Exception], Unit], Nothing] =
    basicRequest
      .method(Method.DELETE, uri"$baseUrl/sent/${id}")
      .contentType("application/json")
      .header("x-api-key", apiKey)
      .response(asJson[Unit])

  /**
   * Get all sent email tracking pixels in paginated form
   * 
   * Expected answers:
   *   code 200 : PageTrackingPixelProjection (OK)
   * 
   * Available security schemes:
   *   API_KEY (apiKey)
   * 
   * @param page Optional page index in sent email tracking pixel list pagination
   * @param size Optional page size in sent email tracking pixel list pagination
   * @param sort Optional createdAt sort direction ASC or DESC
   * @param searchFilter Optional search filter
   * @param since Filter by created at after the given timestamp
   * @param before Filter by created at before the given timestamp
   */
  def getAllSentTrackingPixels(apiKey: String)(page: Option[Int] = None, size: Option[Int] = None, sort: Option[String] = None, searchFilter: Option[String] = None, since: Option[OffsetDateTime] = None, before: Option[OffsetDateTime] = None
): Request[Either[ResponseError[Exception], PageTrackingPixelProjection], Nothing] =
    basicRequest
      .method(Method.GET, uri"$baseUrl/sent/tracking-pixels?page=${ page }&size=${ size }&sort=${ sort }&searchFilter=${ searchFilter }&since=${ since }&before=${ before }")
      .contentType("application/json")
      .header("x-api-key", apiKey)
      .response(asJson[PageTrackingPixelProjection])

  /**
   * Returns a raw, unparsed, and unprocessed sent email. If your client has issues processing the response it is likely due to the response content-type which is text/plain. If you need a JSON response content-type use the getRawSentEmailJson endpoint
   * 
   * Expected answers:
   *   code 200 : String (OK)
   * 
   * Available security schemes:
   *   API_KEY (apiKey)
   * 
   * @param emailId ID of email
   */
  def getRawSentEmailContents(apiKey: String)(emailId: UUID
): Request[Either[ResponseError[Exception], String], Nothing] =
    basicRequest
      .method(Method.GET, uri"$baseUrl/sent/${emailId}/raw")
      .contentType("application/json")
      .header("x-api-key", apiKey)
      .response(asJson[String])

  /**
   * Returns a raw, unparsed, and unprocessed sent email wrapped in a JSON response object for easier handling when compared with the getRawSentEmail text/plain response
   * 
   * Expected answers:
   *   code 200 : RawEmailJson (OK)
   * 
   * Available security schemes:
   *   API_KEY (apiKey)
   * 
   * @param emailId ID of email
   */
  def getRawSentEmailJson(apiKey: String)(emailId: UUID
): Request[Either[ResponseError[Exception], RawEmailJson], Nothing] =
    basicRequest
      .method(Method.GET, uri"$baseUrl/sent/${emailId}/raw/json")
      .contentType("application/json")
      .header("x-api-key", apiKey)
      .response(asJson[RawEmailJson])

  /**
   * Expected answers:
   *   code 200 : SentEmailDto (OK)
   * 
   * Available security schemes:
   *   API_KEY (apiKey)
   * 
   * @param id 
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
   *   code 200 : String (OK)
   * 
   * Available security schemes:
   *   API_KEY (apiKey)
   * 
   * @param id 
   */
  def getSentEmailHTMLContent(apiKey: String)(id: UUID
): Request[Either[ResponseError[Exception], String], Nothing] =
    basicRequest
      .method(Method.GET, uri"$baseUrl/sent/${id}/html")
      .contentType("application/json")
      .header("x-api-key", apiKey)
      .response(asJson[String])

  /**
   * Get a list of URLs for sent email content as text/html or raw SMTP message for viewing the message in a browser.
   * 
   * Expected answers:
   *   code 200 : EmailPreviewUrls (OK)
   * 
   * Available security schemes:
   *   API_KEY (apiKey)
   * 
   * @param id 
   */
  def getSentEmailPreviewURLs(apiKey: String)(id: UUID
): Request[Either[ResponseError[Exception], EmailPreviewUrls], Nothing] =
    basicRequest
      .method(Method.GET, uri"$baseUrl/sent/${id}/urls")
      .contentType("application/json")
      .header("x-api-key", apiKey)
      .response(asJson[EmailPreviewUrls])

  /**
   * Get all tracking pixels for a sent email in paginated form
   * 
   * Expected answers:
   *   code 200 : PageTrackingPixelProjection (OK)
   * 
   * Available security schemes:
   *   API_KEY (apiKey)
   * 
   * @param id 
   * @param page Optional page index in sent email tracking pixel list pagination
   * @param size Optional page size in sent email tracking pixel list pagination
   * @param sort Optional createdAt sort direction ASC or DESC
   * @param searchFilter Optional search filter
   * @param since Filter by created at after the given timestamp
   * @param before Filter by created at before the given timestamp
   */
  def getSentEmailTrackingPixels(apiKey: String)(id: UUID, page: Option[Int] = None, size: Option[Int] = None, sort: Option[String] = None, searchFilter: Option[String] = None, since: Option[OffsetDateTime] = None, before: Option[OffsetDateTime] = None
): Request[Either[ResponseError[Exception], PageTrackingPixelProjection], Nothing] =
    basicRequest
      .method(Method.GET, uri"$baseUrl/sent/${id}/tracking-pixels?page=${ page }&size=${ size }&sort=${ sort }&searchFilter=${ searchFilter }&since=${ since }&before=${ before }")
      .contentType("application/json")
      .header("x-api-key", apiKey)
      .response(asJson[PageTrackingPixelProjection])

  /**
   * Expected answers:
   *   code 200 : PageSentEmailProjection (OK)
   * 
   * Available security schemes:
   *   API_KEY (apiKey)
   * 
   * @param inboxId Optional inboxId to filter sender of sent emails by
   * @param page Optional page index in inbox sent email list pagination
   * @param size Optional page size in inbox sent email list pagination
   * @param sort Optional createdAt sort direction ASC or DESC
   * @param searchFilter Optional search filter
   * @param since Filter by created at after the given timestamp
   * @param before Filter by created at before the given timestamp
   */
  def getSentEmails(apiKey: String)(inboxId: Option[UUID] = None, page: Option[Int] = None, size: Option[Int] = None, sort: Option[String] = None, searchFilter: Option[String] = None, since: Option[OffsetDateTime] = None, before: Option[OffsetDateTime] = None
): Request[Either[ResponseError[Exception], PageSentEmailProjection], Nothing] =
    basicRequest
      .method(Method.GET, uri"$baseUrl/sent?inboxId=${ inboxId }&page=${ page }&size=${ size }&sort=${ sort }&searchFilter=${ searchFilter }&since=${ since }&before=${ before }")
      .contentType("application/json")
      .header("x-api-key", apiKey)
      .response(asJson[PageSentEmailProjection])

  /**
   * Get all sent organization emails in paginated form
   * 
   * Expected answers:
   *   code 200 : PageSentEmailProjection (OK)
   * 
   * Available security schemes:
   *   API_KEY (apiKey)
   * 
   * @param inboxId Optional inboxId to filter sender of sent emails by
   * @param page Optional page index in sent email list pagination
   * @param size Optional page size in sent email list pagination
   * @param sort Optional createdAt sort direction ASC or DESC
   * @param searchFilter Optional search filter
   * @param since Filter by created at after the given timestamp
   * @param before Filter by created at before the given timestamp
   */
  def getSentOrganizationEmails(apiKey: String)(inboxId: Option[UUID] = None, page: Option[Int] = None, size: Option[Int] = None, sort: Option[String] = None, searchFilter: Option[String] = None, since: Option[OffsetDateTime] = None, before: Option[OffsetDateTime] = None
): Request[Either[ResponseError[Exception], PageSentEmailProjection], Nothing] =
    basicRequest
      .method(Method.GET, uri"$baseUrl/sent/organization?inboxId=${ inboxId }&page=${ page }&size=${ size }&sort=${ sort }&searchFilter=${ searchFilter }&since=${ since }&before=${ before }")
      .contentType("application/json")
      .header("x-api-key", apiKey)
      .response(asJson[PageSentEmailProjection])

}
