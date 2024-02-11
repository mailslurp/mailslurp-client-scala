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
package com.mailslurp.modelspackageVersion&#x3D;15.17.37

import java.time.OffsetDateTime
import java.util.UUID

  /**
   * Contact object. For saving a user in contact book.
   */
case class ContactDto(
  id: UUID,
  groupId: Option[UUID] = None,
  firstName: Option[String] = None,
  lastName: Option[String] = None,
  company: Option[String] = None,
  emailAddresses: Seq[String],
  primaryEmailAddress: Option[String] = None,
  tags: Seq[String],
  metaData: Option[Any] = None,
  optOut: Option[Boolean] = None,
  createdAt: OffsetDateTime
)


