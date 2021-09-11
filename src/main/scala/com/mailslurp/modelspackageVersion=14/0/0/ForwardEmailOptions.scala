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
package com.mailslurp.modelspackageVersion&#x3D;14.0.0


  /**
   * ForwardEmailOptions
   * Options for forwarding an email
   */
case class ForwardEmailOptions(
  /* Optional bcc recipients */
  bcc: Option[Seq[String]] = None,
  /* Optional cc recipients */
  cc: Option[Seq[String]] = None,
  /* Optional from override */
  from: Option[String] = None,
  /* Subject for forwarded email */
  subject: Option[String] = None,
  /* To recipients for forwarded email */
  to: Option[Seq[String]] = None,
  /* Optionally use inbox name as display name for sender email address */
  useInboxName: Option[Boolean] = None
)


