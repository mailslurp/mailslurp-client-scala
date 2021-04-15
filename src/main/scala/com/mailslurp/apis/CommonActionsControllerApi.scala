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

import com.mailslurp.modelspackageVersion&#x3D;11.6.24.Inbox
import java.time.OffsetDateTime
import com.mailslurp.modelspackageVersion&#x3D;11.6.24.SimpleSendEmailOptions
import java.util.UUID
import com.mailslurp.client.core.JsonSupport._
import sttp.client._
import sttp.model.Method

object CommonActionsControllerApi {

def apply(baseUrl: String = "https://api.mailslurp.com") = new CommonActionsControllerApi(baseUrl)
}

class CommonActionsControllerApi(baseUrl: String) {

  /**
   * Returns an Inbox with an `id` and an `emailAddress`
   * 
   * Expected answers:
   *   code 201 : Inbox (Created)
   *   code 401 :  (Unauthorized)
   *   code 403 :  (Forbidden)
   *   code 404 :  (Not Found)
   * 
   * Available security schemes:
   *   API_KEY (apiKey)
   * 
   * @param allowTeamAccess allowTeamAccess
   * @param expiresAt expiresAt
   * @param expiresIn expiresIn
   * @param useDomainPool useDomainPool
   */
  def createNewEmailAddress(apiKey: String)(allowTeamAccess: Option[Boolean] = None, expiresAt: Option[OffsetDateTime] = None, expiresIn: Option[Long] = None, useDomainPool: Option[Boolean] = None
): Request[Either[ResponseError[Exception], Inbox], Nothing] =
    basicRequest
      .method(Method.POST, uri"$baseUrl/createInbox?allowTeamAccess=${ allowTeamAccess }&expiresAt=${ expiresAt }&expiresIn=${ expiresIn }&useDomainPool=${ useDomainPool }")
      .contentType("application/json")
      .header("x-api-key", apiKey)
      .response(asJson[Inbox])

  /**
   * Returns an Inbox with an `id` and an `emailAddress`
   * 
   * Expected answers:
   *   code 201 : Inbox (Created)
   *   code 401 :  (Unauthorized)
   *   code 403 :  (Forbidden)
   *   code 404 :  (Not Found)
   * 
   * Available security schemes:
   *   API_KEY (apiKey)
   * 
   * @param allowTeamAccess allowTeamAccess
   * @param expiresAt expiresAt
   * @param expiresIn expiresIn
   * @param useDomainPool useDomainPool
   */
  def createNewEmailAddress1(apiKey: String)(allowTeamAccess: Option[Boolean] = None, expiresAt: Option[OffsetDateTime] = None, expiresIn: Option[Long] = None, useDomainPool: Option[Boolean] = None
): Request[Either[ResponseError[Exception], Inbox], Nothing] =
    basicRequest
      .method(Method.POST, uri"$baseUrl/newEmailAddress?allowTeamAccess=${ allowTeamAccess }&expiresAt=${ expiresAt }&expiresIn=${ expiresIn }&useDomainPool=${ useDomainPool }")
      .contentType("application/json")
      .header("x-api-key", apiKey)
      .response(asJson[Inbox])

  /**
   * Deletes all emails
   * 
   * Expected answers:
   *   code 204 :  (No Content)
   *   code 401 :  (Unauthorized)
   *   code 403 :  (Forbidden)
   * 
   * Available security schemes:
   *   API_KEY (apiKey)
   * 
   * @param inboxId inboxId
   */
  def emptyInbox(apiKey: String)(inboxId: UUID
): Request[Either[ResponseError[Exception], Unit], Nothing] =
    basicRequest
      .method(Method.DELETE, uri"$baseUrl/emptyInbox?inboxId=${ inboxId }")
      .contentType("application/json")
      .header("x-api-key", apiKey)
      .response(asJson[Unit])

  /**
   * If no senderId or inboxId provided a random email address will be used to send from.
   * 
   * Expected answers:
   *   code 201 :  (Created)
   *   code 401 :  (Unauthorized)
   *   code 403 :  (Forbidden)
   *   code 404 :  (Not Found)
   * 
   * Available security schemes:
   *   API_KEY (apiKey)
   * 
   * @param emailOptions emailOptions
   */
  def sendEmailSimple(apiKey: String)(emailOptions: SimpleSendEmailOptions
): Request[Either[ResponseError[Exception], Unit], Nothing] =
    basicRequest
      .method(Method.POST, uri"$baseUrl/sendEmail")
      .contentType("application/json")
      .header("x-api-key", apiKey)
      .body(emailOptions)
      .response(asJson[Unit])

}
