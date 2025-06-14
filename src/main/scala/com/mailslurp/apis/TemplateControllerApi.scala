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

import com.mailslurp.modelspackageVersion&#x3D;16.2.1.CreateTemplateOptions
import java.time.OffsetDateTime
import com.mailslurp.modelspackageVersion&#x3D;16.2.1.PageTemplateProjection
import com.mailslurp.modelspackageVersion&#x3D;16.2.1.TemplateDto
import com.mailslurp.modelspackageVersion&#x3D;16.2.1.TemplatePreview
import com.mailslurp.modelspackageVersion&#x3D;16.2.1.TemplateProjection
import java.util.UUID
import com.mailslurp.client.core.JsonSupport._
import sttp.client._
import sttp.model.Method

object TemplateControllerApi {

def apply(baseUrl: String = "https://api.mailslurp.com") = new TemplateControllerApi(baseUrl)
}

class TemplateControllerApi(baseUrl: String) {

  /**
   * Create an email template with variables for use with templated transactional emails.
   * 
   * Expected answers:
   *   code 201 : TemplateDto (Created)
   * 
   * Available security schemes:
   *   API_KEY (apiKey)
   * 
   * @param createTemplateOptions 
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
   * Delete template
   * 
   * Expected answers:
   *   code 204 :  (No Content)
   * 
   * Available security schemes:
   *   API_KEY (apiKey)
   * 
   * @param templateId Template ID
   */
  def deleteTemplate(apiKey: String)(templateId: UUID
): Request[Either[ResponseError[Exception], Unit], Nothing] =
    basicRequest
      .method(Method.DELETE, uri"$baseUrl/templates/${templateId}")
      .contentType("application/json")
      .header("x-api-key", apiKey)
      .response(asJson[Unit])

  /**
   * Get all templates in paginated format
   * 
   * Expected answers:
   *   code 200 : PageTemplateProjection (OK)
   * 
   * Available security schemes:
   *   API_KEY (apiKey)
   * 
   * @param page Optional page index in list pagination
   * @param size Optional page size in list pagination
   * @param sort Optional createdAt sort direction ASC or DESC
   * @param since Filter by created at after the given timestamp
   * @param before Filter by created at before the given timestamp
   */
  def getAllTemplates(apiKey: String)(page: Option[Int] = None, size: Option[Int] = None, sort: Option[String] = None, since: Option[OffsetDateTime] = None, before: Option[OffsetDateTime] = None
): Request[Either[ResponseError[Exception], PageTemplateProjection], Nothing] =
    basicRequest
      .method(Method.GET, uri"$baseUrl/templates/paginated?page=${ page }&size=${ size }&sort=${ sort }&since=${ since }&before=${ before }")
      .contentType("application/json")
      .header("x-api-key", apiKey)
      .response(asJson[PageTemplateProjection])

  /**
   * Get email template
   * 
   * Expected answers:
   *   code 200 : TemplateDto (OK)
   * 
   * Available security schemes:
   *   API_KEY (apiKey)
   * 
   * @param templateId Template ID
   */
  def getTemplate(apiKey: String)(templateId: UUID
): Request[Either[ResponseError[Exception], TemplateDto], Nothing] =
    basicRequest
      .method(Method.GET, uri"$baseUrl/templates/${templateId}")
      .contentType("application/json")
      .header("x-api-key", apiKey)
      .response(asJson[TemplateDto])

  /**
   * Get email template preview with passed template variables in HTML format for browsers. Pass template variables as query params.
   * 
   * Expected answers:
   *   code 200 : String (OK)
   * 
   * Available security schemes:
   *   API_KEY (apiKey)
   * 
   * @param templateId Template ID
   */
  def getTemplatePreviewHtml(apiKey: String)(templateId: UUID
): Request[Either[ResponseError[Exception], String], Nothing] =
    basicRequest
      .method(Method.GET, uri"$baseUrl/templates/${templateId}/preview/html")
      .contentType("application/json")
      .header("x-api-key", apiKey)
      .response(asJson[String])

  /**
   * Get email template preview with passed template variables in JSON format. Pass template variables as query params.
   * 
   * Expected answers:
   *   code 200 : TemplatePreview (OK)
   * 
   * Available security schemes:
   *   API_KEY (apiKey)
   * 
   * @param templateId Template ID
   */
  def getTemplatePreviewJson(apiKey: String)(templateId: UUID
): Request[Either[ResponseError[Exception], TemplatePreview], Nothing] =
    basicRequest
      .method(Method.GET, uri"$baseUrl/templates/${templateId}/preview/json")
      .contentType("application/json")
      .header("x-api-key", apiKey)
      .response(asJson[TemplatePreview])

  /**
   * Get all templates
   * 
   * Expected answers:
   *   code 200 : Seq[TemplateProjection] (OK)
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

  /**
   * Update email template
   * 
   * Expected answers:
   *   code 201 : TemplateDto (Created)
   * 
   * Available security schemes:
   *   API_KEY (apiKey)
   * 
   * @param templateId Template ID
   * @param createTemplateOptions 
   */
  def updateTemplate(apiKey: String)(templateId: UUID, createTemplateOptions: CreateTemplateOptions
): Request[Either[ResponseError[Exception], TemplateDto], Nothing] =
    basicRequest
      .method(Method.PUT, uri"$baseUrl/templates/${templateId}")
      .contentType("application/json")
      .header("x-api-key", apiKey)
      .body(createTemplateOptions)
      .response(asJson[TemplateDto])

}
