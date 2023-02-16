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
package com.mailslurp.modelspackageVersion&#x3D;15.16.10

import java.util.UUID

  /**
   * BOUNCE webhook payload. Sent to your webhook url endpoint via HTTP POST when an email bounced or was rejected by a recipient. Save the recipients to a ban list on your server and avoid emailing them again. It is recommended you also listen to the BOUNCE_RECIPIENT payload.
   */
case class WebhookBouncePayload(
  /* Idempotent message ID. Store this ID locally or in a database to prevent message duplication. */
  messageId: String,
  /* ID of webhook entity being triggered */
  webhookId: UUID,
  /* Name of the event type webhook is being triggered for. */
  eventName: WebhookBouncePayloadEnums.EventName,
  /* Name of the webhook being triggered */
  webhookName: Option[String] = None,
  /* ID of the bounce email record. Use the ID with the bounce controller to view more information */
  bounceId: UUID,
  /* Email sent to recipients */
  sentToRecipients: Option[Seq[String]] = None,
  /* Sender causing bounce */
  sender: String,
  /* Email addresses that resulted in a bounce or email being rejected. Please save these recipients and avoid emailing them in the future to maintain your reputation. */
  bounceRecipients: Option[Seq[String]] = None
)

object WebhookBouncePayloadEnums {

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

