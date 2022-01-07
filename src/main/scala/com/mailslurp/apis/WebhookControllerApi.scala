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

import com.mailslurp.modelspackageVersion&#x3D;15.1.2.AbstractWebhookPayload
import com.mailslurp.modelspackageVersion&#x3D;15.1.2.CreateWebhookOptions
import com.mailslurp.modelspackageVersion&#x3D;15.1.2.JSONSchemaDto
import java.time.OffsetDateTime
import com.mailslurp.modelspackageVersion&#x3D;15.1.2.PageWebhookProjection
import com.mailslurp.modelspackageVersion&#x3D;15.1.2.PageWebhookResult
import java.util.UUID
import com.mailslurp.modelspackageVersion&#x3D;15.1.2.UnseenErrorCountDto
import com.mailslurp.modelspackageVersion&#x3D;15.1.2.WebhookDto
import com.mailslurp.modelspackageVersion&#x3D;15.1.2.WebhookEmailOpenedPayload
import com.mailslurp.modelspackageVersion&#x3D;15.1.2.WebhookEmailReadPayload
import com.mailslurp.modelspackageVersion&#x3D;15.1.2.WebhookNewAttachmentPayload
import com.mailslurp.modelspackageVersion&#x3D;15.1.2.WebhookNewContactPayload
import com.mailslurp.modelspackageVersion&#x3D;15.1.2.WebhookNewEmailPayload
import com.mailslurp.modelspackageVersion&#x3D;15.1.2.WebhookRedriveResult
import com.mailslurp.modelspackageVersion&#x3D;15.1.2.WebhookResultDto
import com.mailslurp.modelspackageVersion&#x3D;15.1.2.WebhookTestResult
import com.mailslurp.client.core.JsonSupport._
import sttp.client._
import sttp.model.Method

object WebhookControllerApi {

def apply(baseUrl: String = "https://api.mailslurp.com") = new WebhookControllerApi(baseUrl)
}

class WebhookControllerApi(baseUrl: String) {

  /**
   * Get notified whenever an inbox receives an email via a WebHook URL. An emailID will be posted to this URL every time an email is received for this inbox. The URL must be publicly reachable by the MailSlurp server. You can provide basicAuth values if you wish to secure this endpoint.
   * 
   * Expected answers:
   *   code 201 : WebhookDto (Created)
   * 
   * Available security schemes:
   *   API_KEY (apiKey)
   * 
   * @param inboxId 
   * @param createWebhookOptions 
   */
  def createWebhook(apiKey: String)(inboxId: UUID, createWebhookOptions: CreateWebhookOptions
): Request[Either[ResponseError[Exception], WebhookDto], Nothing] =
    basicRequest
      .method(Method.POST, uri"$baseUrl/inboxes/${inboxId}/webhooks")
      .contentType("application/json")
      .header("x-api-key", apiKey)
      .body(createWebhookOptions)
      .response(asJson[WebhookDto])

  /**
   * Expected answers:
   *   code 204 :  (No Content)
   * 
   * Available security schemes:
   *   API_KEY (apiKey)
   */
  def deleteAllWebhooks(apiKey: String)(
): Request[Either[ResponseError[Exception], Unit], Nothing] =
    basicRequest
      .method(Method.DELETE, uri"$baseUrl/webhooks")
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
   * @param inboxId 
   * @param webhookId 
   */
  def deleteWebhook(apiKey: String)(inboxId: UUID, webhookId: UUID
): Request[Either[ResponseError[Exception], Unit], Nothing] =
    basicRequest
      .method(Method.DELETE, uri"$baseUrl/inboxes/${inboxId}/webhooks/${webhookId}")
      .contentType("application/json")
      .header("x-api-key", apiKey)
      .response(asJson[Unit])

  /**
   * Expected answers:
   *   code 200 : PageWebhookResult (OK)
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
   * @param unseenOnly Filter for unseen exceptions only
   */
  def getAllWebhookResults(apiKey: String)(page: Option[Int] = None, size: Option[Int] = None, sort: Option[String] = None, searchFilter: Option[String] = None, since: Option[OffsetDateTime] = None, before: Option[OffsetDateTime] = None, unseenOnly: Option[Boolean] = None
): Request[Either[ResponseError[Exception], PageWebhookResult], Nothing] =
    basicRequest
      .method(Method.GET, uri"$baseUrl/webhooks/results?page=${ page }&size=${ size }&sort=${ sort }&searchFilter=${ searchFilter }&since=${ since }&before=${ before }&unseenOnly=${ unseenOnly }")
      .contentType("application/json")
      .header("x-api-key", apiKey)
      .response(asJson[PageWebhookResult])

  /**
   * List webhooks in paginated form. Allows for page index, page size, and sort direction.
   * 
   * Expected answers:
   *   code 200 : PageWebhookProjection (OK)
   * 
   * Available security schemes:
   *   API_KEY (apiKey)
   * 
   * @param page Optional page index in list pagination
   * @param size Optional page size for paginated result list.
   * @param sort Optional createdAt sort direction ASC or DESC
   * @param searchFilter Optional search filter
   * @param since Filter by created at after the given timestamp
   * @param before Filter by created at before the given timestamp
   */
  def getAllWebhooks(apiKey: String)(page: Option[Int] = None, size: Option[Int] = None, sort: Option[String] = None, searchFilter: Option[String] = None, since: Option[OffsetDateTime] = None, before: Option[OffsetDateTime] = None
): Request[Either[ResponseError[Exception], PageWebhookProjection], Nothing] =
    basicRequest
      .method(Method.GET, uri"$baseUrl/webhooks/paginated?page=${ page }&size=${ size }&sort=${ sort }&searchFilter=${ searchFilter }&since=${ since }&before=${ before }")
      .contentType("application/json")
      .header("x-api-key", apiKey)
      .response(asJson[PageWebhookProjection])

  /**
   * Expected answers:
   *   code 200 : PageWebhookProjection (OK)
   * 
   * Available security schemes:
   *   API_KEY (apiKey)
   * 
   * @param inboxId 
   * @param page Optional page index in list pagination
   * @param size Optional page size in list pagination
   * @param sort Optional createdAt sort direction ASC or DESC
   * @param searchFilter Optional search filter
   * @param since Filter by created at after the given timestamp
   * @param before Filter by created at before the given timestamp
   */
  def getInboxWebhooksPaginated(apiKey: String)(inboxId: UUID, page: Option[Int] = None, size: Option[Int] = None, sort: Option[String] = None, searchFilter: Option[String] = None, since: Option[OffsetDateTime] = None, before: Option[OffsetDateTime] = None
): Request[Either[ResponseError[Exception], PageWebhookProjection], Nothing] =
    basicRequest
      .method(Method.GET, uri"$baseUrl/inboxes/${inboxId}/webhooks/paginated?page=${ page }&size=${ size }&sort=${ sort }&searchFilter=${ searchFilter }&since=${ since }&before=${ before }")
      .contentType("application/json")
      .header("x-api-key", apiKey)
      .response(asJson[PageWebhookProjection])

  /**
   * Get JSON Schema definition for webhook payload
   * 
   * Expected answers:
   *   code 201 : JSONSchemaDto (Created)
   * 
   * Available security schemes:
   *   API_KEY (apiKey)
   * 
   * @param webhookId 
   */
  def getJsonSchemaForWebhookPayload(apiKey: String)(webhookId: UUID
): Request[Either[ResponseError[Exception], JSONSchemaDto], Nothing] =
    basicRequest
      .method(Method.POST, uri"$baseUrl/webhooks/${webhookId}/schema")
      .contentType("application/json")
      .header("x-api-key", apiKey)
      .response(asJson[JSONSchemaDto])

  /**
   * Get test webhook payload example. Response content depends on eventName passed. Uses `EMAIL_RECEIVED` as default.
   * 
   * Expected answers:
   *   code 200 : AbstractWebhookPayload (OK)
   * 
   * Available security schemes:
   *   API_KEY (apiKey)
   * 
   * @param eventName 
   */
  def getTestWebhookPayload(apiKey: String)(eventName: Option[String] = None
): Request[Either[ResponseError[Exception], AbstractWebhookPayload], Nothing] =
    basicRequest
      .method(Method.GET, uri"$baseUrl/webhooks/test?eventName=${ eventName }")
      .contentType("application/json")
      .header("x-api-key", apiKey)
      .response(asJson[AbstractWebhookPayload])

  /**
   * Get webhook test payload for email opened event
   * 
   * Expected answers:
   *   code 200 : WebhookEmailOpenedPayload (OK)
   * 
   * Available security schemes:
   *   API_KEY (apiKey)
   */
  def getTestWebhookPayloadEmailOpened(apiKey: String)(
): Request[Either[ResponseError[Exception], WebhookEmailOpenedPayload], Nothing] =
    basicRequest
      .method(Method.GET, uri"$baseUrl/webhooks/test/email-opened-payload")
      .contentType("application/json")
      .header("x-api-key", apiKey)
      .response(asJson[WebhookEmailOpenedPayload])

  /**
   * Get webhook test payload for email opened event
   * 
   * Expected answers:
   *   code 200 : WebhookEmailReadPayload (OK)
   * 
   * Available security schemes:
   *   API_KEY (apiKey)
   */
  def getTestWebhookPayloadEmailRead(apiKey: String)(
): Request[Either[ResponseError[Exception], WebhookEmailReadPayload], Nothing] =
    basicRequest
      .method(Method.GET, uri"$baseUrl/webhooks/test/email-read-payload")
      .contentType("application/json")
      .header("x-api-key", apiKey)
      .response(asJson[WebhookEmailReadPayload])

  /**
   * Get example payload for webhook
   * 
   * Expected answers:
   *   code 201 : AbstractWebhookPayload (Created)
   * 
   * Available security schemes:
   *   API_KEY (apiKey)
   * 
   * @param webhookId 
   */
  def getTestWebhookPayloadForWebhook(apiKey: String)(webhookId: UUID
): Request[Either[ResponseError[Exception], AbstractWebhookPayload], Nothing] =
    basicRequest
      .method(Method.POST, uri"$baseUrl/webhooks/${webhookId}/example")
      .contentType("application/json")
      .header("x-api-key", apiKey)
      .response(asJson[AbstractWebhookPayload])

  /**
   * Expected answers:
   *   code 200 : WebhookNewAttachmentPayload (OK)
   * 
   * Available security schemes:
   *   API_KEY (apiKey)
   */
  def getTestWebhookPayloadNewAttachment(apiKey: String)(
): Request[Either[ResponseError[Exception], WebhookNewAttachmentPayload], Nothing] =
    basicRequest
      .method(Method.GET, uri"$baseUrl/webhooks/test/new-attachment-payload")
      .contentType("application/json")
      .header("x-api-key", apiKey)
      .response(asJson[WebhookNewAttachmentPayload])

  /**
   * Expected answers:
   *   code 200 : WebhookNewContactPayload (OK)
   * 
   * Available security schemes:
   *   API_KEY (apiKey)
   */
  def getTestWebhookPayloadNewContact(apiKey: String)(
): Request[Either[ResponseError[Exception], WebhookNewContactPayload], Nothing] =
    basicRequest
      .method(Method.GET, uri"$baseUrl/webhooks/test/new-contact-payload")
      .contentType("application/json")
      .header("x-api-key", apiKey)
      .response(asJson[WebhookNewContactPayload])

  /**
   * Expected answers:
   *   code 200 : WebhookNewEmailPayload (OK)
   * 
   * Available security schemes:
   *   API_KEY (apiKey)
   */
  def getTestWebhookPayloadNewEmail(apiKey: String)(
): Request[Either[ResponseError[Exception], WebhookNewEmailPayload], Nothing] =
    basicRequest
      .method(Method.GET, uri"$baseUrl/webhooks/test/new-email-payload")
      .contentType("application/json")
      .header("x-api-key", apiKey)
      .response(asJson[WebhookNewEmailPayload])

  /**
   * Expected answers:
   *   code 200 : WebhookDto (OK)
   * 
   * Available security schemes:
   *   API_KEY (apiKey)
   * 
   * @param webhookId 
   */
  def getWebhook(apiKey: String)(webhookId: UUID
): Request[Either[ResponseError[Exception], WebhookDto], Nothing] =
    basicRequest
      .method(Method.GET, uri"$baseUrl/webhooks/${webhookId}")
      .contentType("application/json")
      .header("x-api-key", apiKey)
      .response(asJson[WebhookDto])

  /**
   * Expected answers:
   *   code 200 : WebhookResultDto (OK)
   * 
   * Available security schemes:
   *   API_KEY (apiKey)
   * 
   * @param webhookResultId Webhook Result ID
   */
  def getWebhookResult(apiKey: String)(webhookResultId: UUID
): Request[Either[ResponseError[Exception], WebhookResultDto], Nothing] =
    basicRequest
      .method(Method.GET, uri"$baseUrl/webhooks/results/${webhookResultId}")
      .contentType("application/json")
      .header("x-api-key", apiKey)
      .response(asJson[WebhookResultDto])

  /**
   * Expected answers:
   *   code 200 : PageWebhookResult (OK)
   * 
   * Available security schemes:
   *   API_KEY (apiKey)
   * 
   * @param webhookId ID of webhook to get results for
   * @param page Optional page index in list pagination
   * @param size Optional page size in list pagination
   * @param sort Optional createdAt sort direction ASC or DESC
   * @param searchFilter Optional search filter
   * @param since Filter by created at after the given timestamp
   * @param before Filter by created at before the given timestamp
   * @param unseenOnly Filter for unseen exceptions only
   */
  def getWebhookResults(apiKey: String)(webhookId: UUID, page: Option[Int] = None, size: Option[Int] = None, sort: Option[String] = None, searchFilter: Option[String] = None, since: Option[OffsetDateTime] = None, before: Option[OffsetDateTime] = None, unseenOnly: Option[Boolean] = None
): Request[Either[ResponseError[Exception], PageWebhookResult], Nothing] =
    basicRequest
      .method(Method.GET, uri"$baseUrl/webhooks/${webhookId}/results?page=${ page }&size=${ size }&sort=${ sort }&searchFilter=${ searchFilter }&since=${ since }&before=${ before }&unseenOnly=${ unseenOnly }")
      .contentType("application/json")
      .header("x-api-key", apiKey)
      .response(asJson[PageWebhookResult])

  /**
   * Expected answers:
   *   code 200 : UnseenErrorCountDto (OK)
   * 
   * Available security schemes:
   *   API_KEY (apiKey)
   * 
   * @param inboxId 
   */
  def getWebhookResultsUnseenErrorCount(apiKey: String)(inboxId: UUID
): Request[Either[ResponseError[Exception], UnseenErrorCountDto], Nothing] =
    basicRequest
      .method(Method.GET, uri"$baseUrl/webhooks/results/unseen-count")
      .contentType("application/json")
      .header("x-api-key", apiKey)
      .response(asJson[UnseenErrorCountDto])

  /**
   * Expected answers:
   *   code 200 : Seq[WebhookDto] (OK)
   * 
   * Available security schemes:
   *   API_KEY (apiKey)
   * 
   * @param inboxId 
   */
  def getWebhooks(apiKey: String)(inboxId: UUID
): Request[Either[ResponseError[Exception], Seq[WebhookDto]], Nothing] =
    basicRequest
      .method(Method.GET, uri"$baseUrl/inboxes/${inboxId}/webhooks")
      .contentType("application/json")
      .header("x-api-key", apiKey)
      .response(asJson[Seq[WebhookDto]])

  /**
   * Allows you to resend a webhook payload that was already sent. Webhooks that fail are retried automatically for 24 hours and then put in a dead letter queue. You can retry results manually using this method.
   * 
   * Expected answers:
   *   code 200 : WebhookRedriveResult (OK)
   * 
   * Available security schemes:
   *   API_KEY (apiKey)
   * 
   * @param webhookResultId Webhook Result ID
   */
  def redriveWebhookResult(apiKey: String)(webhookResultId: UUID
): Request[Either[ResponseError[Exception], WebhookRedriveResult], Nothing] =
    basicRequest
      .method(Method.POST, uri"$baseUrl/webhooks/results/${webhookResultId}/redrive")
      .contentType("application/json")
      .header("x-api-key", apiKey)
      .response(asJson[WebhookRedriveResult])

  /**
   * Expected answers:
   *   code 201 : WebhookTestResult (Created)
   * 
   * Available security schemes:
   *   API_KEY (apiKey)
   * 
   * @param webhookId 
   */
  def sendTestData(apiKey: String)(webhookId: UUID
): Request[Either[ResponseError[Exception], WebhookTestResult], Nothing] =
    basicRequest
      .method(Method.POST, uri"$baseUrl/webhooks/${webhookId}/test")
      .contentType("application/json")
      .header("x-api-key", apiKey)
      .response(asJson[WebhookTestResult])

}
