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
package com.mailslurp.modelspackageVersion&#x3D;11.9.6

import java.time.OffsetDateTime
import java.util.UUID

  /**
   * WebhookPayload
   * MailSlurp webhook payload schema is available at https://api.mailslurp.com/schemas/webhook-payload. This schema describes the JSON object that is sent via HTTP POST to webhook urls when an email is received by an inbox that a webhook is attached to. Payloads may be delivered multiple times so use the ID as a key for event uniqueness. The payload contains IDs for the email and inbox affected. Use these to fetch more data related to the event using appropriate inbox and email endpoints. See https://www.mailslurp.com/guides/email-webhooks/ for more information. Your webhook endpoint should accept POST HTTP request and return a 200 in under 30 seconds. Process the webhook asynchronously if you need to.
   */
case class WebhookPayload(
  /* List of attachment meta data objects if attachments present */
  attachmentMetaDatas: Option[Seq[AttachmentMetaData]] = None,
  /* List of `BCC` recipients email was addressed to */
  bcc: Option[Seq[String]] = None,
  /* List of `CC` recipients email was addressed to */
  cc: Option[Seq[String]] = None,
  /* Date time of event creation */
  createdAt: Option[OffsetDateTime] = None,
  /* ID of the email that was received. Use this ID for fetching the email */
  emailId: Option[UUID] = None,
  /* Name of the event type webhook is being triggered for */
  eventName: Option[WebhookPayloadEnums.EventName] = None,
  /* Who the email was sent from */
  from: Option[String] = None,
  /* Id of the inbox that receive an email */
  inboxId: Option[UUID] = None,
  /* Idempotent message ID. Store this ID locally or in a database to prevent message duplication. */
  messageId: Option[String] = None,
  /* The subject line of the email message */
  subject: Option[String] = None,
  /* List of `To` recipients that email was addressed to */
  to: Option[Seq[String]] = None,
  /* ID of webhook entity being triggered */
  webhookId: Option[UUID] = None,
  /* Name of the webhook being triggered */
  webhookName: Option[String] = None
)

object WebhookPayloadEnums {

  type EventName = EventName.Value
  object EventName extends Enumeration {
    val EMAILRECEIVED = Value("EMAIL_RECEIVED")
  }

}

