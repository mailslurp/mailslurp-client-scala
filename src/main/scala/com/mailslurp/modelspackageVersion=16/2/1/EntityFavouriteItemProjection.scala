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

case class EntityFavouriteItemProjection(
  createdAt: OffsetDateTime,
  entityType: EntityFavouriteItemProjectionEnums.EntityType,
  name: String,
  id: UUID,
  description: Option[String] = None
)

object EntityFavouriteItemProjectionEnums {

  type EntityType = EntityType.Value
  object EntityType extends Enumeration {
    val INBOX = Value("INBOX")
    val EMAIL = Value("EMAIL")
    val ATTACHMENT = Value("ATTACHMENT")
    val PHONE = Value("PHONE")
    val SMS = Value("SMS")
  }

}

