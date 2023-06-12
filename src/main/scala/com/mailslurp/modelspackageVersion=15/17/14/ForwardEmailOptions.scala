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
package com.mailslurp.modelspackageVersion&#x3D;15.17.14


  /**
   * Options for forwarding an email
   */
case class ForwardEmailOptions(
  /* To recipients for forwarded email */
  to: Seq[String],
  /* Subject for forwarded email */
  subject: Option[String] = None,
  /* Optional cc recipients */
  cc: Option[Seq[String]] = None,
  /* Optional bcc recipients */
  bcc: Option[Seq[String]] = None,
  /* Optional from override */
  from: Option[String] = None,
  /* Optionally use inbox name as display name for sender email address */
  useInboxName: Option[Boolean] = None,
  /* Filter recipients to remove any bounced recipients from to, bcc, and cc before sending */
  filterBouncedRecipients: Option[Boolean] = None
)


