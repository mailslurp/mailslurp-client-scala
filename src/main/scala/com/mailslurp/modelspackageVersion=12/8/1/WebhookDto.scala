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
package com.mailslurp.modelspackageVersion&#x3D;12.8.1

import java.time.OffsetDateTime
import java.util.UUID

  /**
   * WebhookDto
   * Representation of a webhook for an inbox. The URL specified will be using by MailSlurp whenever an email is received by the attached inbox. A webhook entity should have a URL that points to your server. Your server should accept HTTP/S POST requests and return a success 200. MailSlurp will retry your webhooks if they fail. See https://api.mailslurp.com/schemas/webhook-payload for the payload schema.
   */
case class WebhookDto(
  /* Does webhook expect basic authentication? If true it means you created this webhook with a username and password. MailSlurp will use these in the URL to authenticate itself. */
  basicAuth: Option[Boolean] = None,
  /* When the webhook was created */
  createdAt: Option[OffsetDateTime] = None,
  eventName: Option[WebhookDtoEnums.EventName] = None,
  /* ID of the Webhook */
  id: Option[UUID] = None,
  /* The inbox that the Webhook will be triggered by */
  inboxId: Option[UUID] = None,
  /* HTTP method that your server endpoint must listen for */
  method: Option[WebhookDtoEnums.Method] = None,
  /* Name of the webhook */
  name: Option[String] = None,
  /* JSON Schema for the payload that will be sent to your URL via the HTTP method described. */
  payloadJsonSchema: Option[String] = None,
  updatedAt: OffsetDateTime,
  /* URL of your server that the webhook will be sent to. The schema of the JSON that is sent is described by the payloadJsonSchema. */
  url: Option[String] = None,
  /* User ID of the Webhook */
  userId: Option[UUID] = None
)

object WebhookDtoEnums {

  type EventName = EventName.Value
  type Method = Method.Value
  object EventName extends Enumeration {
    val EMAILRECEIVED = Value("EMAIL_RECEIVED")
    val NEWEMAIL = Value("NEW_EMAIL")
    val NEWCONTACT = Value("NEW_CONTACT")
    val NEWATTACHMENT = Value("NEW_ATTACHMENT")
    val EMAILOPENED = Value("EMAIL_OPENED")
  }

  object Method extends Enumeration {
    val GET = Value("GET")
    val HEAD = Value("HEAD")
    val POST = Value("POST")
    val PUT = Value("PUT")
    val PATCH = Value("PATCH")
    val DELETE = Value("DELETE")
    val OPTIONS = Value("OPTIONS")
    val TRACE = Value("TRACE")
  }

}

