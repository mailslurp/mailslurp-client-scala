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
package com.mailslurp.modelspackageVersion&#x3D;15.17.25


case class EmailFeatureOverview(
  feature: EmailFeatureOverviewEnums.Feature,
  title: Option[String] = None,
  description: Option[String] = None,
  category: Option[EmailFeatureOverviewEnums.Category] = None,
  notes: Option[String] = None,
  notesNumbers: Option[Map[String, String]] = None,
  featureStatistics: Option[Seq[EmailFeatureFamilyStatistics]] = None,
  statuses: EmailFeatureOverviewEnums.Set[Statuses]
)

object EmailFeatureOverviewEnums {

  type Feature = Feature.Value
  type Category = Category.Value
  type Set[Statuses] = Set[Statuses].Value
  object Feature extends Enumeration {
    val Amp = Value("amp")
    val CssAccentColor = Value("css-accent-color")
    val CssAlignItems = Value("css-align-items")
    val CssAnimation = Value("css-animation")
    val CssAspectRatio = Value("css-aspect-ratio")
    val CssAtFontFace = Value("css-at-font-face")
    val CssAtImport = Value("css-at-import")
    val CssAtKeyframes = Value("css-at-keyframes")
    val CssAtMedia = Value("css-at-media")
    val CssAtSupports = Value("css-at-supports")
    val CssBackgroundBlendMode = Value("css-background-blend-mode")
    val CssBackgroundClip = Value("css-background-clip")
    val CssBackgroundColor = Value("css-background-color")
    val CssBackgroundImage = Value("css-background-image")
    val CssBackgroundOrigin = Value("css-background-origin")
    val CssBackgroundPosition = Value("css-background-position")
    val CssBackgroundRepeat = Value("css-background-repeat")
    val CssBackgroundSize = Value("css-background-size")
    val CssBackground = Value("css-background")
    val CssBlockInlineSize = Value("css-block-inline-size")
    val CssBorderImage = Value("css-border-image")
    val CssBorderInlineBlockIndividual = Value("css-border-inline-block-individual")
    val CssBorderInlineBlockLonghand = Value("css-border-inline-block-longhand")
    val CssBorderInlineBlock = Value("css-border-inline-block")
    val CssBorderRadiusLogical = Value("css-border-radius-logical")
    val CssBorderRadius = Value("css-border-radius")
    val CssBorder = Value("css-border")
    val CssBoxShadow = Value("css-box-shadow")
    val CssBoxSizing = Value("css-box-sizing")
    val CssCaptionSide = Value("css-caption-side")
    val CssClipPath = Value("css-clip-path")
    val CssColumnCount = Value("css-column-count")
    val CssColumnLayoutProperties = Value("css-column-layout-properties")
    val CssDirection = Value("css-direction")
    val CssDisplayFlex = Value("css-display-flex")
    val CssDisplayGrid = Value("css-display-grid")
    val CssDisplayNone = Value("css-display-none")
    val CssDisplay = Value("css-display")
    val CssFilter = Value("css-filter")
    val CssFlexDirection = Value("css-flex-direction")
    val CssFlexWrap = Value("css-flex-wrap")
    val CssFloat = Value("css-float")
    val CssFontKerning = Value("css-font-kerning")
    val CssFontWeight = Value("css-font-weight")
    val CssFont = Value("css-font")
    val CssGap = Value("css-gap")
    val CssGridTemplate = Value("css-grid-template")
    val CssHeight = Value("css-height")
    val CssHyphens = Value("css-hyphens")
    val CssInlineSize = Value("css-inline-size")
    val CssJustifyContent = Value("css-justify-content")
    val CssLeftRightTopBottom = Value("css-left-right-top-bottom")
    val CssLetterSpacing = Value("css-letter-spacing")
    val CssLineHeight = Value("css-line-height")
    val CssListStyleImage = Value("css-list-style-image")
    val CssListStylePosition = Value("css-list-style-position")
    val CssListStyleType = Value("css-list-style-type")
    val CssListStyle = Value("css-list-style")
    val CssMarginBlockStartEnd = Value("css-margin-block-start-end")
    val CssMarginInlineBlock = Value("css-margin-inline-block")
    val CssMarginInlineStartEnd = Value("css-margin-inline-start-end")
    val CssMarginInline = Value("css-margin-inline")
    val CssMargin = Value("css-margin")
    val CssMaxBlockSize = Value("css-max-block-size")
    val CssMaxHeight = Value("css-max-height")
    val CssMaxWidth = Value("css-max-width")
    val CssMinHeight = Value("css-min-height")
    val CssMinInlineSize = Value("css-min-inline-size")
    val CssMinWidth = Value("css-min-width")
    val CssMixBlendMode = Value("css-mix-blend-mode")
    val CssObjectFit = Value("css-object-fit")
    val CssObjectPosition = Value("css-object-position")
    val CssOpacity = Value("css-opacity")
    val CssOutlineOffset = Value("css-outline-offset")
    val CssOutline = Value("css-outline")
    val CssOverflowWrap = Value("css-overflow-wrap")
    val CssOverflow = Value("css-overflow")
    val CssPaddingBlockStartEnd = Value("css-padding-block-start-end")
    val CssPaddingInlineBlock = Value("css-padding-inline-block")
    val CssPaddingInlineStartEnd = Value("css-padding-inline-start-end")
    val CssPadding = Value("css-padding")
    val CssPosition = Value("css-position")
    val CssTabSize = Value("css-tab-size")
    val CssTableLayout = Value("css-table-layout")
    val CssTextAlignLast = Value("css-text-align-last")
    val CssTextAlign = Value("css-text-align")
    val CssTextDecorationColor = Value("css-text-decoration-color")
    val CssTextDecorationThickness = Value("css-text-decoration-thickness")
    val CssTextDecoration = Value("css-text-decoration")
    val CssTextEmphasisPosition = Value("css-text-emphasis-position")
    val CssTextEmphasis = Value("css-text-emphasis")
    val CssTextIndent = Value("css-text-indent")
    val CssTextOverflow = Value("css-text-overflow")
    val CssTextShadow = Value("css-text-shadow")
    val CssTextTransform = Value("css-text-transform")
    val CssTextUnderlineOffset = Value("css-text-underline-offset")
    val CssTransform = Value("css-transform")
    val CssVerticalAlign = Value("css-vertical-align")
    val CssVisibility = Value("css-visibility")
    val CssWhiteSpace = Value("css-white-space")
    val CssWidth = Value("css-width")
    val CssWordBreak = Value("css-word-break")
    val CssWritingMode = Value("css-writing-mode")
    val CssZIndex = Value("css-z-index")
    val HtmlAbbr = Value("html-abbr")
    val HtmlAddress = Value("html-address")
    val HtmlAlign = Value("html-align")
    val HtmlAnchorLinks = Value("html-anchor-links")
    val HtmlAriaDescribedby = Value("html-aria-describedby")
    val HtmlAriaHidden = Value("html-aria-hidden")
    val HtmlAriaLabel = Value("html-aria-label")
    val HtmlAriaLabelledby = Value("html-aria-labelledby")
    val HtmlAriaLive = Value("html-aria-live")
    val HtmlAudio = Value("html-audio")
    val HtmlBackground = Value("html-background")
    val HtmlBase = Value("html-base")
    val HtmlBlockquote = Value("html-blockquote")
    val HtmlBody = Value("html-body")
    val HtmlButtonReset = Value("html-button-reset")
    val HtmlButtonSubmit = Value("html-button-submit")
    val HtmlCode = Value("html-code")
    val HtmlDel = Value("html-del")
    val HtmlDfn = Value("html-dfn")
    val HtmlDialog = Value("html-dialog")
    val HtmlDir = Value("html-dir")
    val HtmlDiv = Value("html-div")
    val HtmlDoctype = Value("html-doctype")
    val HtmlForm = Value("html-form")
    val HtmlH1H6 = Value("html-h1-h6")
    val HtmlHeight = Value("html-height")
    val HtmlImageMaps = Value("html-image-maps")
    val HtmlInputCheckbox = Value("html-input-checkbox")
    val HtmlInputHidden = Value("html-input-hidden")
    val HtmlInputRadio = Value("html-input-radio")
    val HtmlInputReset = Value("html-input-reset")
    val HtmlInputSubmit = Value("html-input-submit")
    val HtmlInputText = Value("html-input-text")
    val HtmlLang = Value("html-lang")
    val HtmlLink = Value("html-link")
    val HtmlLists = Value("html-lists")
    val HtmlLoadingAttribute = Value("html-loading-attribute")
    val HtmlMailtoLinks = Value("html-mailto-links")
    val HtmlMarquee = Value("html-marquee")
    val HtmlMeter = Value("html-meter")
    val HtmlObject = Value("html-object")
    val HtmlP = Value("html-p")
    val HtmlPicture = Value("html-picture")
    val HtmlPre = Value("html-pre")
    val HtmlProgress = Value("html-progress")
    val HtmlRequired = Value("html-required")
    val HtmlRole = Value("html-role")
    val HtmlRp = Value("html-rp")
    val HtmlRt = Value("html-rt")
    val HtmlRuby = Value("html-ruby")
    val HtmlSelect = Value("html-select")
    val HtmlSemantics = Value("html-semantics")
    val HtmlSmall = Value("html-small")
    val HtmlSpan = Value("html-span")
    val HtmlSrcset = Value("html-srcset")
    val HtmlStrike = Value("html-strike")
    val HtmlStrong = Value("html-strong")
    val HtmlStyle = Value("html-style")
    val HtmlSvg = Value("html-svg")
    val HtmlTable = Value("html-table")
    val HtmlTarget = Value("html-target")
    val HtmlTextarea = Value("html-textarea")
    val HtmlValign = Value("html-valign")
    val HtmlVideo = Value("html-video")
    val HtmlWbr = Value("html-wbr")
    val HtmlWidth = Value("html-width")
    val ImageAvif = Value("image-avif")
    val ImageBase64 = Value("image-base64")
    val ImageBmp = Value("image-bmp")
    val ImageGif = Value("image-gif")
    val ImageIco = Value("image-ico")
    val ImageJpg = Value("image-jpg")
    val ImagePng = Value("image-png")
    val ImageSvg = Value("image-svg")
    val ImageWebp = Value("image-webp")
    val Unsupported = Value("unsupported")
  }

  object Category extends Enumeration {
    val Css = Value("css")
    val Html = Value("html")
    val Image = Value("image")
    val Others = Value("others")
  }

  object Set[Statuses] extends Enumeration {
  }

}

