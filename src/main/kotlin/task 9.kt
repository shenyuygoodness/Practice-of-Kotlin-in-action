fun convertFahrenheitToCelsius(fahrenheit: Double): Double {
    return (fahrenheit * 9 / 5) + 32
}
fun main(){
    val fahrenheit = 89.0
    val celsius = convertFahrenheitToCelsius(fahrenheit)
    println("$fahrenheit degrees Celsius is equal to $celsius degrees Fahrenheit.")
}