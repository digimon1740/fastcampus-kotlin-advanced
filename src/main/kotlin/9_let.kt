fun main() {

    val str: String? = "안녕"

    val result: Int? = str?.let {
        println(it)

        val abc: String? = "abc"
        val def: String? = "def"
        if (!abc.isNullOrEmpty() && !def.isNullOrEmpty()) {
            println("abcdef가 null 아님")
        }


        1234
    }
    println(result)


//    val this: String? = null
//    val it : String? = null


    val hello = "hello"
    val hi = "hi"

    hello.let { a : String ->

        //println(a.length)

        hi.let{ b ->
            println(a.length)
            println(b.length)
        }
    }

}