fun main() {
    `hello-code`(2) //ここの数字で結果が変化する
}

fun `hello-code`(type:Int) {
    if (type == 1) {
        println("Hello!")
    } else if (type == 2) {
        println("Good morning!")
    } else if (type == 3) {
        println("Good Afternoon!")
    } else if (type == 4) {
        println("Good evening")
    } else {
        println("What")
    }
}