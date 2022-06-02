fun main() {

    DatabaseClient().apply {
        url = "localhost:3306"
        username = "mysql"
        password = "1234"
    }.connect()
        .run { println(this) }


}