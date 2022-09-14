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
package com.mailslurp.modelspackageVersion&#x3D;15.13.30


  /**
   * Analysis result for email. Each verdict property is a string PASS|FAIL|GRAY or dynamic error message
   */
case class EmailAnalysis(
  /* Verdict of spam ranking analysis */
  spamVerdict: Option[String] = None,
  /* Verdict of virus scan analysis */
  virusVerdict: Option[String] = None,
  /* Verdict of Send Policy Framework record spoofing analysis */
  spfVerdict: Option[String] = None,
  /* Verdict of DomainKeys Identified Mail analysis */
  dkimVerdict: Option[String] = None,
  /* Verdict of Domain-based Message Authentication Reporting and Conformance analysis */
  dmarcVerdict: Option[String] = None
)


