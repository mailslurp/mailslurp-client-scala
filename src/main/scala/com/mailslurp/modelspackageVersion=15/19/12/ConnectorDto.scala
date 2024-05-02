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
package com.mailslurp.modelspackageVersion&#x3D;15.19.12

import java.time.OffsetDateTime
import java.util.UUID

case class ConnectorDto(
  id: UUID,
  name: Option[String] = None,
  enabled: Boolean,
  userId: UUID,
  inboxId: UUID,
  syncEnabled: Boolean,
  syncScheduleType: Option[ConnectorDtoEnums.SyncScheduleType] = None,
  syncInterval: Option[Int] = None,
  hasImapConnection: Boolean,
  hasSmtpConnection: Boolean,
  createdAt: OffsetDateTime
)

object ConnectorDtoEnums {

  type SyncScheduleType = SyncScheduleType.Value
  object SyncScheduleType extends Enumeration {
    val INTERVAL = Value("INTERVAL")
  }

}

