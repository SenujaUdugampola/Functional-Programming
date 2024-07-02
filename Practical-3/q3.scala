import scala.math.BigDecimal.RoundingMode

def average(a: Int, b: Int): Float = {
    var average: Float = a.toFloat + b.toFloat
    return BigDecimal(average/2).setScale(2, BigDecimal.RoundingMode.HALF_UP).toFloat
}

@main def run(): Unit = {
    println("The arithmetic mean of 10 and 23, rounded to 2 decimal places is : "+average(10,23))
}
