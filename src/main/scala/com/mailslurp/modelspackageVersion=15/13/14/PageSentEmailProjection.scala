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
package com.mailslurp.modelspackageVersion&#x3D;15.13.14


  /**
   * Paginated sent email results. Page index starts at zero. Projection results may omit larger entity fields. For fetching a full sent email entity use the projection ID with individual method calls.
   */
case class PageSentEmailProjection(
  /* Collection of items */
  content: Seq[SentEmailProjection],
  pageable: Option[PageableObject] = None,
  total: Option[Long] = None,
  /* Size of page requested */
  size: Int,
  /* Page number starting at 0 */
  number: Int,
  /* Number of items returned */
  numberOfElements: Int,
  /* Total number of items available for querying */
  totalElements: Long,
  /* Total number of pages available */
  totalPages: Int,
  last: Option[Boolean] = None,
  sort: Option[Sort] = None,
  first: Option[Boolean] = None,
  empty: Option[Boolean] = None
)


