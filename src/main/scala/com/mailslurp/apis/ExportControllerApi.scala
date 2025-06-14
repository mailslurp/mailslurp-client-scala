/**
 * MailSlurp API
 * MailSlurp is an API for sending and receiving emails and SMS from dynamically allocated email addresses and phone numbers. It's designed for developers and QA teams to test applications, process inbound emails, send templated notifications, attachments, and more.  ## Resources  - [Homepage](https://www.mailslurp.com) - Get an [API KEY](https://app.mailslurp.com/sign-up/) - Generated [SDK Clients](https://docs.mailslurp.com/) - [Examples](https://github.com/mailslurp/examples) repository
 *
 * The version of the OpenAPI document: 6.5.2
 * Contact: contact@mailslurp.dev
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package com.mailslurp.apis

import com.mailslurp.modelspackageVersion&#x3D;16.2.1.ByteArray
import com.mailslurp.modelspackageVersion&#x3D;16.2.1.ExportLink
import com.mailslurp.modelspackageVersion&#x3D;16.2.1.ExportOptions
import java.time.OffsetDateTime
import com.mailslurp.client.core.JsonSupport._
import sttp.client._
import sttp.model.Method

object ExportControllerApi {

def apply(baseUrl: String = "https://api.mailslurp.com") = new ExportControllerApi(baseUrl)
}

class ExportControllerApi(baseUrl: String) {

  /**
   * Expected answers:
   *   code 200 : ByteArray (OK)
   * 
   * Available security schemes:
   *   API_KEY (apiKey)
   * 
   * @param exportType 
   * @param apiKey 
   * @param outputFormat 
   * @param filter 
   * @param listSeparatorToken 
   * @param excludePreviouslyExported 
   * @param createdEarliestTime 
   * @param createdOldestTime 
   */
  def exportEntities(apiKey: String)(exportType: String, apiKey: String, outputFormat: String, filter: Option[String] = None, listSeparatorToken: Option[String] = None, excludePreviouslyExported: Option[Boolean] = None, createdEarliestTime: Option[OffsetDateTime] = None, createdOldestTime: Option[OffsetDateTime] = None
): Request[Either[ResponseError[Exception], ByteArray], Nothing] =
    basicRequest
      .method(Method.GET, uri"$baseUrl/export?exportType=${ exportType }&apiKey=${ apiKey }&outputFormat=${ outputFormat }&filter=${ filter }&listSeparatorToken=${ listSeparatorToken }&excludePreviouslyExported=${ excludePreviouslyExported }&createdEarliestTime=${ createdEarliestTime }&createdOldestTime=${ createdOldestTime }")
      .contentType("application/json")
      .header("x-api-key", apiKey)
      .response(asJson[ByteArray])

  /**
   * Expected answers:
   *   code 200 : ExportLink (OK)
   * 
   * Available security schemes:
   *   API_KEY (apiKey)
   * 
   * @param exportType 
   * @param exportOptions 
   * @param apiKey 
   */
  def getExportLink(apiKey: String)(exportType: String, exportOptions: ExportOptions, apiKey: Option[String] = None
): Request[Either[ResponseError[Exception], ExportLink], Nothing] =
    basicRequest
      .method(Method.POST, uri"$baseUrl/export?exportType=${ exportType }&apiKey=${ apiKey }")
      .contentType("application/json")
      .header("x-api-key", apiKey)
      .body(exportOptions)
      .response(asJson[ExportLink])

}
