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
package com.mailslurp.modelspackageVersion&#x3D;15.16.7


  /**
   * Attachment meta data
   * Meta data associated with an attachment. Attachments are stored as byte blobs so the meta data is stored separately.
   */
case class AttachmentMetaData(
  /* Name of attachment if given */
  name: String,
  /* Content type of attachment such as `image/png` */
  contentType: String,
  /* Size of attachment in bytes */
  contentLength: Long,
  /* ID of attachment. Can be used to with attachment controller endpoints to download attachment or with sending methods to attach to an email. */
  id: String
)


