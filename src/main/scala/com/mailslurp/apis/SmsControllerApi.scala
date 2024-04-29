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

import com.mailslurp.modelspackageVersion&#x3D;15.19.8.CountDto
import java.time.OffsetDateTime
import com.mailslurp.modelspackageVersion&#x3D;15.19.8.PageSmsProjection
import com.mailslurp.modelspackageVersion&#x3D;15.19.8.ReplyForSms
import com.mailslurp.modelspackageVersion&#x3D;15.19.8.SentSmsDto
import com.mailslurp.modelspackageVersion&#x3D;15.19.8.SmsDto
import com.mailslurp.modelspackageVersion&#x3D;15.19.8.SmsReplyOptions
import java.util.UUID
import com.mailslurp.modelspackageVersion&#x3D;15.19.8.UnreadCount
import com.mailslurp.client.core.JsonSupport._
import sttp.client._
import sttp.model.Method

object SmsControllerApi {

def apply(baseUrl: String = "https://api.mailslurp.com") = new SmsControllerApi(baseUrl)
}

class SmsControllerApi(baseUrl: String) {

  /**
   * Delete an SMS message
   * 
   * Expected answers:
   *   code 204 :  (No Content)
   * 
   * Available security schemes:
   *   API_KEY (apiKey)
   * 
   * @param smsId 
   */
  def deleteSmsMessage(apiKey: String)(smsId: UUID
): Request[Either[ResponseError[Exception], Unit], Nothing] =
    basicRequest
      .method(Method.DELETE, uri"$baseUrl/sms/${smsId}")
      .contentType("application/json")
      .header("x-api-key", apiKey)
      .response(asJson[Unit])

  /**
   * Delete all SMS messages or all messages for a given phone number
   * 
   * Expected answers:
   *   code 204 :  (No Content)
   * 
   * Available security schemes:
   *   API_KEY (apiKey)
   * 
   * @param phoneNumberId 
   */
  def deleteSmsMessages(apiKey: String)(phoneNumberId: Option[UUID] = None
): Request[Either[ResponseError[Exception], Unit], Nothing] =
    basicRequest
      .method(Method.DELETE, uri"$baseUrl/sms?phoneNumberId=${ phoneNumberId }")
      .contentType("application/json")
      .header("x-api-key", apiKey)
      .response(asJson[Unit])

  /**
   * Get reply for an SMS message.
   * 
   * Expected answers:
   *   code 200 : ReplyForSms (OK)
   * 
   * Available security schemes:
   *   API_KEY (apiKey)
   * 
   * @param smsId 
   */
  def getReplyForSmsMessage(apiKey: String)(smsId: UUID
): Request[Either[ResponseError[Exception], ReplyForSms], Nothing] =
    basicRequest
      .method(Method.GET, uri"$baseUrl/sms/${smsId}/reply")
      .contentType("application/json")
      .header("x-api-key", apiKey)
      .response(asJson[ReplyForSms])

  /**
   * Get number of SMS
   * 
   * Expected answers:
   *   code 200 : CountDto (OK)
   * 
   * Available security schemes:
   *   API_KEY (apiKey)
   */
  def getSmsCount(apiKey: String)(
): Request[Either[ResponseError[Exception], CountDto], Nothing] =
    basicRequest
      .method(Method.GET, uri"$baseUrl/sms/count")
      .contentType("application/json")
      .header("x-api-key", apiKey)
      .response(asJson[CountDto])

  /**
   * Returns a SMS summary object with content.
   * 
   * Expected answers:
   *   code 200 : SmsDto (OK)
   * 
   * Available security schemes:
   *   API_KEY (apiKey)
   * 
   * @param smsId 
   */
  def getSmsMessage(apiKey: String)(smsId: UUID
): Request[Either[ResponseError[Exception], SmsDto], Nothing] =
    basicRequest
      .method(Method.GET, uri"$baseUrl/sms/${smsId}")
      .contentType("application/json")
      .header("x-api-key", apiKey)
      .response(asJson[SmsDto])

  /**
   * By default returns all SMS messages across all phone numbers sorted by ascending created at date. Responses are paginated. You can restrict results to a list of phone number IDs. You can also filter out read messages
   * 
   * Expected answers:
   *   code 200 : PageSmsProjection (OK)
   * 
   * Available security schemes:
   *   API_KEY (apiKey)
   * 
   * @param phoneNumber Optional receiving phone number to filter SMS messages for
   * @param page Optional page index in SMS list pagination
   * @param size Optional page size in SMS list pagination. Maximum size is 100. Use page index and sort to page through larger results
   * @param sort Optional createdAt sort direction ASC or DESC
   * @param unreadOnly Optional filter for unread SMS only. All SMS are considered unread until they are viewed in the dashboard or requested directly
   * @param since Optional filter SMSs received after given date time
   * @param before Optional filter SMSs received before given date time
   */
  def getSmsMessagesPaginated(apiKey: String)(phoneNumber: Option[UUID] = None, page: Option[Int] = None, size: Option[Int] = None, sort: Option[String] = None, unreadOnly: Option[Boolean] = None, since: Option[OffsetDateTime] = None, before: Option[OffsetDateTime] = None
): Request[Either[ResponseError[Exception], PageSmsProjection], Nothing] =
    basicRequest
      .method(Method.GET, uri"$baseUrl/sms?phoneNumber=${ phoneNumber }&page=${ page }&size=${ size }&sort=${ sort }&unreadOnly=${ unreadOnly }&since=${ since }&before=${ before }")
      .contentType("application/json")
      .header("x-api-key", apiKey)
      .response(asJson[PageSmsProjection])

  /**
   * Get number of SMS unread. Unread means has not been viewed in dashboard or returned in an email API response
   * 
   * Expected answers:
   *   code 200 : UnreadCount (OK)
   * 
   * Available security schemes:
   *   API_KEY (apiKey)
   */
  def getUnreadSmsCount(apiKey: String)(
): Request[Either[ResponseError[Exception], UnreadCount], Nothing] =
    basicRequest
      .method(Method.GET, uri"$baseUrl/sms/unreadCount")
      .contentType("application/json")
      .header("x-api-key", apiKey)
      .response(asJson[UnreadCount])

  /**
   * Reply to an SMS message.
   * 
   * Expected answers:
   *   code 200 : SentSmsDto (OK)
   * 
   * Available security schemes:
   *   API_KEY (apiKey)
   * 
   * @param smsId 
   * @param smsReplyOptions 
   */
  def replyToSmsMessage(apiKey: String)(smsId: UUID, smsReplyOptions: SmsReplyOptions
): Request[Either[ResponseError[Exception], SentSmsDto], Nothing] =
    basicRequest
      .method(Method.POST, uri"$baseUrl/sms/${smsId}/reply")
      .contentType("application/json")
      .header("x-api-key", apiKey)
      .body(smsReplyOptions)
      .response(asJson[SentSmsDto])

}
