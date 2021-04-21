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
package com.mailslurp.apis

import com.mailslurp.modelspackageVersion&#x3D;11.7.211.CreateDomainOptions
import com.mailslurp.modelspackageVersion&#x3D;11.7.211.DomainDto
import com.mailslurp.modelspackageVersion&#x3D;11.7.211.DomainPreview
import java.util.UUID
import com.mailslurp.modelspackageVersion&#x3D;11.7.211.UpdateDomainOptions
import com.mailslurp.client.core.JsonSupport._
import sttp.client._
import sttp.model.Method

object DomainControllerApi {

def apply(baseUrl: String = "https://api.mailslurp.com") = new DomainControllerApi(baseUrl)
}

class DomainControllerApi(baseUrl: String) {

  /**
   * Add a catch all inbox to a domain so that any emails sent to it that cannot be matched will be sent to the catch all inbox generated
   * 
   * Expected answers:
   *   code 200 : DomainDto (OK)
   *   code 201 :  (Created)
   *   code 401 :  (Unauthorized)
   *   code 403 :  (Forbidden)
   *   code 404 :  (Not Found)
   * 
   * Available security schemes:
   *   API_KEY (apiKey)
   * 
   * @param id id
   */
  def addDomainWildcardCatchAll(apiKey: String)(id: UUID
): Request[Either[ResponseError[Exception], DomainDto], Nothing] =
    basicRequest
      .method(Method.POST, uri"$baseUrl/domains/${id}/wildcard")
      .contentType("application/json")
      .header("x-api-key", apiKey)
      .response(asJson[DomainDto])

  /**
   * Link a domain that you own with MailSlurp so you can create email addresses using it. Endpoint returns DNS records used for validation. You must add these verification records to your host provider's DNS setup to verify the domain.
   * 
   * Expected answers:
   *   code 201 : DomainDto (Created)
   *   code 401 :  (Unauthorized)
   *   code 403 :  (Forbidden)
   *   code 404 :  (Not Found)
   * 
   * Available security schemes:
   *   API_KEY (apiKey)
   * 
   * @param domainOptions domainOptions
   */
  def createDomain(apiKey: String)(domainOptions: CreateDomainOptions
): Request[Either[ResponseError[Exception], DomainDto], Nothing] =
    basicRequest
      .method(Method.POST, uri"$baseUrl/domains")
      .contentType("application/json")
      .header("x-api-key", apiKey)
      .body(domainOptions)
      .response(asJson[DomainDto])

  /**
   * Delete a domain. This will disable any existing inboxes that use this domain.
   * 
   * Expected answers:
   *   code 204 : Seq[String] (No Content)
   *   code 401 :  (Unauthorized)
   *   code 403 :  (Forbidden)
   * 
   * Available security schemes:
   *   API_KEY (apiKey)
   * 
   * @param id id
   */
  def deleteDomain(apiKey: String)(id: UUID
): Request[Either[ResponseError[Exception], Seq[String]], Nothing] =
    basicRequest
      .method(Method.DELETE, uri"$baseUrl/domains/${id}")
      .contentType("application/json")
      .header("x-api-key", apiKey)
      .response(asJson[Seq[String]])

  /**
   * Returns domain verification status and tokens for a given domain
   * 
   * Expected answers:
   *   code 200 : DomainDto (OK)
   *   code 401 :  (Unauthorized)
   *   code 403 :  (Forbidden)
   *   code 404 :  (Not Found)
   * 
   * Available security schemes:
   *   API_KEY (apiKey)
   * 
   * @param id id
   */
  def getDomain(apiKey: String)(id: UUID
): Request[Either[ResponseError[Exception], DomainDto], Nothing] =
    basicRequest
      .method(Method.GET, uri"$baseUrl/domains/${id}")
      .contentType("application/json")
      .header("x-api-key", apiKey)
      .response(asJson[DomainDto])

  /**
   * List all custom domains you have created
   * 
   * Expected answers:
   *   code 200 : Seq[DomainPreview] (OK)
   *   code 401 :  (Unauthorized)
   *   code 403 :  (Forbidden)
   *   code 404 :  (Not Found)
   * 
   * Available security schemes:
   *   API_KEY (apiKey)
   */
  def getDomains(apiKey: String)(
): Request[Either[ResponseError[Exception], Seq[DomainPreview]], Nothing] =
    basicRequest
      .method(Method.GET, uri"$baseUrl/domains")
      .contentType("application/json")
      .header("x-api-key", apiKey)
      .response(asJson[Seq[DomainPreview]])

  /**
   * Update values on a domain. Note you cannot change the domain name as it is immutable. Recreate the domain if you need to alter this.
   * 
   * Expected answers:
   *   code 200 : DomainDto (OK)
   *   code 201 :  (Created)
   *   code 401 :  (Unauthorized)
   *   code 403 :  (Forbidden)
   *   code 404 :  (Not Found)
   * 
   * Available security schemes:
   *   API_KEY (apiKey)
   * 
   * @param id id
   * @param updateDomainDto updateDomainDto
   */
  def updateDomain(apiKey: String)(id: UUID, updateDomainDto: UpdateDomainOptions
): Request[Either[ResponseError[Exception], DomainDto], Nothing] =
    basicRequest
      .method(Method.PUT, uri"$baseUrl/domains/${id}")
      .contentType("application/json")
      .header("x-api-key", apiKey)
      .body(updateDomainDto)
      .response(asJson[DomainDto])

}
