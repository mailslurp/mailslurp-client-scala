/**
 * MailSlurp API
 * MailSlurp is an API for sending and receiving emails from dynamically allocated email addresses. It's designed for developers and QA teams to test applications, process inbound emails, send templated notifications, attachments, and more.   ## Resources - [Homepage](https://www.mailslurp.com) - Get an [API KEY](https://app.mailslurp.com/sign-up/) - Generated [SDK Clients](https://www.mailslurp.com/docs/) - [Examples](https://github.com/mailslurp/examples) repository 
 *
 * The version of the OpenAPI document: 6.5.2
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package com.mailslurp.modelspackageVersion&#x3D;11.7.6

import java.time.OffsetDateTime
import java.util.UUID

  /**
   * DomainDto
   * Domain plus verification records and status
   */
case class DomainDto(
  /* The optional catch all inbox that will receive emails sent to the domain that cannot be matched. */
  catchAllInboxId: Option[UUID] = None,
  createdAt: OffsetDateTime,
  /* Unique token DKIM tokens */
  dkimTokens: Option[Seq[String]] = None,
  /* Custom domain name */
  domain: Option[String] = None,
  /* List of DNS domain name records (C, MX, TXT) etc that you must add to the DNS server associated with your domain provider. */
  domainNameRecords: Option[Seq[DomainNameRecord]] = None,
  id: UUID,
  /* Whether domain has been verified or not. If the domain is not verified after 72 hours there is most likely an issue with the domains DNS records. */
  isVerified: Option[Boolean] = None,
  updatedAt: OffsetDateTime,
  userId: UUID,
  /* Verification tokens */
  verificationToken: Option[String] = None
)


