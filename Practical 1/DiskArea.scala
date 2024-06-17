  def area(radius: Double): Double = {
    math.Pi * radius * radius
  }

@main def DiskArea() =
    val radius = 5
    println(s"The area of a disk with radius $radius is ${area(radius)}")
