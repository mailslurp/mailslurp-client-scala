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
package com.mailslurp.modelspackageVersion&#x3D;15.18.2

import java.time.OffsetDateTime
import java.util.UUID

case class ConnectorDto(
  id: UUID,
  enabled: Boolean,
  userId: UUID,
  connectorType: ConnectorDtoEnums.ConnectorType,
  connectorAuthType: ConnectorDtoEnums.ConnectorAuthType,
  syncEnabled: Boolean,
  syncScheduleType: ConnectorDtoEnums.SyncScheduleType,
  syncInterval: Option[Int] = None,
  imapHost: Option[String] = None,
  imapPort: Option[Int] = None,
  imapUsername: Option[String] = None,
  imapPassword: Option[String] = None,
  imapSsl: Option[Boolean] = None,
  selectFolder: Option[String] = None,
  searchTerms: Option[String] = None,
  createdAt: OffsetDateTime
)

object ConnectorDtoEnums {

  type ConnectorType = ConnectorType.Value
  type ConnectorAuthType = ConnectorAuthType.Value
  type SyncScheduleType = SyncScheduleType.Value
  object ConnectorType extends Enumeration {
    val IMAP = Value("IMAP")
  }

  object ConnectorAuthType extends Enumeration {
    val PLAINTEXT = Value("PLAIN_TEXT")
  }

  object SyncScheduleType extends Enumeration {
    val INTERVAL = Value("INTERVAL")
  }

}

