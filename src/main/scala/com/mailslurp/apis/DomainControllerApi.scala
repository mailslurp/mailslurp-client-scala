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

import com.mailslurp.modelspackageVersion&#x3D;15.19.8.CreateDomainOptions
import com.mailslurp.modelspackageVersion&#x3D;15.19.8.DomainDto
import com.mailslurp.modelspackageVersion&#x3D;15.19.8.DomainGroupsDto
import com.mailslurp.modelspackageVersion&#x3D;15.19.8.DomainIssuesDto
import com.mailslurp.modelspackageVersion&#x3D;15.19.8.DomainPreview
import com.mailslurp.modelspackageVersion&#x3D;15.19.8.InboxDto
import java.util.UUID
import com.mailslurp.modelspackageVersion&#x3D;15.19.8.UpdateDomainOptions
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
   * 
   * Available security schemes:
   *   API_KEY (apiKey)
   * 
   * @param id 
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
   * 
   * Available security schemes:
   *   API_KEY (apiKey)
   * 
   * @param createDomainOptions 
   */
  def createDomain(apiKey: String)(createDomainOptions: CreateDomainOptions
): Request[Either[ResponseError[Exception], DomainDto], Nothing] =
    basicRequest
      .method(Method.POST, uri"$baseUrl/domains")
      .contentType("application/json")
      .header("x-api-key", apiKey)
      .body(createDomainOptions)
      .response(asJson[DomainDto])

  /**
   * Delete a domain. This will disable any existing inboxes that use this domain.
   * 
   * Expected answers:
   *   code 204 : Seq[String] (No Content)
   * 
   * Available security schemes:
   *   API_KEY (apiKey)
   * 
   * @param id 
   */
  def deleteDomain(apiKey: String)(id: UUID
): Request[Either[ResponseError[Exception], Seq[String]], Nothing] =
    basicRequest
      .method(Method.DELETE, uri"$baseUrl/domains/${id}")
      .contentType("application/json")
      .header("x-api-key", apiKey)
      .response(asJson[Seq[String]])

  /**
   * List all domains available for use with email address creation
   * 
   * Expected answers:
   *   code 200 : DomainGroupsDto (OK)
   * 
   * Available security schemes:
   *   API_KEY (apiKey)
   * 
   * @param inboxType 
   */
  def getAvailableDomains(apiKey: String)(inboxType: Option[String] = None
): Request[Either[ResponseError[Exception], DomainGroupsDto], Nothing] =
    basicRequest
      .method(Method.GET, uri"$baseUrl/domains/available-domains?inboxType=${ inboxType }")
      .contentType("application/json")
      .header("x-api-key", apiKey)
      .response(asJson[DomainGroupsDto])

  /**
   * Returns domain verification status and tokens for a given domain
   * 
   * Expected answers:
   *   code 200 : DomainDto (OK)
   * 
   * Available security schemes:
   *   API_KEY (apiKey)
   * 
   * @param id 
   * @param checkForErrors 
   */
  def getDomain(apiKey: String)(id: UUID, checkForErrors: Option[Boolean] = None
): Request[Either[ResponseError[Exception], DomainDto], Nothing] =
    basicRequest
      .method(Method.GET, uri"$baseUrl/domains/${id}?checkForErrors=${ checkForErrors }")
      .contentType("application/json")
      .header("x-api-key", apiKey)
      .response(asJson[DomainDto])

  /**
   * List domain issues for domains you have created
   * 
   * Expected answers:
   *   code 200 : DomainIssuesDto (OK)
   * 
   * Available security schemes:
   *   API_KEY (apiKey)
   */
  def getDomainIssues(apiKey: String)(
): Request[Either[ResponseError[Exception], DomainIssuesDto], Nothing] =
    basicRequest
      .method(Method.GET, uri"$baseUrl/domains/issues")
      .contentType("application/json")
      .header("x-api-key", apiKey)
      .response(asJson[DomainIssuesDto])

  /**
   * Get the catch all inbox for a domain for missed emails
   * 
   * Expected answers:
   *   code 200 : InboxDto (OK)
   * 
   * Available security schemes:
   *   API_KEY (apiKey)
   * 
   * @param id 
   */
  def getDomainWildcardCatchAllInbox(apiKey: String)(id: UUID
): Request[Either[ResponseError[Exception], InboxDto], Nothing] =
    basicRequest
      .method(Method.GET, uri"$baseUrl/domains/${id}/wildcard")
      .contentType("application/json")
      .header("x-api-key", apiKey)
      .response(asJson[InboxDto])

  /**
   * List all custom domains you have created
   * 
   * Expected answers:
   *   code 200 : Seq[DomainPreview] (OK)
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
   * List all MailSlurp domains used with non-custom email addresses
   * 
   * Expected answers:
   *   code 200 : DomainGroupsDto (OK)
   * 
   * Available security schemes:
   *   API_KEY (apiKey)
   * 
   * @param inboxType 
   */
  def getMailSlurpDomains(apiKey: String)(inboxType: Option[String] = None
): Request[Either[ResponseError[Exception], DomainGroupsDto], Nothing] =
    basicRequest
      .method(Method.GET, uri"$baseUrl/domains/mailslurp-domains?inboxType=${ inboxType }")
      .contentType("application/json")
      .header("x-api-key", apiKey)
      .response(asJson[DomainGroupsDto])

  /**
   * Update values on a domain. Note you cannot change the domain name as it is immutable. Recreate the domain if you need to alter this.
   * 
   * Expected answers:
   *   code 200 : DomainDto (OK)
   * 
   * Available security schemes:
   *   API_KEY (apiKey)
   * 
   * @param id 
   * @param updateDomainOptions 
   */
  def updateDomain(apiKey: String)(id: UUID, updateDomainOptions: UpdateDomainOptions
): Request[Either[ResponseError[Exception], DomainDto], Nothing] =
    basicRequest
      .method(Method.PUT, uri"$baseUrl/domains/${id}")
      .contentType("application/json")
      .header("x-api-key", apiKey)
      .body(updateDomainOptions)
      .response(asJson[DomainDto])

}
