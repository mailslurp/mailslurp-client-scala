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

import com.mailslurp.modelspackageVersion&#x3D;11.7.509.CreateWebhookOptions
import com.mailslurp.modelspackageVersion&#x3D;11.7.509.PageWebhookProjection
import java.util.UUID
import com.mailslurp.modelspackageVersion&#x3D;11.7.509.WebhookDto
import com.mailslurp.modelspackageVersion&#x3D;11.7.509.WebhookTestResult
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
   * @param page Optional page index in inbox list pagination
   * @param size Optional page size in inbox list pagination
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
