
  def runtime(): Double = {
    val easypace = 8
    val tempopace = 7
    val easydistance = 2+2
    val tempodistance = 3

    (easypace * easydistance) + (tempopace * tempodistance)
  }

@main def RunTempo() = 
    println(s"Total run time is ${runtime()} minutes")