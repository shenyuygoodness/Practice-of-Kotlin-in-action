fun main(){
    var i: Int = 0
    val array: IntArray = intArrayOf(2, 5, 3, 7, 4)
    var n = array.count { true }
    var max = array[1]
    while (i<=n-1){
        if(array[1]<array[i]){
            max = array[i]
            n--
        }
        i++
    }
    println("The maximum number in the array is $max")
}