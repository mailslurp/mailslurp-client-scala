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
package com.mailslurp.modelspackageVersion&#x3D;15.17.15

import java.time.OffsetDateTime
import java.util.UUID

  /**
   * Preview object for domain entity
   */
case class DomainPreview(
  id: UUID,
  domain: String,
  catchAllInboxId: Option[UUID] = None,
  createdAt: OffsetDateTime,
  /* Type of domain. Dictates type of inbox that can be created with domain. HTTP means inboxes are processed using SES while SMTP inboxes use a custom SMTP mail server. SMTP does not support sending so use HTTP for sending emails. */
  domainType: DomainPreviewEnums.DomainType,
  isVerified: Boolean,
  hasMissingRecords: Boolean
)

object DomainPreviewEnums {

  type DomainType = DomainType.Value
  object DomainType extends Enumeration {
    val HTTPINBOX = Value("HTTP_INBOX")
    val SMTPDOMAIN = Value("SMTP_DOMAIN")
  }

}

