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
package com.mailslurp.modelspackageVersion&#x3D;15.13.6

import java.time.OffsetDateTime

  /**
   * Options for exporting user data
   */
case class ExportOptions(
  outputFormat: ExportOptionsEnums.OutputFormat,
  excludePreviouslyExported: Option[Boolean] = None,
  createdEarliestTime: Option[OffsetDateTime] = None,
  createdOldestTime: Option[OffsetDateTime] = None,
  filter: Option[String] = None,
  listSeparatorToken: Option[String] = None
)

object ExportOptionsEnums {

  type OutputFormat = OutputFormat.Value
  object OutputFormat extends Enumeration {
    val CSVDEFAULT = Value("CSV_DEFAULT")
    val CSVEXCEL = Value("CSV_EXCEL")
  }

}

