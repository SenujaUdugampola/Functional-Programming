import scala.io.StdIn.readLine

case class Product(name: String, quantity: Int, price: Double)

def getAllProductNames(inventory: Map[Int, Product]): List[String] = {
  inventory.values.map(_.name).toList
}

def calculateTotalValue(inventory: Map[Int, Product]): Double = {
  inventory.values.map(p => p.quantity * p.price).sum
}

def isInventoryEmpty(inventory: Map[Int, Product]): Boolean = {
  inventory.isEmpty
}

def mergeInventories(inventory1: Map[Int, Product], inventory2: Map[Int, Product]): Map[Int, Product] = {
  inventory2.foldLeft(inventory1) {
    case (acc, (id, newProduct)) =>
      acc.get(id) match {
        case Some(existingProduct) =>
          val updatedProduct = existingProduct.copy(
            quantity = existingProduct.quantity + newProduct.quantity,
            price = Math.max(existingProduct.price, newProduct.price)
          )
          acc.updated(id, updatedProduct)
        case None =>
          acc.updated(id, newProduct)
      }
  }
}

def checkAndPrintProductDetails(inventory: Map[Int, Product], productId: Int): Unit = {
  inventory.get(productId) match {
    case Some(product) =>
      println(s"Product ID: $productId")
      println(s"Name: ${product.name}")
      println(s"Quantity: ${product.quantity}")
      println(s"Price: ${product.price}")
    case None =>
      println(s"Product with ID $productId not found.")
  }
}

@main def run(): Unit = {
  var inventory1 = Map[Int, Product]()
  var inventory2 = Map[Int, Product]()

  println("Enter the number of products in inventory1:")
  val n1 = readLine().toInt
  for (_ <- 1 to n1) {
    println("Enter product ID, name, quantity, and price (separated by space):")
    val Array(id, name, quantity, price) = readLine().split(" ")
    inventory1 += (id.toInt -> Product(name, quantity.toInt, price.toDouble))
  }

  println("Enter the number of products in inventory2:")
  val n2 = readLine().toInt
  for (_ <- 1 to n2) {
    println("Enter product ID, name, quantity, and price (separated by space):")
    val Array(id, name, quantity, price) = readLine().split(" ")
    inventory2 += (id.toInt -> Product(name, quantity.toInt, price.toDouble))
  }

  println(s"All product names in inventory1: ${getAllProductNames(inventory1)}")
  println(s"Total value of all products in inventory1: ${calculateTotalValue(inventory1)}")
  println(s"Is inventory1 empty: ${isInventoryEmpty(inventory1)}")

  val mergedInventory = mergeInventories(inventory1, inventory2)
  println(s"Merged inventory: $mergedInventory")

  println("Enter the product ID to check in inventory1:")
  val productId = readLine().toInt
  checkAndPrintProductDetails(inventory1, productId)
}
