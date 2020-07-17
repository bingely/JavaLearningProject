fun main() {
    println("helloworld")





    // c. 次构造函数
    // 实例化类
    KUser("hjc") // 调用主构造函数
    KUser()      // 调用次构造函数1
    KUser(2)     // 调用次构造函数2
    KUser("male", 26) // 调用次构造函数3


    // run函数
    val people = KUser("carson", 25)
    val result = people?.run {
        println("my name is $sex, I am $age years old")
        999
    }
// 最终结果 = 返回999给变量result


}