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
package com.mailslurp.modelspackageVersion&#x3D;15.5.6


  /**
   * Options for matching emails in an inbox. Each match option object contains a `field`, `should` and `value` property. Together they form logical conditions such as `SUBJECT` should `CONTAIN` value.
   */
case class MatchOption(
  /* Fields of an email object that can be used to filter results */
  field: MatchOptionEnums.Field,
  /* How the value of the email field specified should be compared to the value given in the match options. */
  should: MatchOptionEnums.Should,
  /* The value you wish to compare with the value of the field specified using the `should` value passed. For example `BODY` should `CONTAIN` a value passed. */
  value: String
)

object MatchOptionEnums {

  type Field = Field.Value
  type Should = Should.Value
  object Field extends Enumeration {
    val SUBJECT = Value("SUBJECT")
    val TO = Value("TO")
    val BCC = Value("BCC")
    val CC = Value("CC")
    val FROM = Value("FROM")
  }

  object Should extends Enumeration {
    val CONTAIN = Value("CONTAIN")
    val EQUAL = Value("EQUAL")
  }

}

