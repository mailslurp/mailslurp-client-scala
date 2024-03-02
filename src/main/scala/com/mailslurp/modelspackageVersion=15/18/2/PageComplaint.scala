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
package com.mailslurp.modelspackageVersion&#x3D;15.18.2


  /**
   * Paginated complaint email. Page index starts at zero. Projection results may omit larger entity fields. For fetching a full entity use the projection ID with individual method calls.
   */
case class PageComplaint(
  content: Option[Seq[Complaint]] = None,
  pageable: Option[PageableObject] = None,
  totalPages: Int,
  totalElements: Long,
  last: Option[Boolean] = None,
  numberOfElements: Option[Int] = None,
  first: Option[Boolean] = None,
  size: Option[Int] = None,
  number: Option[Int] = None,
  sort: Option[SortObject] = None,
  empty: Option[Boolean] = None
)


