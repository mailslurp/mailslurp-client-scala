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
package com.mailslurp.modelspackageVersion&#x3D;15.13.23

import java.time.OffsetDateTime
import java.util.UUID

  /**
   * Rules for inbox
   */
case class InboxRulesetDto(
  id: UUID,
  inboxId: UUID,
  scope: InboxRulesetDtoEnums.Scope,
  action: InboxRulesetDtoEnums.Action,
  target: String,
  handler: InboxRulesetDtoEnums.Handler,
  createdAt: OffsetDateTime
)

object InboxRulesetDtoEnums {

  type Scope = Scope.Value
  type Action = Action.Value
  type Handler = Handler.Value
  object Scope extends Enumeration {
    val RECEIVINGEMAILS = Value("RECEIVING_EMAILS")
    val SENDINGEMAILS = Value("SENDING_EMAILS")
  }

  object Action extends Enumeration {
    val BLOCK = Value("BLOCK")
    val ALLOW = Value("ALLOW")
    val FILTERREMOVE = Value("FILTER_REMOVE")
  }

  object Handler extends Enumeration {
    val EXCEPTION = Value("EXCEPTION")
  }

}

