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

import java.time.OffsetDateTime
import com.mailslurp.modelspackageVersion&#x3D;15.19.19.PageEmailValidationRequest
import java.util.UUID
import com.mailslurp.modelspackageVersion&#x3D;15.19.19.ValidateEmailAddressListOptions
import com.mailslurp.modelspackageVersion&#x3D;15.19.19.ValidateEmailAddressListResult
import com.mailslurp.client.core.JsonSupport._
import sttp.client._
import sttp.model.Method

object EmailVerificationControllerApi {

def apply(baseUrl: String = "https://api.mailslurp.com") = new EmailVerificationControllerApi(baseUrl)
}

class EmailVerificationControllerApi(baseUrl: String) {

  /**
   * Expected answers:
   *   code 204 :  (No Content)
   * 
   * Available security schemes:
   *   API_KEY (apiKey)
   */
  def deleteAllValidationRequests(apiKey: String)(
): Request[Either[ResponseError[Exception], Unit], Nothing] =
    basicRequest
      .method(Method.DELETE, uri"$baseUrl/email-verification")
      .contentType("application/json")
      .header("x-api-key", apiKey)
      .response(asJson[Unit])

  /**
   * Expected answers:
   *   code 204 :  (No Content)
   * 
   * Available security schemes:
   *   API_KEY (apiKey)
   * 
   * @param id 
   */
  def deleteValidationRequest(apiKey: String)(id: UUID
): Request[Either[ResponseError[Exception], Unit], Nothing] =
    basicRequest
      .method(Method.DELETE, uri"$baseUrl/email-verification/${id}")
      .contentType("application/json")
      .header("x-api-key", apiKey)
      .response(asJson[Unit])

  /**
   * Expected answers:
   *   code 200 : PageEmailValidationRequest (OK)
   * 
   * Available security schemes:
   *   API_KEY (apiKey)
   * 
   * @param page Optional page index in list pagination
   * @param size Optional page size for paginated result list.
   * @param sort Optional createdAt sort direction ASC or DESC
   * @param searchFilter Optional search filter
   * @param since Filter by created at after the given timestamp
   * @param before Filter by created at before the given timestamp
   * @param isValid Filter where email is valid is true or false
   */
  def getValidationRequests(apiKey: String)(page: Option[Int] = None, size: Option[Int] = None, sort: Option[String] = None, searchFilter: Option[String] = None, since: Option[OffsetDateTime] = None, before: Option[OffsetDateTime] = None, isValid: Option[Boolean] = None
): Request[Either[ResponseError[Exception], PageEmailValidationRequest], Nothing] =
    basicRequest
      .method(Method.GET, uri"$baseUrl/email-verification/validation-requests?page=${ page }&size=${ size }&sort=${ sort }&searchFilter=${ searchFilter }&since=${ since }&before=${ before }&isValid=${ isValid }")
      .contentType("application/json")
      .header("x-api-key", apiKey)
      .response(asJson[PageEmailValidationRequest])

  /**
   * Expected answers:
   *   code 200 : ValidateEmailAddressListResult (OK)
   * 
   * Available security schemes:
   *   API_KEY (apiKey)
   * 
   * @param validateEmailAddressListOptions 
   */
  def validateEmailAddressList(apiKey: String)(validateEmailAddressListOptions: ValidateEmailAddressListOptions
): Request[Either[ResponseError[Exception], ValidateEmailAddressListResult], Nothing] =
    basicRequest
      .method(Method.POST, uri"$baseUrl/email-verification/email-address-list")
      .contentType("application/json")
      .header("x-api-key", apiKey)
      .body(validateEmailAddressListOptions)
      .response(asJson[ValidateEmailAddressListResult])

}
