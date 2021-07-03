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
package com.mailslurp.modelspackageVersion&#x3D;12.6.1

import java.util.UUID

  /**
   * WaitForConditions
   * Conditions that a `waitForXEmails` endpoint operates on. The methods wait until given conditions are met or a timeout is reached. If the conditions are met without needing to wait the results will be returned immediately. Can include `unreadOnly` to ignore already read emails that were returned in an API call or viewing in the dashboard. Can also include matches for emails containing `from`, `subject`, `hasAttachments` etc.
   */
case class WaitForConditions(
  /* Number of results that should match conditions. Either exactly or at least this amount based on the `countType`. If count condition is not met and the timeout has not been reached the `waitFor` method will retry the operation. */
  count: Option[Int] = None,
  /* How should the found count be compared to the expected count. */
  countType: Option[WaitForConditionsEnums.CountType] = None,
  /* ID of inbox to search within and apply conditions to. Essentially filtering the emails found to give a count. */
  inboxId: Option[UUID] = None,
  /* Conditions that should be matched for an email to qualify for results. Each condition will be applied in order to each email within an inbox to filter a result list of matching emails you are waiting for. */
  matches: Option[Seq[MatchOption]] = None,
  /* Direction to sort matching emails by created time */
  sortDirection: Option[WaitForConditionsEnums.SortDirection] = None,
  /* Max time in milliseconds to retry the `waitFor` operation until conditions are met. */
  timeout: Option[Long] = None,
  /* Apply conditions only to **unread** emails. All emails begin with `read=false`. An email is marked `read=true` when an `EmailDto` representation of it has been returned to the user at least once. For example you have called `getEmail` or `waitForLatestEmail` etc., or you have viewed the email in the dashboard.  */
  unreadOnly: Option[Boolean] = None
)

object WaitForConditionsEnums {

  type CountType = CountType.Value
  type SortDirection = SortDirection.Value
  object CountType extends Enumeration {
    val EXACTLY = Value("EXACTLY")
    val ATLEAST = Value("ATLEAST")
  }

  object SortDirection extends Enumeration {
    val ASC = Value("ASC")
    val DESC = Value("DESC")
  }

}

