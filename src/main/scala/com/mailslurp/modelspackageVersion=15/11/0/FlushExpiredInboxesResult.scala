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
package com.mailslurp.modelspackageVersion&#x3D;15.11.0

import java.time.OffsetDateTime
import java.util.UUID

  /**
   * Result from calling expire on any inboxes that have applicable expiration dates given current time.
   */
case class FlushExpiredInboxesResult(
  /* Inbox IDs affected by expiration */
  inboxIds: Seq[UUID],
  /* DateTime to filter inboxes so that those expiring before this time are expired */
  expireBefore: OffsetDateTime
)


