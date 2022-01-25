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

import com.mailslurp.modelspackageVersion&#x3D;15.5.3.AttachmentEntity
import com.mailslurp.modelspackageVersion&#x3D;15.5.3.AttachmentMetaData
import com.mailslurp.modelspackageVersion&#x3D;15.5.3.ByteArray
import com.mailslurp.modelspackageVersion&#x3D;15.5.3.DownloadAttachmentDto
import com.mailslurp.modelspackageVersion&#x3D;15.5.3.InlineObject
import java.time.OffsetDateTime
import com.mailslurp.modelspackageVersion&#x3D;15.5.3.PageAttachmentEntity
import com.mailslurp.modelspackageVersion&#x3D;15.5.3.UploadAttachmentOptions
import com.mailslurp.client.core.JsonSupport._
import sttp.client._
import sttp.model.Method

object AttachmentControllerApi {

def apply(baseUrl: String = "https://api.mailslurp.com") = new AttachmentControllerApi(baseUrl)
}

class AttachmentControllerApi(baseUrl: String) {

  /**
   * Expected answers:
   *   code 204 :  (No Content)
   * 
   * Available security schemes:
   *   API_KEY (apiKey)
   */
  def deleteAllAttachments(apiKey: String)(
): Request[Either[ResponseError[Exception], Unit], Nothing] =
    basicRequest
      .method(Method.DELETE, uri"$baseUrl/attachments")
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
   * @param attachmentId ID of attachment
   */
  def deleteAttachment(apiKey: String)(attachmentId: String
): Request[Either[ResponseError[Exception], Unit], Nothing] =
    basicRequest
      .method(Method.DELETE, uri"$baseUrl/attachments/${attachmentId}")
      .contentType("application/json")
      .header("x-api-key", apiKey)
      .response(asJson[Unit])

  /**
   * Returns the specified attachment for a given email as a base 64 encoded string. The response type is application/json. This method is similar to the `downloadAttachment` method but allows some clients to get around issues with binary responses.
   * 
   * Expected answers:
   *   code 200 : DownloadAttachmentDto (OK)
   * 
   * Available security schemes:
   *   API_KEY (apiKey)
   * 
   * @param attachmentId ID of attachment
   */
  def downloadAttachmentAsBase64Encoded(apiKey: String)(attachmentId: String
): Request[Either[ResponseError[Exception], DownloadAttachmentDto], Nothing] =
    basicRequest
      .method(Method.GET, uri"$baseUrl/attachments/${attachmentId}/base64")
      .contentType("application/json")
      .header("x-api-key", apiKey)
      .response(asJson[DownloadAttachmentDto])

  /**
   * Returns the specified attachment for a given email as a stream / array of bytes. You can find attachment ids in email responses endpoint responses. The response type is application/octet-stream.
   * 
   * Expected answers:
   *   code 0 : ByteArray (default response)
   * 
   * Available security schemes:
   *   API_KEY (apiKey)
   * 
   * @param attachmentId ID of attachment
   */
  def downloadAttachmentAsBytes(apiKey: String)(attachmentId: String
): Request[Either[ResponseError[Exception], ByteArray], Nothing] =
    basicRequest
      .method(Method.GET, uri"$baseUrl/attachments/${attachmentId}/bytes")
      .contentType("application/json")
      .header("x-api-key", apiKey)
      .response(asJson[ByteArray])

  /**
   * Expected answers:
   *   code 200 : AttachmentEntity (OK)
   * 
   * Available security schemes:
   *   API_KEY (apiKey)
   * 
   * @param attachmentId ID of attachment
   */
  def getAttachment(apiKey: String)(attachmentId: String
): Request[Either[ResponseError[Exception], AttachmentEntity], Nothing] =
    basicRequest
      .method(Method.GET, uri"$baseUrl/attachments/${attachmentId}")
      .contentType("application/json")
      .header("x-api-key", apiKey)
      .response(asJson[AttachmentEntity])

  /**
   * Returns the metadata for an attachment. It is saved separately to the content of the attachment. Contains properties `name` and `content-type` and `content-length` in bytes for a given attachment.
   * 
   * Expected answers:
   *   code 200 : AttachmentMetaData (OK)
   * 
   * Available security schemes:
   *   API_KEY (apiKey)
   * 
   * @param attachmentId ID of attachment
   */
  def getAttachmentInfo(apiKey: String)(attachmentId: String
): Request[Either[ResponseError[Exception], AttachmentMetaData], Nothing] =
    basicRequest
      .method(Method.GET, uri"$baseUrl/attachments/${attachmentId}/metadata")
      .contentType("application/json")
      .header("x-api-key", apiKey)
      .response(asJson[AttachmentMetaData])

  /**
   * Get all attachments in paginated response. Each entity contains meta data for the attachment such as `name` and `content-type`. Use the `attachmentId` and the download endpoints to get the file contents.
   * 
   * Expected answers:
   *   code 200 : PageAttachmentEntity (OK)
   * 
   * Available security schemes:
   *   API_KEY (apiKey)
   * 
   * @param page Optional page index event list pagination
   * @param size Optional page size event list pagination
   * @param sort Optional createdAt sort direction ASC or DESC
   * @param fileNameFilter Optional file name and content type search filter
   * @param since Filter by created at after the given timestamp
   * @param before Filter by created at before the given timestamp
   */
  def getAttachments(apiKey: String)(page: Option[Int] = None, size: Option[Int] = None, sort: Option[String] = None, fileNameFilter: Option[String] = None, since: Option[OffsetDateTime] = None, before: Option[OffsetDateTime] = None
): Request[Either[ResponseError[Exception], PageAttachmentEntity], Nothing] =
    basicRequest
      .method(Method.GET, uri"$baseUrl/attachments?page=${ page }&size=${ size }&sort=${ sort }&fileNameFilter=${ fileNameFilter }&since=${ since }&before=${ before }")
      .contentType("application/json")
      .header("x-api-key", apiKey)
      .response(asJson[PageAttachmentEntity])

  /**
   * Expected answers:
   *   code 201 : Seq[String] (Created)
   * 
   * Available security schemes:
   *   API_KEY (apiKey)
   * 
   * @param uploadAttachmentOptions 
   */
  def uploadAttachment(apiKey: String)(uploadAttachmentOptions: UploadAttachmentOptions
): Request[Either[ResponseError[Exception], Seq[String]], Nothing] =
    basicRequest
      .method(Method.POST, uri"$baseUrl/attachments")
      .contentType("application/json")
      .header("x-api-key", apiKey)
      .body(uploadAttachmentOptions)
      .response(asJson[Seq[String]])

  /**
   * Expected answers:
   *   code 201 : Seq[String] (Created)
   * 
   * Available security schemes:
   *   API_KEY (apiKey)
   * 
   * @param byteArray 
   * @param contentType Optional contentType for file. For instance `application/pdf`
   * @param filename Optional filename to save upload with
   */
  def uploadAttachmentBytes(apiKey: String)(byteArray: Seq[ByteArray], contentType: Option[String] = None, filename: Option[String] = None
): Request[Either[ResponseError[Exception], Seq[String]], Nothing] =
    basicRequest
      .method(Method.POST, uri"$baseUrl/attachments/bytes?contentType=${ contentType }&filename=${ filename }")
      .contentType("application/octet-stream")
      .header("x-api-key", apiKey)
      .body(byteArray)
      .response(asJson[Seq[String]])

  /**
   * Expected answers:
   *   code 201 : Seq[String] (Created)
   * 
   * Available security schemes:
   *   API_KEY (apiKey)
   * 
   * @param contentType Optional content type of attachment
   * @param filename Optional name of file
   * @param xFilename Optional content type header of attachment
   * @param inlineObject 
   */
  def uploadMultipartForm(apiKey: String)(contentType: Option[String] = None, filename: Option[String] = None, xFilename: Option[String] = None, inlineObject: Option[InlineObject] = None
): Request[Either[ResponseError[Exception], Seq[String]], Nothing] =
    basicRequest
      .method(Method.POST, uri"$baseUrl/attachments/multipart?contentType=${ contentType }&filename=${ filename }&x-filename=${ xFilename }")
      .contentType("application/json")
      .header("x-api-key", apiKey)
      .body(inlineObject)
      .response(asJson[Seq[String]])

}
