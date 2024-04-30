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
package com.mailslurp.modelspackageVersion&#x3D;15.19.11


  /**
   * Options for matching emails in an inbox based on a condition such as `HAS_ATTACHMENTS=TRUE`
   */
case class ConditionOption(
  /* Condition of an email object that can be used to filter results */
  condition: ConditionOptionEnums.Condition,
  /* Expected condition value */
  value: ConditionOptionEnums.Value
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

