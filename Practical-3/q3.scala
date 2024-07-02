import scala.math.BigDecimal.RoundingMode

def msum(num1: Int, num2: Int): Int = {
    def msumrec(a: Int, b: Int, x: Int): Int ={
        if(b == 0) x
        else msumrec(a,b-1,x+1)
    }
    msumrec(num1, num2, 0)
}

def amean(num1: Int, num2: Int): Unit = {
    val tSum = msum(num1, num2)
    val mean = tSum / 2.0
}

@main def calThings(): Float = {
    println("Enter number 1 : ")
    val num1 = scala.io.StdIn.readInt()

    println("Enter number 2 : ")
    val num2 = scala.io.StdIn.readInt()

    val result = amean(num1,num2)
    println(f"The arithmetic mean (average) of the two numbers $num1%d, $num2%d rounded to two decimal places is - $result%.2f")

}