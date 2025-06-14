/**
 * MailSlurp API
 * MailSlurp is an API for sending and receiving emails and SMS from dynamically allocated email addresses and phone numbers. It's designed for developers and QA teams to test applications, process inbound emails, send templated notifications, attachments, and more.  ## Resources  - [Homepage](https://www.mailslurp.com) - Get an [API KEY](https://app.mailslurp.com/sign-up/) - Generated [SDK Clients](https://docs.mailslurp.com/) - [Examples](https://github.com/mailslurp/examples) repository
 *
 * The version of the OpenAPI document: 6.5.2
 * Contact: contact@mailslurp.dev
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package com.mailslurp.modelspackageVersion&#x3D;16.2.1


  /**
   * Options for matching SMS messages in a phone number. Each match option object contains a `field`, `should` and `value` property. Together they form logical conditions such as `BODY` should `CONTAIN` value.
   */
case class SmsMatchOption(
  /* Fields of an SMS object that can be used to filter results */
  field: SmsMatchOptionEnums.Field,
  /* How the value of the email field specified should be compared to the value given in the match options. */
  should: SmsMatchOptionEnums.Should,
  /* The value you wish to compare with the value of the field specified using the `should` value passed. For example `BODY` should `CONTAIN` a value passed. */
  value: String
)

object SmsMatchOptionEnums {

  type Field = Field.Value
  type Should = Should.Value
  object Field extends Enumeration {
    val BODY = Value("BODY")
    val FROM = Value("FROM")
  }

  object Should extends Enumeration {
    val `MATCH` = Value("MATCH")
    val CONTAIN = Value("CONTAIN")
    val EQUAL = Value("EQUAL")
  }

}

