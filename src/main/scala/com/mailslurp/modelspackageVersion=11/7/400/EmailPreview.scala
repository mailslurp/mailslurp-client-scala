/**
 * MailSlurp API
 * MailSlurp is an API for sending and receiving emails from dynamically allocated email addresses. It's designed for developers and QA teams to test applications, process inbound emails, send templated notifications, attachments, and more.   ## Resources - [Homepage](https://www.mailslurp.com) - Get an [API KEY](https://app.mailslurp.com/sign-up/) - Generated [SDK Clients](https://www.mailslurp.com/docs/) - [Examples](https://github.com/mailslurp/examples) repository 
 *
 * The version of the OpenAPI document: 6.5.2
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package com.mailslurp.modelspackageVersion&#x3D;11.7.400

import java.time.OffsetDateTime
import java.util.UUID

  /**
   * EmailPreview
   * Preview of an email message. For full message (including body and attachments) call the `getEmail` or other email endpoints with the provided email ID.
   */
case class EmailPreview(
  /* List of IDs of attachments found in the email. Use these IDs with the Inbox and Email Controllers to download attachments and attachment meta data such as filesize, name, extension. */
  attachments: Option[Seq[String]] = None,
  /* List of `BCC` recipients email was addressed to */
  bcc: Option[Seq[String]] = None,
  /* List of `CC` recipients email was addressed to */
  cc: Option[Seq[String]] = None,
  /* When was the email received by MailSlurp */
  createdAt: Option[OffsetDateTime] = None,
  /* Who the email was sent from */
  from: Option[String] = None,
  /* ID of the email */
  id: Option[UUID] = None,
  /* Has the email been viewed ever. This means viewed in the dashboard or requested via the full email entity endpoints */
  read: Option[Boolean] = None,
  /* The subject line of the email message */
  subject: Option[String] = None,
  /* List of `To` recipients email was addressed to */
  to: Option[Seq[String]] = None
)


