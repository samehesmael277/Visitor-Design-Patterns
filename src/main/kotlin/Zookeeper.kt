// Concrete Visitor
class Zookeeper : Visitor {

    override fun visitLion(lion: Lion) {
        println("Zookeeper is feeding the lion.")
        lion.roar()
    }

    override fun visitElephant(elephant: Elephant) {
        println("Zookeeper is giving a medical checkup to the elephant.")
        elephant.trumpet()
    }
}