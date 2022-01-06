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
package com.mailslurp.modelspackageVersion&#x3D;15.0.4

import java.time.OffsetDateTime
import java.util.UUID

case class InboxRulesetDto(
  id: Option[UUID] = None,
  inboxId: Option[UUID] = None,
  scope: Option[InboxRulesetDtoEnums.Scope] = None,
  action: Option[InboxRulesetDtoEnums.Action] = None,
  target: Option[String] = None,
  handler: Option[InboxRulesetDtoEnums.Handler] = None,
  createdAt: Option[OffsetDateTime] = None
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
