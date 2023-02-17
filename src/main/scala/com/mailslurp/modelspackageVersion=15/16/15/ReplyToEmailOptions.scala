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
package com.mailslurp.modelspackageVersion&#x3D;15.16.15

import java.util.UUID

  /**
   * Options for replying to email with API
   */
case class ReplyToEmailOptions(
  /* Body of the reply email you want to send */
  body: String,
  /* Is the reply HTML */
  isHTML: Boolean,
  /* The from header that should be used. Optional */
  from: Option[String] = None,
  /* The replyTo header that should be used. Optional */
  replyTo: Option[String] = None,
  /* The charset that your message should be sent with. Optional. Default is UTF-8 */
  charset: Option[String] = None,
  /* List of uploaded attachments to send with the reply. Optional. */
  attachments: Option[Seq[String]] = None,
  /* Template variables if using a template */
  templateVariables: Option[Map[String, Any]] = None,
  /* Template ID to use instead of body. Will use template variable map to fill defined variable slots. */
  template: Option[UUID] = None,
  /* How an email should be sent based on its recipients */
  sendStrategy: Option[ReplyToEmailOptionsEnums.SendStrategy] = None,
  /* Optionally use inbox name as display name for sender email address */
  useInboxName: Option[Boolean] = None,
  html: Option[Boolean] = None
)

object ReplyToEmailOptionsEnums {

  type SendStrategy = SendStrategy.Value
  object SendStrategy extends Enumeration {
    val SINGLEMESSAGE = Value("SINGLE_MESSAGE")
  }

}

