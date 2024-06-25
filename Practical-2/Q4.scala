def attendees(price: Int): Int = {
    120 + (15 - price) / 5 * 20
}

def revenue(price: Int): Int = {
    attendees(price) * price
}

def cost(price: Int): Int = {
    500 + 3 * attendees(price)
}

def profit(price: Int): Int = {
    revenue(price) - cost(price)
}

@main def relationship(): Unit = {
    println("Profit for Rs.5 Ticket : "+profit(5))
    println("Profit for Rs.10 Ticket : "+profit(10))
    println("Profit for Rs.15 Ticket : "+profit(15))
    println("Profit for Rs.20 Ticket : "+profit(20))
    println("Profit for Rs.25 Ticket : "+profit(25))
    println("Profit for Rs.30 Ticket : "+profit(30))
    println("Profit for Rs.35 Ticket : "+profit(35))
    println("Profit for Rs.40 Ticket : "+profit(40))
}
