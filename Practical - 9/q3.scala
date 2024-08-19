  def toUpper(input: String): String = input.toUpperCase

  def toLower(input: String): String = input.toLowerCase

  def formatNames(name: String)(format: String => String): String = format(name)


@main def formatNamesApp(): Unit = {
  println(formatNames("Benny")(toUpper))        
  println(formatNames("Niroshan")(name => name.substring(0, 2).toUpperCase + name.substring(2)))
  println(formatNames("Saman")(toLower))          
  println(formatNames("Kumara")(name => name.substring(0, 1).toUpperCase  + name.substring(1, name.length - 1).toLowerCase + name.substring(name.length - 1).toUpperCase)) 
}
