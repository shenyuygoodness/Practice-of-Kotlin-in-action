fun main(){
    var sum: Int = 0
    for(i in 10..30){
        if(i%2 == 0){
            sum += i
        }
    }
    println(" The sum of even numbers btn 10 an 30 is $sum")
}