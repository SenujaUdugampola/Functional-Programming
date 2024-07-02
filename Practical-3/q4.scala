import scala.io.StdIn.readLine

def sumEven(n: List[Int]): Int = {
    def evenrec(n: List[Int], x:Int): Int = n match {
        case Nil => x
        case head :: tail if head % 2 == 0 => evenrec(tail, x + head)
        case _:: tail => evenrec(tail, x)
    }
    evenrec(n, 0)
}

@main def run(): Unit = {
  println("Enter integer seperated by commas : ")
    val input = readLine()

    val n = input.split(",").toList.map(_.trim.toInt)

    val sum = sumEven(n)

    println("The sum of all even numbers in the list is: "+sum)
}