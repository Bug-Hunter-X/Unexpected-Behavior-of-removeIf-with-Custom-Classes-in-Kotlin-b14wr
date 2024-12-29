fun main() {
    data class MyClass(val id: Int, val name: String) {
        override fun equals(other: Any?): Boolean {
            if (this === other) return true
            if (javaClass != other?.javaClass) return false

            other as MyClass

            if (id != other.id) return false
            if (name != other.name) return false

            return true
        }

        override fun hashCode(): Int {
            var result = id
            result = 31 * result + name.hashCode()
            return result
        }
    }

    val myList = mutableListOf(MyClass(1, "one"), MyClass(2, "two"), MyClass(3, "three"))
    myList.removeIf { it.id % 2 == 0 }
    println(myList) // Output: [MyClass(id=1, name=one), MyClass(id=3, name=three)]
}
