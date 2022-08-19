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
package com.mailslurp.modelspackageVersion&#x3D;15.13.29

import java.time.OffsetDateTime
import java.util.UUID

  /**
   * DELIVERY_STATUS webhook payload. Sent to your webhook url endpoint via HTTP POST when an email delivery status is created. This could be a successful delivery or a delivery failure.
   */
case class WebhookDeliveryStatusPayload(
  /* Idempotent message ID. Store this ID locally or in a database to prevent message duplication. */
  messageId: String,
  /* ID of webhook entity being triggered */
  webhookId: UUID,
  /* Name of the event type webhook is being triggered for. */
  eventName: WebhookDeliveryStatusPayloadEnums.EventName,
  /* Name of the webhook being triggered */
  webhookName: Option[String] = None,
  /* ID of delivery status */
  id: UUID,
  /* User ID of event */
  userId: UUID,
  /* ID of sent email */
  sentId: Option[UUID] = None,
  /* IP address of the remote Mail Transfer Agent */
  remoteMtaIp: Option[String] = None,
  /* Id of the inbox */
  inboxId: Option[UUID] = None,
  /* Mail Transfer Agent reporting delivery status */
  reportingMta: Option[String] = None,
  /* Recipients for delivery */
  recipients: Option[Seq[String]] = None,
  /* SMTP server response message */
  smtpResponse: Option[String] = None,
  /* SMTP server status */
  smtpStatusCode: Option[Int] = None,
  /* Time in milliseconds for delivery processing */
  processingTimeMillis: Option[Long] = None,
  /* Time event was received */
  received: Option[OffsetDateTime] = None,
  /* Email subject */
  subject: Option[String] = None
)

object WebhookDeliveryStatusPayloadEnums {

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

