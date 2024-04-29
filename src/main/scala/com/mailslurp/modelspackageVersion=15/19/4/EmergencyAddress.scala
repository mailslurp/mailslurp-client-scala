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
package com.mailslurp.modelspackageVersion&#x3D;15.19.4

import java.time.OffsetDateTime
import java.util.UUID

case class EmergencyAddress(
  id: Option[UUID] = None,
  sid: String,
  userId: UUID,
  displayName: String,
  customerName: String,
  address1: String,
  city: String,
  region: String,
  postalCode: String,
  phoneCountry: EmergencyAddressEnums.PhoneCountry,
  accountSid: String,
  createdAt: OffsetDateTime,
  updatedAt: OffsetDateTime
)

object EmergencyAddressEnums {

  type PhoneCountry = PhoneCountry.Value
  object PhoneCountry extends Enumeration {
    val US = Value("US")
    val GB = Value("GB")
    val AU = Value("AU")
  }

}

