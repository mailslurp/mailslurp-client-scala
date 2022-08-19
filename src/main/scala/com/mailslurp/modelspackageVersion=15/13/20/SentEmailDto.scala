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
package com.mailslurp.modelspackageVersion&#x3D;15.13.20

import java.time.OffsetDateTime
import java.util.UUID

  /**
   * Sent email details
   */
case class SentEmailDto(
  /* ID of sent email */
  id: UUID,
  /* User ID */
  userId: UUID,
  /* Inbox ID email was sent from */
  inboxId: UUID,
  /* Domain ID */
  domainId: Option[UUID] = None,
  /* Recipients email was sent to */
  to: Option[Seq[String]] = None,
  from: Option[String] = None,
  replyTo: Option[String] = None,
  cc: Option[Seq[String]] = None,
  bcc: Option[Seq[String]] = None,
  /* Array of IDs of attachments that were sent with this email */
  attachments: Option[Seq[String]] = None,
  subject: Option[String] = None,
  /* MD5 Hash */
  bodyMD5Hash: Option[String] = None,
  body: Option[String] = None,
  toContacts: Option[Seq[UUID]] = None,
  toGroup: Option[UUID] = None,
  charset: Option[String] = None,
  isHTML: Option[Boolean] = None,
  sentAt: OffsetDateTime,
  pixelIds: Option[Seq[UUID]] = None,
  messageId: Option[String] = None,
  messageIds: Option[Seq[String]] = None,
  virtualSend: Option[Boolean] = None,
  templateId: Option[UUID] = None,
  templateVariables: Option[Map[String, Any]] = None,
  html: Option[Boolean] = None
)


