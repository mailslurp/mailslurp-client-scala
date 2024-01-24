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
package com.mailslurp.modelspackageVersion&#x3D;15.17.33

import java.time.OffsetDateTime
import java.util.UUID

case class SearchInboxesOptions(
  /* Optional page index in list pagination */
  pageIndex: Option[Int] = None,
  /* Optional page size in list pagination */
  pageSize: Option[Int] = None,
  /* Optional createdAt sort direction ASC or DESC */
  sortDirection: Option[SearchInboxesOptionsEnums.SortDirection] = None,
  /* Optionally filter results for favourites only */
  favourite: Option[Boolean] = None,
  /* Optionally filter by search words partial matching ID, tags, name, and email address */
  search: Option[String] = None,
  /* Optionally filter by tags. Will return inboxes that include given tags */
  tag: Option[String] = None,
  /* Optional filter by created after given date time */
  since: Option[OffsetDateTime] = None,
  /* Optional filter by created before given date time */
  before: Option[OffsetDateTime] = None,
  /* Type of inbox. HTTP inboxes are faster and better for most cases. SMTP inboxes are more suited for public facing inbound messages (but cannot send). */
  inboxType: Option[SearchInboxesOptionsEnums.InboxType] = None,
  /* Optional filter by inbox function */
  inboxFunction: Option[SearchInboxesOptionsEnums.InboxFunction] = None,
  /* Optional domain ID filter */
  domainId: Option[UUID] = None
)

object SearchInboxesOptionsEnums {

  type SortDirection = SortDirection.Value
  type InboxType = InboxType.Value
  type InboxFunction = InboxFunction.Value
  object SortDirection extends Enumeration {
    val ASC = Value("ASC")
    val DESC = Value("DESC")
  }

  object InboxType extends Enumeration {
    val HTTPINBOX = Value("HTTP_INBOX")
    val SMTPINBOX = Value("SMTP_INBOX")
  }

  object InboxFunction extends Enumeration {
    val ALIAS = Value("ALIAS")
    val THREAD = Value("THREAD")
    val CATCHALL = Value("CATCH_ALL")
    val CONNECTOR = Value("CONNECTOR")
  }

}

