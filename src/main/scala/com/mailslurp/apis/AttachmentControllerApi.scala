/**
 * MailSlurp API
 * MailSlurp is an API for sending and receiving emails from dynamically allocated email addresses. It's designed for developers and QA teams to test applications, process inbound emails, send templated notifications, attachments, and more.   ## Resources - [Homepage](https://www.mailslurp.com) - Get an [API KEY](https://app.mailslurp.com/sign-up/) - Generated [SDK Clients](https://www.mailslurp.com/docs/) - [Examples](https://github.com/mailslurp/examples) repository 
 *
 * The version of the OpenAPI document: 6.5.2
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package com.mailslurp.apis

import com.mailslurp.modelspackageVersion&#x3D;11.8.11.ByteArray
import java.io.File
import com.mailslurp.modelspackageVersion&#x3D;11.8.11.UploadAttachmentOptions
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
