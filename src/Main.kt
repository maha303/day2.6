import kotlin.collections.List as List1
fun main () {
    val Countries = arrayListOf(arrayListOf<String>())
    for (i in 0..2) {
        var country = ""
        var capital = ""

        println("Enter country :")
        country = readLine()!!

        println("Enter capital :")
        capital = readLine()!!
        Countries.add(arrayListOf(country, capital))
    }
    for (i in Countries) {
        if (i.isNotEmpty()) {
            println("the capital of ${i[0]} is ${i[1]}")
        }
    }
}





