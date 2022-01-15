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

import com.mailslurp.modelspackageVersion&#x3D;15.2.6.InboxDto
import java.time.OffsetDateTime
import com.mailslurp.modelspackageVersion&#x3D;15.2.6.SimpleSendEmailOptions
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
   *   code 201 : InboxDto (Created)
   * 
   * Available security schemes:
   *   API_KEY (apiKey)
   * 
   * @param allowTeamAccess 
   * @param useDomainPool 
   * @param expiresAt 
   * @param expiresIn 
   * @param emailAddress 
   * @param inboxType 
   * @param description 
   * @param name 
   * @param tags 
   * @param favourite 
   */
  def createNewEmailAddress(apiKey: String)(allowTeamAccess: Option[Boolean] = None, useDomainPool: Option[Boolean] = None, expiresAt: Option[OffsetDateTime] = None, expiresIn: Option[Long] = None, emailAddress: Option[String] = None, inboxType: Option[String] = None, description: Option[String] = None, name: Option[String] = None, tags: Seq[String], favourite: Option[Boolean] = None
): Request[Either[ResponseError[Exception], InboxDto], Nothing] =
    basicRequest
      .method(Method.POST, uri"$baseUrl/newEmailAddress?allowTeamAccess=${ allowTeamAccess }&useDomainPool=${ useDomainPool }&expiresAt=${ expiresAt }&expiresIn=${ expiresIn }&emailAddress=${ emailAddress }&inboxType=${ inboxType }&description=${ description }&name=${ name }&tags=${ tags }&favourite=${ favourite }")
      .contentType("application/json")
      .header("x-api-key", apiKey)
      .response(asJson[InboxDto])

  /**
   * Returns an Inbox with an `id` and an `emailAddress`
   * 
   * Expected answers:
   *   code 201 : InboxDto (Created)
   * 
   * Available security schemes:
   *   API_KEY (apiKey)
   * 
   * @param allowTeamAccess 
   * @param useDomainPool 
   * @param expiresAt 
   * @param expiresIn 
   * @param emailAddress 
   * @param inboxType 
   * @param description 
   * @param name 
   * @param tags 
   * @param favourite 
   */
  def createRandomInbox(apiKey: String)(allowTeamAccess: Option[Boolean] = None, useDomainPool: Option[Boolean] = None, expiresAt: Option[OffsetDateTime] = None, expiresIn: Option[Long] = None, emailAddress: Option[String] = None, inboxType: Option[String] = None, description: Option[String] = None, name: Option[String] = None, tags: Seq[String], favourite: Option[Boolean] = None
): Request[Either[ResponseError[Exception], InboxDto], Nothing] =
    basicRequest
      .method(Method.POST, uri"$baseUrl/createInbox?allowTeamAccess=${ allowTeamAccess }&useDomainPool=${ useDomainPool }&expiresAt=${ expiresAt }&expiresIn=${ expiresIn }&emailAddress=${ emailAddress }&inboxType=${ inboxType }&description=${ description }&name=${ name }&tags=${ tags }&favourite=${ favourite }")
      .contentType("application/json")
      .header("x-api-key", apiKey)
      .response(asJson[InboxDto])

  /**
   * Deletes inbox email address
   * 
   * Expected answers:
   *   code 204 :  (No Content)
   * 
   * Available security schemes:
   *   API_KEY (apiKey)
   * 
   * @param inboxId 
   */
  def deleteEmailAddress(apiKey: String)(inboxId: UUID
): Request[Either[ResponseError[Exception], Unit], Nothing] =
    basicRequest
      .method(Method.DELETE, uri"$baseUrl/deleteEmailAddress?inboxId=${ inboxId }")
      .contentType("application/json")
      .header("x-api-key", apiKey)
      .response(asJson[Unit])

  /**
   * Deletes all emails
   * 
   * Expected answers:
   *   code 204 :  (No Content)
   * 
   * Available security schemes:
   *   API_KEY (apiKey)
   * 
   * @param inboxId 
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
   * 
   * Available security schemes:
   *   API_KEY (apiKey)
   * 
   * @param simpleSendEmailOptions 
   */
  def sendEmailSimple(apiKey: String)(simpleSendEmailOptions: SimpleSendEmailOptions
): Request[Either[ResponseError[Exception], Unit], Nothing] =
    basicRequest
      .method(Method.POST, uri"$baseUrl/sendEmail")
      .contentType("application/json")
      .header("x-api-key", apiKey)
      .body(simpleSendEmailOptions)
      .response(asJson[Unit])

}
