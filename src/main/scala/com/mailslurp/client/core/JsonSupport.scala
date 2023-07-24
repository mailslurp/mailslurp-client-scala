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
package com.mailslurp.client.core

import com.mailslurp.modelspackageVersion&#x3D;15.17.21._
import org.json4s._
import sttp.client.json4s.SttpJson4sApi
import scala.reflect.ClassTag

object JsonSupport extends SttpJson4sApi {
  def enumSerializers: Seq[Serializer[_]] = Seq[Serializer[_]]() :+
    new EnumNameSerializer(AbstractWebhookPayloadEnums.EventName) :+
    new EnumNameSerializer(ConditionOptionEnums.Condition) :+
    new EnumNameSerializer(ConditionOptionEnums.Value) :+
    new EnumNameSerializer(ConnectorDtoEnums.ConnectorType) :+
    new EnumNameSerializer(ConnectorDtoEnums.ConnectorAuthType) :+
    new EnumNameSerializer(ConnectorDtoEnums.SyncScheduleType) :+
    new EnumNameSerializer(ConnectorProjectionEnums.ConnectorType) :+
    new EnumNameSerializer(ConnectorProjectionEnums.SyncScheduleType) :+
    new EnumNameSerializer(ConnectorSyncEventDtoEnums.SyncStatus) :+
    new EnumNameSerializer(ConnectorSyncEventProjectionEnums.SyncStatus) :+
    new EnumNameSerializer(CreateConnectorOptionsEnums.ConnectorType) :+
    new EnumNameSerializer(CreateConnectorOptionsEnums.ConnectorAuthType) :+
    new EnumNameSerializer(CreateConnectorOptionsEnums.SyncScheduleType) :+
    new EnumNameSerializer(CreateDomainOptionsEnums.DomainType) :+
    new EnumNameSerializer(CreateEmergencyAddressOptionsEnums.IsoCountryCode) :+
    new EnumNameSerializer(CreateInboxDtoEnums.InboxType) :+
    new EnumNameSerializer(CreateInboxForwarderOptionsEnums.Field) :+
    new EnumNameSerializer(CreateInboxReplierOptionsEnums.Field) :+
    new EnumNameSerializer(CreateInboxRulesetOptionsEnums.Scope) :+
    new EnumNameSerializer(CreateInboxRulesetOptionsEnums.Action) :+
    new EnumNameSerializer(CreateWebhookOptionsEnums.EventName) :+
    new EnumNameSerializer(DNSLookupOptionsEnums.Seq[RecordTypes]) :+
    new EnumNameSerializer(DNSLookupResultEnums.RecordType) :+
    new EnumNameSerializer(DomainDtoEnums.DomainType) :+
    new EnumNameSerializer(DomainNameRecordEnums.Label) :+
    new EnumNameSerializer(DomainNameRecordEnums.RecordType) :+
    new EnumNameSerializer(DomainPreviewEnums.DomainType) :+
    new EnumNameSerializer(EmergencyAddressEnums.PhoneCountry) :+
    new EnumNameSerializer(EmergencyAddressDtoEnums.PhoneCountry) :+
    new EnumNameSerializer(ExportOptionsEnums.OutputFormat) :+
    new EnumNameSerializer(GenerateBimiRecordOptionsEnums.Version) :+
    new EnumNameSerializer(GenerateBimiRecordResultsEnums.`Type`) :+
    new EnumNameSerializer(GenerateDmarcRecordOptionsEnums.Version) :+
    new EnumNameSerializer(GenerateDmarcRecordOptionsEnums.Policy) :+
    new EnumNameSerializer(GenerateDmarcRecordOptionsEnums.SubdomainPolicy) :+
    new EnumNameSerializer(GenerateDmarcRecordOptionsEnums.ReportFormat) :+
    new EnumNameSerializer(GenerateDmarcRecordOptionsEnums.Adkim) :+
    new EnumNameSerializer(GenerateDmarcRecordOptionsEnums.Aspf) :+
    new EnumNameSerializer(GenerateDmarcRecordOptionsEnums.Fo) :+
    new EnumNameSerializer(GenerateDmarcRecordResultsEnums.`Type`) :+
    new EnumNameSerializer(GenerateMtaStsRecordOptionsEnums.Version) :+
    new EnumNameSerializer(GenerateMtaStsRecordOptionsEnums.Mode) :+
    new EnumNameSerializer(GenerateMtaStsRecordResultsEnums.`Type`) :+
    new EnumNameSerializer(GenerateTlsReportingRecordOptionsEnums.Version) :+
    new EnumNameSerializer(GenerateTlsReportingRecordResultsEnums.`Type`) :+
    new EnumNameSerializer(ImapFlagOperationOptionsEnums.FlagOperation) :+
    new EnumNameSerializer(InboxDtoEnums.InboxType) :+
    new EnumNameSerializer(InboxForwarderDtoEnums.Field) :+
    new EnumNameSerializer(InboxForwarderEventProjectionEnums.Status) :+
    new EnumNameSerializer(InboxPreviewEnums.InboxType) :+
    new EnumNameSerializer(InboxReplierDtoEnums.Field) :+
    new EnumNameSerializer(InboxReplierEventProjectionEnums.Status) :+
    new EnumNameSerializer(InboxRulesetDtoEnums.Scope) :+
    new EnumNameSerializer(InboxRulesetDtoEnums.Action) :+
    new EnumNameSerializer(InboxRulesetDtoEnums.Handler) :+
    new EnumNameSerializer(MatchOptionEnums.Field) :+
    new EnumNameSerializer(MatchOptionEnums.Should) :+
    new EnumNameSerializer(OrganizationInboxProjectionEnums.InboxType) :+
    new EnumNameSerializer(PhoneNumberDtoEnums.PhoneCountry) :+
    new EnumNameSerializer(PhoneNumberProjectionEnums.PhoneCountry) :+
    new EnumNameSerializer(PhonePlanDtoEnums.PhoneCountry) :+
    new EnumNameSerializer(ReplyToAliasEmailOptionsEnums.SendStrategy) :+
    new EnumNameSerializer(ReplyToEmailOptionsEnums.SendStrategy) :+
    new EnumNameSerializer(ScheduledJobEnums.Status) :+
    new EnumNameSerializer(ScheduledJobDtoEnums.Status) :+
    new EnumNameSerializer(SendEmailOptionsEnums.SendStrategy) :+
    new EnumNameSerializer(SendEmailOptionsEnums.ValidateEmailAddresses) :+
    new EnumNameSerializer(SmsMatchOptionEnums.Field) :+
    new EnumNameSerializer(SmsMatchOptionEnums.Should) :+
    new EnumNameSerializer(TemplateVariableEnums.VariableType) :+
    new EnumNameSerializer(UpdateInboxReplierOptionsEnums.Field) :+
    new EnumNameSerializer(UserInfoDtoEnums.AccountState) :+
    new EnumNameSerializer(UserInfoDtoEnums.SubscriptionType) :+
    new EnumNameSerializer(UserInfoDtoEnums.AccountType) :+
    new EnumNameSerializer(WaitForConditionsEnums.CountType) :+
    new EnumNameSerializer(WaitForConditionsEnums.SortDirection) :+
    new EnumNameSerializer(WaitForSingleSmsOptionsEnums.SortDirection) :+
    new EnumNameSerializer(WaitForSmsConditionsEnums.CountType) :+
    new EnumNameSerializer(WaitForSmsConditionsEnums.SortDirection) :+
    new EnumNameSerializer(WebhookBouncePayloadEnums.EventName) :+
    new EnumNameSerializer(WebhookBounceRecipientPayloadEnums.EventName) :+
    new EnumNameSerializer(WebhookDeliveryStatusPayloadEnums.EventName) :+
    new EnumNameSerializer(WebhookDtoEnums.Method) :+
    new EnumNameSerializer(WebhookDtoEnums.EventName) :+
    new EnumNameSerializer(WebhookEmailOpenedPayloadEnums.EventName) :+
    new EnumNameSerializer(WebhookEmailReadPayloadEnums.EventName) :+
    new EnumNameSerializer(WebhookNewAttachmentPayloadEnums.EventName) :+
    new EnumNameSerializer(WebhookNewContactPayloadEnums.EventName) :+
    new EnumNameSerializer(WebhookNewEmailPayloadEnums.EventName) :+
    new EnumNameSerializer(WebhookNewSmsPayloadEnums.EventName) :+
    new EnumNameSerializer(WebhookProjectionEnums.EventName) :+
    new EnumNameSerializer(WebhookResultDtoEnums.HttpMethod) :+
    new EnumNameSerializer(WebhookResultDtoEnums.WebhookEvent) :+
    new EnumNameSerializer(WebhookResultDtoEnums.ResultType) :+
    new EnumNameSerializer(WebhookTestRequestEnums.Method)

  private class EnumNameSerializer[E <: Enumeration: ClassTag](enum: E) extends Serializer[E#Value] {
    import JsonDSL._
    val EnumerationClass: Class[E#Value] = classOf[E#Value]

    def deserialize(implicit format: Formats): PartialFunction[(TypeInfo, JValue), E#Value] = {
      case (t @ TypeInfo(EnumerationClass, _), json) if isValid(json) =>
        json match {
          case JString(value) => enum.withName(value)
          case value => throw new MappingException(s"Can't convert $value to $EnumerationClass")
        }
    }

    private[this] def isValid(json: JValue) = json match {
      case JString(value) if enum.values.exists(_.toString == value) => true
      case _ => false
    }

    def serialize(implicit format: Formats): PartialFunction[Any, JValue] = {
      case i: E#Value => i.toString
      }
    }

  implicit val format: Formats = DefaultFormats ++ enumSerializers ++ DateSerializers.all
  implicit val serialization: org.json4s.Serialization = org.json4s.jackson.Serialization
}
