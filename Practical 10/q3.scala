class Account(private var balance: Double) {
  
  def deposit(amount: Double): Unit = {
    require(amount > 0, "Deposit amount must be positive")
    balance += amount
  }

  def withdraw(amount: Double): Unit = {
    require(amount > 0, "Withdrawal amount must be positive")
    require(amount <= balance, "Insufficient funds")
    balance -= amount
  }

  def transfer(amount: Double, target: Account): Unit = {
    require(amount > 0, "Transfer amount must be positive")
    withdraw(amount)  
    target.deposit(amount)  
  }

  def getBalance: Double = balance

  override def toString: String = f"Balance: $balance%.2f"
}

@main def testAccount(): Unit = {
  val account1 = new Account(1000.00)
  val account2 = new Account(500.00)

  println(s"Initial Account 1: $account1") 
  println(s"Initial Account 2: $account2")  

  account1.deposit(200.00)
  println(s"After Deposit in Account 1: $account1") 

  account1.withdraw(150.00)
  println(s"After Withdrawal in Account 1: $account1")  

  account1.transfer(300.00, account2)
  println(s"After Transfer from Account 1 to Account 2:")
  println(s"Account 1: $account1") 
  println(s"Account 2: $account2") 
}
