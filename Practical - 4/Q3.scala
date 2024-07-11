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

def formatNames(name: String)(formatFunc: String => String): String = {
    formatFunc(name)
}

@main def main3(): Unit = {
    val names = List("Benny","Niroshan","Saman","Kumara")

    println(formatNames(names(0))(toUpper))
    println(formatNames(names(1)) { name =>
        val firstPart = toUpper(name.substring(0,2))
        val secondPart = toLower(name.substring(2))
        firstPart + secondPart
    })

    println(formatNames(names(2))(toLower))
    println(formatNames(names(3)) { name => 
        val firstPart = toUpper(name.substring(0, 1))
        val secondPart = toLower(name.substring(1, 5))
        val lastPart = toUpper(name.substring(5))
        firstPart + secondPart + lastPart
    })
}
