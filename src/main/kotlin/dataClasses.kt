class Client(val name: String, val postalCode: Int){
    override fun equals(other: Any?): Boolean {
        if (other == null || other !is Client)
            return false
        return name == other.name && postalCode == other.postalCode
    }
    override fun toString() = "Client(name = $name, postalCode = $postalCode)"
}
fun main(){
    var client1 = Client("Alice", 4356)
    print(client1)
}