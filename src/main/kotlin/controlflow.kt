import java.awt.Color
import java.awt.Color.blue
import java.awt.Color.red

var color: Color = red

fun main(){
    color = blue
    when(color){
        blue -> println("wrong color")
        else -> println(color)
    }

    println("I don tire this live oh")
}