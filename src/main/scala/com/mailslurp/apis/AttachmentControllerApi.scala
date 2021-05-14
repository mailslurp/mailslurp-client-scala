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

import com.mailslurp.modelspackageVersion&#x3D;11.14.0.AttachmentMetaData
import com.mailslurp.modelspackageVersion&#x3D;11.14.0.ByteArray
import com.mailslurp.modelspackageVersion&#x3D;11.14.0.DownloadAttachmentDto
import java.io.File
import com.mailslurp.modelspackageVersion&#x3D;11.14.0.PageAttachmentEntity
import com.mailslurp.modelspackageVersion&#x3D;11.14.0.UploadAttachmentOptions
import com.mailslurp.client.core.JsonSupport._
import sttp.client._
import sttp.model.Method

object AttachmentControllerApi {

def apply(baseUrl: String = "https://api.mailslurp.com") = new AttachmentControllerApi(baseUrl)
}

class AttachmentControllerApi(baseUrl: String) {

  /**
   * Email attachments are essentially files with meta data. Files are byte arrays and the meta data is a content type and a filename. These properties allow email clients to display the filename and icon etc. When sending emails with attachments first upload each attachment with an upload endpoint. Record the returned attachment ID and use it with subsequent email sending. For legacy reasons the ID is returned as the first element in an array. Only a single ID is ever returned. To send the attachments pass a list of attachment IDs with `SendEmailOptions` when sending an email. Using the upload endpoints prior to sending mean attachments can easily be reused.
   * 
   * Expected answers:
   *   code 204 :  (No Content)
   *   code 401 :  (Unauthorized)
   *   code 403 :  (Forbidden)
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
   *   code 401 :  (Unauthorized)
   *   code 403 :  (Forbidden)
   *   code 404 :  (Not Found)
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
   *   code 200 : ByteArray (OK)
   *   code 401 :  (Unauthorized)
   *   code 403 :  (Forbidden)
   *   code 404 :  (Not Found)
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
   * Returns the metadata for an attachment. It is saved separately to the content of the attachment. Contains properties `name` and `content-type` and `content-length` in bytes for a given attachment.
   * 
   * Expected answers:
   *   code 200 : AttachmentMetaData (OK)
   *   code 401 :  (Unauthorized)
   *   code 403 :  (Forbidden)
   *   code 404 :  (Not Found)
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
   *   code 401 :  (Unauthorized)
   *   code 403 :  (Forbidden)
   *   code 404 :  (Not Found)
   * 
   * Available security schemes:
   *   API_KEY (apiKey)
   * 
   * @param page Optional page index event list pagination
   * @param size Optional page size event list pagination
   * @param sort Optional createdAt sort direction ASC or DESC
   */
  def getAttachments(apiKey: String)(page: Option[Int] = None, size: Option[Int] = None, sort: Option[String] = None
): Request[Either[ResponseError[Exception], PageAttachmentEntity], Nothing] =
    basicRequest
      .method(Method.GET, uri"$baseUrl/attachments?page=${ page }&size=${ size }&sort=${ sort }")
      .contentType("application/json")
      .header("x-api-key", apiKey)
      .response(asJson[PageAttachmentEntity])

  /**
   * Email attachments are essentially files with meta data. Files are byte arrays and the meta data is a content type and a filename. These properties allow email clients to display the filename and icon etc. When sending emails with attachments first upload each attachment with an upload endpoint. Record the returned attachment ID and use it with subsequent email sending. For legacy reasons the ID is returned as the first element in an array. Only a single ID is ever returned. To send the attachments pass a list of attachment IDs with `SendEmailOptions` when sending an email. Using the upload endpoints prior to sending mean attachments can easily be reused.
   * 
   * Expected answers:
   *   code 201 : Seq[String] (Created)
   *   code 401 :  (Unauthorized)
   *   code 403 :  (Forbidden)
   *   code 404 :  (Not Found)
   * 
   * Available security schemes:
   *   API_KEY (apiKey)
   * 
   * @param uploadOptions uploadOptions
   */
  def uploadAttachment(apiKey: String)(uploadOptions: UploadAttachmentOptions
): Request[Either[ResponseError[Exception], Seq[String]], Nothing] =
    basicRequest
      .method(Method.POST, uri"$baseUrl/attachments")
      .contentType("application/json")
      .header("x-api-key", apiKey)
      .body(uploadOptions)
      .response(asJson[Seq[String]])

  /**
   * Email attachments are essentially files with meta data. Files are byte arrays and the meta data is a content type and a filename. These properties allow email clients to display the filename and icon etc. When sending emails with attachments first upload each attachment with an upload endpoint. Record the returned attachment ID and use it with subsequent email sending. For legacy reasons the ID is returned as the first element in an array. Only a single ID is ever returned. To send the attachments pass a list of attachment IDs with `SendEmailOptions` when sending an email. Using the upload endpoints prior to sending mean attachments can easily be reused.
   * 
   * Expected answers:
   *   code 201 : Seq[String] (Created)
   *   code 401 :  (Unauthorized)
   *   code 403 :  (Forbidden)
   *   code 404 :  (Not Found)
   * 
   * Available security schemes:
   *   API_KEY (apiKey)
   * 
   * @param string Optional contentType for file. For instance `application/pdf`
   * @param filename Optional filename to save upload with
   * @param byteArray Byte array request body
   */
  def uploadAttachmentBytes(apiKey: String)(string: Option[String] = None, filename: Option[String] = None, byteArray: Option[ByteArray] = None
): Request[Either[ResponseError[Exception], Seq[String]], Nothing] =
    basicRequest
      .method(Method.POST, uri"$baseUrl/attachments/bytes?String=${ string }&filename=${ filename }")
      .contentType("application/octet-stream")
      .header("x-api-key", apiKey)
      .body(byteArray)
      .response(asJson[Seq[String]])

  /**
   * Email attachments are essentially files with meta data. Files are byte arrays and the meta data is a content type and a filename. These properties allow email clients to display the filename and icon etc. When sending emails with attachments first upload each attachment with an upload endpoint. Record the returned attachment ID and use it with subsequent email sending. For legacy reasons the ID is returned as the first element in an array. Only a single ID is ever returned. To send the attachments pass a list of attachment IDs with `SendEmailOptions` when sending an email. Using the upload endpoints prior to sending mean attachments can easily be reused.
   * 
   * Expected answers:
   *   code 201 : Seq[String] (Created)
   *   code 401 :  (Unauthorized)
   *   code 403 :  (Forbidden)
   *   code 404 :  (Not Found)
   * 
   * Available security schemes:
   *   API_KEY (apiKey)
   * 
   * @param file file
   * @param contentType Optional content type of attachment
   * @param filename Optional name of file
   * @param xFilename Optional content type header of attachment
   */
  def uploadMultipartForm(apiKey: String)(file: File, contentType: Option[String] = None, filename: Option[String] = None, xFilename: Option[String] = None
): Request[Either[ResponseError[Exception], Seq[String]], Nothing] =
    basicRequest
      .method(Method.POST, uri"$baseUrl/attachments/multipart?contentType=${ contentType }&filename=${ filename }&x-filename=${ xFilename }")
      .contentType("multipart/form-data")
      .header("x-api-key", apiKey)
      .multipartBody(Seq(
                multipartFile("file", file)

      ).flatten)
      .response(asJson[Seq[String]])

}
