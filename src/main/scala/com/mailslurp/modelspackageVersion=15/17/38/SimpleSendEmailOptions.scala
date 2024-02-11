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
package com.mailslurp.modelspackageVersion&#x3D;15.17.38

import java.util.UUID

  /**
   * Simplified send email options
   */
case class SimpleSendEmailOptions(
  /* ID of inbox to send from. If null an inbox will be created for sending */
  senderId: Option[UUID] = None,
  /* Email address to send to */
  to: String,
  /* Body of the email message. Supports HTML */
  body: Option[String] = None,
  /* Subject line of the email */
  subject: Option[String] = None
)


