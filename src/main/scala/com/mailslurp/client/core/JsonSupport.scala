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
package com.mailslurp.client.core

import com.mailslurp.modelspackageVersion&#x3D;12.1.22._
import org.json4s._
import sttp.client.json4s.SttpJson4sApi
import scala.reflect.ClassTag

object JsonSupport extends SttpJson4sApi {
  def enumSerializers: Seq[Serializer[_]] = Seq[Serializer[_]]() :+
    new EnumNameSerializer(AbstractWebhookPayloadEnums.EventName) :+
    new EnumNameSerializer(ConditionOptionEnums.Condition) :+
    new EnumNameSerializer(ConditionOptionEnums.Value) :+
    new EnumNameSerializer(CreateDomainOptionsEnums.DomainType) :+
    new EnumNameSerializer(CreateInboxDtoEnums.InboxType) :+
    new EnumNameSerializer(CreateWebhookOptionsEnums.EventName) :+
    new EnumNameSerializer(DNSLookupOptionsEnums.Seq[RecordTypes]) :+
    new EnumNameSerializer(DNSLookupResultEnums.RecordType) :+
    new EnumNameSerializer(DomainDtoEnums.DomainType) :+
    new EnumNameSerializer(DomainNameRecordEnums.RecordType) :+
    new EnumNameSerializer(InboxEnums.InboxType) :+
    new EnumNameSerializer(InboxProjectionEnums.InboxType) :+
    new EnumNameSerializer(MatchOptionEnums.Field) :+
    new EnumNameSerializer(MatchOptionEnums.Should) :+
    new EnumNameSerializer(OrganizationInboxProjectionEnums.InboxType) :+
    new EnumNameSerializer(ReplyToAliasEmailOptionsEnums.SendStrategy) :+
    new EnumNameSerializer(ReplyToEmailOptionsEnums.SendStrategy) :+
    new EnumNameSerializer(SendEmailOptionsEnums.SendStrategy) :+
    new EnumNameSerializer(TemplateVariableEnums.VariableType) :+
    new EnumNameSerializer(WaitForConditionsEnums.CountType) :+
    new EnumNameSerializer(WaitForConditionsEnums.SortDirection) :+
    new EnumNameSerializer(WebhookDtoEnums.EventName) :+
    new EnumNameSerializer(WebhookDtoEnums.Method) :+
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
