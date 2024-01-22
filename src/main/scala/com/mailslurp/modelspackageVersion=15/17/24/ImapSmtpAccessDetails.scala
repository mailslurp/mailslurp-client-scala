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
package com.mailslurp.modelspackageVersion&#x3D;15.17.24


  /**
   * Access details for inbox using SMTP or IMAP
   */
case class ImapSmtpAccessDetails(
  /* Secure TLS SMTP server host domain */
  secureSmtpServerHost: String,
  /* Secure TLS SMTP server host port */
  secureSmtpServerPort: Int,
  /* Secure TLS SMTP username for login */
  secureSmtpUsername: String,
  /* Secure TLS SMTP password for login */
  secureSmtpPassword: String,
  /* SMTP server host domain */
  smtpServerHost: String,
  /* SMTP server host port */
  smtpServerPort: Int,
  /* SMTP username for login */
  smtpUsername: String,
  /* SMTP password for login */
  smtpPassword: String,
  /* IMAP server host domain */
  imapServerHost: String,
  /* IMAP server host port */
  imapServerPort: Int,
  /* IMAP username for login */
  imapUsername: String,
  /* IMAP password for login */
  imapPassword: String
)


