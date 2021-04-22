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
package com.mailslurp.modelspackageVersion&#x3D;11.7.308

import java.time.OffsetDateTime
import java.util.UUID

  /**
   * AliasDto
   * Email alias representation
   */
case class AliasDto(
  createdAt: Option[OffsetDateTime] = None,
  /* The alias's email address for receiving email */
  emailAddress: Option[String] = None,
  id: UUID,
  /* Inbox that is associated with the alias */
  inboxId: Option[UUID] = None,
  /* Has the alias been verified. You must verify an alias if the masked email address has not yet been verified by your account */
  isVerified: Option[Boolean] = None,
  /* The underlying email address that is hidden and will received forwarded email */
  maskedEmailAddress: Option[String] = None,
  name: Option[String] = None,
  updatedAt: Option[OffsetDateTime] = None,
  /* If alias will generate response threads or not when email are received by it */
  useThreads: Option[Boolean] = None,
  userId: UUID
)


