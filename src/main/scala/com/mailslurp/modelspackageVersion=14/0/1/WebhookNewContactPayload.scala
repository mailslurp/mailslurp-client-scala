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
package com.mailslurp.modelspackageVersion&#x3D;14.0.1

import java.time.OffsetDateTime
import java.util.UUID

  /**
   * WebhookNewContactPayload
   * NEW_CONTACT webhook payload. Sent to your webhook url endpoint via HTTP POST when an email is received by the inbox that your webhook is attached to that contains a recipient that has not been saved as a contact.
   */
case class WebhookNewContactPayload(
  company: Option[String] = None,
  contactId: UUID,
  createdAt: OffsetDateTime,
  emailAddresses: Seq[String],
  /* Name of the event type webhook is being triggered for. */
  eventName: Option[WebhookNewContactPayloadEnums.EventName] = None,
  firstName: Option[String] = None,
  groupId: Option[UUID] = None,
  lastName: Option[String] = None,
  /* Idempotent message ID. Store this ID locally or in a database to prevent message duplication. */
  messageId: Option[String] = None,
  metaData: Option[Any] = None,
  optOut: Option[Boolean] = None,
  primaryEmailAddress: Option[String] = None,
  tags: Seq[String],
  /* ID of webhook entity being triggered */
  webhookId: Option[UUID] = None,
  /* Name of the webhook being triggered */
  webhookName: Option[String] = None
)

object WebhookNewContactPayloadEnums {

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

