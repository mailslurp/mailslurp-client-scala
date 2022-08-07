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

import com.mailslurp.modelspackageVersion&#x3D;15.13.8.UserInfoDto
import com.mailslurp.client.core.JsonSupport._
import sttp.client._
import sttp.model.Method

object ApiUserControllerApi {

def apply(baseUrl: String = "https://api.mailslurp.com") = new ApiUserControllerApi(baseUrl)
}

class ApiUserControllerApi(baseUrl: String) {

  /**
   * Expected answers:
   *   code 200 : String (OK)
   * 
   * Available security schemes:
   *   API_KEY (apiKey)
   */
  def getSmtpPassword(apiKey: String)(
): Request[Either[ResponseError[Exception], String], Nothing] =
    basicRequest
      .method(Method.GET, uri"$baseUrl/user/smtp/password")
      .contentType("application/json")
      .header("x-api-key", apiKey)
      .response(asJson[String])

  /**
   * Expected answers:
   *   code 200 : String (OK)
   * 
   * Available security schemes:
   *   API_KEY (apiKey)
   */
  def getSmtpUsername(apiKey: String)(
): Request[Either[ResponseError[Exception], String], Nothing] =
    basicRequest
      .method(Method.GET, uri"$baseUrl/user/smtp/username")
      .contentType("application/json")
      .header("x-api-key", apiKey)
      .response(asJson[String])

  /**
   * Expected answers:
   *   code 200 : UserInfoDto (OK)
   * 
   * Available security schemes:
   *   API_KEY (apiKey)
   */
  def getUserInfo(apiKey: String)(
): Request[Either[ResponseError[Exception], UserInfoDto], Nothing] =
    basicRequest
      .method(Method.GET, uri"$baseUrl/user/info")
      .contentType("application/json")
      .header("x-api-key", apiKey)
      .response(asJson[UserInfoDto])

}
