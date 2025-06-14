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

import com.mailslurp.modelspackageVersion&#x3D;16.2.1.AITranformCreateOptions
import com.mailslurp.modelspackageVersion&#x3D;16.2.1.AITransformDto
import com.mailslurp.modelspackageVersion&#x3D;16.2.1.AITransformMappingDto
import com.mailslurp.modelspackageVersion&#x3D;16.2.1.AITransformResultDto
import com.mailslurp.modelspackageVersion&#x3D;16.2.1.CreateAITransformerMappingOptions
import com.mailslurp.modelspackageVersion&#x3D;16.2.1.GenerateStructuredContentAttachmentOptions
import com.mailslurp.modelspackageVersion&#x3D;16.2.1.GenerateStructuredContentEmailOptions
import com.mailslurp.modelspackageVersion&#x3D;16.2.1.GenerateStructuredContentSmsOptions
import com.mailslurp.modelspackageVersion&#x3D;16.2.1.PageAITransformMappingProjection
import com.mailslurp.modelspackageVersion&#x3D;16.2.1.PageAITransformProjection
import com.mailslurp.modelspackageVersion&#x3D;16.2.1.PageAITransformResultProjection
import com.mailslurp.modelspackageVersion&#x3D;16.2.1.StructuredContentResultDto
import com.mailslurp.modelspackageVersion&#x3D;16.2.1.StructuredOutputSchema
import com.mailslurp.modelspackageVersion&#x3D;16.2.1.StructuredOutputSchemaValidation
import java.util.UUID
import com.mailslurp.client.core.JsonSupport._
import sttp.client._
import sttp.model.Method

object AIControllerApi {

def apply(baseUrl: String = "https://api.mailslurp.com") = new AIControllerApi(baseUrl)
}

class AIControllerApi(baseUrl: String) {

  /**
   * List all AI transforms
   * 
   * Expected answers:
   *   code 200 : PageAITransformProjection (OK)
   * 
   * Available security schemes:
   *   API_KEY (apiKey)
   * 
   * @param options 
   * @param page 
   * @param size Optional page size in SMS list pagination. Maximum size is 100. Use page index and sort to page through larger results
   * @param sort Optional createdAt sort direction ASC or DESC
   */
  def createTransformer(apiKey: String)(options: AITranformCreateOptions, page: Option[Int] = None, size: Option[Int] = None, sort: Option[String] = None
): Request[Either[ResponseError[Exception], PageAITransformProjection], Nothing] =
    basicRequest
      .method(Method.GET, uri"$baseUrl/ai/transformer?page=${ page }&size=${ size }&sort=${ sort }&options=${ options }")
      .contentType("application/json")
      .header("x-api-key", apiKey)
      .response(asJson[PageAITransformProjection])

  /**
   * Save an AI transform instructions and schema for use with webhooks and automations
   * 
   * Expected answers:
   *   code 200 : AITransformDto (OK)
   * 
   * Available security schemes:
   *   API_KEY (apiKey)
   * 
   * @param aITranformCreateOptions 
   */
  def createTransformer1(apiKey: String)(aITranformCreateOptions: AITranformCreateOptions
): Request[Either[ResponseError[Exception], AITransformDto], Nothing] =
    basicRequest
      .method(Method.POST, uri"$baseUrl/ai/transformer")
      .contentType("application/json")
      .header("x-api-key", apiKey)
      .body(aITranformCreateOptions)
      .response(asJson[AITransformDto])

  /**
   * Create AI transformer mappings to other entities
   * 
   * Expected answers:
   *   code 200 : AITransformMappingDto (OK)
   * 
   * Available security schemes:
   *   API_KEY (apiKey)
   * 
   * @param createAITransformerMappingOptions 
   */
  def createTransformerMappings(apiKey: String)(createAITransformerMappingOptions: CreateAITransformerMappingOptions
): Request[Either[ResponseError[Exception], AITransformMappingDto], Nothing] =
    basicRequest
      .method(Method.POST, uri"$baseUrl/ai/transformer/mappings")
      .contentType("application/json")
      .header("x-api-key", apiKey)
      .body(createAITransformerMappingOptions)
      .response(asJson[AITransformMappingDto])

  /**
   * Delete an AI transformer and schemas by ID
   * 
   * Expected answers:
   *   code 204 :  (No Content)
   * 
   * Available security schemes:
   *   API_KEY (apiKey)
   * 
   * @param id 
   */
  def deleteTransformer(apiKey: String)(id: UUID
): Request[Either[ResponseError[Exception], Unit], Nothing] =
    basicRequest
      .method(Method.DELETE, uri"$baseUrl/ai/transformer/${id}")
      .contentType("application/json")
      .header("x-api-key", apiKey)
      .response(asJson[Unit])

  /**
   * Delete an AI transformer mapping
   * 
   * Expected answers:
   *   code 204 :  (No Content)
   * 
   * Available security schemes:
   *   API_KEY (apiKey)
   * 
   * @param id ID of transform mapping
   */
  def deleteTransformerMapping(apiKey: String)(id: UUID
): Request[Either[ResponseError[Exception], Unit], Nothing] =
    basicRequest
      .method(Method.DELETE, uri"$baseUrl/ai/transformer/mappings/${id}")
      .contentType("application/json")
      .header("x-api-key", apiKey)
      .response(asJson[Unit])

  /**
   * Delete all AI transformers and schemas
   * 
   * Expected answers:
   *   code 204 :  (No Content)
   * 
   * Available security schemes:
   *   API_KEY (apiKey)
   */
  def deleteTransformers(apiKey: String)(
): Request[Either[ResponseError[Exception], Unit], Nothing] =
    basicRequest
      .method(Method.DELETE, uri"$baseUrl/ai/transformer")
      .contentType("application/json")
      .header("x-api-key", apiKey)
      .response(asJson[Unit])

  /**
   * Use output schemas to extract data from an attachment using AI
   * 
   * Expected answers:
   *   code 200 : StructuredContentResultDto (OK)
   * 
   * Available security schemes:
   *   API_KEY (apiKey)
   * 
   * @param generateStructuredContentAttachmentOptions 
   */
  def generateStructuredContentFromAttachment(apiKey: String)(generateStructuredContentAttachmentOptions: GenerateStructuredContentAttachmentOptions
): Request[Either[ResponseError[Exception], StructuredContentResultDto], Nothing] =
    basicRequest
      .method(Method.POST, uri"$baseUrl/ai/structured-content/attachment")
      .contentType("application/json")
      .header("x-api-key", apiKey)
      .body(generateStructuredContentAttachmentOptions)
      .response(asJson[StructuredContentResultDto])

  /**
   * Use output schemas to extract data from an email using AI
   * 
   * Expected answers:
   *   code 200 : StructuredContentResultDto (OK)
   * 
   * Available security schemes:
   *   API_KEY (apiKey)
   * 
   * @param generateStructuredContentEmailOptions 
   */
  def generateStructuredContentFromEmail(apiKey: String)(generateStructuredContentEmailOptions: GenerateStructuredContentEmailOptions
): Request[Either[ResponseError[Exception], StructuredContentResultDto], Nothing] =
    basicRequest
      .method(Method.POST, uri"$baseUrl/ai/structured-content/email")
      .contentType("application/json")
      .header("x-api-key", apiKey)
      .body(generateStructuredContentEmailOptions)
      .response(asJson[StructuredContentResultDto])

  /**
   * Use output schemas to extract data from an SMS using AI
   * 
   * Expected answers:
   *   code 200 : StructuredContentResultDto (OK)
   * 
   * Available security schemes:
   *   API_KEY (apiKey)
   * 
   * @param generateStructuredContentSmsOptions 
   */
  def generateStructuredContentFromSms(apiKey: String)(generateStructuredContentSmsOptions: GenerateStructuredContentSmsOptions
): Request[Either[ResponseError[Exception], StructuredContentResultDto], Nothing] =
    basicRequest
      .method(Method.POST, uri"$baseUrl/ai/structured-content/sms")
      .contentType("application/json")
      .header("x-api-key", apiKey)
      .body(generateStructuredContentSmsOptions)
      .response(asJson[StructuredContentResultDto])

  /**
   * Get AI transformer and schemas by ID
   * 
   * Expected answers:
   *   code 200 : AITransformDto (OK)
   * 
   * Available security schemes:
   *   API_KEY (apiKey)
   * 
   * @param id 
   */
  def getTransformer(apiKey: String)(id: UUID
): Request[Either[ResponseError[Exception], AITransformDto], Nothing] =
    basicRequest
      .method(Method.GET, uri"$baseUrl/ai/transformer/${id}")
      .contentType("application/json")
      .header("x-api-key", apiKey)
      .response(asJson[AITransformDto])

  /**
   * Get an AI transformer mapping
   * 
   * Expected answers:
   *   code 200 : AITransformMappingDto (OK)
   * 
   * Available security schemes:
   *   API_KEY (apiKey)
   * 
   * @param id ID of transform mapping
   */
  def getTransformerMapping(apiKey: String)(id: UUID
): Request[Either[ResponseError[Exception], AITransformMappingDto], Nothing] =
    basicRequest
      .method(Method.GET, uri"$baseUrl/ai/transformer/mappings/${id}")
      .contentType("application/json")
      .header("x-api-key", apiKey)
      .response(asJson[AITransformMappingDto])

  /**
   * Get AI transformer mappings to other entities
   * 
   * Expected answers:
   *   code 200 : PageAITransformMappingProjection (OK)
   * 
   * Available security schemes:
   *   API_KEY (apiKey)
   * 
   * @param aiTransformId 
   * @param entityId 
   * @param entityType 
   * @param page 
   * @param size Optional page size. Maximum size is 100. Use page index and sort to page through larger results
   * @param sort Optional createdAt sort direction ASC or DESC
   */
  def getTransformerMappings(apiKey: String)(aiTransformId: Option[UUID] = None, entityId: Option[UUID] = None, entityType: Option[String] = None, page: Option[Int] = None, size: Option[Int] = None, sort: Option[String] = None
): Request[Either[ResponseError[Exception], PageAITransformMappingProjection], Nothing] =
    basicRequest
      .method(Method.GET, uri"$baseUrl/ai/transformer/mappings?aiTransformId=${ aiTransformId }&entityId=${ entityId }&entityType=${ entityType }&page=${ page }&size=${ size }&sort=${ sort }")
      .contentType("application/json")
      .header("x-api-key", apiKey)
      .response(asJson[PageAITransformMappingProjection])

  /**
   * Get AI transformer result
   * 
   * Expected answers:
   *   code 200 : AITransformResultDto (OK)
   * 
   * Available security schemes:
   *   API_KEY (apiKey)
   * 
   * @param id ID of transform result
   */
  def getTransformerResult(apiKey: String)(id: UUID
): Request[Either[ResponseError[Exception], AITransformResultDto], Nothing] =
    basicRequest
      .method(Method.GET, uri"$baseUrl/ai/transformer/results/${id}")
      .contentType("application/json")
      .header("x-api-key", apiKey)
      .response(asJson[AITransformResultDto])

  /**
   * Get AI transformer results
   * 
   * Expected answers:
   *   code 200 : PageAITransformResultProjection (OK)
   * 
   * Available security schemes:
   *   API_KEY (apiKey)
   * 
   * @param aiTransformId 
   * @param aiTransformMappingId 
   * @param entityId 
   * @param entityType 
   * @param page 
   * @param size Optional page size. Maximum size is 100. Use page index and sort to page through larger results
   * @param sort Optional createdAt sort direction ASC or DESC
   */
  def getTransformerResults(apiKey: String)(aiTransformId: Option[UUID] = None, aiTransformMappingId: Option[UUID] = None, entityId: Option[UUID] = None, entityType: Option[String] = None, page: Option[Int] = None, size: Option[Int] = None, sort: Option[String] = None
): Request[Either[ResponseError[Exception], PageAITransformResultProjection], Nothing] =
    basicRequest
      .method(Method.GET, uri"$baseUrl/ai/transformer/results?aiTransformId=${ aiTransformId }&aiTransformMappingId=${ aiTransformMappingId }&entityId=${ entityId }&entityType=${ entityType }&page=${ page }&size=${ size }&sort=${ sort }")
      .contentType("application/json")
      .header("x-api-key", apiKey)
      .response(asJson[PageAITransformResultProjection])

  /**
   * Check if a schema is valid and can be used to extract data using AI
   * 
   * Expected answers:
   *   code 200 : StructuredOutputSchemaValidation (OK)
   * 
   * Available security schemes:
   *   API_KEY (apiKey)
   * 
   * @param structuredOutputSchema 
   */
  def validateStructuredOutputSchema(apiKey: String)(structuredOutputSchema: StructuredOutputSchema
): Request[Either[ResponseError[Exception], StructuredOutputSchemaValidation], Nothing] =
    basicRequest
      .method(Method.POST, uri"$baseUrl/ai/structured-content/validate")
      .contentType("application/json")
      .header("x-api-key", apiKey)
      .body(structuredOutputSchema)
      .response(asJson[StructuredOutputSchemaValidation])

}
