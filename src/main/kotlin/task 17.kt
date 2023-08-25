fun isPrimeNum(number: Int): Boolean{
    if(number <= 1){
        return false
    }
    for(i in 2 until number){
        if(number % i == 0){
            return false
        }
    }
    return true
}

fun main(){
    val count = 100
    var primeCount = 0
    var currentNumber = 2

    while (primeCount<count){
        if(isPrimeNum(currentNumber)){
            println("$currentNumber ")
            primeCount++
            if(primeCount % 10 == 0){
                println()
            }
        }
        currentNumber++
    }
}