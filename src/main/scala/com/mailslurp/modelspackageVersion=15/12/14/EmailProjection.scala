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
package com.mailslurp.modelspackageVersion&#x3D;15.12.14

import java.time.OffsetDateTime
import java.util.UUID

  /**
   * A compact representation of a full email. Used in list endpoints to keep response sizes low. Body and attachments are not included. To get all fields of the email use the `getEmail` method with the email projection's ID. See `EmailDto` for documentation on projection properties.
   */
case class EmailProjection(
  id: UUID,
  from: Option[String] = None,
  subject: Option[String] = None,
  inboxId: UUID,
  attachments: Option[Seq[String]] = None,
  to: Seq[String],
  createdAt: OffsetDateTime,
  bcc: Option[Seq[String]] = None,
  cc: Option[Seq[String]] = None,
  teamAccess: Boolean,
  read: Boolean,
  bodyMD5Hash: Option[String] = None,
  bodyExcerpt: Option[String] = None
)


