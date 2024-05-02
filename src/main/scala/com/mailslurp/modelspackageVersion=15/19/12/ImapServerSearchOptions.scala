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

  /**
   * IMAP server search options
   */
case class ImapServerSearchOptions(
  seqNum: Option[String] = None,
  uid: Option[String] = None,
  since: Option[OffsetDateTime] = None,
  before: Option[OffsetDateTime] = None,
  sentSince: Option[OffsetDateTime] = None,
  sentBefore: Option[OffsetDateTime] = None,
  header: Option[Map[String, Seq[String]]] = None,
  body: Option[Seq[String]] = None,
  text: Option[Seq[String]] = None,
  withFlags: Option[Seq[String]] = None,
  withoutFlags: Option[Seq[String]] = None
)


