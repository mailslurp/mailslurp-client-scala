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
package com.mailslurp.modelspackageVersion&#x3D;15.19.21

import java.time.OffsetDateTime
import java.util.UUID

  /**
   * Inbox
   * Representation of a MailSlurp inbox. An inbox has an ID and a real email address. Emails can be sent to or from this email address. Inboxes are either `SMTP` or `HTTP` mailboxes. The default, `HTTP` inboxes, use AWS SES to process emails and are best suited as test email accounts and do not support IMAP or POP3. `SMTP` inboxes use a custom mail server at `mxslurp.click` and support SMTP login, IMAP and POP3. Use the `EmailController` or the `InboxController` methods to send and receive emails and attachments. Inboxes may have a description, name, and tags for display purposes. You can also favourite an inbox for easier searching.
   */
case class InboxDto(
  /* ID of the inbox. The ID is a UUID-V4 format string. Use the inboxId for calls to Inbox and Email Controller endpoints. See the emailAddress property for the email address or the inbox. To get emails in an inbox use the WaitFor and Inbox Controller methods `waitForLatestEmail` and `getEmails` methods respectively. Inboxes can be used with aliases to forward emails automatically. */
  id: UUID,
  /* ID of user that inbox belongs to */
  userId: Option[UUID] = None,
  /* When the inbox was created. Time stamps are in ISO DateTime Format `yyyy-MM-dd'T'HH:mm:ss.SSSXXX` e.g. `2000-10-31T01:30:00.000-05:00`. */
  createdAt: OffsetDateTime,
  /* Name of the inbox and used as the sender name when sending emails .Displayed in the dashboard for easier search */
  name: Option[String] = None,
  /* ID of custom domain used by the inbox if any */
  domainId: Option[UUID] = None,
  /* Description of an inbox for labelling and searching purposes */
  description: Option[String] = None,
  /* The inbox's email address. Inbox projections and previews may not include the email address. To view the email address fetch the inbox entity directly. Send an email to this address and the inbox will receive and store it for you. Note the email address in MailSlurp match characters exactly and are case sensitive so `+123` additions are considered different addresses. To retrieve the email use the Inbox and Email Controller endpoints with the inbox ID. */
  emailAddress: String,
  /* Inbox expiration time. When, if ever, the inbox should expire and be deleted. If null then this inbox is permanent and the emails in it won't be deleted. This is the default behavior unless expiration date is set. If an expiration date is set and the time is reached MailSlurp will expire the inbox and move it to an expired inbox entity. You can still access the emails belonging to it but it can no longer send or receive email. */
  expiresAt: Option[String] = None,
  /* Is the inbox a favorite inbox. Make an inbox a favorite is typically done in the dashboard for quick access or filtering */
  favourite: Boolean,
  /* Tags that inbox has been tagged with. Tags can be added to inboxes to group different inboxes within an account. You can also search for inboxes by tag in the dashboard UI. */
  tags: Option[Seq[String]] = None,
  /* Type of inbox. HTTP inboxes are faster and better for most cases. SMTP inboxes are more suited for public facing inbound messages (but cannot send). */
  inboxType: Option[InboxDtoEnums.InboxType] = None,
  /* Is the inbox readOnly for the caller. Read only means can not be deleted or modified. This flag is present when using team accounts and shared inboxes. */
  readOnly: Boolean,
  /* Virtual inbox can receive email but will not send emails to real recipients. Will save sent email record but never send an actual email. Perfect for testing mail server actions. */
  virtualInbox: Boolean,
  /* Inbox function if used as a primitive for another system. */
  functionsAs: Option[InboxDtoEnums.FunctionsAs] = None
)

object InboxDtoEnums {

  type InboxType = InboxType.Value
  type FunctionsAs = FunctionsAs.Value
  object InboxType extends Enumeration {
    val HTTPINBOX = Value("HTTP_INBOX")
    val SMTPINBOX = Value("SMTP_INBOX")
  }

  object FunctionsAs extends Enumeration {
    val ALIAS = Value("ALIAS")
    val THREAD = Value("THREAD")
    val CATCHALL = Value("CATCH_ALL")
    val CONNECTOR = Value("CONNECTOR")
  }

}

