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
package com.mailslurp.modelspackageVersion&#x3D;15.17.0

import java.time.OffsetDateTime
import java.util.UUID

  /**
   * Inbox forwarder event
   */
case class InboxForwarderEventProjection(
  message: Option[String] = None,
  id: Option[UUID] = None,
  status: Option[InboxForwarderEventProjectionEnums.Status] = None,
  userId: Option[UUID] = None,
  emailId: Option[UUID] = None,
  inboxId: Option[UUID] = None,
  createdAt: OffsetDateTime,
  forwarderId: Option[UUID] = None
)

object InboxForwarderEventProjectionEnums {

  type Status = Status.Value
  object Status extends Enumeration {
    val SUCCESS = Value("SUCCESS")
    val FAILURE = Value("FAILURE")
  }

}

