/**
 * MailSlurp API
 * MailSlurp is an API for sending and receiving emails from dynamically allocated email addresses. It's designed for developers and QA teams to test applications, process inbound emails, send templated notifications, attachments, and more.  ## Resources  - [Homepage](https://www.mailslurp.com) - Get an [API KEY](https://app.mailslurp.com/sign-up/) - Generated [SDK Clients](https://www.mailslurp.com/docs/) - [Examples](https://github.com/mailslurp/examples) repository 
 *
 * The version of the OpenAPI document: 6.5.2
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package com.mailslurp.apis

import com.mailslurp.modelspackageVersion&#x3D;12.4.6.ByteArray
import com.mailslurp.modelspackageVersion&#x3D;12.4.6.ExportLink
import com.mailslurp.modelspackageVersion&#x3D;12.4.6.ExportOptions
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
   *   code 401 :  (Unauthorized)
   *   code 403 :  (Forbidden)
   *   code 404 :  (Not Found)
   * 
   * Available security schemes:
   *   API_KEY (apiKey)
   * 
   * @param apiKey apiKey
   * @param exportType exportType
   * @param outputFormat outputFormat
   * @param createdEarliestTime createdEarliestTime
   * @param createdOldestTime createdOldestTime
   * @param excludePreviouslyExported excludePreviouslyExported
   * @param filter filter
   * @param listSeparatorToken listSeparatorToken
   */
  def exportEntities(apiKey: String)(apiKey: String, exportType: String, outputFormat: String, createdEarliestTime: Option[OffsetDateTime] = None, createdOldestTime: Option[OffsetDateTime] = None, excludePreviouslyExported: Option[Boolean] = None, filter: Option[String] = None, listSeparatorToken: Option[String] = None
): Request[Either[ResponseError[Exception], ByteArray], Nothing] =
    basicRequest
      .method(Method.GET, uri"$baseUrl/export?apiKey=${ apiKey }&createdEarliestTime=${ createdEarliestTime }&createdOldestTime=${ createdOldestTime }&excludePreviouslyExported=${ excludePreviouslyExported }&exportType=${ exportType }&filter=${ filter }&listSeparatorToken=${ listSeparatorToken }&outputFormat=${ outputFormat }")
      .contentType("application/json")
      .header("x-api-key", apiKey)
      .response(asJson[ByteArray])

  /**
   * Expected answers:
   *   code 200 : ExportLink (OK)
   *   code 201 :  (Created)
   *   code 401 :  (Unauthorized)
   *   code 403 :  (Forbidden)
   *   code 404 :  (Not Found)
   * 
   * Available security schemes:
   *   API_KEY (apiKey)
   * 
   * @param exportType exportType
   * @param exportOptions exportOptions
   * @param apiKey apiKey
   */
  def getExportLink(apiKey: String)(exportType: String, exportOptions: ExportOptions, apiKey: Option[String] = None
): Request[Either[ResponseError[Exception], ExportLink], Nothing] =
    basicRequest
      .method(Method.POST, uri"$baseUrl/export?apiKey=${ apiKey }&exportType=${ exportType }")
      .contentType("application/json")
      .header("x-api-key", apiKey)
      .body(exportOptions)
      .response(asJson[ExportLink])

}
