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
package com.mailslurp.modelspackageVersion&#x3D;15.17.15

import java.time.OffsetDateTime
import java.util.UUID

  /**
   * Email entity (also known as EmailDto). When an SMTP email message is received by MailSlurp it is parsed. The body and attachments are written to disk and the fields such as to, from, subject etc are stored in a database. The `body` contains the email content. If you want the original SMTP message see the `getRawEmail` endpoints. The attachments can be fetched using the AttachmentController
   */
case class Email(
  /* ID of the email entity */
  id: UUID,
  /* ID of user that email belongs to */
  userId: UUID,
  /* ID of the inbox that received the email */
  inboxId: UUID,
  /* ID of the domain that received the email */
  domainId: Option[UUID] = None,
  /* List of `To` recipient email addresses that the email was addressed to. See recipients object for names. */
  to: Seq[String],
  /* Who the email was sent from. An email address - see fromName for the sender name. */
  from: Option[String] = None,
  sender: Option[Sender] = None,
  recipients: Option[EmailRecipients] = None,
  /* The `replyTo` field on the received email message */
  replyTo: Option[String] = None,
  /* List of `CC` recipients email addresses that the email was addressed to. See recipients object for names. */
  cc: Option[Seq[String]] = None,
  /* List of `BCC` recipients email addresses that the email was addressed to. See recipients object for names. */
  bcc: Option[Seq[String]] = None,
  /* Collection of SMTP headers attached to email */
  headers: Option[Map[String, String]] = None,
  /* Multi-value map of SMTP headers attached to email */
  headersMap: Option[Map[String, Seq[String]]] = None,
  /* List of IDs of attachments found in the email. Use these IDs with the Inbox and Email Controllers to download attachments and attachment meta data such as filesize, name, extension. */
  attachments: Option[Seq[String]] = None,
  /* The subject line of the email message as specified by SMTP subject header */
  subject: Option[String] = None,
  /* The body of the email message as text parsed from the SMTP message body (does not include attachments). Fetch the raw content to access the SMTP message and use the attachments property to access attachments. The body is stored separately to the email entity so the body is not returned in paginated results only in full single email or wait requests. */
  body: Option[String] = None,
  /* An excerpt of the body of the email message for quick preview . */
  bodyExcerpt: Option[String] = None,
  /* A hash signature of the email message using MD5. Useful for comparing emails without fetching full body. */
  bodyMD5Hash: Option[String] = None,
  /* Is the email body content type HTML? */
  isHTML: Option[Boolean] = None,
  /* Detected character set of the email body such as UTF-8 */
  charset: Option[String] = None,
  analysis: Option[EmailAnalysis] = None,
  /* When was the email received by MailSlurp */
  createdAt: OffsetDateTime,
  /* When was the email last updated */
  updatedAt: OffsetDateTime,
  /* Read flag. Has the email ever been viewed in the dashboard or fetched via the API with a hydrated body? If so the email is marked as read. Paginated results do not affect read status. Read status is different to email opened event as it depends on your own account accessing the email. Email opened is determined by tracking pixels sent to other uses if enable during sending. You can listened for both email read and email opened events using webhooks. */
  read: Boolean,
  /* Can the email be accessed by organization team members */
  teamAccess: Boolean,
  html: Option[Boolean] = None
)


