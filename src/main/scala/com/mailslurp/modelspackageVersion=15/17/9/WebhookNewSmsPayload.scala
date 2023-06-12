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
package com.mailslurp.modelspackageVersion&#x3D;15.17.9

import java.util.UUID

  /**
   * NEW_SMS webhook payload. Sent to your webhook url endpoint via HTTP POST when an sms is received by the phone number that your webhook is attached to. Use the SMS ID to fetch the full SMS details.
   */
case class WebhookNewSmsPayload(
  /* Idempotent message ID. Store this ID locally or in a database to prevent message duplication. */
  messageId: String,
  /* ID of webhook entity being triggered */
  webhookId: UUID,
  /* Name of the event type webhook is being triggered for. */
  eventName: WebhookNewSmsPayloadEnums.EventName,
  /* Name of the webhook being triggered */
  webhookName: Option[String] = None,
  /* ID of SMS message */
  smsId: UUID,
  /* User ID of event */
  userId: UUID,
  /* ID of phone number receiving SMS */
  phoneNumber: UUID,
  /* Recipient phone number */
  toNumber: String,
  /* Sender phone number */
  fromNumber: String,
  /* SMS message body */
  body: String,
  /* SMS has been read */
  read: Boolean
)

object WebhookNewSmsPayloadEnums {

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

