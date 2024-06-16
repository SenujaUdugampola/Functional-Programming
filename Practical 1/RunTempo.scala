object RunTempo{
  def runtime(): Double = {
    val easypace = 8
    val tempopace = 7
    val easydistance = 2+2
    val tempodistance = 3

    (easypace * easydistance) + (tempopace * tempodistance)
  }

  def main(arg:Array[String]): Unit = {
    println(s"Total run time is ${runtime()} minutes")
  }
}