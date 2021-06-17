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

import com.mailslurp.modelspackageVersion&#x3D;12.1.30.AttachmentMetaData
import com.mailslurp.modelspackageVersion&#x3D;12.1.30.ByteArray
import com.mailslurp.modelspackageVersion&#x3D;12.1.30.ContentMatchOptions
import com.mailslurp.modelspackageVersion&#x3D;12.1.30.DownloadAttachmentDto
import com.mailslurp.modelspackageVersion&#x3D;12.1.30.Email
import com.mailslurp.modelspackageVersion&#x3D;12.1.30.EmailContentMatchResult
import com.mailslurp.modelspackageVersion&#x3D;12.1.30.EmailTextLinesResult
import com.mailslurp.modelspackageVersion&#x3D;12.1.30.ForwardEmailOptions
import com.mailslurp.modelspackageVersion&#x3D;12.1.30.PageEmailProjection
import com.mailslurp.modelspackageVersion&#x3D;12.1.30.RawEmailJson
import com.mailslurp.modelspackageVersion&#x3D;12.1.30.ReplyToEmailOptions
import com.mailslurp.modelspackageVersion&#x3D;12.1.30.SentEmailDto
import java.util.UUID
import com.mailslurp.modelspackageVersion&#x3D;12.1.30.UnreadCount
import com.mailslurp.modelspackageVersion&#x3D;12.1.30.ValidationDto
import com.mailslurp.client.core.JsonSupport._
import sttp.client._
import sttp.model.Method

object EmailControllerApi {

def apply(baseUrl: String = "https://api.mailslurp.com") = new EmailControllerApi(baseUrl)
}

class EmailControllerApi(baseUrl: String) {

  /**
   * Deletes all emails in your account. Be careful as emails cannot be recovered
   * 
   * Expected answers:
   *   code 204 :  (No Content)
   *   code 401 :  (Unauthorized)
   *   code 403 :  (Forbidden)
   * 
   * Available security schemes:
   *   API_KEY (apiKey)
   */
  def deleteAllEmails(apiKey: String)(
): Request[Either[ResponseError[Exception], Unit], Nothing] =
    basicRequest
      .method(Method.DELETE, uri"$baseUrl/emails")
      .contentType("application/json")
      .header("x-api-key", apiKey)
      .response(asJson[Unit])

  /**
   * Deletes an email and removes it from the inbox. Deleted emails cannot be recovered.
   * 
   * Expected answers:
   *   code 204 :  (No Content)
   *   code 401 :  (Unauthorized)
   *   code 403 :  (Forbidden)
   * 
   * Available security schemes:
   *   API_KEY (apiKey)
   * 
   * @param emailId ID of email to delete
   */
  def deleteEmail(apiKey: String)(emailId: UUID
): Request[Either[ResponseError[Exception], Unit], Nothing] =
    basicRequest
      .method(Method.DELETE, uri"$baseUrl/emails/${emailId}")
      .contentType("application/json")
      .header("x-api-key", apiKey)
      .response(asJson[Unit])

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
   * @param emailId ID of email
   * @param apiKey Can pass apiKey in url for this request if you wish to download the file in a browser. Content type will be set to original content type of the attachment file. This is so that browsers can download the file correctly.
   */
  def downloadAttachment(apiKey: String)(attachmentId: String, emailId: UUID, apiKey: Option[String] = None
): Request[Either[ResponseError[Exception], ByteArray], Nothing] =
    basicRequest
      .method(Method.GET, uri"$baseUrl/emails/${emailId}/attachments/${attachmentId}?apiKey=${ apiKey }")
      .contentType("application/json")
      .header("x-api-key", apiKey)
      .response(asJson[ByteArray])

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
   * @param emailId ID of email
   */
  def downloadAttachmentBase64(apiKey: String)(attachmentId: String, emailId: UUID
): Request[Either[ResponseError[Exception], DownloadAttachmentDto], Nothing] =
    basicRequest
      .method(Method.GET, uri"$baseUrl/emails/${emailId}/attachments/${attachmentId}/base64")
      .contentType("application/json")
      .header("x-api-key", apiKey)
      .response(asJson[DownloadAttachmentDto])

  /**
   * Returns the specified email body for a given email as a string
   * 
   * Expected answers:
   *   code 200 : String (OK)
   *   code 401 :  (Unauthorized)
   *   code 403 :  (Forbidden)
   *   code 404 :  (Not Found)
   * 
   * Available security schemes:
   *   API_KEY (apiKey)
   * 
   * @param emailId ID of email
   */
  def downloadBody(apiKey: String)(emailId: UUID
): Request[Either[ResponseError[Exception], String], Nothing] =
    basicRequest
      .method(Method.GET, uri"$baseUrl/emails/${emailId}/body")
      .contentType("application/json")
      .header("x-api-key", apiKey)
      .response(asJson[String])

  /**
   * Returns the specified email body for a given email as a stream / array of bytes.
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
   * @param emailId ID of email
   */
  def downloadBodyBytes(apiKey: String)(emailId: UUID
): Request[Either[ResponseError[Exception], ByteArray], Nothing] =
    basicRequest
      .method(Method.GET, uri"$baseUrl/emails/${emailId}/body-bytes")
      .contentType("application/json")
      .header("x-api-key", apiKey)
      .response(asJson[ByteArray])

  /**
   * Forward an existing email to new recipients. The sender of the email will be the inbox that received the email you are forwarding. You can override the sender with the `from` option. Note you must have access to the from address in MailSlurp to use the override. For more control consider fetching the email and sending it a new using the send email endpoints.
   * 
   * Expected answers:
   *   code 201 :  (Created)
   *   code 401 :  (Unauthorized)
   *   code 403 :  (Forbidden)
   *   code 404 :  (Not Found)
   * 
   * Available security schemes:
   *   API_KEY (apiKey)
   * 
   * @param emailId ID of email
   * @param forwardEmailOptions forwardEmailOptions
   */
  def forwardEmail(apiKey: String)(emailId: UUID, forwardEmailOptions: ForwardEmailOptions
): Request[Either[ResponseError[Exception], Unit], Nothing] =
    basicRequest
      .method(Method.POST, uri"$baseUrl/emails/${emailId}/forward")
      .contentType("application/json")
      .header("x-api-key", apiKey)
      .body(forwardEmailOptions)
      .response(asJson[Unit])

  /**
   * Returns the metadata such as name and content-type for a given attachment and email.
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
   * @param emailId ID of email
   */
  def getAttachmentMetaData(apiKey: String)(attachmentId: String, emailId: UUID
): Request[Either[ResponseError[Exception], AttachmentMetaData], Nothing] =
    basicRequest
      .method(Method.GET, uri"$baseUrl/emails/${emailId}/attachments/${attachmentId}/metadata")
      .contentType("application/json")
      .header("x-api-key", apiKey)
      .response(asJson[AttachmentMetaData])

  /**
   * Returns an array of attachment metadata such as name and content-type for a given email if present.
   * 
   * Expected answers:
   *   code 200 : Seq[AttachmentMetaData] (OK)
   *   code 401 :  (Unauthorized)
   *   code 403 :  (Forbidden)
   *   code 404 :  (Not Found)
   * 
   * Available security schemes:
   *   API_KEY (apiKey)
   * 
   * @param emailId ID of email
   */
  def getAttachments1(apiKey: String)(emailId: UUID
): Request[Either[ResponseError[Exception], Seq[AttachmentMetaData]], Nothing] =
    basicRequest
      .method(Method.GET, uri"$baseUrl/emails/${emailId}/attachments")
      .contentType("application/json")
      .header("x-api-key", apiKey)
      .response(asJson[Seq[AttachmentMetaData]])

  /**
   * Returns a email summary object with headers and content. To retrieve the raw unparsed email use the getRawEmail endpoints
   * 
   * Expected answers:
   *   code 200 : Email (OK)
   *   code 401 :  (Unauthorized)
   *   code 403 :  (Forbidden)
   *   code 404 :  (Not Found)
   * 
   * Available security schemes:
   *   API_KEY (apiKey)
   * 
   * @param emailId emailId
   * @param decode Decode email body quoted-printable encoding to plain text. SMTP servers often encode text using quoted-printable format (for instance `=D7`). This can be a pain for testing
   */
  def getEmail(apiKey: String)(emailId: UUID, decode: Option[Boolean] = None
): Request[Either[ResponseError[Exception], Email], Nothing] =
    basicRequest
      .method(Method.GET, uri"$baseUrl/emails/${emailId}?decode=${ decode }")
      .contentType("application/json")
      .header("x-api-key", apiKey)
      .response(asJson[Email])

  /**
   * Return the matches for a given Java style regex pattern. Do not include the typical `/` at start or end of regex in some languages. Given an example `your code is: 12345` the pattern to extract match looks like `code is: (\\d{6})`. This will return an array of matches with the first matching the entire pattern and the subsequent matching the groups: `['code is: 123456', '123456']` See https://docs.oracle.com/javase/8/docs/api/java/util/regex/Pattern.html for more information of available patterns. 
   * 
   * Expected answers:
   *   code 200 : EmailContentMatchResult (OK)
   *   code 201 :  (Created)
   *   code 401 :  (Unauthorized)
   *   code 403 :  (Forbidden)
   *   code 404 :  (Not Found)
   * 
   * Available security schemes:
   *   API_KEY (apiKey)
   * 
   * @param emailId ID of email to match against
   * @param contentMatchOptions contentMatchOptions
   */
  def getEmailContentMatch(apiKey: String)(emailId: UUID, contentMatchOptions: ContentMatchOptions
): Request[Either[ResponseError[Exception], EmailContentMatchResult], Nothing] =
    basicRequest
      .method(Method.POST, uri"$baseUrl/emails/${emailId}/contentMatch")
      .contentType("application/json")
      .header("x-api-key", apiKey)
      .body(contentMatchOptions)
      .response(asJson[EmailContentMatchResult])

  /**
   * Retrieve email content as HTML response for viewing in browsers. Decodes quoted-printable entities and converts charset to UTF-8. Pass your API KEY as a request parameter when viewing in a browser: `?apiKey=xxx`
   * 
   * Expected answers:
   *   code 200 : String (OK)
   *   code 401 :  (Unauthorized)
   *   code 403 :  (Forbidden)
   *   code 404 :  (Not Found)
   * 
   * Available security schemes:
   *   API_KEY (apiKey)
   * 
   * @param emailId emailId
   * @param decode decode
   */
  def getEmailHTML(apiKey: String)(emailId: UUID, decode: Option[Boolean] = None
): Request[Either[ResponseError[Exception], String], Nothing] =
    basicRequest
      .method(Method.GET, uri"$baseUrl/emails/${emailId}/html?decode=${ decode }")
      .contentType("application/json")
      .header("x-api-key", apiKey)
      .response(asJson[String])

  /**
   * Parse an email body and return the content as an array of text. HTML parsing uses JSoup which supports JQuery/CSS style selectors
   * 
   * Expected answers:
   *   code 200 : EmailTextLinesResult (OK)
   *   code 401 :  (Unauthorized)
   *   code 403 :  (Forbidden)
   *   code 404 :  (Not Found)
   * 
   * Available security schemes:
   *   API_KEY (apiKey)
   * 
   * @param emailId ID of email to perform HTML query on
   * @param htmlSelector HTML selector to search for. Uses JQuery/JSoup/CSS style selector like '.my-div' to match content. See https://jsoup.org/apidocs/org/jsoup/select/Selector.html for more information.
   */
  def getEmailHTMLQuery(apiKey: String)(emailId: UUID, htmlSelector: Option[String] = None
): Request[Either[ResponseError[Exception], EmailTextLinesResult], Nothing] =
    basicRequest
      .method(Method.GET, uri"$baseUrl/emails/${emailId}/htmlQuery?htmlSelector=${ htmlSelector }")
      .contentType("application/json")
      .header("x-api-key", apiKey)
      .response(asJson[EmailTextLinesResult])

  /**
   * Parse an email body and return the content as an array of strings. HTML parsing uses JSoup and UNIX line separators.
   * 
   * Expected answers:
   *   code 200 : EmailTextLinesResult (OK)
   *   code 401 :  (Unauthorized)
   *   code 403 :  (Forbidden)
   *   code 404 :  (Not Found)
   * 
   * Available security schemes:
   *   API_KEY (apiKey)
   * 
   * @param emailId ID of email to fetch text for
   * @param decodeHtmlEntities Decode HTML entities
   * @param lineSeparator Line separator character
   */
  def getEmailTextLines(apiKey: String)(emailId: UUID, decodeHtmlEntities: Option[Boolean] = None, lineSeparator: Option[String] = None
): Request[Either[ResponseError[Exception], EmailTextLinesResult], Nothing] =
    basicRequest
      .method(Method.GET, uri"$baseUrl/emails/${emailId}/textLines?decodeHtmlEntities=${ decodeHtmlEntities }&lineSeparator=${ lineSeparator }")
      .contentType("application/json")
      .header("x-api-key", apiKey)
      .response(asJson[EmailTextLinesResult])

  /**
   * By default returns all emails across all inboxes sorted by ascending created at date. Responses are paginated. You can restrict results to a list of inbox IDs. You can also filter out read messages
   * 
   * Expected answers:
   *   code 200 : PageEmailProjection (OK)
   *   code 401 :  (Unauthorized)
   *   code 403 :  (Forbidden)
   *   code 404 :  (Not Found)
   * 
   * Available security schemes:
   *   API_KEY (apiKey)
   * 
   * @param inboxId Optional inbox ids to filter by. Can be repeated. By default will use all inboxes belonging to your account.
   * @param page Optional page index in email list pagination
   * @param size Optional page size in email list pagination. Maximum size is 100. Use page index and sort to page through larger results
   * @param sort Optional createdAt sort direction ASC or DESC
   * @param unreadOnly Optional filter for unread emails only. All emails are considered unread until they are viewed in the dashboard or requested directly
   */
  def getEmailsPaginated(apiKey: String)(inboxId: Seq[UUID], page: Option[Int] = None, size: Option[Int] = None, sort: Option[String] = None, unreadOnly: Option[Boolean] = None
): Request[Either[ResponseError[Exception], PageEmailProjection], Nothing] =
    basicRequest
      .method(Method.GET, uri"$baseUrl/emails?inboxId=${ inboxId }&page=${ page }&size=${ size }&sort=${ sort }&unreadOnly=${ unreadOnly }")
      .contentType("application/json")
      .header("x-api-key", apiKey)
      .response(asJson[PageEmailProjection])

  /**
   * Get the newest email in all inboxes or in a passed set of inbox IDs
   * 
   * Expected answers:
   *   code 200 : Email (OK)
   *   code 401 :  (Unauthorized)
   *   code 403 :  (Forbidden)
   *   code 404 :  (Not Found)
   * 
   * Available security schemes:
   *   API_KEY (apiKey)
   * 
   * @param inboxIds Optional set of inboxes to filter by. Only get the latest email from these inbox IDs
   */
  def getLatestEmail(apiKey: String)(inboxIds: Seq[UUID]
): Request[Either[ResponseError[Exception], Email], Nothing] =
    basicRequest
      .method(Method.GET, uri"$baseUrl/emails/latest?inboxIds=${ inboxIds }")
      .contentType("application/json")
      .header("x-api-key", apiKey)
      .response(asJson[Email])

  /**
   * Get the newest email in all inboxes or in a passed set of inbox IDs
   * 
   * Expected answers:
   *   code 200 : Email (OK)
   *   code 401 :  (Unauthorized)
   *   code 403 :  (Forbidden)
   *   code 404 :  (Not Found)
   * 
   * Available security schemes:
   *   API_KEY (apiKey)
   * 
   * @param inboxId ID of the inbox you want to get the latest email from
   */
  def getLatestEmailInInbox(apiKey: String)(inboxId: Option[UUID] = None
): Request[Either[ResponseError[Exception], Email], Nothing] =
    basicRequest
      .method(Method.GET, uri"$baseUrl/emails/latestIn?inboxId=${ inboxId }")
      .contentType("application/json")
      .header("x-api-key", apiKey)
      .response(asJson[Email])

  /**
   * By default returns all emails across all team inboxes sorted by ascending created at date. Responses are paginated. You can restrict results to a list of inbox IDs. You can also filter out read messages
   * 
   * Expected answers:
   *   code 200 : PageEmailProjection (OK)
   *   code 401 :  (Unauthorized)
   *   code 403 :  (Forbidden)
   *   code 404 :  (Not Found)
   * 
   * Available security schemes:
   *   API_KEY (apiKey)
   * 
   * @param inboxId Optional inbox ids to filter by. Can be repeated. By default will use all inboxes belonging to your account.
   * @param page Optional page index in email list pagination
   * @param size Optional page size in email list pagination. Maximum size is 100. Use page index and sort to page through larger results
   * @param sort Optional createdAt sort direction ASC or DESC
   * @param unreadOnly Optional filter for unread emails only. All emails are considered unread until they are viewed in the dashboard or requested directly
   */
  def getOrganizationEmailsPaginated(apiKey: String)(inboxId: Seq[UUID], page: Option[Int] = None, size: Option[Int] = None, sort: Option[String] = None, unreadOnly: Option[Boolean] = None
): Request[Either[ResponseError[Exception], PageEmailProjection], Nothing] =
    basicRequest
      .method(Method.GET, uri"$baseUrl/emails/organization?inboxId=${ inboxId }&page=${ page }&size=${ size }&sort=${ sort }&unreadOnly=${ unreadOnly }")
      .contentType("application/json")
      .header("x-api-key", apiKey)
      .response(asJson[PageEmailProjection])

  /**
   * Returns a raw, unparsed, and unprocessed email. If your client has issues processing the response it is likely due to the response content-type which is text/plain. If you need a JSON response content-type use the getRawEmailJson endpoint
   * 
   * Expected answers:
   *   code 200 : String (text/plain raw email)
   *   code 401 :  (Unauthorized)
   *   code 403 :  (Forbidden)
   *   code 404 :  (Not Found)
   * 
   * Available security schemes:
   *   API_KEY (apiKey)
   * 
   * @param emailId ID of email
   */
  def getRawEmailContents(apiKey: String)(emailId: UUID
): Request[Either[ResponseError[Exception], String], Nothing] =
    basicRequest
      .method(Method.GET, uri"$baseUrl/emails/${emailId}/raw")
      .contentType("application/json")
      .header("x-api-key", apiKey)
      .response(asJson[String])

  /**
   * Returns a raw, unparsed, and unprocessed email wrapped in a JSON response object for easier handling when compared with the getRawEmail text/plain response
   * 
   * Expected answers:
   *   code 200 : RawEmailJson (OK)
   *   code 401 :  (Unauthorized)
   *   code 403 :  (Forbidden)
   *   code 404 :  (Not Found)
   * 
   * Available security schemes:
   *   API_KEY (apiKey)
   * 
   * @param emailId ID of email
   */
  def getRawEmailJson(apiKey: String)(emailId: UUID
): Request[Either[ResponseError[Exception], RawEmailJson], Nothing] =
    basicRequest
      .method(Method.GET, uri"$baseUrl/emails/${emailId}/raw/json")
      .contentType("application/json")
      .header("x-api-key", apiKey)
      .response(asJson[RawEmailJson])

  /**
   * Get number of emails unread. Unread means has not been viewed in dashboard or returned in an email API response
   * 
   * Expected answers:
   *   code 200 : UnreadCount (OK)
   *   code 401 :  (Unauthorized)
   *   code 403 :  (Forbidden)
   *   code 404 :  (Not Found)
   * 
   * Available security schemes:
   *   API_KEY (apiKey)
   */
  def getUnreadEmailCount(apiKey: String)(
): Request[Either[ResponseError[Exception], UnreadCount], Nothing] =
    basicRequest
      .method(Method.GET, uri"$baseUrl/emails/unreadCount")
      .contentType("application/json")
      .header("x-api-key", apiKey)
      .response(asJson[UnreadCount])

  /**
   * Send the reply to the email sender or reply-to and include same subject cc bcc etc. Reply to an email and the contents will be sent with the existing subject to the emails `to`, `cc`, and `bcc`.
   * 
   * Expected answers:
   *   code 200 : SentEmailDto (OK)
   *   code 201 :  (Created)
   *   code 401 :  (Unauthorized)
   *   code 403 :  (Forbidden)
   *   code 404 :  (Not Found)
   * 
   * Available security schemes:
   *   API_KEY (apiKey)
   * 
   * @param emailId ID of the email that should be replied to
   * @param replyToEmailOptions replyToEmailOptions
   */
  def replyToEmail(apiKey: String)(emailId: UUID, replyToEmailOptions: ReplyToEmailOptions
): Request[Either[ResponseError[Exception], SentEmailDto], Nothing] =
    basicRequest
      .method(Method.PUT, uri"$baseUrl/emails/${emailId}")
      .contentType("application/json")
      .header("x-api-key", apiKey)
      .body(replyToEmailOptions)
      .response(asJson[SentEmailDto])

  /**
   * Validate the HTML content of email if HTML is found. Considered valid if no HTML is present.
   * 
   * Expected answers:
   *   code 201 : ValidationDto (Created)
   *   code 401 :  (Unauthorized)
   *   code 403 :  (Forbidden)
   *   code 404 :  (Not Found)
   * 
   * Available security schemes:
   *   API_KEY (apiKey)
   * 
   * @param emailId ID of email
   */
  def validateEmail(apiKey: String)(emailId: UUID
): Request[Either[ResponseError[Exception], ValidationDto], Nothing] =
    basicRequest
      .method(Method.POST, uri"$baseUrl/emails/${emailId}/validate")
      .contentType("application/json")
      .header("x-api-key", apiKey)
      .response(asJson[ValidationDto])

}
