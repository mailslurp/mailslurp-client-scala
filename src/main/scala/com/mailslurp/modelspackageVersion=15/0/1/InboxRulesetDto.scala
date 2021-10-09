/**
 * MailSlurp API
 * MailSlurp is an API for sending and receiving emails from dynamically allocated email addresses. It's designed for developers and QA teams to test applications, process inbound emails, send templated notifications, attachments, and more.  ## Resources  - [Homepage](https://www.mailslurp.com) - Get an [API KEY](https://app.mailslurp.com/sign-up/) - Generated [SDK Clients](https://www.mailslurp.com/docs/) - [Examples](https://github.com/mailslurp/examples) repository
 *
 * The version of the OpenAPI document: 6.5.2
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package com.mailslurp.modelspackageVersion&#x3D;15.0.1

import java.time.OffsetDateTime
import java.util.UUID

case class InboxRulesetDto(
  action: InboxRulesetDtoEnums.Action,
  createdAt: OffsetDateTime,
  handler: InboxRulesetDtoEnums.Handler,
  id: UUID,
  inboxId: UUID,
  scope: InboxRulesetDtoEnums.Scope,
  target: String
)

object InboxRulesetDtoEnums {

  type Action = Action.Value
  type Handler = Handler.Value
  type Scope = Scope.Value
  object Action extends Enumeration {
    val BLOCK = Value("BLOCK")
    val ALLOW = Value("ALLOW")
    val FILTERREMOVE = Value("FILTER_REMOVE")
  }

  object Handler extends Enumeration {
    val EXCEPTION = Value("EXCEPTION")
  }

  object Scope extends Enumeration {
    val RECEIVINGEMAILS = Value("RECEIVING_EMAILS")
    val SENDINGEMAILS = Value("SENDING_EMAILS")
  }

}
