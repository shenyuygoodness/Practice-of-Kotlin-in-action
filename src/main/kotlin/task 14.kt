fun main(){
    var firstValue: Int = 0
    var secondValue: Int = 1
    var fibN: Int = 0
    var n: Int = 10
    for(i in 1..n){
        print("$firstValue ")
        fibN = firstValue + secondValue
        firstValue = secondValue
        secondValue = fibN
    }

}