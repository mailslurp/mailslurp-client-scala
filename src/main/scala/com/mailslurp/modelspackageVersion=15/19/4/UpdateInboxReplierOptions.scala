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
package com.mailslurp.modelspackageVersion&#x3D;15.19.4

import java.util.UUID

  /**
   * Options for updating an inbox replier
   */
case class UpdateInboxReplierOptions(
  /* Inbox ID to attach replier to */
  inboxId: UUID,
  /* Name for replier */
  name: Option[String] = None,
  /* Field to match against to trigger inbox replier for inbound email */
  field: UpdateInboxReplierOptionsEnums.Field,
  /* String or wildcard style match for field specified when evaluating reply rules */
  `match`: String,
  /* Reply-to email address when sending replying */
  replyTo: Option[String] = None,
  /* Subject override when replying to email */
  subject: Option[String] = None,
  /* Send email from address */
  from: Option[String] = None,
  /* Email reply charset */
  charset: Option[String] = None,
  /* Send HTML email */
  isHTML: Option[Boolean] = None,
  /* Ignore sender replyTo when responding. Send directly to the sender if enabled. */
  ignoreReplyTo: Option[Boolean] = None,
  /* Email body for reply */
  body: Option[String] = None,
  /* ID of template to use when sending a reply */
  templateId: Option[UUID] = None,
  /* Template variable values */
  templateVariables: Option[Map[String, Any]] = None
)

object UpdateInboxReplierOptionsEnums {

  type Field = Field.Value
  object Field extends Enumeration {
    val RECIPIENTS = Value("RECIPIENTS")
    val SENDER = Value("SENDER")
    val SUBJECT = Value("SUBJECT")
    val ATTACHMENTS = Value("ATTACHMENTS")
  }

}

