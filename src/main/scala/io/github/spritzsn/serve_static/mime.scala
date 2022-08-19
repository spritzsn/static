package io.github.spritzsn.serve_static

import java.nio.file.Path

def mime(path: Path): String =
  val filename = path.getFileName.toString
  val extension =
    filename lastIndexOf '.' match
      case -1  => ""
      case idx => filename.substring(idx + 1)

  extension.toLowerCase match
    case "aac"  => "audio/aac" // AAC audio
    case "abw"  => "application/x-abiword" // AbiWord document
    case "arc"  => "application/x-freearc" // Archive document (multiple files embedded)
    case "avif" => "image/avif" // AVIF image
    case "avi"  => "video/x-msvideo" // AVI: Audio Video Interleave
    case "azw"  => "application/vnd.amazon.ebook" // Amazon Kindle eBook format
    case "bin"  => "application/octet-stream" // Any kind of binary data
    case "bmp"  => "image/bmp" // Windows OS/2 Bitmap Graphics
    case "bz"   => "application/x-bzip" // BZip archive
    case "bz2"  => "application/x-bzip2" // BZip2 archive
    case "cda"  => "application/x-cdf" // CD audio
    case "csh"  => "application/x-csh" // C-Shell script
    case "css"  => "text/css" // Cascading Style Sheets (CSS)
    case "csv"  => "text/csv" // Comma-separated values (CSV)
    case "doc"  => "application/msword" // Microsoft Word
    case "docx" =>
      "application/vnd.openxmlformats-officedocument.wordprocessingml.document" // Microsoft Word (OpenXML)
    case "eot"    => "application/vnd.ms-fontobject" // MS Embedded OpenType fonts
    case "epub"   => "application/epub+zip" // Electronic publication (EPUB)
    case "gz"     => "application/gzip" // GZip Compressed Archive
    case "gif"    => "image/gif" // Graphics Interchange Format (GIF)
    case "htm"    => "text/html" // .html 	HyperText Markup Language (HTML)
    case "ico"    => "image/vnd.microsoft.icon" // Icon format
    case "ics"    => "text/calendar" // iCalendar format
    case "jar"    => "application/java-archive" // Java Archive (JAR)
    case "jpeg"   => "image/jpeg" // .jpg 	JPEG images
    case "js"     => "text/javascript" // JavaScript
    case "json"   => "application/json" // JSON format
    case "jsonld" => "application/ld+json" // JSON-LD format
    case "mid"    => "audio/midi" // .midi 	Musical Instrument Digital Interface (MIDI)
    case "mjs"    => "text/javascript" // JavaScript module
    case "mp3"    => "audio/mpeg" // MP3 audio
    case "mp4"    => "video/mp4" // MP4 video
    case "mpeg"   => "video/mpeg" // MPEG Video
    case "mpkg"   => "application/vnd.apple.installer+xml" // Apple Installer Package
    case "odp"    => "application/vnd.oasis.opendocument.presentation" // OpenDocument presentation document
    case "ods"    => "application/vnd.oasis.opendocument.spreadsheet" // OpenDocument spreadsheet document
    case "odt"    => "application/vnd.oasis.opendocument.text" // OpenDocument text document
    case "oga"    => "audio/ogg" // OGG audio
    case "ogv"    => "video/ogg" // OGG video
    case "ogx"    => "application/ogg" // OGG
    case "opus"   => "audio/opus" // Opus audio
    case "otf"    => "font/otf" // OpenType font
    case "png"    => "image/png" // Portable Network Graphics
    case "pdf"    => "application/pdf" // Adobe Portable Document Format (PDF)
    case "php"    => "application/x-httpd-php" // Hypertext Preprocessor (Personal Home Page)
    case "ppt"    => "application/vnd.ms-powerpoint" // Microsoft PowerPoint
    case "pptx" =>
      "application/vnd.openxmlformats-officedocument.presentationml.presentation" // Microsoft PowerPoint (OpenXML)
    case "rar"   => "application/vnd.rar" // RAR archive
    case "rtf"   => "application/rtf" // Rich Text Format (RTF)
    case "sh"    => "application/x-sh" // Bourne shell script
    case "svg"   => "image/svg+xml" // Scalable Vector Graphics (SVG)
    case "swf"   => "application/x-shockwave-flash" // Small web format (SWF) or Adobe Flash document
    case "tar"   => "application/x-tar" // Tape Archive (TAR)
    case "tif"   => "image/tiff" // .tiff 	Tagged Image File Format (TIFF)
    case "ts"    => "video/mp2t" // MPEG transport stream
    case "ttf"   => "font/ttf" // TrueType Font
    case "txt"   => "text/plain" // Text, (generally ASCII or ISO 8859-n)
    case "vsd"   => "application/vnd.visio" // Microsoft Visio
    case "wav"   => "audio/wav" // Waveform Audio Format
    case "weba"  => "audio/webm" // WEBM audio
    case "webm"  => "video/webm" // WEBM video
    case "webp"  => "image/webp" // WEBP image
    case "woff"  => "font/woff" // Web Open Font Format (WOFF)
    case "woff2" => "font/woff2" // Web Open Font Format (WOFF)
    case "xhtml" => "application/xhtml+xml" // XHTML
    case "xls"   => "application/vnd.ms-excel" // Microsoft Excel
    case "xlsb"  => "application/vnd.ms-excel.sheet.binary.macroEnabled.12"
    case "xlsx" =>
      "application/vnd.openxmlformats-officedocument.spreadsheetml.sheet" // Microsoft Excel (OpenXML)
    case "xlsm"                                  => "application/vnd.ms-excel.sheet.macroEnabled.12"
    case "xml"                                   => "application/xml" // XML
    case "xul"                                   => "application/vnd.mozilla.xul+xml" // XUL
    case "zip"                                   => "application/zip" // ZIP archive
    case "3gp"                                   => "video/3gpp" // 3GPP audio/video container
    case "3g2"                                   => "video/3gpp2" // 3GPP2 audio/video container
    case "7z"                                    => "application/x-7z-compressed" // 7-zip archive
    case "scala" | "log" | "conf" | "properties" => "text/plain"
    case _                                       => "application/octet-stream"
end mime
