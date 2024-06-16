object VolumeSphere{
  def volume(radius: Double): Double = {
    (4.00/3.00) * math.Pi * radius * radius * radius
  }

  def main(args: Array[String]): Unit = {
    val radius = 5
    println(s"The volume of a sphere with radius $radius is ${volume(radius)}")
  }
}