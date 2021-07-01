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
package com.mailslurp.modelspackageVersion&#x3D;12.6.0


  /**
   * PageSentEmailProjection
   * Paginated sent email results. Page index starts at zero. Projection results may omit larger entity fields. For fetching a full sent email entity use the projection ID with individual method calls.
   */
case class PageSentEmailProjection(
  /* Collection of items */
  content: Option[Seq[SentEmailProjection]] = None,
  empty: Option[Boolean] = None,
  first: Option[Boolean] = None,
  last: Option[Boolean] = None,
  /* Page number starting at 0 */
  number: Option[Int] = None,
  /* Number of items returned */
  numberOfElements: Option[Int] = None,
  pageable: Option[Pageable] = None,
  /* Size of page requested */
  size: Option[Int] = None,
  sort: Option[Sort] = None,
  /* Total number of items available for querying */
  totalElements: Option[Long] = None,
  /* Total number of pages available */
  totalPages: Option[Int] = None
)


