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
package com.mailslurp.modelspackageVersion&#x3D;12.8.0

import java.util.UUID

  /**
   * WebhookNewAttachmentPayload
   * NEW_ATTACHMENT webhook payload. Sent to your webhook url endpoint via HTTP POST when an email is received by the inbox that your webhook is attached to that contains an attachment. You can use the attachmentId to download the attachment.
   */
case class WebhookNewAttachmentPayload(
  /* ID of attachment. Use the `AttachmentController` to */
  attachmentId: Option[String] = None,
  /* Size of attachment in bytes */
  contentLength: Option[Long] = None,
  /* Content type of attachment such as 'image/png' or 'application/pdf */
  contentType: Option[String] = None,
  /* Name of the event type webhook is being triggered for. */
  eventName: Option[WebhookNewAttachmentPayloadEnums.EventName] = None,
  /* Idempotent message ID. Store this ID locally or in a database to prevent message duplication. */
  messageId: Option[String] = None,
  /* Filename of the attachment if present */
  name: Option[String] = None,
  /* ID of webhook entity being triggered */
  webhookId: Option[UUID] = None,
  /* Name of the webhook being triggered */
  webhookName: Option[String] = None
)

object WebhookNewAttachmentPayloadEnums {

  type EventName = EventName.Value
  object EventName extends Enumeration {
    val EMAILRECEIVED = Value("EMAIL_RECEIVED")
    val NEWEMAIL = Value("NEW_EMAIL")
    val NEWCONTACT = Value("NEW_CONTACT")
    val NEWATTACHMENT = Value("NEW_ATTACHMENT")
    val EMAILOPENED = Value("EMAIL_OPENED")
  }

}

