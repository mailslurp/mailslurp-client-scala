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

import com.mailslurp.modelspackageVersion&#x3D;15.19.6.ImapServerFetchResult
import com.mailslurp.modelspackageVersion&#x3D;15.19.6.ImapServerListOptions
import com.mailslurp.modelspackageVersion&#x3D;15.19.6.ImapServerListResult
import com.mailslurp.modelspackageVersion&#x3D;15.19.6.ImapServerSearchOptions
import com.mailslurp.modelspackageVersion&#x3D;15.19.6.ImapServerSearchResult
import com.mailslurp.modelspackageVersion&#x3D;15.19.6.ImapServerStatusOptions
import com.mailslurp.modelspackageVersion&#x3D;15.19.6.ImapServerStatusResult
import com.mailslurp.modelspackageVersion&#x3D;15.19.6.ImapUpdateFlagsOptions
import java.util.UUID
import com.mailslurp.client.core.JsonSupport._
import sttp.client._
import sttp.model.Method

object ImapControllerApi {

def apply(baseUrl: String = "https://api.mailslurp.com") = new ImapControllerApi(baseUrl)
}

class ImapControllerApi(baseUrl: String) {

  /**
   * Expected answers:
   *   code 200 : ImapServerFetchResult (OK)
   * 
   * Available security schemes:
   *   API_KEY (apiKey)
   * 
   * @param seqNum 
   * @param inboxId Inbox ID to search
   */
  def imapServerFetch(apiKey: String)(seqNum: Long, inboxId: Option[UUID] = None
): Request[Either[ResponseError[Exception], ImapServerFetchResult], Nothing] =
    basicRequest
      .method(Method.POST, uri"$baseUrl/imap/server/fetch?inboxId=${ inboxId }&seqNum=${ seqNum }")
      .contentType("application/json")
      .header("x-api-key", apiKey)
      .response(asJson[ImapServerFetchResult])

  /**
   * Expected answers:
   *   code 200 : ImapServerListResult (OK)
   * 
   * Available security schemes:
   *   API_KEY (apiKey)
   * 
   * @param imapServerListOptions 
   * @param inboxId Inbox ID to list
   */
  def imapServerList(apiKey: String)(imapServerListOptions: ImapServerListOptions, inboxId: Option[UUID] = None
): Request[Either[ResponseError[Exception], ImapServerListResult], Nothing] =
    basicRequest
      .method(Method.POST, uri"$baseUrl/imap/server/list?inboxId=${ inboxId }")
      .contentType("application/json")
      .header("x-api-key", apiKey)
      .body(imapServerListOptions)
      .response(asJson[ImapServerListResult])

  /**
   * Expected answers:
   *   code 200 : ImapServerSearchResult (OK)
   * 
   * Available security schemes:
   *   API_KEY (apiKey)
   * 
   * @param imapServerSearchOptions 
   * @param inboxId Inbox ID to search
   */
  def imapServerSearch(apiKey: String)(imapServerSearchOptions: ImapServerSearchOptions, inboxId: Option[UUID] = None
): Request[Either[ResponseError[Exception], ImapServerSearchResult], Nothing] =
    basicRequest
      .method(Method.POST, uri"$baseUrl/imap/server/search?inboxId=${ inboxId }")
      .contentType("application/json")
      .header("x-api-key", apiKey)
      .body(imapServerSearchOptions)
      .response(asJson[ImapServerSearchResult])

  /**
   * Expected answers:
   *   code 200 : ImapServerStatusResult (OK)
   * 
   * Available security schemes:
   *   API_KEY (apiKey)
   * 
   * @param imapServerStatusOptions 
   * @param inboxId Inbox ID to list
   */
  def imapServerStatus(apiKey: String)(imapServerStatusOptions: ImapServerStatusOptions, inboxId: Option[UUID] = None
): Request[Either[ResponseError[Exception], ImapServerStatusResult], Nothing] =
    basicRequest
      .method(Method.POST, uri"$baseUrl/imap/server/status?inboxId=${ inboxId }")
      .contentType("application/json")
      .header("x-api-key", apiKey)
      .body(imapServerStatusOptions)
      .response(asJson[ImapServerStatusResult])

  /**
   * Update message flags
   * 
   * Expected answers:
   *   code 204 :  (No Content)
   * 
   * Available security schemes:
   *   API_KEY (apiKey)
   * 
   * @param imapUpdateFlagsOptions 
   * @param inboxId 
   */
  def imapServerUpdateFlags(apiKey: String)(imapUpdateFlagsOptions: ImapUpdateFlagsOptions, inboxId: Option[UUID] = None
): Request[Either[ResponseError[Exception], Unit], Nothing] =
    basicRequest
      .method(Method.POST, uri"$baseUrl/imap/server/update-flags?inboxId=${ inboxId }")
      .contentType("application/json")
      .header("x-api-key", apiKey)
      .body(imapUpdateFlagsOptions)
      .response(asJson[Unit])

}
