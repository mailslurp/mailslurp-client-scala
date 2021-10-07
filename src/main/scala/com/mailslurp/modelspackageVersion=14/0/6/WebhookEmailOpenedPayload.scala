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
package com.mailslurp.modelspackageVersion&#x3D;14.0.6

import java.time.OffsetDateTime
import java.util.UUID

  /**
   * WebhookEmailOpenedPayload
   * EMAIL_OPENED webhook payload. Sent to your webhook url endpoint via HTTP POST when an email containing a tracking pixel is opened and the pixel image is loaded by a reader.
   */
case class WebhookEmailOpenedPayload(
  /* Date time of event creation */
  createdAt: Option[OffsetDateTime] = None,
  /* Name of the event type webhook is being triggered for. */
  eventName: Option[WebhookEmailOpenedPayloadEnums.EventName] = None,
  /* Id of the inbox that received an email */
  inboxId: Option[UUID] = None,
  /* Idempotent message ID. Store this ID locally or in a database to prevent message duplication. */
  messageId: Option[String] = None,
  /* ID of the tracking pixel */
  pixelId: Option[UUID] = None,
  /* Email address for the recipient of the tracking pixel */
  recipient: Option[String] = None,
  /* ID of sent email */
  sentEmailId: Option[UUID] = None,
  /* ID of webhook entity being triggered */
  webhookId: Option[UUID] = None,
  /* Name of the webhook being triggered */
  webhookName: Option[String] = None
)

object WebhookEmailOpenedPayloadEnums {

  type EventName = EventName.Value
  object EventName extends Enumeration {
    val EMAILRECEIVED = Value("EMAIL_RECEIVED")
    val NEWEMAIL = Value("NEW_EMAIL")
    val NEWCONTACT = Value("NEW_CONTACT")
    val NEWATTACHMENT = Value("NEW_ATTACHMENT")
    val EMAILOPENED = Value("EMAIL_OPENED")
    val EMAILREAD = Value("EMAIL_READ")
  }

}

