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
package com.mailslurp.modelspackageVersion&#x3D;15.13.25

import java.time.OffsetDateTime
import java.util.UUID

  /**
   * Bounced email
   */
case class BouncedEmailDto(
  id: Option[UUID] = None,
  userId: UUID,
  notificationType: String,
  sentToRecipients: Option[Seq[String]] = None,
  sender: String,
  bounceMta: Option[String] = None,
  bounceType: Option[String] = None,
  bounceRecipients: Option[Seq[String]] = None,
  bounceSubType: Option[String] = None,
  sentEmailId: Option[UUID] = None,
  subject: Option[String] = None,
  createdAt: OffsetDateTime
)


