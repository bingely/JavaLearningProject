fun main() {
    println("hello")

    val test = listOf(1, 3, 4, 7)

    println("大于5的数${test.filter { it > 5 }}")


    // 无参数
    val hello = { println("hello other")}
    hello()


    // 有参数



    val lambda = { println("test")}
    lambda()
    lambda.invoke()
}


val hello = { println("hello other")}
fun hello() {
    print("hello kotlin")
}



// 等价于函数
fun sum(a: Int, b: Int): Int {
    return a
}































//