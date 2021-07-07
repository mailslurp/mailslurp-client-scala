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

import com.mailslurp.modelspackageVersion&#x3D;12.7.0.CreateTemplateOptions
import com.mailslurp.modelspackageVersion&#x3D;12.7.0.PageTemplateProjection
import com.mailslurp.modelspackageVersion&#x3D;12.7.0.TemplateDto
import com.mailslurp.modelspackageVersion&#x3D;12.7.0.TemplateProjection
import java.util.UUID
import com.mailslurp.client.core.JsonSupport._
import sttp.client._
import sttp.model.Method

object TemplateControllerApi {

def apply(baseUrl: String = "https://api.mailslurp.com") = new TemplateControllerApi(baseUrl)
}

class TemplateControllerApi(baseUrl: String) {

  /**
   * Expected answers:
   *   code 201 : TemplateDto (Created)
   *   code 401 :  (Unauthorized)
   *   code 403 :  (Forbidden)
   *   code 404 :  (Not Found)
   * 
   * Available security schemes:
   *   API_KEY (apiKey)
   * 
   * @param createTemplateOptions createTemplateOptions
   */
  def createTemplate(apiKey: String)(createTemplateOptions: CreateTemplateOptions
): Request[Either[ResponseError[Exception], TemplateDto], Nothing] =
    basicRequest
      .method(Method.POST, uri"$baseUrl/templates")
      .contentType("application/json")
      .header("x-api-key", apiKey)
      .body(createTemplateOptions)
      .response(asJson[TemplateDto])

  /**
   * Expected answers:
   *   code 204 :  (No Content)
   *   code 401 :  (Unauthorized)
   *   code 403 :  (Forbidden)
   * 
   * Available security schemes:
   *   API_KEY (apiKey)
   * 
   * @param templateId TemplateId
   */
  def deleteTemplate(apiKey: String)(templateId: UUID
): Request[Either[ResponseError[Exception], Unit], Nothing] =
    basicRequest
      .method(Method.DELETE, uri"$baseUrl/templates/${TemplateId}")
      .contentType("application/json")
      .header("x-api-key", apiKey)
      .response(asJson[Unit])

  /**
   * Expected answers:
   *   code 200 : PageTemplateProjection (OK)
   *   code 401 :  (Unauthorized)
   *   code 403 :  (Forbidden)
   *   code 404 :  (Not Found)
   * 
   * Available security schemes:
   *   API_KEY (apiKey)
   * 
   * @param page Optional page index in list pagination
   * @param size Optional page size in list pagination
   * @param sort Optional createdAt sort direction ASC or DESC
   */
  def getAllTemplates(apiKey: String)(page: Option[Int] = None, size: Option[Int] = None, sort: Option[String] = None
): Request[Either[ResponseError[Exception], PageTemplateProjection], Nothing] =
    basicRequest
      .method(Method.GET, uri"$baseUrl/templates/paginated?page=${ page }&size=${ size }&sort=${ sort }")
      .contentType("application/json")
      .header("x-api-key", apiKey)
      .response(asJson[PageTemplateProjection])

  /**
   * Expected answers:
   *   code 200 : TemplateDto (OK)
   *   code 401 :  (Unauthorized)
   *   code 403 :  (Forbidden)
   *   code 404 :  (Not Found)
   * 
   * Available security schemes:
   *   API_KEY (apiKey)
   * 
   * @param templateId TemplateId
   */
  def getTemplate(apiKey: String)(templateId: UUID
): Request[Either[ResponseError[Exception], TemplateDto], Nothing] =
    basicRequest
      .method(Method.GET, uri"$baseUrl/templates/${TemplateId}")
      .contentType("application/json")
      .header("x-api-key", apiKey)
      .response(asJson[TemplateDto])

  /**
   * Expected answers:
   *   code 200 : Seq[TemplateProjection] (OK)
   *   code 401 :  (Unauthorized)
   *   code 403 :  (Forbidden)
   *   code 404 :  (Not Found)
   * 
   * Available security schemes:
   *   API_KEY (apiKey)
   */
  def getTemplates(apiKey: String)(
): Request[Either[ResponseError[Exception], Seq[TemplateProjection]], Nothing] =
    basicRequest
      .method(Method.GET, uri"$baseUrl/templates")
      .contentType("application/json")
      .header("x-api-key", apiKey)
      .response(asJson[Seq[TemplateProjection]])

}
