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
package com.mailslurp.modelspackageVersion&#x3D;15.0.0


  /**
   * CreateInboxForwarderOptions
   * Options for creating an inbox forwarder
   */
case class CreateInboxForwarderOptions(
  /* Field to match against to trigger inbox forwarding for inbound email */
  field: Option[CreateInboxForwarderOptionsEnums.Field] = None,
  /* Email addresses to forward an email to if it matches the field and match criteria of the forwarder */
  forwardToRecipients: Option[Seq[String]] = None,
  /* String or wildcard style match for field specified when evaluating forwarding rules */
  `match`: Option[String] = None
)

object CreateInboxForwarderOptionsEnums {

  type Field = Field.Value
  object Field extends Enumeration {
    val RECIPIENTS = Value("RECIPIENTS")
    val SENDER = Value("SENDER")
    val SUBJECT = Value("SUBJECT")
    val ATTACHMENTS = Value("ATTACHMENTS")
  }

}

