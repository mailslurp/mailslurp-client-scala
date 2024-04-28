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
package com.mailslurp.modelspackageVersion&#x3D;15.19.0


  /**
   * Options for IMAP connection to external email inbox. Allows syncing emails iva IMAP.
   */
case class CreateConnectorImapConnectionOptions(
  imapSsl: Option[Boolean] = None,
  imapUsername: Option[String] = None,
  imapPassword: Option[String] = None,
  /* Optional folder to select during IMAP connection */
  selectFolder: Option[String] = None,
  searchTerms: Option[String] = None,
  /* IMAP server port */
  imapPort: Option[Int] = None,
  /* IMAP server host */
  imapHost: String,
  /* IMAP server enabled */
  enabled: Option[Boolean] = None
)


