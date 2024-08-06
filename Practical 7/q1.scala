def filterEvenNumbers(nums: List[Int]): List[Int] = {
  nums.filter(num => num % 2 == 0);
}

@main def run(): Unit = {
    val input1 = List(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
    val output1 = filterEvenNumbers(input1);
    println(output1);
}  
