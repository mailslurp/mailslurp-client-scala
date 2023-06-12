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
package com.mailslurp.modelspackageVersion&#x3D;15.17.12

import java.time.OffsetDateTime
import java.util.UUID

  /**
   * Conditions to apply to emails that you are waiting for
   */
case class WaitForSmsConditions(
  /* ID of phone number to search within and apply conditions to. Essentially filtering the SMS found to give a count. */
  phoneNumberId: UUID,
  /* Limit results */
  limit: Option[Int] = None,
  /* Number of results that should match conditions. Either exactly or at least this amount based on the `countType`. If count condition is not met and the timeout has not been reached the `waitFor` method will retry the operation. */
  count: Long,
  /* Max time in milliseconds to wait between retries if a `timeout` is specified. */
  delayTimeout: Option[Long] = None,
  /* Max time in milliseconds to retry the `waitFor` operation until conditions are met. */
  timeout: Long,
  /* Apply conditions only to **unread** SMS. All SMS messages begin with `read=false`. An SMS is marked `read=true` when an `SMS` has been returned to the user at least once. For example you have called `getSms` or `waitForSms` etc., or you have viewed the SMS in the dashboard. */
  unreadOnly: Option[Boolean] = None,
  /* How result size should be compared with the expected size. Exactly or at-least matching result? */
  countType: Option[WaitForSmsConditionsEnums.CountType] = None,
  /* Conditions that should be matched for an SMS to qualify for results. Each condition will be applied in order to each SMS within a phone number to filter a result list of matching SMSs you are waiting for. */
  matches: Option[Seq[SmsMatchOption]] = None,
  /* Direction to sort matching SMSs by created time */
  sortDirection: Option[WaitForSmsConditionsEnums.SortDirection] = None,
  /* ISO Date Time earliest time of SMS to consider. Filter for matching SMSs that were received after this date */
  since: Option[OffsetDateTime] = None,
  /* ISO Date Time latest time of SMS to consider. Filter for matching SMSs that were received before this date */
  before: Option[OffsetDateTime] = None
)

object WaitForSmsConditionsEnums {

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

