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
package com.mailslurp.modelspackageVersion&#x3D;15.17.32

import java.time.OffsetDateTime
import java.util.UUID

  /**
   * Email contact for address book
   */
case class ContactProjection(
  emailAddress: Option[String] = None,
  emailAddresses: Option[Seq[String]] = None,
  firstName: Option[String] = None,
  lastName: Option[String] = None,
  company: Option[String] = None,
  optOut: Option[Boolean] = None,
  createdAt: OffsetDateTime,
  id: UUID,
  groupId: Option[UUID] = None
)


