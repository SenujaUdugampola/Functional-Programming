import scala.io.StdIn.readLine

def getProductList(): List[String] = {
  var productList: List[String] = List()
  var input: String = ""

  while input.toLowerCase != "done" do
    input = readLine("Enter a product name (or type 'done' to finish): ")
    if input.toLowerCase != "done" then
      productList = productList :+ input

  productList
}

def printProductList(productList: List[String]): Unit = {
  for (product, index) <- productList.zipWithIndex do
    println(s"${index + 1}. $product")
}

def getTotalProducts(productList: List[String]): Int = {
  productList.length
}

@main def runInventoryManagement(): Unit = {
  val products = getProductList()
  println("Product List:")
  printProductList(products)
  println(s"Total number of products: ${getTotalProducts(products)}")
}
