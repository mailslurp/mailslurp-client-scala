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

import com.mailslurp.modelspackageVersion&#x3D;11.7.1.BulkSendEmailOptions
import com.mailslurp.modelspackageVersion&#x3D;11.7.1.Inbox
import java.util.UUID
import com.mailslurp.client.core.JsonSupport._
import sttp.client._
import sttp.model.Method

object BulkActionsControllerApi {

def apply(baseUrl: String = "https://api.mailslurp.com") = new BulkActionsControllerApi(baseUrl)
}

class BulkActionsControllerApi(baseUrl: String) {

  /**
   * Expected answers:
   *   code 201 : Seq[Inbox] (Created)
   *   code 401 :  (Unauthorized)
   *   code 403 :  (Forbidden)
   *   code 404 :  (Not Found)
   * 
   * Available security schemes:
   *   API_KEY (apiKey)
   * 
   * @param count Number of inboxes to be created in bulk
   */
  def bulkCreateInboxes(apiKey: String)(count: Int
): Request[Either[ResponseError[Exception], Seq[Inbox]], Nothing] =
    basicRequest
      .method(Method.POST, uri"$baseUrl/bulk/inboxes?count=${ count }")
      .contentType("application/json")
      .header("x-api-key", apiKey)
      .response(asJson[Seq[Inbox]])

  /**
   * Expected answers:
   *   code 204 :  (No Content)
   *   code 401 :  (Unauthorized)
   *   code 403 :  (Forbidden)
   * 
   * Available security schemes:
   *   API_KEY (apiKey)
   * 
   * @param ids ids
   */
  def bulkDeleteInboxes(apiKey: String)(ids: Seq[UUID]
): Request[Either[ResponseError[Exception], Unit], Nothing] =
    basicRequest
      .method(Method.DELETE, uri"$baseUrl/bulk/inboxes")
      .contentType("application/json")
      .header("x-api-key", apiKey)
      .body(ids)
      .response(asJson[Unit])

  /**
   * Expected answers:
   *   code 201 :  (Created)
   *   code 401 :  (Unauthorized)
   *   code 403 :  (Forbidden)
   *   code 404 :  (Not Found)
   * 
   * Available security schemes:
   *   API_KEY (apiKey)
   * 
   * @param bulkSendEmailOptions bulkSendEmailOptions
   */
  def bulkSendEmails(apiKey: String)(bulkSendEmailOptions: BulkSendEmailOptions
): Request[Either[ResponseError[Exception], Unit], Nothing] =
    basicRequest
      .method(Method.POST, uri"$baseUrl/bulk/send")
      .contentType("application/json")
      .header("x-api-key", apiKey)
      .body(bulkSendEmailOptions)
      .response(asJson[Unit])

}
