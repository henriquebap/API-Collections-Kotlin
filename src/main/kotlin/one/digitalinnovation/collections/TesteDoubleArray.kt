package one.digitalinnovation.collections

fun main(){
    val salarios = DoubleArray(3)
    salarios[0] = 100.2
    salarios[1] = 1000.1
    salarios[2] = 9999.9

    salarios.forEach{ println(it)}

    println("---------------------------")
    salarios.forEachIndexed{ index, salario ->
        salarios[index] = salario * 1.5
    }
    salarios.forEach { println(it) }

    println("---------------------------")
    val salarios2 = doubleArrayOf(1500.5, 1.0, 10000000.0)
    salarios2.sort()
    salarios2.forEach { println(it) }

}



