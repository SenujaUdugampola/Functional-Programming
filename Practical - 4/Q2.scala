def checkNumber(n: Int): Unit = {
    n match
        case n if n <= 0 => println("A Negativ/Zero input")
        case n if n % 2 == 0 => println("An Even number input")
        case _ => println("An Odd number input")
}

@main def main2(args: String*): Unit = {
    if args.length != 1 then
        println("Please provide exactly one integer argument")
    else
        try
            val num = args(0).toInt
            checkNumber(num)
        catch
            case e: NumberFormatException => println("Please provide a valid integer")
}