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
package com.mailslurp.modelspackageVersion&#x3D;11.16666.0

import java.time.OffsetDateTime
import java.util.UUID

  /**
   * Email
   * Email entity (also known as EmailDto). When an SMTP email message is received by MailSlurp it is parsed. The body and attachments are written to disk and the fields such as to, from, subject etc are stored in a database. The `body` contains the email content. If you want the original SMTP message see the `getRawEmail` endpoints. The attachments can be fetched using the AttachmentController
   */
case class Email(
  analysis: Option[EmailAnalysis] = None,
  /* List of IDs of attachments found in the email. Use these IDs with the Inbox and Email Controllers to download attachments and attachment meta data such as filesize, name, extension. */
  attachments: Option[Seq[String]] = None,
  /* List of `BCC` recipients email was addressed to */
  bcc: Option[Seq[String]] = None,
  /* The body of the email message */
  body: Option[String] = None,
  /* A hash signature of the email message */
  bodyMD5Hash: Option[String] = None,
  /* List of `CC` recipients email was addressed to */
  cc: Option[Seq[String]] = None,
  /* Detected character set of the email body such as UTF-8 */
  charset: Option[String] = None,
  /* When was the email received by MailSlurp */
  createdAt: Option[OffsetDateTime] = None,
  /* Who the email was sent from */
  from: Option[String] = None,
  /* Collection of SMTP headers attached to email */
  headers: Option[Map[String, String]] = None,
  /* ID of the email entity */
  id: Option[UUID] = None,
  /* ID of the inbox that received the email */
  inboxId: Option[UUID] = None,
  /* Is the email body HTML */
  isHTML: Option[Boolean] = None,
  /* Read flag. Has the email ever been viewed in the dashboard or fetched via the API? If so the email is marked as read. */
  read: Option[Boolean] = None,
  /* The `replyTo` field on the received email message */
  replyTo: Option[String] = None,
  /* The subject line of the email message */
  subject: Option[String] = None,
  /* Can the email be accessed by organization team members */
  teamAccess: Option[Boolean] = None,
  /* List of `To` recipients that email was addressed to */
  to: Option[Seq[String]] = None,
  /* When was the email last updated */
  updatedAt: Option[OffsetDateTime] = None,
  /* ID of user that email belongs to */
  userId: Option[UUID] = None
)


