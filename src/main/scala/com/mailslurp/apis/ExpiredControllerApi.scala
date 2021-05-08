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

import com.mailslurp.modelspackageVersion&#x3D;11.10.0.ExpirationDefaults
import com.mailslurp.modelspackageVersion&#x3D;11.10.0.ExpiredInboxDto
import com.mailslurp.modelspackageVersion&#x3D;11.10.0.PageExpiredInboxRecordProjection
import java.util.UUID
import com.mailslurp.client.core.JsonSupport._
import sttp.client._
import sttp.model.Method

object ExpiredControllerApi {

def apply(baseUrl: String = "https://api.mailslurp.com") = new ExpiredControllerApi(baseUrl)
}

class ExpiredControllerApi(baseUrl: String) {

  /**
   * Return default times used for inbox expiration
   * 
   * Expected answers:
   *   code 200 : ExpirationDefaults (OK)
   *   code 401 :  (Unauthorized)
   *   code 403 :  (Forbidden)
   *   code 404 :  (Not Found)
   * 
   * Available security schemes:
   *   API_KEY (apiKey)
   */
  def getExpirationDefaults(apiKey: String)(
): Request[Either[ResponseError[Exception], ExpirationDefaults], Nothing] =
    basicRequest
      .method(Method.GET, uri"$baseUrl/expired/defaults")
      .contentType("application/json")
      .header("x-api-key", apiKey)
      .response(asJson[ExpirationDefaults])

  /**
   * Use the inboxId to return an ExpiredInboxRecord if an inbox has expired. Inboxes expire and are disabled if an expiration date is set or plan requires. Returns 404 if no expired inbox is found for the inboxId
   * 
   * Expected answers:
   *   code 200 : ExpiredInboxDto (OK)
   *   code 401 :  (Unauthorized)
   *   code 403 :  (Forbidden)
   *   code 404 :  (Not Found)
   * 
   * Available security schemes:
   *   API_KEY (apiKey)
   * 
   * @param inboxId ID of inbox you want to retrieve (not the inbox ID)
   */
  def getExpiredInboxByInboxId(apiKey: String)(inboxId: UUID
): Request[Either[ResponseError[Exception], ExpiredInboxDto], Nothing] =
    basicRequest
      .method(Method.GET, uri"$baseUrl/expired/inbox/${inboxId}")
      .contentType("application/json")
      .header("x-api-key", apiKey)
      .response(asJson[ExpiredInboxDto])

  /**
   * Inboxes created with an expiration date will expire after the given date and be moved to an ExpiredInbox entity. You can still read emails in the inbox but it can no longer send or receive emails. Fetch the expired inboxes to view the old inboxes properties
   * 
   * Expected answers:
   *   code 200 : ExpiredInboxDto (OK)
   *   code 401 :  (Unauthorized)
   *   code 403 :  (Forbidden)
   *   code 404 :  (Not Found)
   * 
   * Available security schemes:
   *   API_KEY (apiKey)
   * 
   * @param expiredId ID of the ExpiredInboxRecord you want to retrieve. This is different from the ID of the inbox you are interested in. See other methods for getting ExpiredInboxRecord for an inbox inboxId)
   */
  def getExpiredInboxRecord(apiKey: String)(expiredId: UUID
): Request[Either[ResponseError[Exception], ExpiredInboxDto], Nothing] =
    basicRequest
      .method(Method.GET, uri"$baseUrl/expired/${expiredId}")
      .contentType("application/json")
      .header("x-api-key", apiKey)
      .response(asJson[ExpiredInboxDto])

  /**
   * Inboxes created with an expiration date will expire after the given date. An ExpiredInboxRecord is created that records the inboxes old ID and email address. You can still read emails in the inbox (using the inboxes old ID) but the email address associated with the inbox can no longer send or receive emails. Fetch expired inbox records to view the old inboxes properties
   * 
   * Expected answers:
   *   code 200 : PageExpiredInboxRecordProjection (OK)
   *   code 401 :  (Unauthorized)
   *   code 403 :  (Forbidden)
   *   code 404 :  (Not Found)
   * 
   * Available security schemes:
   *   API_KEY (apiKey)
   * 
   * @param page Optional page index in inbox sent email list pagination
   * @param size Optional page size in inbox sent email list pagination
   * @param sort Optional createdAt sort direction ASC or DESC
   */
  def getExpiredInboxes(apiKey: String)(page: Option[Int] = None, size: Option[Int] = None, sort: Option[String] = None
): Request[Either[ResponseError[Exception], PageExpiredInboxRecordProjection], Nothing] =
    basicRequest
      .method(Method.GET, uri"$baseUrl/expired?page=${ page }&size=${ size }&sort=${ sort }")
      .contentType("application/json")
      .header("x-api-key", apiKey)
      .response(asJson[PageExpiredInboxRecordProjection])

}
