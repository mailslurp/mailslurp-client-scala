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
package com.mailslurp.modelspackageVersion&#x3D;15.19.6

import java.time.OffsetDateTime
import java.util.UUID

case class UserInfoDto(
  id: UUID,
  emailAddress: String,
  accountState: UserInfoDtoEnums.AccountState,
  subscriptionType: Option[UserInfoDtoEnums.SubscriptionType] = None,
  accountType: UserInfoDtoEnums.AccountType,
  createdAt: OffsetDateTime
)

object UserInfoDtoEnums {

  type AccountState = AccountState.Value
  type SubscriptionType = SubscriptionType.Value
  type AccountType = AccountType.Value
  object AccountState extends Enumeration {
    val FROZEN = Value("FROZEN")
    val ACTIVE = Value("ACTIVE")
  }

  object SubscriptionType extends Enumeration {
    val PROMONTHLY = Value("PRO_MONTHLY")
    val STARTER = Value("STARTER")
    val PRO = Value("PRO")
    val TEAM = Value("TEAM")
    val ENTERPRISE = Value("ENTERPRISE")
  }

  object AccountType extends Enumeration {
    val SOLO = Value("SOLO")
    val CHILDSOLO = Value("CHILD_SOLO")
    val CHILDTEAM = Value("CHILD_TEAM")
    val CHILDADMIN = Value("CHILD_ADMIN")
  }

}

