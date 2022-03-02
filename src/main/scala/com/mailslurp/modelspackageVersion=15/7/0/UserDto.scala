/**
 * MailSlurp API
 * MailSlurp is an API for sending and receiving emails from dynamically allocated email addresses. It's designed for developers and QA teams to test applications, process inbound emails, send templated notifications, attachments, and more.  ## Resources  - [Homepage](https://www.mailslurp.com) - Get an [API KEY](https://app.mailslurp.com/sign-up/) - Generated [SDK Clients](https://www.mailslurp.com/docs/) - [Examples](https://github.com/mailslurp/examples) repository
 *
 * The version of the OpenAPI document: 6.5.2
 * Contact: contact@mailslurp.dev
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package com.mailslurp.modelspackageVersion&#x3D;15.7.0

import java.time.OffsetDateTime
import java.util.UUID

  /**
   * Representation a user's account
   */
case class UserDto(
  id: UUID,
  apiKey: String,
  emailAddress: String,
  emailAddressMd5: String,
  created: Option[OffsetDateTime] = None,
  userType: Option[UserDtoEnums.UserType] = None,
  /* Does user belong to an organization */
  organization: Option[UUID] = None,
  /* Has user accepted an organization invite */
  verified: Option[UserDtoEnums.Verified] = None,
  hasPassword: Boolean,
  isFrozen: Boolean,
  addNewContacts: Option[Boolean] = None,
  ssoProvider: Option[String] = None,
  customerId: Option[String] = None,
  hasOnboarded: Option[Boolean] = None,
  imapUsername: Option[String] = None,
  imapPassword: Option[String] = None,
  smtpUsername: Option[String] = None,
  smtpPassword: Option[String] = None
)

object UserDtoEnums {

  type UserType = UserType.Value
  type Verified = Verified.Value
  object UserType extends Enumeration {
    val SOLO = Value("SOLO")
    val CHILDSOLO = Value("CHILD_SOLO")
    val CHILDTEAM = Value("CHILD_TEAM")
  }

  object Verified extends Enumeration {
    val VERIFIED = Value("VERIFIED")
    val PENDING = Value("PENDING")
  }

}

