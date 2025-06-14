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
   * Access details for inbox using SMTP
   */
case class SmtpAccessDetails(
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
  /* Mail from domain or SMTP HELO value */
  mailFromDomain: Option[String] = None
)


