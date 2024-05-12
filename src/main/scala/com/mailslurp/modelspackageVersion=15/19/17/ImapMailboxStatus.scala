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
package com.mailslurp.modelspackageVersion&#x3D;15.19.17


case class ImapMailboxStatus(
  /* The mailbox name. */
  name: String,
  /* True if the mailbox is open in read-only mode. */
  readOnly: Boolean,
  /* Results map */
  items: Any,
  /* The mailbox flags. */
  flags: Seq[String],
  /* The mailbox permanent flags. */
  permanentFlags: Seq[String],
  /* The sequence number of the first unseen message in the mailbox. */
  unseenSeqNum: Long,
  /* The number of messages in this mailbox. */
  messages: Int,
  /* The number of messages not seen since the last time the mailbox was opened. */
  recent: Int,
  /* The number of unread messages. */
  unseen: Int,
  /* The next UID. */
  uidNext: Long,
  /* Together with a UID, it is a unique identifier for a message. Must be greater than or equal to 1. */
  uidValidity: Int,
  /* Per-mailbox limit of message size. Set only if server supports the APPENDLIMIT extension */
  appendLimit: Option[Int] = None
)


