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
package com.mailslurp.modelspackageVersion&#x3D;11.7.201

import java.time.OffsetDateTime
import java.util.UUID

  /**
   * ThreadProjection
   * A thread is a message thread created for a message received by an alias
   */
case class ThreadProjection(
  aliasId: UUID,
  bcc: Option[Seq[String]] = None,
  cc: Option[Seq[String]] = None,
  createdAt: OffsetDateTime,
  id: UUID,
  inboxId: UUID,
  name: Option[String] = None,
  subject: Option[String] = None,
  to: Seq[String],
  updatedAt: OffsetDateTime,
  userId: UUID
)


