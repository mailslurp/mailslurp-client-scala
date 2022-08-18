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

import com.mailslurp.modelspackageVersion&#x3D;15.13.18.AliasDto
import com.mailslurp.modelspackageVersion&#x3D;15.13.18.CreateAliasOptions
import java.time.OffsetDateTime
import com.mailslurp.modelspackageVersion&#x3D;15.13.18.PageAlias
import com.mailslurp.modelspackageVersion&#x3D;15.13.18.PageEmailProjection
import com.mailslurp.modelspackageVersion&#x3D;15.13.18.PageThreadProjection
import com.mailslurp.modelspackageVersion&#x3D;15.13.18.ReplyToAliasEmailOptions
import com.mailslurp.modelspackageVersion&#x3D;15.13.18.SendEmailOptions
import com.mailslurp.modelspackageVersion&#x3D;15.13.18.SentEmailDto
import java.util.UUID
import com.mailslurp.modelspackageVersion&#x3D;15.13.18.UpdateAliasOptions
import com.mailslurp.client.core.JsonSupport._
import sttp.client._
import sttp.model.Method

object AliasControllerApi {

def apply(baseUrl: String = "https://api.mailslurp.com") = new AliasControllerApi(baseUrl)
}

class AliasControllerApi(baseUrl: String) {

  /**
   * Email aliases use a MailSlurp randomly generated email address (or a custom domain inbox that you provide) to mask or proxy a real email address. Emails sent to the alias address will be forwarded to the hidden email address it was created for. If you want to send a reply use the threadId attached
   * 
   * Expected answers:
   *   code 201 : AliasDto (Created)
   * 
   * Available security schemes:
   *   API_KEY (apiKey)
   * 
   * @param createAliasOptions 
   */
  def createAlias(apiKey: String)(createAliasOptions: CreateAliasOptions
): Request[Either[ResponseError[Exception], AliasDto], Nothing] =
    basicRequest
      .method(Method.POST, uri"$baseUrl/aliases")
      .contentType("application/json")
      .header("x-api-key", apiKey)
      .body(createAliasOptions)
      .response(asJson[AliasDto])

  /**
   * Expected answers:
   *   code 204 :  (No Content)
   * 
   * Available security schemes:
   *   API_KEY (apiKey)
   * 
   * @param aliasId 
   */
  def deleteAlias(apiKey: String)(aliasId: UUID
): Request[Either[ResponseError[Exception], Unit], Nothing] =
    basicRequest
      .method(Method.DELETE, uri"$baseUrl/aliases/${aliasId}")
      .contentType("application/json")
      .header("x-api-key", apiKey)
      .response(asJson[Unit])

  /**
   * Get an email alias by ID
   * 
   * Expected answers:
   *   code 200 : AliasDto (OK)
   * 
   * Available security schemes:
   *   API_KEY (apiKey)
   * 
   * @param aliasId 
   */
  def getAlias(apiKey: String)(aliasId: UUID
): Request[Either[ResponseError[Exception], AliasDto], Nothing] =
    basicRequest
      .method(Method.GET, uri"$baseUrl/aliases/${aliasId}")
      .contentType("application/json")
      .header("x-api-key", apiKey)
      .response(asJson[AliasDto])

  /**
   * Get paginated emails for an alias by ID
   * 
   * Expected answers:
   *   code 200 : PageEmailProjection (OK)
   * 
   * Available security schemes:
   *   API_KEY (apiKey)
   * 
   * @param aliasId 
   * @param page Optional page index alias email list pagination
   * @param size Optional page size alias email list pagination
   * @param sort Optional createdAt sort direction ASC or DESC
   * @param since Optional filter by sent after given date time
   * @param before Optional filter by sent before given date time
   */
  def getAliasEmails(apiKey: String)(aliasId: UUID, page: Option[Int] = None, size: Option[Int] = None, sort: Option[String] = None, since: Option[OffsetDateTime] = None, before: Option[OffsetDateTime] = None
): Request[Either[ResponseError[Exception], PageEmailProjection], Nothing] =
    basicRequest
      .method(Method.GET, uri"$baseUrl/aliases/${aliasId}/emails?page=${ page }&size=${ size }&sort=${ sort }&since=${ since }&before=${ before }")
      .contentType("application/json")
      .header("x-api-key", apiKey)
      .response(asJson[PageEmailProjection])

  /**
   * Returns threads created for an email alias in paginated form
   * 
   * Expected answers:
   *   code 200 : PageThreadProjection (OK)
   * 
   * Available security schemes:
   *   API_KEY (apiKey)
   * 
   * @param aliasId 
   * @param page Optional page index in thread list pagination
   * @param size Optional page size in thread list pagination
   * @param sort Optional createdAt sort direction ASC or DESC
   * @param since Optional filter by sent after given date time
   * @param before Optional filter by sent before given date time
   */
  def getAliasThreads(apiKey: String)(aliasId: UUID, page: Option[Int] = None, size: Option[Int] = None, sort: Option[String] = None, since: Option[OffsetDateTime] = None, before: Option[OffsetDateTime] = None
): Request[Either[ResponseError[Exception], PageThreadProjection], Nothing] =
    basicRequest
      .method(Method.GET, uri"$baseUrl/aliases/${aliasId}/threads?page=${ page }&size=${ size }&sort=${ sort }&since=${ since }&before=${ before }")
      .contentType("application/json")
      .header("x-api-key", apiKey)
      .response(asJson[PageThreadProjection])

  /**
   * Get all email aliases in paginated form
   * 
   * Expected answers:
   *   code 200 : PageAlias (OK)
   * 
   * Available security schemes:
   *   API_KEY (apiKey)
   * 
   * @param page Optional page index in alias list pagination
   * @param size Optional page size in alias list pagination
   * @param sort Optional createdAt sort direction ASC or DESC
   * @param since Filter by created at after the given timestamp
   * @param before Filter by created at before the given timestamp
   */
  def getAliases(apiKey: String)(page: Option[Int] = None, size: Option[Int] = None, sort: Option[String] = None, since: Option[OffsetDateTime] = None, before: Option[OffsetDateTime] = None
): Request[Either[ResponseError[Exception], PageAlias], Nothing] =
    basicRequest
      .method(Method.GET, uri"$baseUrl/aliases?page=${ page }&size=${ size }&sort=${ sort }&since=${ since }&before=${ before }")
      .contentType("application/json")
      .header("x-api-key", apiKey)
      .response(asJson[PageAlias])

  /**
   * Send the reply to the email sender or reply-to and include same subject cc bcc etc. Reply to an email and the contents will be sent with the existing subject to the emails `to`, `cc`, and `bcc`.
   * 
   * Expected answers:
   *   code 200 : SentEmailDto (OK)
   * 
   * Available security schemes:
   *   API_KEY (apiKey)
   * 
   * @param aliasId ID of the alias that email belongs to
   * @param emailId ID of the email that should be replied to
   * @param replyToAliasEmailOptions 
   */
  def replyToAliasEmail(apiKey: String)(aliasId: UUID, emailId: UUID, replyToAliasEmailOptions: ReplyToAliasEmailOptions
): Request[Either[ResponseError[Exception], SentEmailDto], Nothing] =
    basicRequest
      .method(Method.PUT, uri"$baseUrl/aliases/${aliasId}/emails/${emailId}")
      .contentType("application/json")
      .header("x-api-key", apiKey)
      .body(replyToAliasEmailOptions)
      .response(asJson[SentEmailDto])

  /**
   * Send an email from an alias. Replies to the email will be forwarded to the alias masked email address
   * 
   * Expected answers:
   *   code 200 : SentEmailDto (OK)
   * 
   * Available security schemes:
   *   API_KEY (apiKey)
   * 
   * @param aliasId 
   * @param sendEmailOptions 
   */
  def sendAliasEmail(apiKey: String)(aliasId: UUID, sendEmailOptions: SendEmailOptions
): Request[Either[ResponseError[Exception], SentEmailDto], Nothing] =
    basicRequest
      .method(Method.POST, uri"$baseUrl/aliases/${aliasId}/emails")
      .contentType("application/json")
      .header("x-api-key", apiKey)
      .body(sendEmailOptions)
      .response(asJson[SentEmailDto])

  /**
   * Expected answers:
   *   code 202 : AliasDto (Accepted)
   * 
   * Available security schemes:
   *   API_KEY (apiKey)
   * 
   * @param aliasId 
   * @param updateAliasOptions 
   */
  def updateAlias(apiKey: String)(aliasId: UUID, updateAliasOptions: UpdateAliasOptions
): Request[Either[ResponseError[Exception], AliasDto], Nothing] =
    basicRequest
      .method(Method.PUT, uri"$baseUrl/aliases/${aliasId}")
      .contentType("application/json")
      .header("x-api-key", apiKey)
      .body(updateAliasOptions)
      .response(asJson[AliasDto])

}
