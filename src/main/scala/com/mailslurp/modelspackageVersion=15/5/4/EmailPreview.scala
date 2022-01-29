/**
 * MailSlurp API
 * MailSlurp is an API for sending and receiving emails from dynamically allocated email addresses. It's designed for developers and QA teams to test applications, process inbound emails, send templated notifications, attachments, and more.  ## Resources  - [Homepage](https://www.mailslurp.com) - Get an [API KEY](https://app.mailslurp.com/sign-up/) - Generated [SDK Clients](https://www.mailslurp.com/docs/) - [Examples](https://github.com/mailslurp/examples) repository
 *
 * The version of the OpenAPI document: 6.5.2
 * Contact: contact@mailslurp.dev
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package com.mailslurp.modelspackageVersion&#x3D;15.5.4

import java.time.OffsetDateTime
import java.util.UUID

  /**
   * Preview of an email message. For full message (including body and attachments) call the `getEmail` or other email endpoints with the provided email ID.
   */
case class EmailPreview(
  /* ID of the email entity */
  id: UUID,
  /* The subject line of the email message as specified by SMTP subject header */
  subject: Option[String] = None,
  /* List of `To` recipient email addresses that the email was addressed to. See recipients object for names. */
  to: Seq[String],
  /* Who the email was sent from. An email address - see fromName for the sender name. */
  from: Option[String] = None,
  /* List of `BCC` recipients email addresses that the email was addressed to. See recipients object for names. */
  bcc: Option[Seq[String]] = None,
  /* List of `CC` recipients email addresses that the email was addressed to. See recipients object for names. */
  cc: Option[Seq[String]] = None,
  /* When was the email received by MailSlurp */
  createdAt: OffsetDateTime,
  /* Read flag. Has the email ever been viewed in the dashboard or fetched via the API with a hydrated body? If so the email is marked as read. Paginated results do not affect read status. Read status is different to email opened event as it depends on your own account accessing the email. Email opened is determined by tracking pixels sent to other uses if enable during sending. You can listened for both email read and email opened events using webhooks. */
  read: Option[Boolean] = None,
  /* List of IDs of attachments found in the email. Use these IDs with the Inbox and Email Controllers to download attachments and attachment meta data such as filesize, name, extension. */
  attachments: Option[Seq[String]] = None
)

