import scala.io.StdIn.readLine

def filter(s: List[String]): List[String] = {
    def filterrec(strings: List[String], x: List[String]): List[String] = strings match {
        case Nil => x
        case head :: tail => if (head.length > 5) head :: filter(tail) else filter(tail)
    }
    filterrec(s, List())
}


@main def newList(): Unit = {
    println("Enter strings seperated by commas : ")
    val input = readLine()

    val s = input.split(",").toList.map(_.trim)

    val flist = filter(s)

    println("Filtered strings with length greater than 5: ")
    flist.foreach(println)

}

