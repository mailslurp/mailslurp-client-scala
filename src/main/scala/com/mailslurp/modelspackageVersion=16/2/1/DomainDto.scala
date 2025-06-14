/**
 * MailSlurp API
 * MailSlurp is an API for sending and receiving emails and SMS from dynamically allocated email addresses and phone numbers. It's designed for developers and QA teams to test applications, process inbound emails, send templated notifications, attachments, and more.  ## Resources  - [Homepage](https://www.mailslurp.com) - Get an [API KEY](https://app.mailslurp.com/sign-up/) - Generated [SDK Clients](https://docs.mailslurp.com/) - [Examples](https://github.com/mailslurp/examples) repository
 *
 * The version of the OpenAPI document: 6.5.2
 * Contact: contact@mailslurp.dev
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package com.mailslurp.modelspackageVersion&#x3D;16.2.1

import java.time.OffsetDateTime
import java.util.UUID

  /**
   * Domain plus verification records and status
   */
case class DomainDto(
  id: UUID,
  userId: UUID,
  /* Custom domain name */
  domain: String,
  /* Verification tokens */
  verificationToken: String,
  /* Unique token DKIM tokens */
  dkimTokens: Seq[String],
  /* If the domain is duplicate records. */
  duplicateRecordsMessage: Option[String] = None,
  /* Whether the domain has duplicated required records. If true then see the domain in the dashboard app. */
  hasDuplicateRecords: Boolean,
  /* If the domain is missing records then show which pairs are missing. */
  missingRecordsMessage: Option[String] = None,
  /* Whether the domain has missing required records. If true then see the domain in the dashboard app. */
  hasMissingRecords: Boolean,
  /* Whether domain has been verified or not. If the domain is not verified after 72 hours there is most likely an issue with the domains DNS records. */
  isVerified: Boolean,
  /* List of DNS domain name records (C, MX, TXT) etc that you must add to the DNS server associated with your domain provider. */
  domainNameRecords: Seq[DomainNameRecord],
  /* The optional catch all inbox that will receive emails sent to the domain that cannot be matched. */
  catchAllInboxId: Option[UUID] = None,
  createdAt: OffsetDateTime,
  updatedAt: OffsetDateTime,
  /* Type of domain. Dictates type of inbox that can be created with domain. HTTP means inboxes are processed using SES while SMTP inboxes use a custom SMTP mail server. SMTP does not support sending so use HTTP for sending emails. */
  domainType: DomainDtoEnums.DomainType
)

object DomainDtoEnums {

  type DomainType = DomainType.Value
  object DomainType extends Enumeration {
    val HTTPINBOX = Value("HTTP_INBOX")
    val SMTPDOMAIN = Value("SMTP_DOMAIN")
  }

}

