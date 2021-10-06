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

import com.mailslurp.modelspackageVersion&#x3D;14.0.5.CreateTrackingPixelOptions
import java.time.OffsetDateTime
import com.mailslurp.modelspackageVersion&#x3D;14.0.5.PageTrackingPixelProjection
import com.mailslurp.modelspackageVersion&#x3D;14.0.5.TrackingPixelDto
import java.util.UUID
import com.mailslurp.client.core.JsonSupport._
import sttp.client._
import sttp.model.Method

object TrackingControllerApi {

def apply(baseUrl: String = "https://api.mailslurp.com") = new TrackingControllerApi(baseUrl)
}

class TrackingControllerApi(baseUrl: String) {

  /**
   * Create a tracking pixel. A tracking pixel is an image that can be embedded in an email. When the email is viewed and the image is seen MailSlurp will mark the pixel as seen. Use tracking pixels to monitor email open events. You can receive open notifications via webhook or by fetching the pixel.
   * 
   * Expected answers:
   *   code 201 : TrackingPixelDto (Created)
   *   code 401 :  (Unauthorized)
   *   code 403 :  (Forbidden)
   *   code 404 :  (Not Found)
   * 
   * Available security schemes:
   *   API_KEY (apiKey)
   * 
   * @param createTrackingPixelOptions createTrackingPixelOptions
   */
  def createTrackingPixel(apiKey: String)(createTrackingPixelOptions: CreateTrackingPixelOptions
): Request[Either[ResponseError[Exception], TrackingPixelDto], Nothing] =
    basicRequest
      .method(Method.POST, uri"$baseUrl/tracking/pixels")
      .contentType("application/json")
      .header("x-api-key", apiKey)
      .body(createTrackingPixelOptions)
      .response(asJson[TrackingPixelDto])

  /**
   * List tracking pixels in paginated form
   * 
   * Expected answers:
   *   code 200 : PageTrackingPixelProjection (OK)
   *   code 401 :  (Unauthorized)
   *   code 403 :  (Forbidden)
   *   code 404 :  (Not Found)
   * 
   * Available security schemes:
   *   API_KEY (apiKey)
   * 
   * @param before Filter by created at before the given timestamp
   * @param page Optional page index in list pagination
   * @param searchFilter Optional search filter
   * @param since Filter by created at after the given timestamp
   * @param size Optional page size in list pagination
   * @param sort Optional createdAt sort direction ASC or DESC
   */
  def getAllTrackingPixels(apiKey: String)(before: Option[OffsetDateTime] = None, page: Option[Int] = None, searchFilter: Option[String] = None, since: Option[OffsetDateTime] = None, size: Option[Int] = None, sort: Option[String] = None
): Request[Either[ResponseError[Exception], PageTrackingPixelProjection], Nothing] =
    basicRequest
      .method(Method.GET, uri"$baseUrl/tracking/pixels?before=${ before }&page=${ page }&searchFilter=${ searchFilter }&since=${ since }&size=${ size }&sort=${ sort }")
      .contentType("application/json")
      .header("x-api-key", apiKey)
      .response(asJson[PageTrackingPixelProjection])

  /**
   * Expected answers:
   *   code 200 : TrackingPixelDto (OK)
   *   code 401 :  (Unauthorized)
   *   code 403 :  (Forbidden)
   *   code 404 :  (Not Found)
   * 
   * Available security schemes:
   *   API_KEY (apiKey)
   * 
   * @param id id
   */
  def getTrackingPixel(apiKey: String)(id: UUID
): Request[Either[ResponseError[Exception], TrackingPixelDto], Nothing] =
    basicRequest
      .method(Method.GET, uri"$baseUrl/tracking/pixels/${id}")
      .contentType("application/json")
      .header("x-api-key", apiKey)
      .response(asJson[TrackingPixelDto])

}
