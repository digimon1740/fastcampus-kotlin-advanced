fun getStr(): Nothing = throw Exception("예외 발생 기본 값으로 초기화")

fun main() {

    val result1 = try {
        getStr()
    } catch (e: Exception) {
        println(e.message)
        "기본값"
    }
    println(result1)

    val result2 = runCatching { "성공" }
        .getOrNull()

    println(result2)

    val result3: Throwable? = runCatching { getStr() }
        .exceptionOrNull()


    result3?.let {
        println(it.message)
        throw it
    }

    val result4 = runCatching { getStr() }
        .getOrDefault("기본 값")

    println(result4)

    val result5 = runCatching { getStr() }
        .getOrElse {
            println(it.message)
            "기본 값"
        }

    println(result5)

    val result6: String = runCatching { "성공" }
        .getOrThrow()

    println(result6)

    val result7 = runCatching { "안녕" }
        .map {
            "${it}하세요"
        }.getOrThrow()

    println(result7)

    val result8 = runCatching { "안녕" }
        .mapCatching {
            throw Exception("예외")
        }.getOrDefault("기본 값")

    println(result8)

    val result9 = runCatching { getStr() }
        .recover {
            "복구"
        }
        .getOrNull()

    println(result9)

    val result10 = runCatching { getStr() }
        .recoverCatching {
            throw Exception("예외")
        }
        .getOrDefault("복구")

    println(result10)
}
// 예외 발생 기본 값으로 초기화
// 기본값