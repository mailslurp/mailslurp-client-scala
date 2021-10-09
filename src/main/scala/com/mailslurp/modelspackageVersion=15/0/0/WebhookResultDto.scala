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
package com.mailslurp.modelspackageVersion&#x3D;15.0.0

import java.time.OffsetDateTime
import java.util.UUID

case class WebhookResultDto(
  createdAt: OffsetDateTime,
  httpMethod: WebhookResultDtoEnums.HttpMethod,
  id: Option[UUID] = None,
  inboxId: UUID,
  messageId: String,
  redriveId: Option[UUID] = None,
  responseBodyExtract: Option[String] = None,
  responseStatus: Option[Int] = None,
  responseTimeMillis: Long,
  resultType: Option[WebhookResultDtoEnums.ResultType] = None,
  seen: Option[Boolean] = None,
  updatedAt: OffsetDateTime,
  userId: UUID,
  webhookEvent: WebhookResultDtoEnums.WebhookEvent,
  webhookId: UUID,
  webhookUrl: String
)

object WebhookResultDtoEnums {

  type HttpMethod = HttpMethod.Value
  type ResultType = ResultType.Value
  type WebhookEvent = WebhookEvent.Value
  object HttpMethod extends Enumeration {
    val GET = Value("GET")
    val HEAD = Value("HEAD")
    val POST = Value("POST")
    val PUT = Value("PUT")
    val PATCH = Value("PATCH")
    val DELETE = Value("DELETE")
    val OPTIONS = Value("OPTIONS")
    val TRACE = Value("TRACE")
  }

  object ResultType extends Enumeration {
    val BADRESPONSE = Value("BAD_RESPONSE")
    val EXCEPTION = Value("EXCEPTION")
    val SUCCESS = Value("SUCCESS")
  }

  object WebhookEvent extends Enumeration {
    val EMAILRECEIVED = Value("EMAIL_RECEIVED")
    val NEWEMAIL = Value("NEW_EMAIL")
    val NEWCONTACT = Value("NEW_CONTACT")
    val NEWATTACHMENT = Value("NEW_ATTACHMENT")
    val EMAILOPENED = Value("EMAIL_OPENED")
    val EMAILREAD = Value("EMAIL_READ")
  }

}

