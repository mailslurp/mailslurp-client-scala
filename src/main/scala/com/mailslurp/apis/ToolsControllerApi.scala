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
package com.mailslurp.apis

import com.mailslurp.modelspackageVersion&#x3D;15.17.36.CheckEmailFeaturesClientSupportOptions
import com.mailslurp.modelspackageVersion&#x3D;15.17.36.CheckEmailFeaturesClientSupportResults
import com.mailslurp.modelspackageVersion&#x3D;15.17.36.GenerateBimiRecordOptions
import com.mailslurp.modelspackageVersion&#x3D;15.17.36.GenerateBimiRecordResults
import com.mailslurp.modelspackageVersion&#x3D;15.17.36.GenerateDmarcRecordOptions
import com.mailslurp.modelspackageVersion&#x3D;15.17.36.GenerateDmarcRecordResults
import com.mailslurp.modelspackageVersion&#x3D;15.17.36.GenerateMtaStsRecordOptions
import com.mailslurp.modelspackageVersion&#x3D;15.17.36.GenerateMtaStsRecordResults
import com.mailslurp.modelspackageVersion&#x3D;15.17.36.GenerateTlsReportingRecordOptions
import com.mailslurp.modelspackageVersion&#x3D;15.17.36.GenerateTlsReportingRecordResults
import com.mailslurp.modelspackageVersion&#x3D;15.17.36.LookupBimiDomainOptions
import com.mailslurp.modelspackageVersion&#x3D;15.17.36.LookupBimiDomainResults
import com.mailslurp.modelspackageVersion&#x3D;15.17.36.LookupDmarcDomainOptions
import com.mailslurp.modelspackageVersion&#x3D;15.17.36.LookupDmarcDomainResults
import com.mailslurp.modelspackageVersion&#x3D;15.17.36.LookupMtaStsDomainOptions
import com.mailslurp.modelspackageVersion&#x3D;15.17.36.LookupMtaStsDomainResults
import com.mailslurp.modelspackageVersion&#x3D;15.17.36.LookupTlsReportingDomainOptions
import com.mailslurp.modelspackageVersion&#x3D;15.17.36.LookupTlsReportingDomainResults
import com.mailslurp.client.core.JsonSupport._
import sttp.client._
import sttp.model.Method

object ToolsControllerApi {

def apply(baseUrl: String = "https://api.mailslurp.com") = new ToolsControllerApi(baseUrl)
}

class ToolsControllerApi(baseUrl: String) {

  /**
   * Expected answers:
   *   code 200 : CheckEmailFeaturesClientSupportResults (OK)
   * 
   * Available security schemes:
   *   API_KEY (apiKey)
   * 
   * @param checkEmailFeaturesClientSupportOptions 
   */
  def checkEmailFeaturesClientSupport(apiKey: String)(checkEmailFeaturesClientSupportOptions: CheckEmailFeaturesClientSupportOptions
): Request[Either[ResponseError[Exception], CheckEmailFeaturesClientSupportResults], Nothing] =
    basicRequest
      .method(Method.POST, uri"$baseUrl/tools/check-email-features-client-support")
      .contentType("application/json")
      .header("x-api-key", apiKey)
      .body(checkEmailFeaturesClientSupportOptions)
      .response(asJson[CheckEmailFeaturesClientSupportResults])

  /**
   * Expected answers:
   *   code 200 : GenerateBimiRecordResults (OK)
   * 
   * Available security schemes:
   *   API_KEY (apiKey)
   * 
   * @param generateBimiRecordOptions 
   */
  def generateBimiRecord(apiKey: String)(generateBimiRecordOptions: GenerateBimiRecordOptions
): Request[Either[ResponseError[Exception], GenerateBimiRecordResults], Nothing] =
    basicRequest
      .method(Method.POST, uri"$baseUrl/tools/generate-bimi-record")
      .contentType("application/json")
      .header("x-api-key", apiKey)
      .body(generateBimiRecordOptions)
      .response(asJson[GenerateBimiRecordResults])

  /**
   * Expected answers:
   *   code 200 : GenerateDmarcRecordResults (OK)
   * 
   * Available security schemes:
   *   API_KEY (apiKey)
   * 
   * @param generateDmarcRecordOptions 
   */
  def generateDmarcRecord(apiKey: String)(generateDmarcRecordOptions: GenerateDmarcRecordOptions
): Request[Either[ResponseError[Exception], GenerateDmarcRecordResults], Nothing] =
    basicRequest
      .method(Method.POST, uri"$baseUrl/tools/generate-dmarc-record")
      .contentType("application/json")
      .header("x-api-key", apiKey)
      .body(generateDmarcRecordOptions)
      .response(asJson[GenerateDmarcRecordResults])

  /**
   * Expected answers:
   *   code 200 : GenerateMtaStsRecordResults (OK)
   * 
   * Available security schemes:
   *   API_KEY (apiKey)
   * 
   * @param generateMtaStsRecordOptions 
   */
  def generateMtaStsRecord(apiKey: String)(generateMtaStsRecordOptions: GenerateMtaStsRecordOptions
): Request[Either[ResponseError[Exception], GenerateMtaStsRecordResults], Nothing] =
    basicRequest
      .method(Method.POST, uri"$baseUrl/tools/generate-mta-sts-record")
      .contentType("application/json")
      .header("x-api-key", apiKey)
      .body(generateMtaStsRecordOptions)
      .response(asJson[GenerateMtaStsRecordResults])

  /**
   * Expected answers:
   *   code 200 : GenerateTlsReportingRecordResults (OK)
   * 
   * Available security schemes:
   *   API_KEY (apiKey)
   * 
   * @param generateTlsReportingRecordOptions 
   */
  def generateTlsReportingRecord(apiKey: String)(generateTlsReportingRecordOptions: GenerateTlsReportingRecordOptions
): Request[Either[ResponseError[Exception], GenerateTlsReportingRecordResults], Nothing] =
    basicRequest
      .method(Method.POST, uri"$baseUrl/tools/generate-tls-reporting-record")
      .contentType("application/json")
      .header("x-api-key", apiKey)
      .body(generateTlsReportingRecordOptions)
      .response(asJson[GenerateTlsReportingRecordResults])

  /**
   * Expected answers:
   *   code 200 : LookupBimiDomainResults (OK)
   * 
   * Available security schemes:
   *   API_KEY (apiKey)
   * 
   * @param lookupBimiDomainOptions 
   */
  def lookupBimiDomain(apiKey: String)(lookupBimiDomainOptions: LookupBimiDomainOptions
): Request[Either[ResponseError[Exception], LookupBimiDomainResults], Nothing] =
    basicRequest
      .method(Method.POST, uri"$baseUrl/tools/lookup-bimi-domain")
      .contentType("application/json")
      .header("x-api-key", apiKey)
      .body(lookupBimiDomainOptions)
      .response(asJson[LookupBimiDomainResults])

  /**
   * Expected answers:
   *   code 200 : LookupDmarcDomainResults (OK)
   * 
   * Available security schemes:
   *   API_KEY (apiKey)
   * 
   * @param lookupDmarcDomainOptions 
   */
  def lookupDmarcDomain(apiKey: String)(lookupDmarcDomainOptions: LookupDmarcDomainOptions
): Request[Either[ResponseError[Exception], LookupDmarcDomainResults], Nothing] =
    basicRequest
      .method(Method.POST, uri"$baseUrl/tools/lookup-dmarc-domain")
      .contentType("application/json")
      .header("x-api-key", apiKey)
      .body(lookupDmarcDomainOptions)
      .response(asJson[LookupDmarcDomainResults])

  /**
   * Expected answers:
   *   code 200 : LookupMtaStsDomainResults (OK)
   * 
   * Available security schemes:
   *   API_KEY (apiKey)
   * 
   * @param lookupMtaStsDomainOptions 
   */
  def lookupMtaStsDomain(apiKey: String)(lookupMtaStsDomainOptions: LookupMtaStsDomainOptions
): Request[Either[ResponseError[Exception], LookupMtaStsDomainResults], Nothing] =
    basicRequest
      .method(Method.POST, uri"$baseUrl/tools/lookup-mta-sts-domain")
      .contentType("application/json")
      .header("x-api-key", apiKey)
      .body(lookupMtaStsDomainOptions)
      .response(asJson[LookupMtaStsDomainResults])

  /**
   * Expected answers:
   *   code 200 : LookupTlsReportingDomainResults (OK)
   * 
   * Available security schemes:
   *   API_KEY (apiKey)
   * 
   * @param lookupTlsReportingDomainOptions 
   */
  def lookupTlsReportingDomain(apiKey: String)(lookupTlsReportingDomainOptions: LookupTlsReportingDomainOptions
): Request[Either[ResponseError[Exception], LookupTlsReportingDomainResults], Nothing] =
    basicRequest
      .method(Method.POST, uri"$baseUrl/tools/lookup-tls-reporting-domain")
      .contentType("application/json")
      .header("x-api-key", apiKey)
      .body(lookupTlsReportingDomainOptions)
      .response(asJson[LookupTlsReportingDomainResults])

}
