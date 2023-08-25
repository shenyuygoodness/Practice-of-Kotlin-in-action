fun convertCelsiusToFahrenheit(celsius: Double): Double {
    return (celsius * 9 / 5) + 32
}

fun main() {
    val celsius = 0.0
    val fahrenheit = convertCelsiusToFahrenheit(celsius)
    println("$celsius degrees Celsius is equal to $fahrenheit degrees Fahrenheit.")
}