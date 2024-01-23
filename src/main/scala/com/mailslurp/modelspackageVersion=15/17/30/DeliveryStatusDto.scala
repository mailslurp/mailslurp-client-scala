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
package com.mailslurp.modelspackageVersion&#x3D;15.17.30

import java.time.OffsetDateTime
import java.util.UUID

case class DeliveryStatusDto(
  id: UUID,
  userId: UUID,
  sentId: Option[UUID] = None,
  remoteMtaIp: Option[String] = None,
  inboxId: Option[UUID] = None,
  reportingMta: Option[String] = None,
  recipients: Option[Seq[String]] = None,
  smtpResponse: Option[String] = None,
  smtpStatusCode: Option[Int] = None,
  processingTimeMillis: Option[Long] = None,
  received: Option[OffsetDateTime] = None,
  subject: Option[String] = None,
  createdAt: OffsetDateTime,
  updatedAt: OffsetDateTime
)


