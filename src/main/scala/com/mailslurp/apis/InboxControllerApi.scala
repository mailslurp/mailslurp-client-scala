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

import com.mailslurp.modelspackageVersion&#x3D;11.8.2.CreateInboxDto
import com.mailslurp.modelspackageVersion&#x3D;11.8.2.EmailPreview
import com.mailslurp.modelspackageVersion&#x3D;11.8.2.Inbox
import java.time.OffsetDateTime
import com.mailslurp.modelspackageVersion&#x3D;11.8.2.PageEmailPreview
import com.mailslurp.modelspackageVersion&#x3D;11.8.2.PageInboxProjection
import com.mailslurp.modelspackageVersion&#x3D;11.8.2.PageOrganizationInboxProjection
import com.mailslurp.modelspackageVersion&#x3D;11.8.2.PageSentEmailProjection
import com.mailslurp.modelspackageVersion&#x3D;11.8.2.SendEmailOptions
import com.mailslurp.modelspackageVersion&#x3D;11.8.2.SentEmailDto
import com.mailslurp.modelspackageVersion&#x3D;11.8.2.SetInboxFavouritedOptions
import java.util.UUID
import com.mailslurp.modelspackageVersion&#x3D;11.8.2.UpdateInboxOptions
import com.mailslurp.client.core.JsonSupport._
import sttp.client._
import sttp.model.Method

object InboxControllerApi {

def apply(baseUrl: String = "https://api.mailslurp.com") = new InboxControllerApi(baseUrl)
}

class InboxControllerApi(baseUrl: String) {

  /**
   * Create a new inbox and with a randomized email address to send and receive from. Pass emailAddress parameter if you wish to use a specific email address. Creating an inbox is required before sending or receiving emails. If writing tests it is recommended that you create a new inbox during each test method so that it is unique and empty. 
   * 
   * Expected answers:
   *   code 201 : Inbox (Created)
   *   code 401 :  (Unauthorized)
   *   code 403 :  (Forbidden)
   *   code 404 :  (Not Found)
   * 
   * Available security schemes:
   *   API_KEY (apiKey)
   * 
   * @param allowTeamAccess Grant team access to this inbox and the emails that belong to it for team members of your organization.
   * @param description Optional description of the inbox for labelling purposes. Is shown in the dashboard and can be used with
   * @param emailAddress A custom email address to use with the inbox. Defaults to null. When null MailSlurp will assign a random email address to the inbox such as `123@mailslurp.com`. If you use the `useDomainPool` option when the email address is null it will generate an email address with a more varied domain ending such as `123@mailslurp.info` or `123@mailslurp.biz`. When a custom email address is provided the address is split into a domain and the domain is queried against your user. If you have created the domain in the MailSlurp dashboard and verified it you can use any email address that ends with the domain. Send an email to this address and the inbox will receive and store it for you. To retrieve the email use the Inbox and Email Controller endpoints with the inbox ID.
   * @param expiresAt Optional inbox expiration date. If null then this inbox is permanent and the emails in it won't be deleted. If an expiration date is provided or is required by your plan the inbox will be closed when the expiration time is reached. Expired inboxes still contain their emails but can no longer send or receive emails. An ExpiredInboxRecord is created when an inbox and the email address and inbox ID are recorded. The expiresAt property is a timestamp string in ISO DateTime Format yyyy-MM-dd'T'HH:mm:ss.SSSXXX.
   * @param expiresIn Number of milliseconds that inbox should exist for
   * @param favourite Is the inbox favorited. Favouriting inboxes is typically done in the dashboard for quick access or filtering
   * @param name Optional name of the inbox. Displayed in the dashboard for easier search
   * @param tags Tags that inbox has been tagged with. Tags can be added to inboxes to group different inboxes within an account. You can also search for inboxes by tag in the dashboard UI.
   * @param useDomainPool Use the MailSlurp domain name pool with this inbox when creating the email address. Defaults to null. If enabled the inbox will be an email address with a domain randomly chosen from a list of the MailSlurp domains. This is useful when the default `@mailslurp.com` email addresses used with inboxes are blocked or considered spam by a provider or receiving service. When domain pool is enabled an email address will be generated ending in `@mailslurp.{world,info,xyz,...}` . This means a TLD is randomly selecting from a list of `.biz`, `.info`, `.xyz` etc to add variance to the generated email addresses. When null or false MailSlurp uses the default behavior of `@mailslurp.com` or custom email address provided by the emailAddress field.
   */
  def createInbox(apiKey: String)(allowTeamAccess: Option[Boolean] = None, description: Option[String] = None, emailAddress: Option[String] = None, expiresAt: Option[OffsetDateTime] = None, expiresIn: Option[Long] = None, favourite: Option[Boolean] = None, name: Option[String] = None, tags: Seq[String], useDomainPool: Option[Boolean] = None
): Request[Either[ResponseError[Exception], Inbox], Nothing] =
    basicRequest
      .method(Method.POST, uri"$baseUrl/inboxes?allowTeamAccess=${ allowTeamAccess }&description=${ description }&emailAddress=${ emailAddress }&expiresAt=${ expiresAt }&expiresIn=${ expiresIn }&favourite=${ favourite }&name=${ name }&tags=${ tags }&useDomainPool=${ useDomainPool }")
      .contentType("application/json")
      .header("x-api-key", apiKey)
      .response(asJson[Inbox])

  /**
   * Additional endpoint that allows inbox creation with request body options. Can be more flexible that other methods for some clients.
   * 
   * Expected answers:
   *   code 201 : Inbox (Created)
   *   code 401 :  (Unauthorized)
   *   code 403 :  (Forbidden)
   *   code 404 :  (Not Found)
   * 
   * Available security schemes:
   *   API_KEY (apiKey)
   * 
   * @param createInboxDto createInboxDto
   */
  def createInboxWithOptions(apiKey: String)(createInboxDto: CreateInboxDto
): Request[Either[ResponseError[Exception], Inbox], Nothing] =
    basicRequest
      .method(Method.POST, uri"$baseUrl/inboxes/withOptions")
      .contentType("application/json")
      .header("x-api-key", apiKey)
      .body(createInboxDto)
      .response(asJson[Inbox])

  /**
   * Permanently delete all inboxes and associated email addresses. This will also delete all emails within the inboxes. Be careful as inboxes cannot be recovered once deleted. Note: deleting inboxes will not impact your usage limits. Monthly inbox creation limits are based on how many inboxes were created in the last 30 days, not how many inboxes you currently have.
   * 
   * Expected answers:
   *   code 204 :  (No Content)
   *   code 401 :  (Unauthorized)
   *   code 403 :  (Forbidden)
   * 
   * Available security schemes:
   *   API_KEY (apiKey)
   */
  def deleteAllInboxes(apiKey: String)(
): Request[Either[ResponseError[Exception], Unit], Nothing] =
    basicRequest
      .method(Method.DELETE, uri"$baseUrl/inboxes")
      .contentType("application/json")
      .header("x-api-key", apiKey)
      .response(asJson[Unit])

  /**
   * Permanently delete an inbox and associated email address as well as all emails within the given inbox. This action cannot be undone. Note: deleting an inbox will not affect your account usage. Monthly inbox usage is based on how many inboxes you create within 30 days, not how many exist at time of request.
   * 
   * Expected answers:
   *   code 204 :  (No Content)
   *   code 401 :  (Unauthorized)
   *   code 403 :  (Forbidden)
   * 
   * Available security schemes:
   *   API_KEY (apiKey)
   * 
   * @param inboxId inboxId
   */
  def deleteInbox(apiKey: String)(inboxId: UUID
): Request[Either[ResponseError[Exception], Unit], Nothing] =
    basicRequest
      .method(Method.DELETE, uri"$baseUrl/inboxes/${inboxId}")
      .contentType("application/json")
      .header("x-api-key", apiKey)
      .response(asJson[Unit])

  /**
   * List inboxes in paginated form. The results are available on the `content` property of the returned object. This method allows for page index (zero based), page size (how many results to return), and a sort direction (based on createdAt time). You Can also filter by whether an inbox is favorited or use email address pattern. This method is the recommended way to query inboxes. The alternative `getInboxes` method returns a full list of inboxes but is limited to 100 results. Results do not include team access inboxes by default. Use organization method to list team inboxes or set `teamAccess` to true.
   * 
   * Expected answers:
   *   code 200 : PageInboxProjection (OK)
   *   code 401 :  (Unauthorized)
   *   code 403 :  (Forbidden)
   *   code 404 :  (Not Found)
   * 
   * Available security schemes:
   *   API_KEY (apiKey)
   * 
   * @param favourite Optionally filter results for favourites only
   * @param page Optional page index in inbox list pagination
   * @param search Optionally filter by search words partial matching ID, tags, name, and email address
   * @param size Optional page size in inbox list pagination
   * @param sort Optional createdAt sort direction ASC or DESC
   * @param tag Optionally filter by tags. Will return inboxes that include given tags
   * @param teamAccess Optionally filter by team access. Defaults to false so organization inboxes are not included
   */
  def getAllInboxes(apiKey: String)(favourite: Option[Boolean] = None, page: Option[Int] = None, search: Option[String] = None, size: Option[Int] = None, sort: Option[String] = None, tag: Option[String] = None, teamAccess: Option[Boolean] = None
): Request[Either[ResponseError[Exception], PageInboxProjection], Nothing] =
    basicRequest
      .method(Method.GET, uri"$baseUrl/inboxes/paginated?favourite=${ favourite }&page=${ page }&search=${ search }&size=${ size }&sort=${ sort }&tag=${ tag }&teamAccess=${ teamAccess }")
      .contentType("application/json")
      .header("x-api-key", apiKey)
      .response(asJson[PageInboxProjection])

  /**
   * List emails that an inbox has received. Only emails that are sent to the inbox's email address will appear in the inbox. It may take several seconds for any email you send to an inbox's email address to appear in the inbox. To make this endpoint wait for a minimum number of emails use the `minCount` parameter. The server will retry the inbox database until the `minCount` is satisfied or the `retryTimeout` is reached
   * 
   * Expected answers:
   *   code 200 : Seq[EmailPreview] (OK)
   *   code 401 :  (Unauthorized)
   *   code 403 :  (Forbidden)
   *   code 404 :  (Not Found)
   * 
   * Available security schemes:
   *   API_KEY (apiKey)
   * 
   * @param inboxId Id of inbox that emails belongs to
   * @param limit Limit the result set, ordered by received date time sort direction. Maximum 100. For more listing options see the email controller
   * @param minCount Minimum acceptable email count. Will cause request to hang (and retry) until minCount is satisfied or retryTimeout is reached.
   * @param retryTimeout Maximum milliseconds to spend retrying inbox database until minCount emails are returned
   * @param since Exclude emails received before this ISO 8601 date time
   * @param size Alias for limit. Assessed first before assessing any passed limit.
   * @param sort Sort the results by received date and direction ASC or DESC
   */
  def getEmails(apiKey: String)(inboxId: UUID, limit: Option[Int] = None, minCount: Option[Long] = None, retryTimeout: Option[Long] = None, since: Option[OffsetDateTime] = None, size: Option[Int] = None, sort: Option[String] = None
): Request[Either[ResponseError[Exception], Seq[EmailPreview]], Nothing] =
    basicRequest
      .method(Method.GET, uri"$baseUrl/inboxes/${inboxId}/emails?limit=${ limit }&minCount=${ minCount }&retryTimeout=${ retryTimeout }&since=${ since }&size=${ size }&sort=${ sort }")
      .contentType("application/json")
      .header("x-api-key", apiKey)
      .response(asJson[Seq[EmailPreview]])

  /**
   * Returns an inbox's properties, including its email address and ID.
   * 
   * Expected answers:
   *   code 200 : Inbox (OK)
   *   code 401 :  (Unauthorized)
   *   code 403 :  (Forbidden)
   *   code 404 :  (Not Found)
   * 
   * Available security schemes:
   *   API_KEY (apiKey)
   * 
   * @param inboxId inboxId
   */
  def getInbox(apiKey: String)(inboxId: UUID
): Request[Either[ResponseError[Exception], Inbox], Nothing] =
    basicRequest
      .method(Method.GET, uri"$baseUrl/inboxes/${inboxId}")
      .contentType("application/json")
      .header("x-api-key", apiKey)
      .response(asJson[Inbox])

  /**
   * Get a paginated list of emails in an inbox. Does not hold connections open.
   * 
   * Expected answers:
   *   code 200 : PageEmailPreview (OK)
   *   code 401 :  (Unauthorized)
   *   code 403 :  (Forbidden)
   *   code 404 :  (Not Found)
   * 
   * Available security schemes:
   *   API_KEY (apiKey)
   * 
   * @param inboxId Id of inbox that emails belongs to
   * @param page Optional page index in inbox emails list pagination
   * @param size Optional page size in inbox emails list pagination
   * @param sort Optional createdAt sort direction ASC or DESC
   */
  def getInboxEmailsPaginated(apiKey: String)(inboxId: UUID, page: Option[Int] = None, size: Option[Int] = None, sort: Option[String] = None
): Request[Either[ResponseError[Exception], PageEmailPreview], Nothing] =
    basicRequest
      .method(Method.GET, uri"$baseUrl/inboxes/${inboxId}/emails/paginated?page=${ page }&size=${ size }&sort=${ sort }")
      .contentType("application/json")
      .header("x-api-key", apiKey)
      .response(asJson[PageEmailPreview])

  /**
   * Returns an inbox's sent email receipts. Call individual sent email endpoints for more details. Note for privacy reasons the full body of sent emails is never stored. An MD5 hash hex is available for comparison instead.
   * 
   * Expected answers:
   *   code 200 : PageSentEmailProjection (OK)
   *   code 401 :  (Unauthorized)
   *   code 403 :  (Forbidden)
   *   code 404 :  (Not Found)
   * 
   * Available security schemes:
   *   API_KEY (apiKey)
   * 
   * @param inboxId inboxId
   * @param page Optional page index in inbox sent email list pagination
   * @param size Optional page size in inbox sent email list pagination
   * @param sort Optional createdAt sort direction ASC or DESC
   */
  def getInboxSentEmails(apiKey: String)(inboxId: UUID, page: Option[Int] = None, size: Option[Int] = None, sort: Option[String] = None
): Request[Either[ResponseError[Exception], PageSentEmailProjection], Nothing] =
    basicRequest
      .method(Method.GET, uri"$baseUrl/inboxes/${inboxId}/sent?page=${ page }&size=${ size }&sort=${ sort }")
      .contentType("application/json")
      .header("x-api-key", apiKey)
      .response(asJson[PageSentEmailProjection])

  /**
   * Get all inbox tags
   * 
   * Expected answers:
   *   code 200 : Seq[String] (OK)
   *   code 401 :  (Unauthorized)
   *   code 403 :  (Forbidden)
   *   code 404 :  (Not Found)
   * 
   * Available security schemes:
   *   API_KEY (apiKey)
   */
  def getInboxTags(apiKey: String)(
): Request[Either[ResponseError[Exception], Seq[String]], Nothing] =
    basicRequest
      .method(Method.GET, uri"$baseUrl/inboxes/tags")
      .contentType("application/json")
      .header("x-api-key", apiKey)
      .response(asJson[Seq[String]])

  /**
   * List the inboxes you have created. Note use of the more advanced `getAllEmails` is recommended. You can provide a limit and sort parameter.
   * 
   * Expected answers:
   *   code 200 : Seq[Inbox] (OK)
   *   code 401 :  (Unauthorized)
   *   code 403 :  (Forbidden)
   *   code 404 :  (Not Found)
   * 
   * Available security schemes:
   *   API_KEY (apiKey)
   * 
   * @param size Optional result size limit. Note an automatic limit of 100 results is applied. See the paginated `getAllEmails` for larger queries.
   * @param sort Optional createdAt sort direction ASC or DESC
   */
  def getInboxes(apiKey: String)(size: Option[Int] = None, sort: Option[String] = None
): Request[Either[ResponseError[Exception], Seq[Inbox]], Nothing] =
    basicRequest
      .method(Method.GET, uri"$baseUrl/inboxes?size=${ size }&sort=${ sort }")
      .contentType("application/json")
      .header("x-api-key", apiKey)
      .response(asJson[Seq[Inbox]])

  /**
   * List organization inboxes in paginated form. These are inboxes created with `allowTeamAccess` flag enabled. Organization inboxes are `readOnly` for non-admin users. The results are available on the `content` property of the returned object. This method allows for page index (zero based), page size (how many results to return), and a sort direction (based on createdAt time). 
   * 
   * Expected answers:
   *   code 200 : PageOrganizationInboxProjection (OK)
   *   code 401 :  (Unauthorized)
   *   code 403 :  (Forbidden)
   *   code 404 :  (Not Found)
   * 
   * Available security schemes:
   *   API_KEY (apiKey)
   * 
   * @param page Optional page index in inbox list pagination
   * @param size Optional page size in inbox list pagination
   * @param sort Optional createdAt sort direction ASC or DESC
   */
  def getOrganizationInboxes(apiKey: String)(page: Option[Int] = None, size: Option[Int] = None, sort: Option[String] = None
): Request[Either[ResponseError[Exception], PageOrganizationInboxProjection], Nothing] =
    basicRequest
      .method(Method.GET, uri"$baseUrl/inboxes/organization?page=${ page }&size=${ size }&sort=${ sort }")
      .contentType("application/json")
      .header("x-api-key", apiKey)
      .response(asJson[PageOrganizationInboxProjection])

  /**
   * Send an email from an inbox's email address.  The request body should contain the `SendEmailOptions` that include recipients, attachments, body etc. See `SendEmailOptions` for all available properties. Note the `inboxId` refers to the inbox's id not the inbox's email address. See https://www.mailslurp.com/guides/ for more information on how to send emails. This method does not return a sent email entity due to legacy reasons. To send and get a sent email as returned response use the sister method `sendEmailAndConfirm`.
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
   * @param inboxId ID of the inbox you want to send the email from
   * @param sendEmailOptions Options for the email
   */
  def sendEmail(apiKey: String)(inboxId: UUID, sendEmailOptions: Option[SendEmailOptions] = None
): Request[Either[ResponseError[Exception], Unit], Nothing] =
    basicRequest
      .method(Method.POST, uri"$baseUrl/inboxes/${inboxId}")
      .contentType("application/json")
      .header("x-api-key", apiKey)
      .body(sendEmailOptions)
      .response(asJson[Unit])

  /**
   * Sister method for standard `sendEmail` method with the benefit of returning a `SentEmail` entity confirming the successful sending of the email with link the the sent object created for it.
   * 
   * Expected answers:
   *   code 201 : SentEmailDto (Created)
   *   code 401 :  (Unauthorized)
   *   code 403 :  (Forbidden)
   *   code 404 :  (Not Found)
   * 
   * Available security schemes:
   *   API_KEY (apiKey)
   * 
   * @param inboxId ID of the inbox you want to send the email from
   * @param sendEmailOptions Options for the email
   */
  def sendEmailAndConfirm(apiKey: String)(inboxId: UUID, sendEmailOptions: Option[SendEmailOptions] = None
): Request[Either[ResponseError[Exception], SentEmailDto], Nothing] =
    basicRequest
      .method(Method.POST, uri"$baseUrl/inboxes/${inboxId}/confirm")
      .contentType("application/json")
      .header("x-api-key", apiKey)
      .body(sendEmailOptions)
      .response(asJson[SentEmailDto])

  /**
   * Set and return new favourite state for an inbox
   * 
   * Expected answers:
   *   code 200 : Inbox (OK)
   *   code 201 :  (Created)
   *   code 401 :  (Unauthorized)
   *   code 403 :  (Forbidden)
   *   code 404 :  (Not Found)
   * 
   * Available security schemes:
   *   API_KEY (apiKey)
   * 
   * @param inboxId inboxId
   * @param setInboxFavouritedOptions setInboxFavouritedOptions
   */
  def setInboxFavourited(apiKey: String)(inboxId: UUID, setInboxFavouritedOptions: SetInboxFavouritedOptions
): Request[Either[ResponseError[Exception], Inbox], Nothing] =
    basicRequest
      .method(Method.PUT, uri"$baseUrl/inboxes/${inboxId}/favourite")
      .contentType("application/json")
      .header("x-api-key", apiKey)
      .body(setInboxFavouritedOptions)
      .response(asJson[Inbox])

  /**
   * Update editable fields on an inbox
   * 
   * Expected answers:
   *   code 200 : Inbox (OK)
   *   code 204 :  (No Content)
   *   code 401 :  (Unauthorized)
   *   code 403 :  (Forbidden)
   * 
   * Available security schemes:
   *   API_KEY (apiKey)
   * 
   * @param inboxId inboxId
   * @param updateInboxOptions updateInboxOptions
   */
  def updateInbox(apiKey: String)(inboxId: UUID, updateInboxOptions: UpdateInboxOptions
): Request[Either[ResponseError[Exception], Inbox], Nothing] =
    basicRequest
      .method(Method.PATCH, uri"$baseUrl/inboxes/${inboxId}")
      .contentType("application/json")
      .header("x-api-key", apiKey)
      .body(updateInboxOptions)
      .response(asJson[Inbox])

}
