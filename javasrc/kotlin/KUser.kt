class KUser(username: String) {

    //Kotlin的类可以拥有属性：关键字var（读写） / 关键字val（只读）
    var phone: String = ""
    val sex: String = "男"
    val age: Int = 0


    // 主构造
    init {
        println(username)
    }
    // 次构造函数1：可通过this调主构造函数
    constructor() : this("hjc")

    // 次构造函数2：可通过this调主构造函数
    constructor(age: Int) : this("hjc") {
        println(age)
    }

    // 次构造函数3：通过this调主构造函数
    constructor(sex: String, age: Int) : this("hjc") {
        println("$sex$age")
    }

}