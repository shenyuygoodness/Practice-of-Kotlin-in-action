open class BankAccount(val accountNumber: Int, var balance: Double){
    fun deposit(amount: Double){
        balance += amount
    }
    fun withdraw(amount: Double){
        if(amount > balance){
            println("insufficient funds")
        }else{
            balance -= amount
        }
    }
    open fun getAccountInfo(): String{
        return "accountNumber: $accountNumber, balance: $balance"
    }
}
class SavingsAccount(val interestRate: Double, accountNumber: Int, balance: Double): BankAccount(accountNumber, balance){
    fun calculateInterest(): Double{
        return balance * interestRate
    }
    override fun getAccountInfo(): String{
        return super.getAccountInfo() + " InterestRate: $interestRate"
    }

}
class Bank(val name: String){
    val accounts: MutableList<BankAccount> = mutableListOf()
    fun addAccount(account: BankAccount){
        accounts.add(account)
    }
    fun getTotalBalance(): Double {
        var totalBalance: Double = 0.0
        for(account in accounts){
            totalBalance += account.balance
        }
        return totalBalance
    }
}

fun main(){
    val bank = Bank("Limo")
    val save1 = SavingsAccount(3.2, 112223, 3900.0)
    val save2 = SavingsAccount(1.2, 124532, 1222.4)

    bank.addAccount(save1)
    bank.addAccount(save2)

    save1.deposit(600.0)
    save2.withdraw(2000.0)

    println(save1.calculateInterest())
    println(save2.calculateInterest())

    println(save1.getAccountInfo())
    println(save2.getAccountInfo())

    println(bank.getTotalBalance())

}