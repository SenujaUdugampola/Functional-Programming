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

def findBestPrice(startPrice: Int, endPrice: Int, increment: Int): Int = {
    var bestPrice = startPrice
    var maxProfit = 0

    var currentPrice:Int = startPrice
    while (currentPrice <= endPrice) {
        val currentProfit = profit(currentPrice)
        if (currentProfit > maxProfit) {
            maxProfit = currentProfit
            bestPrice = currentPrice
        }
        currentPrice += increment
    }

    bestPrice
}

@main def relationship(): Unit = {
    val startPrice = 5
    val endPrice = 50
    val increment = 5

    val bestPrice = findBestPrice(startPrice, endPrice, increment)
    println(s"The best ticket price to maximize profit is Rs $bestPrice")
    println("Price\tAttendees\tRevenue\tCost\tProfit")
    for (price <- startPrice to endPrice by increment) {
        println(s"$price\t${attendees(price)}\t\t${revenue(price)}\t${cost(price)}\t${profit(price)}")
    }
}
