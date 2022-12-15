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
package com.mailslurp.modelspackageVersion&#x3D;15.15.4


  /**
   * Options for creating a webhook. Webhooks can be attached to inboxes and MailSlurp will POST a webhook payload to the URL specified whenever the webhook's event is triggered. Webhooks are great for processing many inbound emails and responding to other events at scale. Customize the payload sent to your endpoint by setting the `requestBodyTemplate` property to a string with moustache style variables. Property names from the standard payload model for the given event are available as variables.
   */
case class CreateWebhookOptions(
  /* Public URL on your server that MailSlurp can post WebhookNotification payload to when an email is received or an event is trigger. The payload of the submitted JSON is dependent on the webhook event type. See docs.mailslurp.com/webhooks for event payload documentation. */
  url: String,
  basicAuth: Option[BasicAuthOptions] = None,
  /* Optional name for the webhook */
  name: Option[String] = None,
  /* Optional webhook event name. Default is `EMAIL_RECEIVED` and is triggered when an email is received by the inbox associated with the webhook. Payload differ according to the webhook event name. */
  eventName: Option[CreateWebhookOptionsEnums.EventName] = None,
  includeHeaders: Option[WebhookHeaders] = None,
  /* Template for the JSON body of the webhook request that will be sent to your server. Use Moustache style `{{variableName}}` templating to use parts of the standard webhook payload for the given event. */
  requestBodyTemplate: Option[String] = None
)

object CreateWebhookOptionsEnums {

  type EventName = EventName.Value
  object EventName extends Enumeration {
    val EMAILRECEIVED = Value("EMAIL_RECEIVED")
    val NEWEMAIL = Value("NEW_EMAIL")
    val NEWCONTACT = Value("NEW_CONTACT")
    val NEWATTACHMENT = Value("NEW_ATTACHMENT")
    val EMAILOPENED = Value("EMAIL_OPENED")
    val EMAILREAD = Value("EMAIL_READ")
    val DELIVERYSTATUS = Value("DELIVERY_STATUS")
    val BOUNCE = Value("BOUNCE")
    val BOUNCERECIPIENT = Value("BOUNCE_RECIPIENT")
    val NEWSMS = Value("NEW_SMS")
  }

}

