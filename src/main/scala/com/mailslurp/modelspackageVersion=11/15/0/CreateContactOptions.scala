/**
 * MailSlurp API
 * MailSlurp is an API for sending and receiving emails from dynamically allocated email addresses. It's designed for developers and QA teams to test applications, process inbound emails, send templated notifications, attachments, and more.  ## Resources  - [Homepage](https://www.mailslurp.com) - Get an [API KEY](https://app.mailslurp.com/sign-up/) - Generated [SDK Clients](https://www.mailslurp.com/docs/) - [Examples](https://github.com/mailslurp/examples) repository 
 *
 * The version of the OpenAPI document: 6.5.2
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package com.mailslurp.modelspackageVersion&#x3D;11.15.0

import java.util.UUID

case class CreateContactOptions(
  /* Set of email addresses belonging to the contact */
  emailAddresses: Option[Seq[String]] = None,
  firstName: Option[String] = None,
  /* Group IDs that contact belongs to */
  groupId: Option[UUID] = None,
  metaData: Option[Any] = None,
  /* Has the user explicitly or implicitly opted out of being contacted? If so MailSlurp will ignore them in all actions. */
  optOut: Option[Boolean] = None,
  /* Tags that can be used to search and group contacts */
  tags: Option[Seq[String]] = None,
  lastName: Option[String] = None,
  company: Option[String] = None
)


