def fibonacci(n: Int): Int = n match {
  case 0 => 0
  case 1 => 1
  case _ => fibonacci(n - 1) + fibonacci(n - 2)
}

def printFibonacciNumbers(n: Int): Unit = {
  def loop(i: Int): Unit = {
    if i < n then
      println(fibonacci(i))
      loop(i + 1)
  }
  loop(0)
}

@main def runFibonacci(): Unit = {
  val n = 10 
  printFibonacciNumbers(n)
}
