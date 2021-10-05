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
package com.mailslurp.modelspackageVersion&#x3D;14.0.3

import java.time.OffsetDateTime
import java.util.UUID

  /**
   * WebhookNewEmailPayload
   * NEW_EMAIL webhook payload. Sent to your webhook url endpoint via HTTP POST when an email is received by the inbox that your webhook is attached to. Use the email ID to fetch the full email body or attachments.
   */
case class WebhookNewEmailPayload(
  /* List of attachment meta data objects if attachments present */
  attachmentMetaDatas: Option[Seq[AttachmentMetaData]] = None,
  /* List of `BCC` recipients email addresses that the email was addressed to. See recipients object for names. */
  bcc: Option[Seq[String]] = None,
  /* List of `CC` recipients email addresses that the email was addressed to. See recipients object for names. */
  cc: Option[Seq[String]] = None,
  /* Date time of event creation */
  createdAt: Option[OffsetDateTime] = None,
  /* ID of the email that was received. Use this ID for fetching the email with the `EmailController`. */
  emailId: Option[UUID] = None,
  /* Name of the event type webhook is being triggered for. */
  eventName: Option[WebhookNewEmailPayloadEnums.EventName] = None,
  /* Who the email was sent from. An email address - see fromName for the sender name. */
  from: Option[String] = None,
  /* Id of the inbox that received an email */
  inboxId: Option[UUID] = None,
  /* Idempotent message ID. Store this ID locally or in a database to prevent message duplication. */
  messageId: Option[String] = None,
  /* The subject line of the email message as specified by SMTP subject header */
  subject: Option[String] = None,
  /* List of `To` recipient email addresses that the email was addressed to. See recipients object for names. */
  to: Option[Seq[String]] = None,
  /* ID of webhook entity being triggered */
  webhookId: Option[UUID] = None,
  /* Name of the webhook being triggered */
  webhookName: Option[String] = None
)

object WebhookNewEmailPayloadEnums {

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

