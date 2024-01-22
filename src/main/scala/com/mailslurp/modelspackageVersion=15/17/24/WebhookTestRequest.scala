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
package com.mailslurp.modelspackageVersion&#x3D;15.17.24


  /**
   * Result of webhook test request
   */
case class WebhookTestRequest(
  url: String,
  method: WebhookTestRequestEnums.Method,
  headers: Map[String, String],
  payload: Option[String] = None
)

object WebhookTestRequestEnums {

  type Method = Method.Value
  object Method extends Enumeration {
    val POST = Value("POST")
    val DELETE = Value("DELETE")
    val GET = Value("GET")
    val PUT = Value("PUT")
    val PATCH = Value("PATCH")
    val HEAD = Value("HEAD")
    val OPTIONS = Value("OPTIONS")
    val TRACE = Value("TRACE")
  }

}

