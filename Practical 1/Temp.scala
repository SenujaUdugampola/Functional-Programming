  def convert(current_temp:Double): Double = {
    current_temp * 1.8000 + 32.00
  }
@main def Temp() =
    val current_temp = 35
    println(s"$current_temp celsius is equal to ${convert(current_temp:Double)} fatrnhite ")