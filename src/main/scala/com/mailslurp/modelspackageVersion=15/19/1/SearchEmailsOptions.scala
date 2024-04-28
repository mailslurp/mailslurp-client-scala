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
package com.mailslurp.modelspackageVersion&#x3D;15.19.1

import java.time.OffsetDateTime
import java.util.UUID

case class SearchEmailsOptions(
  /* Optional inbox ids to filter by. Can be repeated. By default will use all inboxes belonging to your account. */
  inboxIds: Option[Seq[UUID]] = None,
  /* Optional page index in email list pagination */
  pageIndex: Option[Int] = None,
  /* Optional page size in email list pagination. Maximum size is 100. Use page index and sort to page through larger results */
  pageSize: Option[Int] = None,
  /* Optional createdAt sort direction ASC or DESC */
  sortDirection: Option[SearchEmailsOptionsEnums.SortDirection] = None,
  /* Optional filter for unread emails only. All emails are considered unread until they are viewed in the dashboard or requested directly */
  unreadOnly: Option[Boolean] = None,
  /* Optional search filter. Searches email recipients, sender, subject, email address and ID. Does not search email body */
  searchFilter: Option[String] = None,
  /* Optional filter emails received after given date time */
  since: Option[OffsetDateTime] = None,
  /* Optional filter emails received before given date time */
  before: Option[OffsetDateTime] = None
)

object SearchEmailsOptionsEnums {

  type SortDirection = SortDirection.Value
  object SortDirection extends Enumeration {
    val ASC = Value("ASC")
    val DESC = Value("DESC")
  }

}

