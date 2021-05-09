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
package com.mailslurp.modelspackageVersion&#x3D;11.10.3


  /**
   * AttachmentMetaData
   * Meta data associated with an attachment. Attachments are stored as byte blobs so the meta data is stored separately.
   */
case class AttachmentMetaData(
  /* Size of attachment in bytes */
  contentLength: Option[Long] = None,
  /* Content type of attachment such as `image/png` */
  contentType: Option[String] = None,
  /* ID of attachment */
  id: Option[String] = None,
  /* Name of attachment if given */
  name: Option[String] = None
)

