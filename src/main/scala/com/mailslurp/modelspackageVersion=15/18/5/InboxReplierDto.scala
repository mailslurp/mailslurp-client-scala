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
package com.mailslurp.modelspackageVersion&#x3D;15.18.5

import java.time.OffsetDateTime
import java.util.UUID

  /**
   * Inbox replier. Will automatically reply to inbound emails that match given field for an inbox.
   */
case class InboxReplierDto(
  id: UUID,
  inboxId: UUID,
  name: Option[String] = None,
  field: InboxReplierDtoEnums.Field,
  `match`: String,
  replyTo: Option[String] = None,
  subject: Option[String] = None,
  from: Option[String] = None,
  charset: Option[String] = None,
  isHTML: Boolean,
  templateId: Option[UUID] = None,
  templateVariables: Option[Map[String, Any]] = None,
  ignoreReplyTo: Boolean,
  createdAt: OffsetDateTime
)

object InboxReplierDtoEnums {

  type Field = Field.Value
  object Field extends Enumeration {
    val RECIPIENTS = Value("RECIPIENTS")
    val SENDER = Value("SENDER")
    val SUBJECT = Value("SUBJECT")
    val ATTACHMENTS = Value("ATTACHMENTS")
  }

}

