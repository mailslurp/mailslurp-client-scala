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
package com.mailslurp.modelspackageVersion&#x3D;12.4.2

import java.time.OffsetDateTime
import java.util.UUID

  /**
   * SentEmailDto
   * Sent email details
   */
case class SentEmailDto(
  /* Array of IDs of attachments that were sent with this email */
  attachments: Option[Seq[String]] = None,
  bcc: Option[Seq[String]] = None,
  body: Option[String] = None,
  /* MD5 Hash */
  bodyMD5Hash: Option[String] = None,
  cc: Option[Seq[String]] = None,
  charset: Option[String] = None,
  from: Option[String] = None,
  /* ID of sent email */
  id: Option[UUID] = None,
  /* Inbox ID email was sent from */
  inboxId: Option[UUID] = None,
  isHTML: Option[Boolean] = None,
  replyTo: Option[String] = None,
  sentAt: OffsetDateTime,
  subject: Option[String] = None,
  /* Recipients email was sent to */
  to: Option[Seq[String]] = None,
  /* User ID */
  userId: Option[UUID] = None
)


