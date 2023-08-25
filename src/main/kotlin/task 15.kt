fun fibonacci(num: Int): Long{
    return if(num == 0 || num==1) num.toLong()  else {fibonacci(num-1) + fibonacci(num-2)}
}
fun main(){
    val num = 5
    val nthFibonacci = fibonacci(num)
    println(nthFibonacci)
}