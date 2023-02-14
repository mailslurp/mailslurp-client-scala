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
package com.mailslurp.modelspackageVersion&#x3D;15.16.6


  /**
   * Paginated email projection results. EmailProjections and EmailPreviews are essentially the same but have legacy naming issues. Page index starts at zero. Projection results may omit larger entity fields. For fetching a full email entity use the projection ID with individual method calls. For emails there are several methods for fetching message bodies and attachments.
   */
case class PageEmailProjection(
  content: Option[Seq[EmailProjection]] = None,
  pageable: Option[PageableObject] = None,
  total: Option[Long] = None,
  totalPages: Option[Int] = None,
  totalElements: Option[Long] = None,
  last: Option[Boolean] = None,
  size: Option[Int] = None,
  number: Option[Int] = None,
  sort: Option[Sort] = None,
  numberOfElements: Option[Int] = None,
  first: Option[Boolean] = None,
  empty: Option[Boolean] = None
)


