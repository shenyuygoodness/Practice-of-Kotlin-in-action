fun main(){
    val arr: IntArray = intArrayOf(3, 4, 2, 9)
    var sum = 0
    for (i in arr){
        sum +=i
    }
    val average = sum/2
    println(average)
}