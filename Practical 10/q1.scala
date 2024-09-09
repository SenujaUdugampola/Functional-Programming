// Define the Rational class
class Rational(val numerator: Int, val denominator: Int) {
  require(denominator != 0, "Denominator cannot be zero")
  
  private def simplify(n: Int, d: Int): (Int, Int) = {
    val g = BigInt(n).gcd(BigInt(d)).toInt
    (n / g, d / g)
  }
  
  private val (simplifiedNumerator, simplifiedDenominator) = simplify(numerator, denominator)
  
  def neg: Rational = new Rational(-simplifiedNumerator, simplifiedDenominator)
  
  override def toString: String = s"$simplifiedNumerator/$simplifiedDenominator"
}

@main def testRational(): Unit = {
  val x = new Rational(3, 4)
  println(s"x: $x") 
  println(s"x.neg: ${x.neg}") 
}
