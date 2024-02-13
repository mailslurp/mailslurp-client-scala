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
package com.mailslurp.modelspackageVersion&#x3D;15.17.40


case class EmailFeatureFamilyName(
  slug: EmailFeatureFamilyNameEnums.Slug,
  name: String
)

object EmailFeatureFamilyNameEnums {

  type Slug = Slug.Value
  object Slug extends Enumeration {
    val Aol = Value("aol")
    val AppleMail = Value("apple-mail")
    val Fastmail = Value("fastmail")
    val FreeFr = Value("free-fr")
    val Gmail = Value("gmail")
    val Gmx = Value("gmx")
    val Hey = Value("hey")
    val Ionos1and1 = Value("ionos-1and1")
    val Laposte = Value("laposte")
    val MailRu = Value("mail-ru")
    val Microsoft = Value("microsoft")
    val Orange = Value("orange")
    val Outlook = Value("outlook")
    val Protonmail = Value("protonmail")
    val Rainloop = Value("rainloop")
    val SamsungEmail = Value("samsung-email")
    val Sfr = Value("sfr")
    val TOnlineDe = Value("t-online-de")
    val Thunderbird = Value("thunderbird")
    val WebDe = Value("web-de")
    val Yahoo = Value("yahoo")
  }

}

