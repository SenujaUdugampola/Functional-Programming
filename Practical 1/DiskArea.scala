object DiskArea{
  def area(radius: Double): Double = {
    math.Pi * radius * radius
  }

  def main(args: Array[String]): Unit = {
    val radius = 5
    println(s"The area of a disk with radius $radius is ${area(radius)}")
  }
}
