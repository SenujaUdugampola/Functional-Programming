def filterPrime(nums: List[Int]): List[Int] = {
  def isPrime(n: Int): Boolean = {
    if (n <= 1) false;
    else if (n == 2) true;
    else {
        var i = 2
        var prime = true
        while (i * i <= n && prime) {
          if (n % i == 0) prime = false
          i += 1
        }
        prime
      };
  }

  nums.filter(num => isPrime(num))
}

@main def run(): Unit = {
    val input3 = List(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
    val output3 = filterPrime(input3);
    println(output3);
}