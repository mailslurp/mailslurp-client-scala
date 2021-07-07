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
package com.mailslurp.modelspackageVersion&#x3D;12.7.0


  /**
   * ConditionOption
   * Options for matching emails in an inbox based on a condition such as `HAS_ATTACHMENTS=TRUE`
   */
case class ConditionOption(
  /* The condition to evaluate against the email */
  condition: Option[ConditionOptionEnums.Condition] = None,
  /* What the condition should evaluate to. A string 'TRUE|FALSE' not a boolean. */
  value: Option[ConditionOptionEnums.Value] = None
)

object ConditionOptionEnums {

  type Condition = Condition.Value
  type Value = Value.Value
  object Condition extends Enumeration {
    val HASATTACHMENTS = Value("HAS_ATTACHMENTS")
  }

  object Value extends Enumeration {
    val `TRUE` = Value("TRUE")
    val `FALSE` = Value("FALSE")
  }

}

