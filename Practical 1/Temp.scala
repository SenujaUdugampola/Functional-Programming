object Temp{
  def convert(current_temp:Double): Double = {
    current_temp * 1.8000 + 32.00
  }
  def main(args: Array[String]): Unit = {
    val current_temp = 35
    println(s"$current_temp celsius is equal to ${convert(current_temp:Double)} fatrnhite ")
  }
}