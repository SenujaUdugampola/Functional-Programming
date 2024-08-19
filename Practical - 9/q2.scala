@main def PatternMatching(input: Int) : Unit = {
    
    val Number:Int => String = {
        case x if x == 0 => "Zero"
        case x if x % 2 == 0 => "Even Number"
        case x if x % 2 == 1 => "Odd Numbe"
        case _  => "Neagative"
    }

    println(Number(input))
}