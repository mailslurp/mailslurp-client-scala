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
package com.mailslurp.modelspackageVersion&#x3D;11.8.11

import java.util.UUID

  /**
   * SendEmailOptions
   * Options for sending an email message from an inbox. You must provide one of: `to`, `toGroup`, or `toContacts` to send an email. All other parameters are optional. 
   */
case class SendEmailOptions(
  /* Optional list of attachment IDs to send with this email. You must first upload each attachment separately in order to obtain attachment IDs. This way you can reuse attachments with different emails once uploaded. */
  attachments: Option[Seq[String]] = None,
  /* Optional list of bcc destination email addresses */
  bcc: Option[Seq[String]] = None,
  /* Optional contents of email. If body contains HTML then set `isHTML` to true to ensure that email clients render it correctly. You can use moustache template syntax in the email body in conjunction with `toGroup` contact variables or `templateVariables` data. If you need more templating control consider creating a template and using the `template` property instead of the body. */
  body: Option[String] = None,
  /* Optional list of cc destination email addresses */
  cc: Option[Seq[String]] = None,
  /* Optional charset */
  charset: Option[String] = None,
  /* Optional from address. If not set the source inbox address will be used for this field. Beware of potential spam penalties when setting this field to an address not used by the inbox. For custom email addresses use a custom domain. */
  from: Option[String] = None,
  /* Optional HTML flag. If true the `content-type` of the email will be `text/html`. Set to true when sending HTML to ensure proper rending on email clients */
  isHTML: Option[Boolean] = None,
  /* Optional replyTo header */
  replyTo: Option[String] = None,
  /* Optional strategy to use when sending the email */
  sendStrategy: Option[SendEmailOptionsEnums.SendStrategy] = None,
  /* Optional email subject line */
  subject: Option[String] = None,
  /* Optional template ID to use for body. Will override body if provided. When using a template make sure you pass the corresponding map of `templateVariables`. You can find which variables are needed by fetching the template itself or viewing it in the dashboard. */
  template: Option[UUID] = None,
  /* Optional map of template variables. Will replace moustache syntax variables in subject and body or template with the associated values if found. */
  templateVariables: Option[Any] = None,
  /* List of destination email addresses. Even single recipients must be in array form. Maximum recipients per email depends on your plan. If you need to send many emails try using contacts or contact groups or use a non standard sendStrategy to ensure that spam filters are not triggered (many recipients in one email can affect your spam rating). */
  to: Option[Seq[String]] = None,
  /* Optional list of contact IDs to send email to. Manage your contacts via the API or dashboard. When contacts are used the email is sent to each contact separately so they will not see other recipients. */
  toContacts: Option[Seq[UUID]] = None,
  /* Optional contact group ID to send email to. You can create contacts and contact groups in the API or dashboard and use them for email campaigns. When contact groups are used the email is sent to each contact separately so they will not see other recipients */
  toGroup: Option[UUID] = None
)

object SendEmailOptionsEnums {

  type SendStrategy = SendStrategy.Value
  object SendStrategy extends Enumeration {
    val SINGLEMESSAGE = Value("SINGLE_MESSAGE")
  }

}

