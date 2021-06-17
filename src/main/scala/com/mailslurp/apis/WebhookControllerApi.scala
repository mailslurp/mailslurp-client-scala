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

import com.mailslurp.modelspackageVersion&#x3D;12.1.30.AbstractWebhookPayload
import com.mailslurp.modelspackageVersion&#x3D;12.1.30.CreateWebhookOptions
import com.mailslurp.modelspackageVersion&#x3D;12.1.30.PageWebhookProjection
import com.mailslurp.modelspackageVersion&#x3D;12.1.30.PageWebhookResult
import java.util.UUID
import com.mailslurp.modelspackageVersion&#x3D;12.1.30.WebhookDto
import com.mailslurp.modelspackageVersion&#x3D;12.1.30.WebhookNewAttachmentPayload
import com.mailslurp.modelspackageVersion&#x3D;12.1.30.WebhookNewContactPayload
import com.mailslurp.modelspackageVersion&#x3D;12.1.30.WebhookNewEmailPayload
import com.mailslurp.modelspackageVersion&#x3D;12.1.30.WebhookResultEntity
import com.mailslurp.modelspackageVersion&#x3D;12.1.30.WebhookTestResult
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
   *   code 401 :  (Unauthorized)
   *   code 403 :  (Forbidden)
   *   code 404 :  (Not Found)
   * 
   * Available security schemes:
   *   API_KEY (apiKey)
   * 
   * @param inboxId inboxId
   * @param webhookOptions webhookOptions
   */
  def createWebhook(apiKey: String)(inboxId: UUID, webhookOptions: CreateWebhookOptions
): Request[Either[ResponseError[Exception], WebhookDto], Nothing] =
    basicRequest
      .method(Method.POST, uri"$baseUrl/inboxes/${inboxId}/webhooks")
      .contentType("application/json")
      .header("x-api-key", apiKey)
      .body(webhookOptions)
      .response(asJson[WebhookDto])

  /**
   * Expected answers:
   *   code 204 :  (No Content)
   *   code 401 :  (Unauthorized)
   *   code 403 :  (Forbidden)
   * 
   * Available security schemes:
   *   API_KEY (apiKey)
   * 
   * @param inboxId inboxId
   * @param webhookId webhookId
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
   *   code 401 :  (Unauthorized)
   *   code 403 :  (Forbidden)
   *   code 404 :  (Not Found)
   * 
   * Available security schemes:
   *   API_KEY (apiKey)
   * 
   * @param page Optional page index in list pagination
   * @param size Optional page size in list pagination
   * @param sort Optional createdAt sort direction ASC or DESC
   */
  def getAllWebhookResults(apiKey: String)(page: Option[Int] = None, size: Option[Int] = None, sort: Option[String] = None
): Request[Either[ResponseError[Exception], PageWebhookResult], Nothing] =
    basicRequest
      .method(Method.GET, uri"$baseUrl/webhooks/results?page=${ page }&size=${ size }&sort=${ sort }")
      .contentType("application/json")
      .header("x-api-key", apiKey)
      .response(asJson[PageWebhookResult])

  /**
   * List webhooks in paginated form. Allows for page index, page size, and sort direction.
   * 
   * Expected answers:
   *   code 200 : PageWebhookProjection (OK)
   *   code 401 :  (Unauthorized)
   *   code 403 :  (Forbidden)
   *   code 404 :  (Not Found)
   * 
   * Available security schemes:
   *   API_KEY (apiKey)
   * 
   * @param page Optional page index in list pagination
   * @param size Optional page size in list pagination
   * @param sort Optional createdAt sort direction ASC or DESC
   */
  def getAllWebhooks(apiKey: String)(page: Option[Int] = None, size: Option[Int] = None, sort: Option[String] = None
): Request[Either[ResponseError[Exception], PageWebhookProjection], Nothing] =
    basicRequest
      .method(Method.GET, uri"$baseUrl/webhooks/paginated?page=${ page }&size=${ size }&sort=${ sort }")
      .contentType("application/json")
      .header("x-api-key", apiKey)
      .response(asJson[PageWebhookProjection])

  /**
   * Expected answers:
   *   code 200 : AbstractWebhookPayload (OK)
   *   code 401 :  (Unauthorized)
   *   code 403 :  (Forbidden)
   *   code 404 :  (Not Found)
   * 
   * Available security schemes:
   *   API_KEY (apiKey)
   * 
   * @param eventName eventName
   */
  def getTestWebhookPayload(apiKey: String)(eventName: Option[String] = None
): Request[Either[ResponseError[Exception], AbstractWebhookPayload], Nothing] =
    basicRequest
      .method(Method.GET, uri"$baseUrl/webhooks/test?eventName=${ eventName }")
      .contentType("application/json")
      .header("x-api-key", apiKey)
      .response(asJson[AbstractWebhookPayload])

  /**
   * Expected answers:
   *   code 200 : WebhookNewAttachmentPayload (OK)
   *   code 401 :  (Unauthorized)
   *   code 403 :  (Forbidden)
   *   code 404 :  (Not Found)
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
   *   code 401 :  (Unauthorized)
   *   code 403 :  (Forbidden)
   *   code 404 :  (Not Found)
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
   *   code 401 :  (Unauthorized)
   *   code 403 :  (Forbidden)
   *   code 404 :  (Not Found)
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
   *   code 401 :  (Unauthorized)
   *   code 403 :  (Forbidden)
   *   code 404 :  (Not Found)
   * 
   * Available security schemes:
   *   API_KEY (apiKey)
   * 
   * @param webhookId webhookId
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
   *   code 200 : WebhookResultEntity (OK)
   *   code 401 :  (Unauthorized)
   *   code 403 :  (Forbidden)
   *   code 404 :  (Not Found)
   * 
   * Available security schemes:
   *   API_KEY (apiKey)
   * 
   * @param webhookResultId Webhook Result ID
   */
  def getWebhookResult(apiKey: String)(webhookResultId: UUID
): Request[Either[ResponseError[Exception], WebhookResultEntity], Nothing] =
    basicRequest
      .method(Method.GET, uri"$baseUrl/webhooks/results/${webhookResultId}")
      .contentType("application/json")
      .header("x-api-key", apiKey)
      .response(asJson[WebhookResultEntity])

  /**
   * Expected answers:
   *   code 200 : PageWebhookResult (OK)
   *   code 401 :  (Unauthorized)
   *   code 403 :  (Forbidden)
   *   code 404 :  (Not Found)
   * 
   * Available security schemes:
   *   API_KEY (apiKey)
   * 
   * @param webhookId ID of webhook to get results for
   * @param page Optional page index in list pagination
   * @param size Optional page size in list pagination
   * @param sort Optional createdAt sort direction ASC or DESC
   */
  def getWebhookResults(apiKey: String)(webhookId: UUID, page: Option[Int] = None, size: Option[Int] = None, sort: Option[String] = None
): Request[Either[ResponseError[Exception], PageWebhookResult], Nothing] =
    basicRequest
      .method(Method.GET, uri"$baseUrl/webhooks/${webhookId}/results?page=${ page }&size=${ size }&sort=${ sort }")
      .contentType("application/json")
      .header("x-api-key", apiKey)
      .response(asJson[PageWebhookResult])

  /**
   * Expected answers:
   *   code 200 : Seq[WebhookDto] (OK)
   *   code 401 :  (Unauthorized)
   *   code 403 :  (Forbidden)
   *   code 404 :  (Not Found)
   * 
   * Available security schemes:
   *   API_KEY (apiKey)
   * 
   * @param inboxId inboxId
   */
  def getWebhooks(apiKey: String)(inboxId: UUID
): Request[Either[ResponseError[Exception], Seq[WebhookDto]], Nothing] =
    basicRequest
      .method(Method.GET, uri"$baseUrl/inboxes/${inboxId}/webhooks")
      .contentType("application/json")
      .header("x-api-key", apiKey)
      .response(asJson[Seq[WebhookDto]])

  /**
   * Expected answers:
   *   code 201 : WebhookTestResult (Created)
   *   code 401 :  (Unauthorized)
   *   code 403 :  (Forbidden)
   *   code 404 :  (Not Found)
   * 
   * Available security schemes:
   *   API_KEY (apiKey)
   * 
   * @param webhookId webhookId
   */
  def sendTestData(apiKey: String)(webhookId: UUID
): Request[Either[ResponseError[Exception], WebhookTestResult], Nothing] =
    basicRequest
      .method(Method.POST, uri"$baseUrl/webhooks/${webhookId}/test")
      .contentType("application/json")
      .header("x-api-key", apiKey)
      .response(asJson[WebhookTestResult])

}
