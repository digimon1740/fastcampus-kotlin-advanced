class `7_LateInit` {

    lateinit var text: String

    val textInitialized: Boolean
        get() = this::text.isInitialized

    fun printText() {
        println(text)
    }
}

fun a (str:String, block: (String) -> Unit) {
    block(str)
}
fun main() {

    "".let {  }
    a("") {
        it.length
    }
    val test = `7_LateInit`()

    if (!test.textInitialized) {
        test.text = "하이요"
    }
    test.printText()

}