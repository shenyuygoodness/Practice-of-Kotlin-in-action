fun positiveArray(array: IntArray): IntArray{
    var poArray: IntArray = intArrayOf()
    for(i in array){
        if(array[i]>=0){
            var poArray = array[i]
        }
    }
    return poArray
}
fun main(){
    val arr = intArrayOf(1, 4, -4, 3, -7)
    val poArray = positiveArray(arr)
    println("$poArray")
}