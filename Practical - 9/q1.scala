@main def ActualInterest(input: Int) : Unit = {
    
    val InterestMoney:Int => String = {
        case x if x < 0 => "No interest"
        case x if x <= 20000 => "Interest Money is "+ x * 0.02
        case x if x <= 200000 => "Interest Money is "+ x * 0.04
        case x if x <= 2000000 => "Interest Money is "+ x * 0.035
        case x if x > 2000000 => "Interest Money is "+ x * 0.065
        case _  => "No interest"
    }

    println(InterestMoney(input))
}