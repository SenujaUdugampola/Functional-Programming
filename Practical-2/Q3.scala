def calculateHomesalary(normalHour:Int,OThour: Int) : Double = {
    var normalHourprice: Int = 250
    var OThourprice: Int = 85
    val tax: Double = 0.12

    //val normalHour: Int = 40
    //val OThour: Int = 30

    var home_salary: Int = normalHour * normalHourprice + OThour * OThourprice
    var tax_amount: Double = home_salary * tax
     home_salary - tax_amount
}

@main def HomeS() : Unit = 
    val normalHour = 40
    val OThour = 30
    println("Working Salary of a typical employee is "+calculateHomesalary(normalHour:Int,OThour: Int)+" Rupees")