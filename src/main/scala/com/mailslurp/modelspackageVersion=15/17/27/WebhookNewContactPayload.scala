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
package com.mailslurp.modelspackageVersion&#x3D;15.17.27

import java.time.OffsetDateTime
import java.util.UUID

  /**
   * NEW_CONTACT webhook payload. Sent to your webhook url endpoint via HTTP POST when an email is received by the inbox that your webhook is attached to that contains a recipient that has not been saved as a contact.
   */
case class WebhookNewContactPayload(
  /* Idempotent message ID. Store this ID locally or in a database to prevent message duplication. */
  messageId: String,
  /* ID of webhook entity being triggered */
  webhookId: UUID,
  /* Name of the webhook being triggered */
  webhookName: Option[String] = None,
  /* Name of the event type webhook is being triggered for. */
  eventName: WebhookNewContactPayloadEnums.EventName,
  /* Contact ID */
  contactId: UUID,
  /* Contact group ID */
  groupId: Option[UUID] = None,
  /* Contact first name */
  firstName: Option[String] = None,
  /* Contact last name */
  lastName: Option[String] = None,
  /* Contact company name */
  company: Option[String] = None,
  /* Primary email address for contact */
  primaryEmailAddress: Option[String] = None,
  /* Email addresses for contact */
  emailAddresses: Seq[String],
  /* Tags for contact */
  tags: Seq[String],
  metaData: Option[Any] = None,
  /* Has contact opted out of emails */
  optOut: Boolean,
  /* Date time of event creation */
  createdAt: OffsetDateTime
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
    val DELIVERYSTATUS = Value("DELIVERY_STATUS")
    val BOUNCE = Value("BOUNCE")
    val BOUNCERECIPIENT = Value("BOUNCE_RECIPIENT")
    val NEWSMS = Value("NEW_SMS")
  }

}

