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

import com.mailslurp.modelspackageVersion&#x3D;15.19.22.ConnectorDto
import com.mailslurp.modelspackageVersion&#x3D;15.19.22.ConnectorImapConnectionDto
import com.mailslurp.modelspackageVersion&#x3D;15.19.22.ConnectorSmtpConnectionDto
import com.mailslurp.modelspackageVersion&#x3D;15.19.22.ConnectorSyncEventDto
import com.mailslurp.modelspackageVersion&#x3D;15.19.22.ConnectorSyncRequestResult
import com.mailslurp.modelspackageVersion&#x3D;15.19.22.CreateConnectorImapConnectionOptions
import com.mailslurp.modelspackageVersion&#x3D;15.19.22.CreateConnectorOptions
import com.mailslurp.modelspackageVersion&#x3D;15.19.22.CreateConnectorSmtpConnectionOptions
import java.time.OffsetDateTime
import com.mailslurp.modelspackageVersion&#x3D;15.19.22.PageConnector
import com.mailslurp.modelspackageVersion&#x3D;15.19.22.PageConnectorSyncEvents
import java.util.UUID
import com.mailslurp.client.core.JsonSupport._
import sttp.client._
import sttp.model.Method

object ConnectorControllerApi {

def apply(baseUrl: String = "https://api.mailslurp.com") = new ConnectorControllerApi(baseUrl)
}

class ConnectorControllerApi(baseUrl: String) {

  /**
   * Sync emails between external mailboxes and MailSlurp inboxes
   * 
   * Expected answers:
   *   code 201 : ConnectorDto (Created)
   * 
   * Available security schemes:
   *   API_KEY (apiKey)
   * 
   * @param createConnectorOptions 
   */
  def createConnector(apiKey: String)(createConnectorOptions: CreateConnectorOptions
): Request[Either[ResponseError[Exception], ConnectorDto], Nothing] =
    basicRequest
      .method(Method.POST, uri"$baseUrl/connectors")
      .contentType("application/json")
      .header("x-api-key", apiKey)
      .body(createConnectorOptions)
      .response(asJson[ConnectorDto])

  /**
   * Allows the reading of emails in an external mailbox and syncing to a MailSlurp inbox
   * 
   * Expected answers:
   *   code 201 : ConnectorImapConnectionDto (Created)
   * 
   * Available security schemes:
   *   API_KEY (apiKey)
   * 
   * @param id 
   * @param createConnectorImapConnectionOptions 
   */
  def createConnectorImapConnection(apiKey: String)(id: UUID, createConnectorImapConnectionOptions: CreateConnectorImapConnectionOptions
): Request[Either[ResponseError[Exception], ConnectorImapConnectionDto], Nothing] =
    basicRequest
      .method(Method.POST, uri"$baseUrl/connectors/${id}/imap")
      .contentType("application/json")
      .header("x-api-key", apiKey)
      .body(createConnectorImapConnectionOptions)
      .response(asJson[ConnectorImapConnectionDto])

  /**
   * Allows sending via connector and email is routed to connected inbox and sent via SMTP
   * 
   * Expected answers:
   *   code 201 : ConnectorSmtpConnectionDto (Created)
   * 
   * Available security schemes:
   *   API_KEY (apiKey)
   * 
   * @param id 
   * @param createConnectorSmtpConnectionOptions 
   */
  def createConnectorSmtpConnection(apiKey: String)(id: UUID, createConnectorSmtpConnectionOptions: CreateConnectorSmtpConnectionOptions
): Request[Either[ResponseError[Exception], ConnectorSmtpConnectionDto], Nothing] =
    basicRequest
      .method(Method.POST, uri"$baseUrl/connectors/${id}/smtp")
      .contentType("application/json")
      .header("x-api-key", apiKey)
      .body(createConnectorSmtpConnectionOptions)
      .response(asJson[ConnectorSmtpConnectionDto])

  /**
   * Expected answers:
   *   code 204 :  (No Content)
   * 
   * Available security schemes:
   *   API_KEY (apiKey)
   */
  def deleteAllConnector(apiKey: String)(
): Request[Either[ResponseError[Exception], Unit], Nothing] =
    basicRequest
      .method(Method.DELETE, uri"$baseUrl/connectors")
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
  def deleteConnector(apiKey: String)(id: UUID
): Request[Either[ResponseError[Exception], Unit], Nothing] =
    basicRequest
      .method(Method.DELETE, uri"$baseUrl/connectors/${id}")
      .contentType("application/json")
      .header("x-api-key", apiKey)
      .response(asJson[Unit])

  /**
   * Delete IMAP connection for external inbox
   * 
   * Expected answers:
   *   code 204 :  (No Content)
   * 
   * Available security schemes:
   *   API_KEY (apiKey)
   * 
   * @param id 
   */
  def deleteConnectorImapConnection(apiKey: String)(id: UUID
): Request[Either[ResponseError[Exception], Unit], Nothing] =
    basicRequest
      .method(Method.DELETE, uri"$baseUrl/connectors/${id}/imap")
      .contentType("application/json")
      .header("x-api-key", apiKey)
      .response(asJson[Unit])

  /**
   * Delete SMTP connection for external inbox
   * 
   * Expected answers:
   *   code 204 :  (No Content)
   * 
   * Available security schemes:
   *   API_KEY (apiKey)
   * 
   * @param id 
   */
  def deleteConnectorSmtpConnection(apiKey: String)(id: UUID
): Request[Either[ResponseError[Exception], Unit], Nothing] =
    basicRequest
      .method(Method.DELETE, uri"$baseUrl/connectors/${id}/smtp")
      .contentType("application/json")
      .header("x-api-key", apiKey)
      .response(asJson[Unit])

  /**
   * Expected answers:
   *   code 200 : PageConnectorSyncEvents (OK)
   * 
   * Available security schemes:
   *   API_KEY (apiKey)
   * 
   * @param page Optional page index in connector list pagination
   * @param size Optional page size in connector list pagination
   * @param sort Optional createdAt sort direction ASC or DESC
   * @param since Filter by created at after the given timestamp
   * @param before Filter by created at before the given timestamp
   */
  def getAllConnectorSyncEvents(apiKey: String)(page: Option[Int] = None, size: Option[Int] = None, sort: Option[String] = None, since: Option[OffsetDateTime] = None, before: Option[OffsetDateTime] = None
): Request[Either[ResponseError[Exception], PageConnectorSyncEvents], Nothing] =
    basicRequest
      .method(Method.GET, uri"$baseUrl/connectors/events?page=${ page }&size=${ size }&sort=${ sort }&since=${ since }&before=${ before }")
      .contentType("application/json")
      .header("x-api-key", apiKey)
      .response(asJson[PageConnectorSyncEvents])

  /**
   * Expected answers:
   *   code 200 : ConnectorDto (OK)
   * 
   * Available security schemes:
   *   API_KEY (apiKey)
   * 
   * @param id 
   */
  def getConnector(apiKey: String)(id: UUID
): Request[Either[ResponseError[Exception], ConnectorDto], Nothing] =
    basicRequest
      .method(Method.GET, uri"$baseUrl/connectors/${id}")
      .contentType("application/json")
      .header("x-api-key", apiKey)
      .response(asJson[ConnectorDto])

  /**
   * Expected answers:
   *   code 200 : ConnectorSyncEventDto (OK)
   * 
   * Available security schemes:
   *   API_KEY (apiKey)
   * 
   * @param id 
   */
  def getConnectorSyncEvent(apiKey: String)(id: UUID
): Request[Either[ResponseError[Exception], ConnectorSyncEventDto], Nothing] =
    basicRequest
      .method(Method.GET, uri"$baseUrl/connectors/events/${id}")
      .contentType("application/json")
      .header("x-api-key", apiKey)
      .response(asJson[ConnectorSyncEventDto])

  /**
   * Expected answers:
   *   code 200 : PageConnectorSyncEvents (OK)
   * 
   * Available security schemes:
   *   API_KEY (apiKey)
   * 
   * @param id 
   * @param page Optional page index in connector list pagination
   * @param size Optional page size in connector list pagination
   * @param sort Optional createdAt sort direction ASC or DESC
   * @param since Filter by created at after the given timestamp
   * @param before Filter by created at before the given timestamp
   */
  def getConnectorSyncEvents(apiKey: String)(id: UUID, page: Option[Int] = None, size: Option[Int] = None, sort: Option[String] = None, since: Option[OffsetDateTime] = None, before: Option[OffsetDateTime] = None
): Request[Either[ResponseError[Exception], PageConnectorSyncEvents], Nothing] =
    basicRequest
      .method(Method.GET, uri"$baseUrl/connectors/${id}/events?page=${ page }&size=${ size }&sort=${ sort }&since=${ since }&before=${ before }")
      .contentType("application/json")
      .header("x-api-key", apiKey)
      .response(asJson[PageConnectorSyncEvents])

  /**
   * List inbox connectors that sync external emails to MailSlurp inboxes
   * 
   * Expected answers:
   *   code 200 : PageConnector (OK)
   * 
   * Available security schemes:
   *   API_KEY (apiKey)
   * 
   * @param page Optional page index in connector list pagination
   * @param size Optional page size in connector list pagination
   * @param sort Optional createdAt sort direction ASC or DESC
   * @param since Filter by created at after the given timestamp
   * @param before Filter by created at before the given timestamp
   */
  def getConnectors(apiKey: String)(page: Option[Int] = None, size: Option[Int] = None, sort: Option[String] = None, since: Option[OffsetDateTime] = None, before: Option[OffsetDateTime] = None
): Request[Either[ResponseError[Exception], PageConnector], Nothing] =
    basicRequest
      .method(Method.GET, uri"$baseUrl/connectors?page=${ page }&size=${ size }&sort=${ sort }&since=${ since }&before=${ before }")
      .contentType("application/json")
      .header("x-api-key", apiKey)
      .response(asJson[PageConnector])

  /**
   * Expected answers:
   *   code 200 : ConnectorSyncRequestResult (OK)
   * 
   * Available security schemes:
   *   API_KEY (apiKey)
   * 
   * @param id 
   */
  def syncConnector(apiKey: String)(id: UUID
): Request[Either[ResponseError[Exception], ConnectorSyncRequestResult], Nothing] =
    basicRequest
      .method(Method.POST, uri"$baseUrl/connectors/${id}/sync")
      .contentType("application/json")
      .header("x-api-key", apiKey)
      .response(asJson[ConnectorSyncRequestResult])

  /**
   * Expected answers:
   *   code 200 : ConnectorDto (OK)
   * 
   * Available security schemes:
   *   API_KEY (apiKey)
   * 
   * @param id 
   * @param createConnectorOptions 
   */
  def updateConnector(apiKey: String)(id: UUID, createConnectorOptions: CreateConnectorOptions
): Request[Either[ResponseError[Exception], ConnectorDto], Nothing] =
    basicRequest
      .method(Method.PUT, uri"$baseUrl/connectors/${id}")
      .contentType("application/json")
      .header("x-api-key", apiKey)
      .body(createConnectorOptions)
      .response(asJson[ConnectorDto])

}
