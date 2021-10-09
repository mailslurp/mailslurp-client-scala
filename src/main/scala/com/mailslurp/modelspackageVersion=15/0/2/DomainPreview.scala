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
package com.mailslurp.modelspackageVersion&#x3D;15.0.2

import java.time.OffsetDateTime
import java.util.UUID

  /**
   * DomainPreview
   * Preview object for domain entity
   */
case class DomainPreview(
  catchAllInboxId: Option[UUID] = None,
  createdAt: OffsetDateTime,
  domain: String,
  domainType: DomainPreviewEnums.DomainType,
  id: UUID,
  isVerified: Boolean
)

object DomainPreviewEnums {

  type DomainType = DomainType.Value
  object DomainType extends Enumeration {
    val HTTPINBOX = Value("HTTP_INBOX")
    val SMTPDOMAIN = Value("SMTP_DOMAIN")
  }

}

