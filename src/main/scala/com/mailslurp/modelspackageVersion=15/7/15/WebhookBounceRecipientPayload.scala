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
package com.mailslurp.modelspackageVersion&#x3D;15.7.15

import java.util.UUID

  /**
   * BOUNCE_RECIPIENT webhook payload. Sent to your webhook url endpoint via HTTP POST when an email caused a bounce to occur for a recipient. Save the recipient to a ban list of your server and avoid email them again.
   */
case class WebhookBounceRecipientPayload(
  /* Idempotent message ID. Store this ID locally or in a database to prevent message duplication. */
  messageId: String,
  /* ID of webhook entity being triggered */
  webhookId: UUID,
  /* Name of the event type webhook is being triggered for. */
  eventName: WebhookBounceRecipientPayloadEnums.EventName,
  /* Name of the webhook being triggered */
  webhookName: Option[String] = None,
  /* Email address that caused a bounce. Make note of the address and try not to message it again to preserve your reputation. */
  recipient: String
)

object WebhookBounceRecipientPayloadEnums {

  type EventName = EventName.Value
  object EventName extends Enumeration {
    val EMAILRECEIVED = Value("EMAIL_RECEIVED")
    val NEWEMAIL = Value("NEW_EMAIL")
    val NEWCONTACT = Value("NEW_CONTACT")
    val NEWATTACHMENT = Value("NEW_ATTACHMENT")
    val EMAILOPENED = Value("EMAIL_OPENED")
    val EMAILREAD = Value("EMAIL_READ")
    val BOUNCE = Value("BOUNCE")
    val BOUNCERECIPIENT = Value("BOUNCE_RECIPIENT")
  }

}

