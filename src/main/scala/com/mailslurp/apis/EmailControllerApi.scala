/**
 * MailSlurp API
 * MailSlurp is an API for sending and receiving emails from dynamically allocated email addresses. It's designed for developers and QA teams to test applications, process inbound emails, send templated notifications, attachments, and more.  ## Resources  - [Homepage](https://www.mailslurp.com) - Get an [API KEY](https://app.mailslurp.com/sign-up/) - Generated [SDK Clients](https://docs.mailslurp.com/) - [Examples](https://github.com/mailslurp/examples) repository
 *
 * The version of the OpenAPI document: 6.5.2
 * Contact: contact@mailslurp.dev
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package com.mailslurp.apis

import com.mailslurp.modelspackageVersion&#x3D;15.9.0.AttachmentMetaData
import com.mailslurp.modelspackageVersion&#x3D;15.9.0.ByteArray
import com.mailslurp.modelspackageVersion&#x3D;15.9.0.ContentMatchOptions
import com.mailslurp.modelspackageVersion&#x3D;15.9.0.CountDto
import com.mailslurp.modelspackageVersion&#x3D;15.9.0.DownloadAttachmentDto
import com.mailslurp.modelspackageVersion&#x3D;15.9.0.Email
import com.mailslurp.modelspackageVersion&#x3D;15.9.0.EmailContentMatchResult
import com.mailslurp.modelspackageVersion&#x3D;15.9.0.EmailLinksResult
import com.mailslurp.modelspackageVersion&#x3D;15.9.0.EmailPreview
import com.mailslurp.modelspackageVersion&#x3D;15.9.0.EmailPreviewUrls
import com.mailslurp.modelspackageVersion&#x3D;15.9.0.EmailTextLinesResult
import com.mailslurp.modelspackageVersion&#x3D;15.9.0.ForwardEmailOptions
import com.mailslurp.modelspackageVersion&#x3D;15.9.0.GravatarUrl
import com.mailslurp.modelspackageVersion&#x3D;15.9.0.ImapFlagOperationOptions
import java.time.OffsetDateTime
import com.mailslurp.modelspackageVersion&#x3D;15.9.0.PageEmailProjection
import com.mailslurp.modelspackageVersion&#x3D;15.9.0.RawEmailJson
import com.mailslurp.modelspackageVersion&#x3D;15.9.0.ReplyToEmailOptions
import com.mailslurp.modelspackageVersion&#x3D;15.9.0.SendEmailOptions
import com.mailslurp.modelspackageVersion&#x3D;15.9.0.SentEmailDto
import java.util.UUID
import com.mailslurp.modelspackageVersion&#x3D;15.9.0.UnreadCount
import com.mailslurp.modelspackageVersion&#x3D;15.9.0.ValidationDto
import com.mailslurp.client.core.JsonSupport._
import sttp.client._
import sttp.model.Method

object EmailControllerApi {

def apply(baseUrl: String = "https://api.mailslurp.com") = new EmailControllerApi(baseUrl)
}

class EmailControllerApi(baseUrl: String) {

  /**
   * Apply RFC3501 section-2.3.2 IMAP flag operations on an email
   * 
   * Expected answers:
   *   code 200 : EmailPreview (OK)
   * 
   * Available security schemes:
   *   API_KEY (apiKey)
   * 
   * @param emailId 
   * @param imapFlagOperationOptions 
   */
  def applyImapFlagOperation(apiKey: String)(emailId: UUID, imapFlagOperationOptions: ImapFlagOperationOptions
): Request[Either[ResponseError[Exception], EmailPreview], Nothing] =
    basicRequest
      .method(Method.POST, uri"$baseUrl/emails/${emailId}/imap-flag-operation")
      .contentType("application/json")
      .header("x-api-key", apiKey)
      .body(imapFlagOperationOptions)
      .response(asJson[EmailPreview])

  /**
   * Deletes all emails in your account. Be careful as emails cannot be recovered
   * 
   * Expected answers:
   *   code 204 :  (No Content)
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
   *   code 0 : ByteArray (default response)
   * 
   * Available security schemes:
   *   API_KEY (apiKey)
   * 
   * @param emailId ID of email
   * @param attachmentId ID of attachment
   * @param apiKey Can pass apiKey in url for this request if you wish to download the file in a browser. Content type will be set to original content type of the attachment file. This is so that browsers can download the file correctly.
   */
  def downloadAttachment(apiKey: String)(emailId: UUID, attachmentId: String, apiKey: Option[String] = None
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
   * 
   * Available security schemes:
   *   API_KEY (apiKey)
   * 
   * @param emailId ID of email
   * @param attachmentId ID of attachment
   */
  def downloadAttachmentBase64(apiKey: String)(emailId: UUID, attachmentId: String
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
   *   code 0 : ByteArray (default response)
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
   *   code 201 : SentEmailDto (Created)
   * 
   * Available security schemes:
   *   API_KEY (apiKey)
   * 
   * @param emailId ID of email
   * @param forwardEmailOptions 
   */
  def forwardEmail(apiKey: String)(emailId: UUID, forwardEmailOptions: ForwardEmailOptions
): Request[Either[ResponseError[Exception], SentEmailDto], Nothing] =
    basicRequest
      .method(Method.POST, uri"$baseUrl/emails/${emailId}/forward")
      .contentType("application/json")
      .header("x-api-key", apiKey)
      .body(forwardEmailOptions)
      .response(asJson[SentEmailDto])

  /**
   * Returns the metadata such as name and content-type for a given attachment and email.
   * 
   * Expected answers:
   *   code 200 : AttachmentMetaData (OK)
   * 
   * Available security schemes:
   *   API_KEY (apiKey)
   * 
   * @param emailId ID of email
   * @param attachmentId ID of attachment
   */
  def getAttachmentMetaData(apiKey: String)(emailId: UUID, attachmentId: String
): Request[Either[ResponseError[Exception], AttachmentMetaData], Nothing] =
    basicRequest
      .method(Method.GET, uri"$baseUrl/emails/${emailId}/attachments/${attachmentId}/metadata")
      .contentType("application/json")
      .header("x-api-key", apiKey)
      .response(asJson[AttachmentMetaData])

  /**
   * Returns a email summary object with headers and content. To retrieve the raw unparsed email use the getRawEmail endpoints
   * 
   * Expected answers:
   *   code 200 : Email (OK)
   * 
   * Available security schemes:
   *   API_KEY (apiKey)
   * 
   * @param emailId 
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
   * Returns an array of attachment metadata such as name and content-type for a given email if present.
   * 
   * Expected answers:
   *   code 200 : Seq[AttachmentMetaData] (OK)
   * 
   * Available security schemes:
   *   API_KEY (apiKey)
   * 
   * @param emailId ID of email
   */
  def getEmailAttachments(apiKey: String)(emailId: UUID
): Request[Either[ResponseError[Exception], Seq[AttachmentMetaData]], Nothing] =
    basicRequest
      .method(Method.GET, uri"$baseUrl/emails/${emailId}/attachments")
      .contentType("application/json")
      .header("x-api-key", apiKey)
      .response(asJson[Seq[AttachmentMetaData]])

  /**
   * Return the matches for a given Java style regex pattern. Do not include the typical `/` at start or end of regex in some languages. Given an example `your code is: 12345` the pattern to extract match looks like `code is: (\\d{6})`. This will return an array of matches with the first matching the entire pattern and the subsequent matching the groups: `['code is: 123456', '123456']` See https://docs.oracle.com/javase/8/docs/api/java/util/regex/Pattern.html for more information of available patterns. 
   * 
   * Expected answers:
   *   code 200 : EmailContentMatchResult (OK)
   * 
   * Available security schemes:
   *   API_KEY (apiKey)
   * 
   * @param emailId ID of email to match against
   * @param contentMatchOptions 
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
   * Expected answers:
   *   code 200 : CountDto (OK)
   * 
   * Available security schemes:
   *   API_KEY (apiKey)
   */
  def getEmailCount(apiKey: String)(
): Request[Either[ResponseError[Exception], CountDto], Nothing] =
    basicRequest
      .method(Method.GET, uri"$baseUrl/emails/emails/count")
      .contentType("application/json")
      .header("x-api-key", apiKey)
      .response(asJson[CountDto])

  /**
   * Retrieve email content as HTML response for viewing in browsers. Decodes quoted-printable entities and converts charset to UTF-8. Pass your API KEY as a request parameter when viewing in a browser: `?apiKey=xxx`
   * 
   * Expected answers:
   *   code 200 : String (OK)
   * 
   * Available security schemes:
   *   API_KEY (apiKey)
   * 
   * @param emailId 
   * @param decode 
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
   * 
   * Available security schemes:
   *   API_KEY (apiKey)
   * 
   * @param emailId ID of email to perform HTML query on
   * @param htmlSelector HTML selector to search for. Uses JQuery/JSoup/CSS style selector like '.my-div' to match content. See https://jsoup.org/apidocs/org/jsoup/select/Selector.html for more information.
   */
  def getEmailHTMLQuery(apiKey: String)(emailId: UUID, htmlSelector: String
): Request[Either[ResponseError[Exception], EmailTextLinesResult], Nothing] =
    basicRequest
      .method(Method.GET, uri"$baseUrl/emails/${emailId}/htmlQuery?htmlSelector=${ htmlSelector }")
      .contentType("application/json")
      .header("x-api-key", apiKey)
      .response(asJson[EmailTextLinesResult])

  /**
   * HTML parsing uses JSoup and UNIX line separators. Searches content for href attributes
   * 
   * Expected answers:
   *   code 200 : EmailLinksResult (OK)
   * 
   * Available security schemes:
   *   API_KEY (apiKey)
   * 
   * @param emailId ID of email to fetch text for
   */
  def getEmailLinks(apiKey: String)(emailId: UUID
): Request[Either[ResponseError[Exception], EmailLinksResult], Nothing] =
    basicRequest
      .method(Method.GET, uri"$baseUrl/emails/${emailId}/links")
      .contentType("application/json")
      .header("x-api-key", apiKey)
      .response(asJson[EmailLinksResult])

  /**
   * Get a list of URLs for email content as text/html or raw SMTP message for viewing the message in a browser.
   * 
   * Expected answers:
   *   code 200 : EmailPreviewUrls (OK)
   * 
   * Available security schemes:
   *   API_KEY (apiKey)
   * 
   * @param emailId 
   */
  def getEmailPreviewURLs(apiKey: String)(emailId: UUID
): Request[Either[ResponseError[Exception], EmailPreviewUrls], Nothing] =
    basicRequest
      .method(Method.GET, uri"$baseUrl/emails/${emailId}/urls")
      .contentType("application/json")
      .header("x-api-key", apiKey)
      .response(asJson[EmailPreviewUrls])

  /**
   * Parse an email body and return the content as an array of strings. HTML parsing uses JSoup and UNIX line separators.
   * 
   * Expected answers:
   *   code 200 : EmailTextLinesResult (OK)
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
   * 
   * Available security schemes:
   *   API_KEY (apiKey)
   * 
   * @param inboxId Optional inbox ids to filter by. Can be repeated. By default will use all inboxes belonging to your account.
   * @param page Optional page index in email list pagination
   * @param size Optional page size in email list pagination. Maximum size is 100. Use page index and sort to page through larger results
   * @param sort Optional createdAt sort direction ASC or DESC
   * @param unreadOnly Optional filter for unread emails only. All emails are considered unread until they are viewed in the dashboard or requested directly
   * @param searchFilter Optional search filter. Searches email recipients, sender, subject, email address and ID. Does not search email body
   * @param since Optional filter emails received after given date time
   * @param before Optional filter emails received before given date time
   */
  def getEmailsPaginated(apiKey: String)(inboxId: Seq[UUID], page: Option[Int] = None, size: Option[Int] = None, sort: Option[String] = None, unreadOnly: Option[Boolean] = None, searchFilter: Option[String] = None, since: Option[OffsetDateTime] = None, before: Option[OffsetDateTime] = None
): Request[Either[ResponseError[Exception], PageEmailProjection], Nothing] =
    basicRequest
      .method(Method.GET, uri"$baseUrl/emails?inboxId=${ inboxId }&page=${ page }&size=${ size }&sort=${ sort }&unreadOnly=${ unreadOnly }&searchFilter=${ searchFilter }&since=${ since }&before=${ before }")
      .contentType("application/json")
      .header("x-api-key", apiKey)
      .response(asJson[PageEmailProjection])

  /**
   * Get gravatar url for email address
   * 
   * Expected answers:
   *   code 200 : GravatarUrl (OK)
   * 
   * Available security schemes:
   *   API_KEY (apiKey)
   * 
   * @param emailAddress 
   * @param size 
   */
  def getGravatarUrlForEmailAddress(apiKey: String)(emailAddress: String, size: Option[String] = None
): Request[Either[ResponseError[Exception], GravatarUrl], Nothing] =
    basicRequest
      .method(Method.GET, uri"$baseUrl/emails/gravatarFor?emailAddress=${ emailAddress }&size=${ size }")
      .contentType("application/json")
      .header("x-api-key", apiKey)
      .response(asJson[GravatarUrl])

  /**
   * Get the newest email in all inboxes or in a passed set of inbox IDs
   * 
   * Expected answers:
   *   code 200 : Email (OK)
   * 
   * Available security schemes:
   *   API_KEY (apiKey)
   * 
   * @param inboxIds Optional set of inboxes to filter by. Only get the latest email from these inbox IDs. If not provided will search across all inboxes
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
   * 
   * Available security schemes:
   *   API_KEY (apiKey)
   * 
   * @param inboxId ID of the inbox you want to get the latest email from
   */
  def getLatestEmailInInbox1(apiKey: String)(inboxId: UUID
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
   * 
   * Available security schemes:
   *   API_KEY (apiKey)
   * 
   * @param inboxId Optional inbox ids to filter by. Can be repeated. By default will use all inboxes belonging to your account.
   * @param page Optional page index in email list pagination
   * @param size Optional page size in email list pagination. Maximum size is 100. Use page index and sort to page through larger results
   * @param sort Optional createdAt sort direction ASC or DESC
   * @param unreadOnly Optional filter for unread emails only. All emails are considered unread until they are viewed in the dashboard or requested directly
   * @param searchFilter Optional search filter search filter for emails.
   * @param since Optional filter emails received after given date time
   * @param before Optional filter emails received before given date time
   */
  def getOrganizationEmailsPaginated(apiKey: String)(inboxId: Seq[UUID], page: Option[Int] = None, size: Option[Int] = None, sort: Option[String] = None, unreadOnly: Option[Boolean] = None, searchFilter: Option[String] = None, since: Option[OffsetDateTime] = None, before: Option[OffsetDateTime] = None
): Request[Either[ResponseError[Exception], PageEmailProjection], Nothing] =
    basicRequest
      .method(Method.GET, uri"$baseUrl/emails/organization?inboxId=${ inboxId }&page=${ page }&size=${ size }&sort=${ sort }&unreadOnly=${ unreadOnly }&searchFilter=${ searchFilter }&since=${ since }&before=${ before }")
      .contentType("application/json")
      .header("x-api-key", apiKey)
      .response(asJson[PageEmailProjection])

  /**
   * Returns a raw, unparsed, and unprocessed email. If your client has issues processing the response it is likely due to the response content-type which is text/plain. If you need a JSON response content-type use the getRawEmailJson endpoint
   * 
   * Expected answers:
   *   code 200 : String (OK)
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
   * Marks an email as read or unread. Pass boolean read flag to set value. This is useful if you want to read an email but keep it as unread
   * 
   * Expected answers:
   *   code 200 : EmailPreview (OK)
   * 
   * Available security schemes:
   *   API_KEY (apiKey)
   * 
   * @param emailId 
   * @param read What value to assign to email read property. Default true.
   */
  def markAsRead(apiKey: String)(emailId: UUID, read: Option[Boolean] = None
): Request[Either[ResponseError[Exception], EmailPreview], Nothing] =
    basicRequest
      .method(Method.PATCH, uri"$baseUrl/emails/${emailId}/read?read=${ read }")
      .contentType("application/json")
      .header("x-api-key", apiKey)
      .response(asJson[EmailPreview])

  /**
   * Send the reply to the email sender or reply-to and include same subject cc bcc etc. Reply to an email and the contents will be sent with the existing subject to the emails `to`, `cc`, and `bcc`.
   * 
   * Expected answers:
   *   code 200 : SentEmailDto (OK)
   * 
   * Available security schemes:
   *   API_KEY (apiKey)
   * 
   * @param emailId ID of the email that should be replied to
   * @param replyToEmailOptions 
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
   * Alias for `InboxController.sendEmail` method - see original method for full details. Sends an email from a given inbox that you have created. If no inbox is supplied a random inbox will be created for you and used to send the email.
   * 
   * Expected answers:
   *   code 201 :  (Created)
   * 
   * Available security schemes:
   *   API_KEY (apiKey)
   * 
   * @param inboxId ID of the inbox you want to send the email from
   * @param sendEmailOptions 
   * @param useDomainPool Use domain pool. Optionally create inbox to send from using the mailslurp domain pool.
   * @param virtualSend Optionally create inbox to send from that is a virtual inbox and won't send to external addresses
   */
  def sendEmailSourceOptional(apiKey: String)(inboxId: UUID, sendEmailOptions: SendEmailOptions, useDomainPool: Option[Boolean] = None, virtualSend: Option[Boolean] = None
): Request[Either[ResponseError[Exception], Unit], Nothing] =
    basicRequest
      .method(Method.POST, uri"$baseUrl/emails?useDomainPool=${ useDomainPool }&virtualSend=${ virtualSend }")
      .contentType("application/json")
      .header("x-api-key", apiKey)
      .body(sendEmailOptions)
      .response(asJson[Unit])

  /**
   * Validate the HTML content of email if HTML is found. Considered valid if no HTML is present.
   * 
   * Expected answers:
   *   code 201 : ValidationDto (Created)
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
