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
package com.mailslurp.modelspackageVersion&#x3D;15.17.31


case class GenerateDmarcRecordOptions(
  domain: String,
  version: GenerateDmarcRecordOptionsEnums.Version,
  policy: GenerateDmarcRecordOptionsEnums.Policy,
  subdomainPolicy: Option[GenerateDmarcRecordOptionsEnums.SubdomainPolicy] = None,
  reportEmailAddress: Option[Seq[String]] = None,
  forensicEmailAddress: Option[Seq[String]] = None,
  percentage: Option[Int] = None,
  reportFormat: Option[GenerateDmarcRecordOptionsEnums.ReportFormat] = None,
  secondsBetweenReports: Option[Int] = None,
  adkim: Option[GenerateDmarcRecordOptionsEnums.Adkim] = None,
  aspf: Option[GenerateDmarcRecordOptionsEnums.Aspf] = None,
  fo: Option[GenerateDmarcRecordOptionsEnums.Fo] = None
)

object GenerateDmarcRecordOptionsEnums {

  type Version = Version.Value
  type Policy = Policy.Value
  type SubdomainPolicy = SubdomainPolicy.Value
  type ReportFormat = ReportFormat.Value
  type Adkim = Adkim.Value
  type Aspf = Aspf.Value
  type Fo = Fo.Value
  object Version extends Enumeration {
    val DMARC1 = Value("DMARC1")
  }

  object Policy extends Enumeration {
    val NONE = Value("NONE")
    val QUARANTINE = Value("QUARANTINE")
    val REJECT = Value("REJECT")
  }

  object SubdomainPolicy extends Enumeration {
    val NONE = Value("NONE")
    val QUARANTINE = Value("QUARANTINE")
    val REJECT = Value("REJECT")
  }

  object ReportFormat extends Enumeration {
    val AFRF = Value("AFRF")
  }

  object Adkim extends Enumeration {
    val STRICT = Value("STRICT")
    val RELAXED = Value("RELAXED")
  }

  object Aspf extends Enumeration {
    val STRICT = Value("STRICT")
    val RELAXED = Value("RELAXED")
  }

  object Fo extends Enumeration {
    val FO0 = Value("FO_0")
    val FO1 = Value("FO_1")
    val FOD = Value("FO_D")
    val FOS = Value("FO_S")
  }

}

