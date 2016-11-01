package uk.gov.hmrc.hmrcemailrenderer.domain

object MessagePriority extends Enumeration {
  type MessagePriority = Value
  val Urgent, Normal, Background = Value
}
