fun main() {
    forever()
}

fun forever(): Nothing {

    while (true) {
        Thread.sleep(1000)
        println("Hello")
    }
}