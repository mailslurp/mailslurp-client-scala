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
package com.mailslurp.modelspackageVersion&#x3D;15.17.14

import java.time.OffsetDateTime
import java.util.UUID

case class PhonePlanDto(
  id: UUID,
  userId: UUID,
  phoneCountry: PhonePlanDtoEnums.PhoneCountry,
  createdAt: OffsetDateTime
)

object PhonePlanDtoEnums {

  type PhoneCountry = PhoneCountry.Value
  object PhoneCountry extends Enumeration {
    val US = Value("US")
    val GB = Value("GB")
    val AU = Value("AU")
  }

}

