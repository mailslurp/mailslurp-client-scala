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
package com.mailslurp.modelspackageVersion&#x3D;12.0.0

import java.time.OffsetDateTime
import java.util.UUID

case class InboxProjection(
  createdAt: OffsetDateTime,
  emailAddress: Option[String] = None,
  favourite: Boolean,
  id: UUID,
  inboxType: Option[InboxProjectionEnums.InboxType] = None,
  name: Option[String] = None,
  tags: Option[Seq[String]] = None,
  teamAccess: Boolean
)

object InboxProjectionEnums {

  type InboxType = InboxType.Value
  object InboxType extends Enumeration {
    val HTTPINBOX = Value("HTTP_INBOX")
    val SMTPINBOX = Value("SMTP_INBOX")
  }

}

