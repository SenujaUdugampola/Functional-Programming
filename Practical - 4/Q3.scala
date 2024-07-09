def toUpper(str: String): String = {
    str.toUpperCase()
}

def toLower(str: String): String = {
    str.toLowerCase()
}

def formatNames(name: String)(formatFunc: String => String): String = {
    formatFunc(name)
}

@main def main3(): Unit = {
    val names = List("Benny","Niroshan","Saman","Kumara")

    println(formatNames(names(0))(toUpper))
    println(formatNames(names(1)) { name =>
        val firstPart = name.substring(0,2).toUpperCase
        val secondPart = name.substring(2)
        firstPart + secondPart
    })

    println(formatNames(names(2))(toLower))
    println(formatNames(names(3)) { name => 
        val firstPart = name.substring(0, 1).toUpperCase()
        val secondPart = name.substring(1, 5).toLowerCase()
        val lastPart = name.substring(5).toUpperCase()
        firstPart + secondPart + lastPart
    })
}