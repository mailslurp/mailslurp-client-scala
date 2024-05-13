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
package com.mailslurp.modelspackageVersion&#x3D;15.19.20

import java.util.UUID

  /**
   * IMAP fetch content in raw format
   */
case class ImapServerFetchItem(
  /* Content of the email */
  content: String,
  /* ID of the email */
  id: UUID,
  /* UID of the email */
  uid: Long,
  /* Sequence number of the email */
  seqNum: Long,
  /* Read status of the email */
  read: Boolean
)


