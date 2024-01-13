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

import com.mailslurp.modelspackageVersion&#x3D;15.17.23.DNSLookupOptions
import com.mailslurp.modelspackageVersion&#x3D;15.17.23.DNSLookupResults
import com.mailslurp.modelspackageVersion&#x3D;15.17.23.DescribeDomainOptions
import com.mailslurp.modelspackageVersion&#x3D;15.17.23.DescribeMailServerDomainResult
import com.mailslurp.modelspackageVersion&#x3D;15.17.23.EmailVerificationResult
import com.mailslurp.modelspackageVersion&#x3D;15.17.23.IPAddressResult
import com.mailslurp.modelspackageVersion&#x3D;15.17.23.VerifyEmailAddressOptions
import com.mailslurp.client.core.JsonSupport._
import sttp.client._
import sttp.model.Method

object MailServerControllerApi {

def apply(baseUrl: String = "https://api.mailslurp.com") = new MailServerControllerApi(baseUrl)
}

class MailServerControllerApi(baseUrl: String) {

  /**
   * Expected answers:
   *   code 200 : DescribeMailServerDomainResult (OK)
   * 
   * Available security schemes:
   *   API_KEY (apiKey)
   * 
   * @param describeDomainOptions 
   */
  def describeMailServerDomain(apiKey: String)(describeDomainOptions: DescribeDomainOptions
): Request[Either[ResponseError[Exception], DescribeMailServerDomainResult], Nothing] =
    basicRequest
      .method(Method.POST, uri"$baseUrl/mail-server/describe/domain")
      .contentType("application/json")
      .header("x-api-key", apiKey)
      .body(describeDomainOptions)
      .response(asJson[DescribeMailServerDomainResult])

  /**
   * Expected answers:
   *   code 200 : DNSLookupResults (OK)
   * 
   * Available security schemes:
   *   API_KEY (apiKey)
   * 
   * @param dNSLookupOptions 
   */
  def getDnsLookup(apiKey: String)(dNSLookupOptions: DNSLookupOptions
): Request[Either[ResponseError[Exception], DNSLookupResults], Nothing] =
    basicRequest
      .method(Method.POST, uri"$baseUrl/mail-server/describe/dns-lookup")
      .contentType("application/json")
      .header("x-api-key", apiKey)
      .body(dNSLookupOptions)
      .response(asJson[DNSLookupResults])

  /**
   * Expected answers:
   *   code 200 : IPAddressResult (OK)
   * 
   * Available security schemes:
   *   API_KEY (apiKey)
   * 
   * @param name 
   */
  def getIpAddress(apiKey: String)(name: String
): Request[Either[ResponseError[Exception], IPAddressResult], Nothing] =
    basicRequest
      .method(Method.POST, uri"$baseUrl/mail-server/describe/ip-address?name=${ name }")
      .contentType("application/json")
      .header("x-api-key", apiKey)
      .response(asJson[IPAddressResult])

  /**
   * Expected answers:
   *   code 200 : EmailVerificationResult (OK)
   * 
   * Available security schemes:
   *   API_KEY (apiKey)
   * 
   * @param verifyEmailAddressOptions 
   */
  def verifyEmailAddress(apiKey: String)(verifyEmailAddressOptions: VerifyEmailAddressOptions
): Request[Either[ResponseError[Exception], EmailVerificationResult], Nothing] =
    basicRequest
      .method(Method.POST, uri"$baseUrl/mail-server/verify/email-address")
      .contentType("application/json")
      .header("x-api-key", apiKey)
      .body(verifyEmailAddressOptions)
      .response(asJson[EmailVerificationResult])

}
