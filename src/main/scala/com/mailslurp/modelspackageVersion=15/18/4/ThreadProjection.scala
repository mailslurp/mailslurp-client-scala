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
package com.mailslurp.modelspackageVersion&#x3D;15.18.4

import java.time.OffsetDateTime
import java.util.UUID

  /**
   * A thread is a message thread created for a message received by an alias
   */
case class ThreadProjection(
  /* Created at DateTime */
  createdAt: OffsetDateTime,
  /* Updated at DateTime */
  updatedAt: OffsetDateTime,
  /* Inbox ID */
  inboxId: UUID,
  /* User ID */
  userId: UUID,
  /* To recipients */
  to: Seq[String],
  /* BCC recipients */
  bcc: Option[Seq[String]] = None,
  /* CC recipients */
  cc: Option[Seq[String]] = None,
  /* Alias ID */
  aliasId: UUID,
  /* Thread subject */
  subject: Option[String] = None,
  /* Name of thread */
  name: Option[String] = None,
  /* ID of email thread */
  id: UUID
)


