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
package com.mailslurp.modelspackageVersion&#x3D;15.7.12


  /**
   * Options for creating inbox rulesets. Inbox rulesets can be used to block, allow, filter, or forward emails when sending or receiving using the inbox.
   */
case class CreateInboxRulesetOptions(
  /* What type of emails actions to apply ruleset to. Either `SENDING_EMAILS` or `RECEIVING_EMAILS` will apply action and target to any sending or receiving of emails respectively. */
  scope: CreateInboxRulesetOptionsEnums.Scope,
  /* Action to be taken when the ruleset matches an email for the given scope. For example: `BLOCK` action with target `*` and scope `SENDING_EMAILS` blocks sending to all recipients. Note `ALLOW` takes precedent over `BLOCK`. `FILTER_REMOVE` is like block but will remove offending email addresses during a send or receive event instead of blocking the action. */
  action: CreateInboxRulesetOptionsEnums.Action,
  /* Target to match emails with. Can be a wild-card type pattern or a valid email address. For instance `*@gmail.com` matches all gmail addresses while `test@gmail.com` matches one address exactly. The target is applied to every recipient field email address when `SENDING_EMAILS` is the scope and is applied to sender of email when `RECEIVING_EMAILS`. */
  target: String
)

object CreateInboxRulesetOptionsEnums {

  type Scope = Scope.Value
  type Action = Action.Value
  object Scope extends Enumeration {
    val RECEIVINGEMAILS = Value("RECEIVING_EMAILS")
    val SENDINGEMAILS = Value("SENDING_EMAILS")
  }

  object Action extends Enumeration {
    val BLOCK = Value("BLOCK")
    val ALLOW = Value("ALLOW")
    val FILTERREMOVE = Value("FILTER_REMOVE")
  }

}

