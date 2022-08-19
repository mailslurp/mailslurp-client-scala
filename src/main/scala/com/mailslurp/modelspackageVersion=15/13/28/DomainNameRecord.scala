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
package com.mailslurp.modelspackageVersion&#x3D;15.13.28


  /**
   * DNS Record required for verification of a domain. Record vary depending on domain type.
   */
case class DomainNameRecord(
  /* Domain Name Server Record Types */
  recordType: DomainNameRecordEnums.RecordType,
  name: String,
  recordEntries: Seq[String],
  ttl: Long
)

object DomainNameRecordEnums {

  type RecordType = RecordType.Value
  object RecordType extends Enumeration {
    val `A` = Value("A")
    val NS = Value("NS")
    val MD = Value("MD")
    val MF = Value("MF")
    val CNAME = Value("CNAME")
    val SOA = Value("SOA")
    val MB = Value("MB")
    val MG = Value("MG")
    val MR = Value("MR")
    val `NULL` = Value("NULL")
    val WKS = Value("WKS")
    val PTR = Value("PTR")
    val HINFO = Value("HINFO")
    val MINFO = Value("MINFO")
    val MX = Value("MX")
    val TXT = Value("TXT")
    val RP = Value("RP")
    val AFSDB = Value("AFSDB")
    val X25 = Value("X25")
    val ISDN = Value("ISDN")
    val RT = Value("RT")
    val NSAP = Value("NSAP")
    val NSAPPTR = Value("NSAP_PTR")
    val SIG = Value("SIG")
    val KEY = Value("KEY")
    val PX = Value("PX")
    val GPOS = Value("GPOS")
    val AAAA = Value("AAAA")
    val LOC = Value("LOC")
    val NXT = Value("NXT")
    val EID = Value("EID")
    val NIMLOC = Value("NIMLOC")
    val SRV = Value("SRV")
    val ATMA = Value("ATMA")
    val NAPTR = Value("NAPTR")
    val KX = Value("KX")
    val CERT = Value("CERT")
    val A6 = Value("A6")
    val DNAME = Value("DNAME")
    val SINK = Value("SINK")
    val OPT = Value("OPT")
    val APL = Value("APL")
    val DS = Value("DS")
    val SSHFP = Value("SSHFP")
    val IPSECKEY = Value("IPSECKEY")
    val RRSIG = Value("RRSIG")
    val NSEC = Value("NSEC")
    val DNSKEY = Value("DNSKEY")
    val DHCID = Value("DHCID")
    val NSEC3 = Value("NSEC3")
    val NSEC3PARAM = Value("NSEC3PARAM")
    val TLSA = Value("TLSA")
    val SMIMEA = Value("SMIMEA")
    val HIP = Value("HIP")
    val NINFO = Value("NINFO")
    val RKEY = Value("RKEY")
    val TALINK = Value("TALINK")
    val CDS = Value("CDS")
    val CDNSKEY = Value("CDNSKEY")
    val OPENPGPKEY = Value("OPENPGPKEY")
    val CSYNC = Value("CSYNC")
    val ZONEMD = Value("ZONEMD")
    val SVCB = Value("SVCB")
    val HTTPS = Value("HTTPS")
    val SPF = Value("SPF")
    val UINFO = Value("UINFO")
    val UID = Value("UID")
    val GID = Value("GID")
    val UNSPEC = Value("UNSPEC")
    val NID = Value("NID")
    val L32 = Value("L32")
    val L64 = Value("L64")
    val LP = Value("LP")
    val EUI48 = Value("EUI48")
    val EUI64 = Value("EUI64")
    val TKEY = Value("TKEY")
    val TSIG = Value("TSIG")
    val IXFR = Value("IXFR")
    val AXFR = Value("AXFR")
    val MAILB = Value("MAILB")
    val MAILA = Value("MAILA")
    val ANY = Value("ANY")
    val URI = Value("URI")
    val CAA = Value("CAA")
    val AVC = Value("AVC")
    val DOA = Value("DOA")
    val AMTRELAY = Value("AMTRELAY")
    val TA = Value("TA")
    val DLV = Value("DLV")
  }

}

