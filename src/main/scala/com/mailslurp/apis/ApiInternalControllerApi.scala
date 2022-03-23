/**
 * MailSlurp API
 * MailSlurp is an API for sending and receiving emails from dynamically allocated email addresses. It's designed for developers and QA teams to test applications, process inbound emails, send templated notifications, attachments, and more.  ## Resources  - [Homepage](https://www.mailslurp.com) - Get an [API KEY](https://app.mailslurp.com/sign-up/) - Generated [SDK Clients](https://www.mailslurp.com/docs/) - [Examples](https://github.com/mailslurp/examples) repository
 *
 * The version of the OpenAPI document: 6.5.2
 * Contact: contact@mailslurp.dev
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package com.mailslurp.apis

import com.mailslurp.modelspackageVersion&#x3D;15.7.8.GetOrCreateSamlUserOptions
import com.mailslurp.modelspackageVersion&#x3D;15.7.8.UserDto
import com.mailslurp.client.core.JsonSupport._
import sttp.client._
import sttp.model.Method

object ApiInternalControllerApi {

def apply(baseUrl: String = "https://api.mailslurp.com") = new ApiInternalControllerApi(baseUrl)
}

class ApiInternalControllerApi(baseUrl: String) {

  /**
   * Expected answers:
   *   code 200 : UserDto (OK)
   * 
   * Available security schemes:
   *   API_KEY (apiKey)
   * 
   * @param key 
   * @param getOrCreateSamlUserOptions 
   */
  def getSamlUserOrCreate(apiKey: String)(key: String, getOrCreateSamlUserOptions: GetOrCreateSamlUserOptions
): Request[Either[ResponseError[Exception], UserDto], Nothing] =
    basicRequest
      .method(Method.POST, uri"$baseUrl/internal/saml/user?key=${ key }")
      .contentType("application/json")
      .header("x-api-key", apiKey)
      .body(getOrCreateSamlUserOptions)
      .response(asJson[UserDto])

}
