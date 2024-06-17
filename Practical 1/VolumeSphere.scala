  def volume(radius: Double): Double = {
    (4.00/3.00) * math.Pi * radius * radius * radius
  }

@main def VolumeSphere() =
    val radius = 5
    println(s"The volume of a sphere with radius $radius is ${volume(radius)}")