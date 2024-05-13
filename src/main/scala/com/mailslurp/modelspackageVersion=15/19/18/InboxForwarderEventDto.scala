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
package com.mailslurp.modelspackageVersion&#x3D;15.19.18

import java.time.OffsetDateTime
import java.util.UUID

  /**
   * Inbox forwarder event. Describes how an email was handled by an inbox forwarder.
   */
case class InboxForwarderEventDto(
  id: Option[UUID] = None,
  inboxId: Option[UUID] = None,
  emailId: Option[UUID] = None,
  userId: Option[UUID] = None,
  forwarderId: Option[UUID] = None,
  message: Option[String] = None,
  status: Option[InboxForwarderEventDtoEnums.Status] = None,
  createdAt: OffsetDateTime
)

object InboxForwarderEventDtoEnums {

  type Status = Status.Value
  object Status extends Enumeration {
    val SUCCESS = Value("SUCCESS")
    val FAILURE = Value("FAILURE")
  }

}

