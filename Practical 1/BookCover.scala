
  def cost(copies: Int): Double = {
    val coverprice = 24.95
    val discount = 0.40
    val newprice = coverprice * (1-discount)
    val shippingcost = if(copies <= 50) {
      3
    }else{
      3+(copies -50) * 0.75
    }
    (newprice * copies) + shippingcost
  }

@main  def BookCover() = 
    val copies = 60
    println(s"Total cost for $copies copies is Rs. ${cost(copies)}")
  
