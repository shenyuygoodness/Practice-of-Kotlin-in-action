fun isPrime(num: Int): Boolean{
    for(i in 1..num/2){
       if(num%i != 0){
           return true
       }
    }
    return  false
}

fun main(){
    val value = 7
    val prime = isPrime(value)
    println(prime)
}