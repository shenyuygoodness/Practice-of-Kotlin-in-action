fun main(){
    var num: Int = 10
    var mul: Int = 1
    while(num>=1){
        mul = mul * num
        num--
    }
    println("The factorial of 10 is $mul")
}