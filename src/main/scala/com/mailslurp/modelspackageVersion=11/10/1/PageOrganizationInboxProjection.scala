/**
 * MailSlurp API
 * MailSlurp is an API for sending and receiving emails from dynamically allocated email addresses. It's designed for developers and QA teams to test applications, process inbound emails, send templated notifications, attachments, and more.   ## Resources - [Homepage](https://www.mailslurp.com) - Get an [API KEY](https://app.mailslurp.com/sign-up/) - Generated [SDK Clients](https://www.mailslurp.com/docs/) - [Examples](https://github.com/mailslurp/examples) repository 
 *
 * The version of the OpenAPI document: 6.5.2
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package com.mailslurp.modelspackageVersion&#x3D;11.10.1


  /**
   * PageOrganizationInboxProjection
   * Paginated organization inbox results. Page index starts at zero. Projection results may omit larger entity fields. For fetching a full entity use the projection ID with individual method calls.
   */
case class PageOrganizationInboxProjection(
  content: Option[Seq[OrganizationInboxProjection]] = None,
  empty: Option[Boolean] = None,
  first: Option[Boolean] = None,
  last: Option[Boolean] = None,
  number: Option[Int] = None,
  numberOfElements: Option[Int] = None,
  pageable: Option[Pageable] = None,
  size: Option[Int] = None,
  sort: Option[Sort] = None,
  totalElements: Option[Long] = None,
  totalPages: Option[Int] = None
)


