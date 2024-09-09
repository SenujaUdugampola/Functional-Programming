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

class Bank(private val accounts: List[Account]) {
  
  def getAccountsWithNegativeBalances: List[Account] = {
    accounts.filter(_.getBalance < 0)
  }

  def calculateTotalBalance: Double = {
    accounts.map(_.getBalance).sum
  }

  def applyInterest(): Unit = {
    accounts.foreach { account =>
      val balance = account.getBalance
      val interestRate = if (balance > 0) 0.05 else 0.10
      val interest = balance * interestRate
      if (interest > 0) {
        account.deposit(interest)
      }
    }
  }

  override def toString: String = accounts.mkString("\n")
}

@main def testBank(): Unit = {
  val account1 = new Account(1000.00)
  val account2 = new Account(-500.00)
  val account3 = new Account(200.00)
  val account4 = new Account(-100.00)

  val bank = new Bank(List(account1, account2, account3, account4))

  println("Accounts with negative balances:")
  bank.getAccountsWithNegativeBalances.foreach(println)

  println(s"\nTotal balance: ${bank.calculateTotalBalance}")

  bank.applyInterest()

  println("\nBalances after applying interest:")
  println(bank)
}
