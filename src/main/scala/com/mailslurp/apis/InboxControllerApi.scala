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

import com.mailslurp.modelspackageVersion&#x3D;15.13.19.CountDto
import com.mailslurp.modelspackageVersion&#x3D;15.13.19.CreateInboxDto
import com.mailslurp.modelspackageVersion&#x3D;15.13.19.CreateInboxRulesetOptions
import com.mailslurp.modelspackageVersion&#x3D;15.13.19.Email
import com.mailslurp.modelspackageVersion&#x3D;15.13.19.EmailPreview
import com.mailslurp.modelspackageVersion&#x3D;15.13.19.FlushExpiredInboxesResult
import com.mailslurp.modelspackageVersion&#x3D;15.13.19.ImapSmtpAccessDetails
import com.mailslurp.modelspackageVersion&#x3D;15.13.19.InboxByEmailAddressResult
import com.mailslurp.modelspackageVersion&#x3D;15.13.19.InboxByNameResult
import com.mailslurp.modelspackageVersion&#x3D;15.13.19.InboxDto
import com.mailslurp.modelspackageVersion&#x3D;15.13.19.InboxExistsDto
import com.mailslurp.modelspackageVersion&#x3D;15.13.19.InboxIdsResult
import com.mailslurp.modelspackageVersion&#x3D;15.13.19.InboxRulesetDto
import java.time.OffsetDateTime
import com.mailslurp.modelspackageVersion&#x3D;15.13.19.PageDeliveryStatus
import com.mailslurp.modelspackageVersion&#x3D;15.13.19.PageEmailPreview
import com.mailslurp.modelspackageVersion&#x3D;15.13.19.PageInboxProjection
import com.mailslurp.modelspackageVersion&#x3D;15.13.19.PageInboxRulesetDto
import com.mailslurp.modelspackageVersion&#x3D;15.13.19.PageOrganizationInboxProjection
import com.mailslurp.modelspackageVersion&#x3D;15.13.19.PageSentEmailProjection
import com.mailslurp.modelspackageVersion&#x3D;15.13.19.PageTrackingPixelProjection
import com.mailslurp.modelspackageVersion&#x3D;15.13.19.SendEmailOptions
import com.mailslurp.modelspackageVersion&#x3D;15.13.19.SendSMTPEnvelopeOptions
import com.mailslurp.modelspackageVersion&#x3D;15.13.19.SentEmailDto
import com.mailslurp.modelspackageVersion&#x3D;15.13.19.SetInboxFavouritedOptions
import java.util.UUID
import com.mailslurp.modelspackageVersion&#x3D;15.13.19.UpdateInboxOptions
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
   *   code 201 : InboxDto (Created)
   * 
   * Available security schemes:
   *   API_KEY (apiKey)
   * 
   * @param emailAddress A custom email address to use with the inbox. Defaults to null. When null MailSlurp will assign a random email address to the inbox such as `123@mailslurp.com`. If you use the `useDomainPool` option when the email address is null it will generate an email address with a more varied domain ending such as `123@mailslurp.info` or `123@mailslurp.biz`. When a custom email address is provided the address is split into a domain and the domain is queried against your user. If you have created the domain in the MailSlurp dashboard and verified it you can use any email address that ends with the domain. Note domain types must match the inbox type - so `SMTP` inboxes will only work with `SMTP` type domains. Avoid `SMTP` inboxes if you need to send emails as they can only receive. Send an email to this address and the inbox will receive and store it for you. To retrieve the email use the Inbox and Email Controller endpoints with the inbox ID.
   * @param tags Tags that inbox has been tagged with. Tags can be added to inboxes to group different inboxes within an account. You can also search for inboxes by tag in the dashboard UI.
   * @param name Optional name of the inbox. Displayed in the dashboard for easier search and used as the sender name when sending emails.
   * @param description Optional description of the inbox for labelling purposes. Is shown in the dashboard and can be used with
   * @param useDomainPool Use the MailSlurp domain name pool with this inbox when creating the email address. Defaults to null. If enabled the inbox will be an email address with a domain randomly chosen from a list of the MailSlurp domains. This is useful when the default `@mailslurp.com` email addresses used with inboxes are blocked or considered spam by a provider or receiving service. When domain pool is enabled an email address will be generated ending in `@mailslurp.{world,info,xyz,...}` . This means a TLD is randomly selecting from a list of `.biz`, `.info`, `.xyz` etc to add variance to the generated email addresses. When null or false MailSlurp uses the default behavior of `@mailslurp.com` or custom email address provided by the emailAddress field. Note this feature is only available for `HTTP` inbox types.
   * @param favourite Is the inbox a favorite. Marking an inbox as a favorite is typically done in the dashboard for quick access or filtering
   * @param expiresAt Optional inbox expiration date. If null then this inbox is permanent and the emails in it won't be deleted. If an expiration date is provided or is required by your plan the inbox will be closed when the expiration time is reached. Expired inboxes still contain their emails but can no longer send or receive emails. An ExpiredInboxRecord is created when an inbox and the email address and inbox ID are recorded. The expiresAt property is a timestamp string in ISO DateTime Format yyyy-MM-dd'T'HH:mm:ss.SSSXXX.
   * @param expiresIn Number of milliseconds that inbox should exist for
   * @param allowTeamAccess DEPRECATED (team access is always true). Grant team access to this inbox and the emails that belong to it for team members of your organization.
   * @param inboxType HTTP (default) or SMTP inbox type. HTTP inboxes are default and best solution for most cases. SMTP inboxes are more reliable for public inbound email consumption (but do not support sending emails). When using custom domains the domain type must match the inbox type. HTTP inboxes are processed by AWS SES while SMTP inboxes use a custom mail server running at `mx.mailslurp.com`.
   * @param virtualInbox Virtual inbox prevents any outbound emails from being sent. It creates sent email records but will never send real emails to recipients. Great for testing and faking email sending.
   */
  def createInbox(apiKey: String)(emailAddress: Option[String] = None, tags: Seq[String], name: Option[String] = None, description: Option[String] = None, useDomainPool: Option[Boolean] = None, favourite: Option[Boolean] = None, expiresAt: Option[OffsetDateTime] = None, expiresIn: Option[Long] = None, allowTeamAccess: Option[Boolean] = None, inboxType: Option[String] = None, virtualInbox: Option[Boolean] = None
): Request[Either[ResponseError[Exception], InboxDto], Nothing] =
    basicRequest
      .method(Method.POST, uri"$baseUrl/inboxes?emailAddress=${ emailAddress }&tags=${ tags }&name=${ name }&description=${ description }&useDomainPool=${ useDomainPool }&favourite=${ favourite }&expiresAt=${ expiresAt }&expiresIn=${ expiresIn }&allowTeamAccess=${ allowTeamAccess }&inboxType=${ inboxType }&virtualInbox=${ virtualInbox }")
      .contentType("application/json")
      .header("x-api-key", apiKey)
      .response(asJson[InboxDto])

  /**
   * Create a new inbox rule for forwarding, blocking, and allowing emails when sending and receiving
   * 
   * Expected answers:
   *   code 200 : InboxRulesetDto (OK)
   * 
   * Available security schemes:
   *   API_KEY (apiKey)
   * 
   * @param inboxId inboxId
   * @param createInboxRulesetOptions 
   */
  def createInboxRuleset(apiKey: String)(inboxId: UUID, createInboxRulesetOptions: CreateInboxRulesetOptions
): Request[Either[ResponseError[Exception], InboxRulesetDto], Nothing] =
    basicRequest
      .method(Method.POST, uri"$baseUrl/inboxes/${inboxId}/rulesets")
      .contentType("application/json")
      .header("x-api-key", apiKey)
      .body(createInboxRulesetOptions)
      .response(asJson[InboxRulesetDto])

  /**
   * Expected answers:
   *   code 201 : InboxDto (Created)
   * 
   * Available security schemes:
   *   API_KEY (apiKey)
   */
  def createInboxWithDefaults(apiKey: String)(
): Request[Either[ResponseError[Exception], InboxDto], Nothing] =
    basicRequest
      .method(Method.POST, uri"$baseUrl/inboxes/withDefaults")
      .contentType("application/json")
      .header("x-api-key", apiKey)
      .response(asJson[InboxDto])

  /**
   * Additional endpoint that allows inbox creation with request body options. Can be more flexible that other methods for some clients.
   * 
   * Expected answers:
   *   code 201 : InboxDto (Created)
   * 
   * Available security schemes:
   *   API_KEY (apiKey)
   * 
   * @param createInboxDto 
   */
  def createInboxWithOptions(apiKey: String)(createInboxDto: CreateInboxDto
): Request[Either[ResponseError[Exception], InboxDto], Nothing] =
    basicRequest
      .method(Method.POST, uri"$baseUrl/inboxes/withOptions")
      .contentType("application/json")
      .header("x-api-key", apiKey)
      .body(createInboxDto)
      .response(asJson[InboxDto])

  /**
   * Deletes all emails in an inbox. Be careful as emails cannot be recovered
   * 
   * Expected answers:
   *   code 204 :  (No Content)
   * 
   * Available security schemes:
   *   API_KEY (apiKey)
   * 
   * @param inboxId 
   */
  def deleteAllInboxEmails(apiKey: String)(inboxId: UUID
): Request[Either[ResponseError[Exception], Unit], Nothing] =
    basicRequest
      .method(Method.DELETE, uri"$baseUrl/inboxes/${inboxId}/deleteAllInboxEmails")
      .contentType("application/json")
      .header("x-api-key", apiKey)
      .response(asJson[Unit])

  /**
   * Permanently delete all inboxes and associated email addresses. This will also delete all emails within the inboxes. Be careful as inboxes cannot be recovered once deleted. Note: deleting inboxes will not impact your usage limits. Monthly inbox creation limits are based on how many inboxes were created in the last 30 days, not how many inboxes you currently have.
   * 
   * Expected answers:
   *   code 204 :  (No Content)
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
   * 
   * Available security schemes:
   *   API_KEY (apiKey)
   * 
   * @param inboxId 
   */
  def deleteInbox(apiKey: String)(inboxId: UUID
): Request[Either[ResponseError[Exception], Unit], Nothing] =
    basicRequest
      .method(Method.DELETE, uri"$baseUrl/inboxes/${inboxId}")
      .contentType("application/json")
      .header("x-api-key", apiKey)
      .response(asJson[Unit])

  /**
   * Check if inboxes exist by email address. Useful if you are sending emails to mailslurp addresses
   * 
   * Expected answers:
   *   code 200 : InboxExistsDto (OK)
   * 
   * Available security schemes:
   *   API_KEY (apiKey)
   * 
   * @param emailAddress Email address
   */
  def doesInboxExist(apiKey: String)(emailAddress: String
): Request[Either[ResponseError[Exception], InboxExistsDto], Nothing] =
    basicRequest
      .method(Method.GET, uri"$baseUrl/inboxes/exists?emailAddress=${ emailAddress }")
      .contentType("application/json")
      .header("x-api-key", apiKey)
      .response(asJson[InboxExistsDto])

  /**
   * Remove any expired inboxes for your account (instead of waiting for scheduled removal on server)
   * 
   * Expected answers:
   *   code 200 : FlushExpiredInboxesResult (OK)
   * 
   * Available security schemes:
   *   API_KEY (apiKey)
   * 
   * @param before Optional expired at before flag to flush expired inboxes that have expired before the given time
   */
  def flushExpired(apiKey: String)(before: Option[OffsetDateTime] = None
): Request[Either[ResponseError[Exception], FlushExpiredInboxesResult], Nothing] =
    basicRequest
      .method(Method.DELETE, uri"$baseUrl/inboxes/expired?before=${ before }")
      .contentType("application/json")
      .header("x-api-key", apiKey)
      .response(asJson[FlushExpiredInboxesResult])

  /**
   * List inboxes in paginated form. The results are available on the `content` property of the returned object. This method allows for page index (zero based), page size (how many results to return), and a sort direction (based on createdAt time). You Can also filter by whether an inbox is favorited or use email address pattern. This method is the recommended way to query inboxes. The alternative `getInboxes` method returns a full list of inboxes but is limited to 100 results.
   * 
   * Expected answers:
   *   code 200 : PageInboxProjection (OK)
   * 
   * Available security schemes:
   *   API_KEY (apiKey)
   * 
   * @param page Optional page index in list pagination
   * @param size Optional page size in list pagination
   * @param sort Optional createdAt sort direction ASC or DESC
   * @param favourite Optionally filter results for favourites only
   * @param search Optionally filter by search words partial matching ID, tags, name, and email address
   * @param tag Optionally filter by tags. Will return inboxes that include given tags
   * @param teamAccess DEPRECATED. Optionally filter by team access.
   * @param since Optional filter by created after given date time
   * @param before Optional filter by created before given date time
   * @param inboxType Optional filter by inbox type
   * @param domainId Optional domain ID filter
   */
  def getAllInboxes(apiKey: String)(page: Option[Int] = None, size: Option[Int] = None, sort: Option[String] = None, favourite: Option[Boolean] = None, search: Option[String] = None, tag: Option[String] = None, teamAccess: Option[Boolean] = None, since: Option[OffsetDateTime] = None, before: Option[OffsetDateTime] = None, inboxType: Option[String] = None, domainId: Option[UUID] = None
): Request[Either[ResponseError[Exception], PageInboxProjection], Nothing] =
    basicRequest
      .method(Method.GET, uri"$baseUrl/inboxes/paginated?page=${ page }&size=${ size }&sort=${ sort }&favourite=${ favourite }&search=${ search }&tag=${ tag }&teamAccess=${ teamAccess }&since=${ since }&before=${ before }&inboxType=${ inboxType }&domainId=${ domainId }")
      .contentType("application/json")
      .header("x-api-key", apiKey)
      .response(asJson[PageInboxProjection])

  /**
   * Get all email delivery statuses for an inbox
   * 
   * Expected answers:
   *   code 200 : PageDeliveryStatus (OK)
   * 
   * Available security schemes:
   *   API_KEY (apiKey)
   * 
   * @param inboxId 
   * @param page Optional page index in delivery status list pagination
   * @param size Optional page size in delivery status list pagination
   * @param sort Optional createdAt sort direction ASC or DESC
   * @param since Filter by created at after the given timestamp
   * @param before Filter by created at before the given timestamp
   */
  def getDeliveryStatusesByInboxId(apiKey: String)(inboxId: UUID, page: Option[Int] = None, size: Option[Int] = None, sort: Option[String] = None, since: Option[OffsetDateTime] = None, before: Option[OffsetDateTime] = None
): Request[Either[ResponseError[Exception], PageDeliveryStatus], Nothing] =
    basicRequest
      .method(Method.GET, uri"$baseUrl/inboxes/${inboxId}/delivery-status?page=${ page }&size=${ size }&sort=${ sort }&since=${ since }&before=${ before }")
      .contentType("application/json")
      .header("x-api-key", apiKey)
      .response(asJson[PageDeliveryStatus])

  /**
   * List emails that an inbox has received. Only emails that are sent to the inbox's email address will appear in the inbox. It may take several seconds for any email you send to an inbox's email address to appear in the inbox. To make this endpoint wait for a minimum number of emails use the `minCount` parameter. The server will retry the inbox database until the `minCount` is satisfied or the `retryTimeout` is reached
   * 
   * Expected answers:
   *   code 200 : Seq[EmailPreview] (OK)
   * 
   * Available security schemes:
   *   API_KEY (apiKey)
   * 
   * @param inboxId Id of inbox that emails belongs to
   * @param size Alias for limit. Assessed first before assessing any passed limit.
   * @param limit Limit the result set, ordered by received date time sort direction. Maximum 100. For more listing options see the email controller
   * @param sort Sort the results by received date and direction ASC or DESC
   * @param retryTimeout Maximum milliseconds to spend retrying inbox database until minCount emails are returned
   * @param delayTimeout 
   * @param minCount Minimum acceptable email count. Will cause request to hang (and retry) until minCount is satisfied or retryTimeout is reached.
   * @param unreadOnly 
   * @param before Exclude emails received after this ISO 8601 date time
   * @param since Exclude emails received before this ISO 8601 date time
   */
  def getEmails(apiKey: String)(inboxId: UUID, size: Option[Int] = None, limit: Option[Int] = None, sort: Option[String] = None, retryTimeout: Option[Long] = None, delayTimeout: Option[Long] = None, minCount: Option[Long] = None, unreadOnly: Option[Boolean] = None, before: Option[OffsetDateTime] = None, since: Option[OffsetDateTime] = None
): Request[Either[ResponseError[Exception], Seq[EmailPreview]], Nothing] =
    basicRequest
      .method(Method.GET, uri"$baseUrl/inboxes/${inboxId}/emails?size=${ size }&limit=${ limit }&sort=${ sort }&retryTimeout=${ retryTimeout }&delayTimeout=${ delayTimeout }&minCount=${ minCount }&unreadOnly=${ unreadOnly }&before=${ before }&since=${ since }")
      .contentType("application/json")
      .header("x-api-key", apiKey)
      .response(asJson[Seq[EmailPreview]])

  /**
   * Get IMAP and SMTP access usernames and passwords
   * 
   * Expected answers:
   *   code 200 : ImapSmtpAccessDetails (OK)
   * 
   * Available security schemes:
   *   API_KEY (apiKey)
   * 
   * @param inboxId Inbox ID
   */
  def getImapSmtpAccess(apiKey: String)(inboxId: Option[UUID] = None
): Request[Either[ResponseError[Exception], ImapSmtpAccessDetails], Nothing] =
    basicRequest
      .method(Method.GET, uri"$baseUrl/inboxes/imap-smtp-access?inboxId=${ inboxId }")
      .contentType("application/json")
      .header("x-api-key", apiKey)
      .response(asJson[ImapSmtpAccessDetails])

  /**
   * Returns an inbox's properties, including its email address and ID.
   * 
   * Expected answers:
   *   code 200 : InboxDto (OK)
   * 
   * Available security schemes:
   *   API_KEY (apiKey)
   * 
   * @param inboxId 
   */
  def getInbox(apiKey: String)(inboxId: UUID
): Request[Either[ResponseError[Exception], InboxDto], Nothing] =
    basicRequest
      .method(Method.GET, uri"$baseUrl/inboxes/${inboxId}")
      .contentType("application/json")
      .header("x-api-key", apiKey)
      .response(asJson[InboxDto])

  /**
   * Get a inbox result by email address
   * 
   * Expected answers:
   *   code 200 : InboxByEmailAddressResult (OK)
   * 
   * Available security schemes:
   *   API_KEY (apiKey)
   * 
   * @param emailAddress 
   */
  def getInboxByEmailAddress(apiKey: String)(emailAddress: String
): Request[Either[ResponseError[Exception], InboxByEmailAddressResult], Nothing] =
    basicRequest
      .method(Method.GET, uri"$baseUrl/inboxes/byEmailAddress?emailAddress=${ emailAddress }")
      .contentType("application/json")
      .header("x-api-key", apiKey)
      .response(asJson[InboxByEmailAddressResult])

  /**
   * Get a inbox result by name
   * 
   * Expected answers:
   *   code 200 : InboxByNameResult (OK)
   * 
   * Available security schemes:
   *   API_KEY (apiKey)
   * 
   * @param name 
   */
  def getInboxByName(apiKey: String)(name: String
): Request[Either[ResponseError[Exception], InboxByNameResult], Nothing] =
    basicRequest
      .method(Method.GET, uri"$baseUrl/inboxes/byName?name=${ name }")
      .contentType("application/json")
      .header("x-api-key", apiKey)
      .response(asJson[InboxByNameResult])

  /**
   * Expected answers:
   *   code 200 : CountDto (OK)
   * 
   * Available security schemes:
   *   API_KEY (apiKey)
   */
  def getInboxCount(apiKey: String)(
): Request[Either[ResponseError[Exception], CountDto], Nothing] =
    basicRequest
      .method(Method.GET, uri"$baseUrl/inboxes/count")
      .contentType("application/json")
      .header("x-api-key", apiKey)
      .response(asJson[CountDto])

  /**
   * Expected answers:
   *   code 200 : CountDto (OK)
   * 
   * Available security schemes:
   *   API_KEY (apiKey)
   * 
   * @param inboxId Id of inbox that emails belongs to
   */
  def getInboxEmailCount(apiKey: String)(inboxId: UUID
): Request[Either[ResponseError[Exception], CountDto], Nothing] =
    basicRequest
      .method(Method.GET, uri"$baseUrl/inboxes/${inboxId}/emails/count")
      .contentType("application/json")
      .header("x-api-key", apiKey)
      .response(asJson[CountDto])

  /**
   * Get a paginated list of emails in an inbox. Does not hold connections open.
   * 
   * Expected answers:
   *   code 200 : PageEmailPreview (OK)
   * 
   * Available security schemes:
   *   API_KEY (apiKey)
   * 
   * @param inboxId Id of inbox that emails belongs to
   * @param page Optional page index in inbox emails list pagination
   * @param size Optional page size in inbox emails list pagination
   * @param sort Optional createdAt sort direction ASC or DESC
   * @param since Optional filter by received after given date time
   * @param before Optional filter by received before given date time
   */
  def getInboxEmailsPaginated(apiKey: String)(inboxId: UUID, page: Option[Int] = None, size: Option[Int] = None, sort: Option[String] = None, since: Option[OffsetDateTime] = None, before: Option[OffsetDateTime] = None
): Request[Either[ResponseError[Exception], PageEmailPreview], Nothing] =
    basicRequest
      .method(Method.GET, uri"$baseUrl/inboxes/${inboxId}/emails/paginated?page=${ page }&size=${ size }&sort=${ sort }&since=${ since }&before=${ before }")
      .contentType("application/json")
      .header("x-api-key", apiKey)
      .response(asJson[PageEmailPreview])

  /**
   * Get list of inbox IDs
   * 
   * Expected answers:
   *   code 200 : InboxIdsResult (OK)
   * 
   * Available security schemes:
   *   API_KEY (apiKey)
   */
  def getInboxIds(apiKey: String)(
): Request[Either[ResponseError[Exception], InboxIdsResult], Nothing] =
    basicRequest
      .method(Method.GET, uri"$baseUrl/inboxes/ids")
      .contentType("application/json")
      .header("x-api-key", apiKey)
      .response(asJson[InboxIdsResult])

  /**
   * Returns an inbox's sent email receipts. Call individual sent email endpoints for more details. Note for privacy reasons the full body of sent emails is never stored. An MD5 hash hex is available for comparison instead.
   * 
   * Expected answers:
   *   code 200 : PageSentEmailProjection (OK)
   * 
   * Available security schemes:
   *   API_KEY (apiKey)
   * 
   * @param inboxId 
   * @param page Optional page index in inbox sent email list pagination
   * @param size Optional page size in inbox sent email list pagination
   * @param sort Optional createdAt sort direction ASC or DESC
   * @param searchFilter Optional sent email search
   * @param since Optional filter by sent after given date time
   * @param before Optional filter by sent before given date time
   */
  def getInboxSentEmails(apiKey: String)(inboxId: UUID, page: Option[Int] = None, size: Option[Int] = None, sort: Option[String] = None, searchFilter: Option[String] = None, since: Option[OffsetDateTime] = None, before: Option[OffsetDateTime] = None
): Request[Either[ResponseError[Exception], PageSentEmailProjection], Nothing] =
    basicRequest
      .method(Method.GET, uri"$baseUrl/inboxes/${inboxId}/sent?page=${ page }&size=${ size }&sort=${ sort }&searchFilter=${ searchFilter }&since=${ since }&before=${ before }")
      .contentType("application/json")
      .header("x-api-key", apiKey)
      .response(asJson[PageSentEmailProjection])

  /**
   * Get all inbox tags
   * 
   * Expected answers:
   *   code 200 : Seq[String] (OK)
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
   * List the inboxes you have created. Note use of the more advanced `getAllInboxes` is recommended and allows paginated access using a limit and sort parameter.
   * 
   * Expected answers:
   *   code 200 : Seq[InboxDto] (OK)
   * 
   * Available security schemes:
   *   API_KEY (apiKey)
   * 
   * @param size Optional result size limit. Note an automatic limit of 100 results is applied. See the paginated `getAllEmails` for larger queries.
   * @param sort Optional createdAt sort direction ASC or DESC
   * @param since Optional filter by created after given date time
   * @param before Optional filter by created before given date time
   */
  def getInboxes(apiKey: String)(size: Option[Int] = None, sort: Option[String] = None, since: Option[OffsetDateTime] = None, before: Option[OffsetDateTime] = None
): Request[Either[ResponseError[Exception], Seq[InboxDto]], Nothing] =
    basicRequest
      .method(Method.GET, uri"$baseUrl/inboxes?size=${ size }&sort=${ sort }&since=${ since }&before=${ before }")
      .contentType("application/json")
      .header("x-api-key", apiKey)
      .response(asJson[Seq[InboxDto]])

  /**
   * Get the newest email in an inbox or wait for one to arrive
   * 
   * Expected answers:
   *   code 200 : Email (OK)
   * 
   * Available security schemes:
   *   API_KEY (apiKey)
   * 
   * @param inboxId ID of the inbox you want to get the latest email from
   * @param timeoutMillis Timeout milliseconds to wait for latest email
   */
  def getLatestEmailInInbox(apiKey: String)(inboxId: UUID, timeoutMillis: Long
): Request[Either[ResponseError[Exception], Email], Nothing] =
    basicRequest
      .method(Method.GET, uri"$baseUrl/inboxes/getLatestEmail?inboxId=${ inboxId }&timeoutMillis=${ timeoutMillis }")
      .contentType("application/json")
      .header("x-api-key", apiKey)
      .response(asJson[Email])

  /**
   * List organization inboxes in paginated form. These are inboxes created with `allowTeamAccess` flag enabled. Organization inboxes are `readOnly` for non-admin users. The results are available on the `content` property of the returned object. This method allows for page index (zero based), page size (how many results to return), and a sort direction (based on createdAt time). 
   * 
   * Expected answers:
   *   code 200 : PageOrganizationInboxProjection (OK)
   * 
   * Available security schemes:
   *   API_KEY (apiKey)
   * 
   * @param page Optional page index in list pagination
   * @param size Optional page size in list pagination
   * @param sort Optional createdAt sort direction ASC or DESC
   * @param searchFilter Optional search filter
   * @param since Optional filter by created after given date time
   * @param before Optional filter by created before given date time
   */
  def getOrganizationInboxes(apiKey: String)(page: Option[Int] = None, size: Option[Int] = None, sort: Option[String] = None, searchFilter: Option[String] = None, since: Option[OffsetDateTime] = None, before: Option[OffsetDateTime] = None
): Request[Either[ResponseError[Exception], PageOrganizationInboxProjection], Nothing] =
    basicRequest
      .method(Method.GET, uri"$baseUrl/inboxes/organization?page=${ page }&size=${ size }&sort=${ sort }&searchFilter=${ searchFilter }&since=${ since }&before=${ before }")
      .contentType("application/json")
      .header("x-api-key", apiKey)
      .response(asJson[PageOrganizationInboxProjection])

  /**
   * List all rulesets attached to an inbox
   * 
   * Expected answers:
   *   code 200 : PageInboxRulesetDto (OK)
   * 
   * Available security schemes:
   *   API_KEY (apiKey)
   * 
   * @param inboxId 
   * @param page Optional page index in inbox ruleset list pagination
   * @param size Optional page size in inbox ruleset list pagination
   * @param sort Optional createdAt sort direction ASC or DESC
   * @param searchFilter Optional search filter
   * @param since Optional filter by created after given date time
   * @param before Optional filter by created before given date time
   */
  def listInboxRulesets(apiKey: String)(inboxId: UUID, page: Option[Int] = None, size: Option[Int] = None, sort: Option[String] = None, searchFilter: Option[String] = None, since: Option[OffsetDateTime] = None, before: Option[OffsetDateTime] = None
): Request[Either[ResponseError[Exception], PageInboxRulesetDto], Nothing] =
    basicRequest
      .method(Method.GET, uri"$baseUrl/inboxes/${inboxId}/rulesets?page=${ page }&size=${ size }&sort=${ sort }&searchFilter=${ searchFilter }&since=${ since }&before=${ before }")
      .contentType("application/json")
      .header("x-api-key", apiKey)
      .response(asJson[PageInboxRulesetDto])

  /**
   * List all tracking pixels sent from an inbox
   * 
   * Expected answers:
   *   code 200 : PageTrackingPixelProjection (OK)
   * 
   * Available security schemes:
   *   API_KEY (apiKey)
   * 
   * @param inboxId 
   * @param page Optional page index in inbox tracking pixel list pagination
   * @param size Optional page size in inbox tracking pixel list pagination
   * @param sort Optional createdAt sort direction ASC or DESC
   * @param searchFilter Optional search filter
   * @param since Optional filter by created after given date time
   * @param before Optional filter by created before given date time
   */
  def listInboxTrackingPixels(apiKey: String)(inboxId: UUID, page: Option[Int] = None, size: Option[Int] = None, sort: Option[String] = None, searchFilter: Option[String] = None, since: Option[OffsetDateTime] = None, before: Option[OffsetDateTime] = None
): Request[Either[ResponseError[Exception], PageTrackingPixelProjection], Nothing] =
    basicRequest
      .method(Method.GET, uri"$baseUrl/inboxes/${inboxId}/tracking-pixels?page=${ page }&size=${ size }&sort=${ sort }&searchFilter=${ searchFilter }&since=${ since }&before=${ before }")
      .contentType("application/json")
      .header("x-api-key", apiKey)
      .response(asJson[PageTrackingPixelProjection])

  /**
   * Send an email from an inbox's email address.  The request body should contain the `SendEmailOptions` that include recipients, attachments, body etc. See `SendEmailOptions` for all available properties. Note the `inboxId` refers to the inbox's id not the inbox's email address. See https://www.mailslurp.com/guides/ for more information on how to send emails. This method does not return a sent email entity due to legacy reasons. To send and get a sent email as returned response use the sister method `sendEmailAndConfirm`.
   * 
   * Expected answers:
   *   code 201 :  (Created)
   * 
   * Available security schemes:
   *   API_KEY (apiKey)
   * 
   * @param inboxId ID of the inbox you want to send the email from
   * @param sendEmailOptions 
   */
  def sendEmail(apiKey: String)(inboxId: UUID, sendEmailOptions: SendEmailOptions
): Request[Either[ResponseError[Exception], Unit], Nothing] =
    basicRequest
      .method(Method.POST, uri"$baseUrl/inboxes/${inboxId}")
      .contentType("application/json")
      .header("x-api-key", apiKey)
      .body(sendEmailOptions)
      .response(asJson[Unit])

  /**
   * Sister method for standard `sendEmail` method with the benefit of returning a `SentEmail` entity confirming the successful sending of the email with a link to the sent object created for it.
   * 
   * Expected answers:
   *   code 201 : SentEmailDto (Created)
   * 
   * Available security schemes:
   *   API_KEY (apiKey)
   * 
   * @param inboxId ID of the inbox you want to send the email from
   * @param sendEmailOptions 
   */
  def sendEmailAndConfirm(apiKey: String)(inboxId: UUID, sendEmailOptions: SendEmailOptions
): Request[Either[ResponseError[Exception], SentEmailDto], Nothing] =
    basicRequest
      .method(Method.POST, uri"$baseUrl/inboxes/${inboxId}/confirm")
      .contentType("application/json")
      .header("x-api-key", apiKey)
      .body(sendEmailOptions)
      .response(asJson[SentEmailDto])

  /**
   * Send an email using a queue. Will place the email onto a queue that will then be processed and sent. Use this queue method to enable any failed email sending to be recovered. This will prevent lost emails when sending if your account encounters a block or payment issue.
   * 
   * Expected answers:
   *   code 201 :  (Created)
   * 
   * Available security schemes:
   *   API_KEY (apiKey)
   * 
   * @param inboxId ID of the inbox you want to send the email from
   * @param validateBeforeEnqueue Validate before adding to queue
   * @param sendEmailOptions 
   */
  def sendEmailWithQueue(apiKey: String)(inboxId: UUID, validateBeforeEnqueue: Boolean, sendEmailOptions: SendEmailOptions
): Request[Either[ResponseError[Exception], Unit], Nothing] =
    basicRequest
      .method(Method.POST, uri"$baseUrl/inboxes/${inboxId}/with-queue?validateBeforeEnqueue=${ validateBeforeEnqueue }")
      .contentType("application/json")
      .header("x-api-key", apiKey)
      .body(sendEmailOptions)
      .response(asJson[Unit])

  /**
   * Send email using an SMTP envelope containing RCPT TO, MAIL FROM, and a SMTP BODY.
   * 
   * Expected answers:
   *   code 201 : SentEmailDto (Created)
   * 
   * Available security schemes:
   *   API_KEY (apiKey)
   * 
   * @param inboxId ID of the inbox you want to send the email from
   * @param sendSMTPEnvelopeOptions 
   */
  def sendSmtpEnvelope(apiKey: String)(inboxId: UUID, sendSMTPEnvelopeOptions: SendSMTPEnvelopeOptions
): Request[Either[ResponseError[Exception], SentEmailDto], Nothing] =
    basicRequest
      .method(Method.POST, uri"$baseUrl/inboxes/${inboxId}/smtp-envelope")
      .contentType("application/json")
      .header("x-api-key", apiKey)
      .body(sendSMTPEnvelopeOptions)
      .response(asJson[SentEmailDto])

  /**
   * Send an inbox a test email to test email receiving is working
   * 
   * Expected answers:
   *   code 204 :  (No Content)
   * 
   * Available security schemes:
   *   API_KEY (apiKey)
   * 
   * @param inboxId 
   */
  def sendTestEmail(apiKey: String)(inboxId: UUID
): Request[Either[ResponseError[Exception], Unit], Nothing] =
    basicRequest
      .method(Method.POST, uri"$baseUrl/inboxes/${inboxId}/send-test-email")
      .contentType("application/json")
      .header("x-api-key", apiKey)
      .response(asJson[Unit])

  /**
   * Set and return new favourite state for an inbox
   * 
   * Expected answers:
   *   code 200 : InboxDto (OK)
   * 
   * Available security schemes:
   *   API_KEY (apiKey)
   * 
   * @param inboxId ID of inbox to set favourite state
   * @param setInboxFavouritedOptions 
   */
  def setInboxFavourited(apiKey: String)(inboxId: UUID, setInboxFavouritedOptions: SetInboxFavouritedOptions
): Request[Either[ResponseError[Exception], InboxDto], Nothing] =
    basicRequest
      .method(Method.PUT, uri"$baseUrl/inboxes/${inboxId}/favourite")
      .contentType("application/json")
      .header("x-api-key", apiKey)
      .body(setInboxFavouritedOptions)
      .response(asJson[InboxDto])

  /**
   * Update editable fields on an inbox
   * 
   * Expected answers:
   *   code 200 : InboxDto (OK)
   * 
   * Available security schemes:
   *   API_KEY (apiKey)
   * 
   * @param inboxId 
   * @param updateInboxOptions 
   */
  def updateInbox(apiKey: String)(inboxId: UUID, updateInboxOptions: UpdateInboxOptions
): Request[Either[ResponseError[Exception], InboxDto], Nothing] =
    basicRequest
      .method(Method.PATCH, uri"$baseUrl/inboxes/${inboxId}")
      .contentType("application/json")
      .header("x-api-key", apiKey)
      .body(updateInboxOptions)
      .response(asJson[InboxDto])

}
