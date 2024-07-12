def toUpper(str: String): String = {
  str.map { char =>
    if char >= 'a' && char <= 'z' then
      (char - 32).toChar
    else
      char
  }
}

def toLower(str: String): String = {
  str.map { char =>
    if char >= 'A' && char <= 'Z' then
      (char + 32).toChar
    else
      char
  }
}

def formatNames(name: String, formatFunc: String => String): String = {
    formatFunc(name)
}

@main def run(): Unit =
  val names = List("Benny", "Niroshan", "Saman", "Kumara")

  def customFormatNiroshan(name: String): String = {
    val firstPart = toUpper(name.substring(0, 2))
    val secondPart = name.substring(2)
    firstPart+secondPart
  }

  def customFormatKumara(name: String): String = {
    val firstPart = toUpper(name.substring(0, 1))
    val secondPart = toLower(name.substring(1, 5))
    val lastPart = toUpper(name.substring(5))
    firstPart+secondPart+lastPart
  }

  println(formatNames(names(0), toUpper)) 
  println(formatNames(names(1), customFormatNiroshan))
  println(formatNames(names(2), toLower))
  println(formatNames(names(3), customFormatKumara))
