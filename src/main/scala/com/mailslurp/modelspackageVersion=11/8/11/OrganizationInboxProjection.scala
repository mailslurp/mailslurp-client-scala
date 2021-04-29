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
package com.mailslurp.modelspackageVersion&#x3D;11.8.11

import java.time.OffsetDateTime
import java.util.UUID

case class OrganizationInboxProjection(
  /* When the inbox was created. Time stamps are in ISO DateTime Format `yyyy-MM-dd'T'HH:mm:ss.SSSXXX` e.g. `2000-10-31T01:30:00.000-05:00`. */
  createdAt: Option[OffsetDateTime] = None,
  /* The inbox's email address. Inbox projections and previews may not include the email address. To view the email address fetch the inbox entity directly. Send an email to this address and the inbox will receive and store it for you. Note the email address in MailSlurp match characters exactly and are case sensitive so `+123` additions are considered different addresses. To retrieve the email use the Inbox and Email Controller endpoints with the inbox ID. */
  emailAddress: Option[String] = None,
  /* Is the inbox favorited. Favouriting inboxes is typically done in the dashboard for quick access or filtering */
  favourite: Option[Boolean] = None,
  /* ID of the inbox. The ID is a UUID-V4 format string. Use the inboxId for calls to Inbox and Email Controller endpoints. See the emailAddress property for the email address or the inbox. To get emails in an inbox use the WaitFor and Inbox Controller methods `waitForLatestEmail` and `getEmails` methods respectively. Inboxes can be used with aliases to forward emails automatically. */
  id: Option[UUID] = None,
  /* Name of the inbox. Displayed in the dashboard for easier search */
  name: Option[String] = None,
  /* Is the inbox readOnly for the caller. Read only means can not be deleted or modified. */
  readOnly: Option[Boolean] = None,
  /* Tags that inbox has been tagged with. Tags can be added to inboxes to group different inboxes within an account. You can also search for inboxes by tag in the dashboard UI. */
  tags: Option[Seq[String]] = None,
  /* Does inbox permit team access for organization team members. If so team users can use inbox and emails associated with it. */
  teamAccess: Option[Boolean] = None
)


