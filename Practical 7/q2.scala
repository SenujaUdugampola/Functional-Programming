def calculateSquare(nums: List[Int]): List[Int] = {
  nums.map(num => num * num);
}

@main def run(): Unit = {
    val input2 = List(1, 2, 3, 4, 5);
    val output2 = calculateSquare(input2);
    println(output2);
}