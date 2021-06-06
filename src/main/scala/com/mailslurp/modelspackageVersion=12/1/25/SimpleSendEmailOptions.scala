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
package com.mailslurp.modelspackageVersion&#x3D;12.1.25

import java.util.UUID

case class SimpleSendEmailOptions(
  /* Body of the email message. Supports HTML */
  body: Option[String] = None,
  /* ID of inbox to send from. If null an inbox will be created for sending */
  senderId: Option[UUID] = None,
  /* Subject line of the email */
  subject: Option[String] = None,
  /* Email address to send to */
  to: Option[String] = None
)


