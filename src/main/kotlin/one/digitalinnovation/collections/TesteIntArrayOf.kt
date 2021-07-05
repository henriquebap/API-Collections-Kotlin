package one.digitalinnovation.collections

fun main(){

    val values = intArrayOf(2, 3, 5, 6, 99, 8, 5.0, 532, 2 ,523, 5, 23, 5)

    values.forEach {
        println(it)
    }
    println("------------------")
    values.sort()
    values.forEach {
        println(it)
    }
}
