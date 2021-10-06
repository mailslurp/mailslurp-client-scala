/**
 * MailSlurp API
 * MailSlurp is an API for sending and receiving emails from dynamically allocated email addresses. It's designed for developers and QA teams to test applications, process inbound emails, send templated notifications, attachments, and more.  ## Resources  - [Homepage](https://www.mailslurp.com) - Get an [API KEY](https://app.mailslurp.com/sign-up/) - Generated [SDK Clients](https://www.mailslurp.com/docs/) - [Examples](https://github.com/mailslurp/examples) repository
 *
 * The version of the OpenAPI document: 6.5.2
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package com.mailslurp.modelspackageVersion&#x3D;14.0.5

import java.util.UUID

  /**
   * ReplyToEmailOptions
   * Options for replying to email with API
   */
case class ReplyToEmailOptions(
  /* List of uploaded attachments to send with the reply. Optional. */
  attachments: Option[Seq[String]] = None,
  /* Body of the reply email you want to send */
  body: Option[String] = None,
  /* The charset that your message should be sent with. Optional. Default is UTF-8 */
  charset: Option[String] = None,
  /* The from header that should be used. Optional */
  from: Option[String] = None,
  /* Is the reply HTML */
  isHTML: Option[Boolean] = None,
  /* The replyTo header that should be used. Optional */
  replyTo: Option[String] = None,
  /* When to send the email. Typically immediately */
  sendStrategy: Option[ReplyToEmailOptionsEnums.SendStrategy] = None,
  /* Template ID to use instead of body. Will use template variable map to fill defined variable slots. */
  template: Option[UUID] = None,
  /* Template variables if using a template */
  templateVariables: Option[Any] = None,
  /* Optionally use inbox name as display name for sender email address */
  useInboxName: Option[Boolean] = None
)

object ReplyToEmailOptionsEnums {

  type SendStrategy = SendStrategy.Value
  object SendStrategy extends Enumeration {
    val SINGLEMESSAGE = Value("SINGLE_MESSAGE")
  }

}

