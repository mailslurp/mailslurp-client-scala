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

import java.time.OffsetDateTime
import java.util.UUID

case class WaitForSingleSmsOptions(
  phoneNumberId: UUID,
  timeout: Long,
  unreadOnly: Option[Boolean] = None,
  before: Option[OffsetDateTime] = None,
  since: Option[OffsetDateTime] = None,
  sortDirection: Option[WaitForSingleSmsOptionsEnums.SortDirection] = None,
  delay: Option[Long] = None
)

object WaitForSingleSmsOptionsEnums {

  type SortDirection = SortDirection.Value
  object SortDirection extends Enumeration {
    val ASC = Value("ASC")
    val DESC = Value("DESC")
  }

}

