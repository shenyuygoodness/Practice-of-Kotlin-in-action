fun main(){
    var mul: Int = 1
    for(i in 1..12){
        println("Multiplication table for $i")
        for(n in 1..12){
            mul = i * n
            println("$i * $n = $mul")
        }
    }
}