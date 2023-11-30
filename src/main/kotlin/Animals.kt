// Concrete Element
class Lion : Animal {

    fun roar() {
        println("Lion: Roar!")
    }

    override fun accept(visitor: Visitor) {
        visitor.visitLion(this)
    }
}

// Concrete Element
class Elephant : Animal {

    fun trumpet() {
        println("Elephant: Trumpeting!")
    }

    override fun accept(visitor: Visitor) {
        visitor.visitElephant(this)
    }
}