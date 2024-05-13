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
package com.mailslurp.modelspackageVersion&#x3D;15.19.21


case class GenerateTlsReportingRecordOptions(
  reportingAddresses: Seq[String],
  reportingUrl: Option[String] = None,
  host: String,
  version: GenerateTlsReportingRecordOptionsEnums.Version,
  ttl: Int
)

object GenerateTlsReportingRecordOptionsEnums {

  type Version = Version.Value
  object Version extends Enumeration {
    val TLSRPTv1 = Value("TLSRPTv1")
  }

}

