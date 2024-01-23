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
package com.mailslurp.modelspackageVersion&#x3D;15.17.28


case class GenerateMtaStsRecordOptions(
  host: String,
  version: GenerateMtaStsRecordOptionsEnums.Version,
  mode: GenerateMtaStsRecordOptionsEnums.Mode,
  ttl: Int,
  maxAgeSeconds: Int,
  mxRecords: Seq[String]
)

object GenerateMtaStsRecordOptionsEnums {

  type Version = Version.Value
  type Mode = Mode.Value
  object Version extends Enumeration {
    val STSv1 = Value("STSv1")
  }

  object Mode extends Enumeration {
    val TESTING = Value("TESTING")
    val ENFORCE = Value("ENFORCE")
    val NONE = Value("NONE")
  }

}

