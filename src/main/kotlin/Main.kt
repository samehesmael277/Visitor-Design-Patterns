fun main(args: Array<String>) {
    val lion = Lion()
    val elephant = Elephant()

    val zookeeper = Zookeeper()

    lion.accept(zookeeper)
    elephant.accept(zookeeper)
}