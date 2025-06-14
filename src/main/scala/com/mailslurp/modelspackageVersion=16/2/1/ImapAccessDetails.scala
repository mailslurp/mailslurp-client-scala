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


  /**
   * Access details for inbox using IMAP
   */
case class ImapAccessDetails(
  /* Secure TLS IMAP server host domain */
  secureImapServerHost: String,
  /* Secure TLS IMAP server host port */
  secureImapServerPort: Int,
  /* Secure TLS IMAP username for login */
  secureImapUsername: String,
  /* Secure TLS IMAP password for login */
  secureImapPassword: String,
  /* IMAP server host domain */
  imapServerHost: String,
  /* IMAP server host port */
  imapServerPort: Int,
  /* IMAP username for login */
  imapUsername: String,
  /* IMAP password for login */
  imapPassword: String,
  /* IMAP mailbox to SELECT */
  imapMailbox: String
)


