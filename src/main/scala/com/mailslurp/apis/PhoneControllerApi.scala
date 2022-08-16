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

import com.mailslurp.modelspackageVersion&#x3D;15.13.17.CreateEmergencyAddressOptions
import com.mailslurp.modelspackageVersion&#x3D;15.13.17.EmergencyAddress
import com.mailslurp.modelspackageVersion&#x3D;15.13.17.EmergencyAddressDto
import com.mailslurp.modelspackageVersion&#x3D;15.13.17.EmptyResponseDto
import java.time.OffsetDateTime
import com.mailslurp.modelspackageVersion&#x3D;15.13.17.PagePhoneNumberProjection
import com.mailslurp.modelspackageVersion&#x3D;15.13.17.PhoneNumberDto
import com.mailslurp.modelspackageVersion&#x3D;15.13.17.PhonePlanDto
import com.mailslurp.modelspackageVersion&#x3D;15.13.17.TestPhoneNumberOptions
import java.util.UUID
import com.mailslurp.client.core.JsonSupport._
import sttp.client._
import sttp.model.Method

object PhoneControllerApi {

def apply(baseUrl: String = "https://api.mailslurp.com") = new PhoneControllerApi(baseUrl)
}

class PhoneControllerApi(baseUrl: String) {

  /**
   * Expected answers:
   *   code 200 : EmergencyAddress (OK)
   * 
   * Available security schemes:
   *   API_KEY (apiKey)
   * 
   * @param createEmergencyAddressOptions 
   */
  def createEmergencyAddress(apiKey: String)(createEmergencyAddressOptions: CreateEmergencyAddressOptions
): Request[Either[ResponseError[Exception], EmergencyAddress], Nothing] =
    basicRequest
      .method(Method.POST, uri"$baseUrl/phone/emergency-addresses")
      .contentType("application/json")
      .header("x-api-key", apiKey)
      .body(createEmergencyAddressOptions)
      .response(asJson[EmergencyAddress])

  /**
   * Expected answers:
   *   code 200 : EmptyResponseDto (OK)
   * 
   * Available security schemes:
   *   API_KEY (apiKey)
   * 
   * @param addressId 
   */
  def deleteEmergencyAddress(apiKey: String)(addressId: UUID
): Request[Either[ResponseError[Exception], EmptyResponseDto], Nothing] =
    basicRequest
      .method(Method.DELETE, uri"$baseUrl/phone/emergency-addresses/${addressId}")
      .contentType("application/json")
      .header("x-api-key", apiKey)
      .response(asJson[EmptyResponseDto])

  /**
   * Expected answers:
   *   code 204 :  (No Content)
   * 
   * Available security schemes:
   *   API_KEY (apiKey)
   * 
   * @param phoneNumberId 
   */
  def deletePhoneNumber(apiKey: String)(phoneNumberId: UUID
): Request[Either[ResponseError[Exception], Unit], Nothing] =
    basicRequest
      .method(Method.DELETE, uri"$baseUrl/phone/numbers/${phoneNumberId}")
      .contentType("application/json")
      .header("x-api-key", apiKey)
      .response(asJson[Unit])

  /**
   * Expected answers:
   *   code 200 : EmergencyAddress (OK)
   * 
   * Available security schemes:
   *   API_KEY (apiKey)
   * 
   * @param addressId 
   */
  def getEmergencyAddress(apiKey: String)(addressId: UUID
): Request[Either[ResponseError[Exception], EmergencyAddress], Nothing] =
    basicRequest
      .method(Method.GET, uri"$baseUrl/phone/emergency-addresses/${addressId}")
      .contentType("application/json")
      .header("x-api-key", apiKey)
      .response(asJson[EmergencyAddress])

  /**
   * Expected answers:
   *   code 200 : Seq[EmergencyAddressDto] (OK)
   * 
   * Available security schemes:
   *   API_KEY (apiKey)
   */
  def getEmergencyAddresses(apiKey: String)(
): Request[Either[ResponseError[Exception], Seq[EmergencyAddressDto]], Nothing] =
    basicRequest
      .method(Method.GET, uri"$baseUrl/phone/emergency-addresses")
      .contentType("application/json")
      .header("x-api-key", apiKey)
      .response(asJson[Seq[EmergencyAddressDto]])

  /**
   * Expected answers:
   *   code 200 : PhoneNumberDto (OK)
   * 
   * Available security schemes:
   *   API_KEY (apiKey)
   * 
   * @param phoneNumberId 
   */
  def getPhoneNumber(apiKey: String)(phoneNumberId: UUID
): Request[Either[ResponseError[Exception], PhoneNumberDto], Nothing] =
    basicRequest
      .method(Method.GET, uri"$baseUrl/phone/numbers/${phoneNumberId}")
      .contentType("application/json")
      .header("x-api-key", apiKey)
      .response(asJson[PhoneNumberDto])

  /**
   * Expected answers:
   *   code 200 : PagePhoneNumberProjection (OK)
   * 
   * Available security schemes:
   *   API_KEY (apiKey)
   * 
   * @param phoneCountry Optional phone country
   * @param page Optional page index for list pagination
   * @param size Optional page size for list pagination
   * @param sort Optional createdAt sort direction ASC or DESC
   * @param since Filter by created at after the given timestamp
   * @param before Filter by created at before the given timestamp
   */
  def getPhoneNumbers(apiKey: String)(phoneCountry: Option[String] = None, page: Option[Int] = None, size: Option[Int] = None, sort: Option[String] = None, since: Option[OffsetDateTime] = None, before: Option[OffsetDateTime] = None
): Request[Either[ResponseError[Exception], PagePhoneNumberProjection], Nothing] =
    basicRequest
      .method(Method.GET, uri"$baseUrl/phone/numbers?phoneCountry=${ phoneCountry }&page=${ page }&size=${ size }&sort=${ sort }&since=${ since }&before=${ before }")
      .contentType("application/json")
      .header("x-api-key", apiKey)
      .response(asJson[PagePhoneNumberProjection])

  /**
   * Expected answers:
   *   code 200 : Seq[PhonePlanDto] (OK)
   * 
   * Available security schemes:
   *   API_KEY (apiKey)
   */
  def getPhonePlans(apiKey: String)(
): Request[Either[ResponseError[Exception], Seq[PhonePlanDto]], Nothing] =
    basicRequest
      .method(Method.GET, uri"$baseUrl/phone/plans")
      .contentType("application/json")
      .header("x-api-key", apiKey)
      .response(asJson[Seq[PhonePlanDto]])

  /**
   * Expected answers:
   *   code 200 :  (OK)
   * 
   * Available security schemes:
   *   API_KEY (apiKey)
   * 
   * @param phoneNumberId 
   * @param testPhoneNumberOptions 
   * @param xTestId 
   */
  def testPhoneNumberSendSms(apiKey: String)(phoneNumberId: UUID, testPhoneNumberOptions: TestPhoneNumberOptions, xTestId: Option[String] = None
): Request[Either[ResponseError[Exception], Unit], Nothing] =
    basicRequest
      .method(Method.POST, uri"$baseUrl/phone/numbers/${phoneNumberId}/test")
      .contentType("application/json")
      .header("x-test-id", xTestId)
      .header("x-api-key", apiKey)
      .body(testPhoneNumberOptions)
      .response(asJson[Unit])

}
