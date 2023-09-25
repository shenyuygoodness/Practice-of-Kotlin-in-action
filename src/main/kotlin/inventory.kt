open class Product(val name: String, val price: Double){
    open fun getProductInfo(): String{
        return "Name: $name, price: $price"
    }
}
class Electronics(name: String, price: Double,val brand: String): Product(name, price){
    private var discountPercentage: Double = 0.0
    fun setDiscountPercentage(percentage: Double){
         discountPercentage = percentage
    }
    override fun getProductInfo(): String{
        return super.getProductInfo() + "\n brand: $brand\n Discount: $discountPercentage"
    }
}

class Clothing(name: String, price: Double,val size: String): Product(name, price){
       fun isSizeAvailable(size: String): Boolean{
           return this.size.equals(size, ignoreCase = true)
       }
}


fun main(){
    val product1 = Product("tech", 5000.56)
    val electron1 = Electronics("Laptops", 400.4, "Dell")
    val cloth1 = Clothing("skirt", 324.1, "3.5")

    println(product1.getProductInfo())
    println(electron1.setDiscountPercentage(32.2))
    println(cloth1.isSizeAvailable("32.3"))

}