import kotlin.collections.List as List1
fun main (){
    val a = ArrayList<ArrayList<String>>()
    val aa = arrayListOf("","")
    var ab = arrayListOf("","")
    var num=1
    while (num<3) {
        println("Enter country :")
        var country = readLine()!!.toString()

        println("Enter capital :")
        var capital = readLine()!!.toString()
        num++

        aa.add(country)
        aa.add(capital)
        ab.add(country)
        ab.add(capital)

        println(a.add(ArrayList(aa)))
        println(a.add(ArrayList(ab)))

    }
  for (i in a){
      println(i)
  }
}




