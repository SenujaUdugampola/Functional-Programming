var itemNames: Array[String] = Array("Mango","Pineapple","Watermelon")
var itemQuantities: Array[Int] = Array(10, 5, 8)

def displayInventory(): Unit = {
    println("Current Invenory: ")
    for i <- itemNames.indices do
        println(itemNames(i)+": "+itemQuantities(i))
}

def restockItem(itemName: String,quantity: Int): Unit = {
    val index = itemNames.indexOf(itemName)
    if index >= 0 then
        itemQuantities(index) += quantity
        println("Restocked "+quantity+" of "+itemName+". New quantity: "+itemQuantities(index))
    else
        println("Item "+itemName+" does not exist in inventory.")
}

def sellItem(itemName: String, quantity: Int): Unit = {
    val index = itemNames.indexOf(itemName)
    if index >= 0 then
        if itemQuantities(index) >= quantity then
            itemQuantities(index) -= quantity
            println("Sold "+ quantity +" of "+itemName)
        else
            println("Not enough "+itemName+" to sell.")
        else
            println("Item "+itemName+" does not exist in inventory.")
}

@main def main(): Unit = {
    displayInventory()
    println()

    restockItem("Pineapple", 10)
    displayInventory()
    println()

    sellItem("Watermelon", 3)
    displayInventory()
    println()

    sellItem("Mango", 12)
    displayInventory()
    println()
}