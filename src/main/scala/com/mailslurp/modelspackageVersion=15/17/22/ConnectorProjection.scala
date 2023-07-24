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
package com.mailslurp.modelspackageVersion&#x3D;15.17.22

import java.time.OffsetDateTime
import java.util.UUID

  /**
   * Connector
   */
case class ConnectorProjection(
  id: Option[UUID] = None,
  userId: UUID,
  inboxId: UUID,
  createdAt: OffsetDateTime,
  connectorType: ConnectorProjectionEnums.ConnectorType,
  syncScheduleType: ConnectorProjectionEnums.SyncScheduleType,
  syncInterval: Option[Int] = None,
  syncEnabled: Boolean
)

object ConnectorProjectionEnums {

  type ConnectorType = ConnectorType.Value
  type SyncScheduleType = SyncScheduleType.Value
  object ConnectorType extends Enumeration {
    val IMAP = Value("IMAP")
  }

  object SyncScheduleType extends Enumeration {
    val INTERVAL = Value("INTERVAL")
  }

}

