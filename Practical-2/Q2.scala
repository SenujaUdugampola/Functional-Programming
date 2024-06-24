@main def evaluateExpressions2(): Unit = {
  var a: Int = 2
  var b: Int = 3
  var c: Int = 4
  var d: Int = 5
  var k: Float = 4.3f
  var g: Float = 0.0f 

  println(b * a + c * d)
  println(a)
  a += 1

  println(-2 * (g - k) + c)

  println(c)
  c += 1
  c += 1
  println(c * a)
  a += 1
} 
