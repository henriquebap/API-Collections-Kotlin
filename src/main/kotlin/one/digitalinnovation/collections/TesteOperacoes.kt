package one.digitalinnovation.collections

fun main(){
    val salarios = doubleArrayOf(100.0, 2000.0, 6660.0, 500.0)

    for (salario in salarios){
        println(salario)
    }

    println("-----------------------")
    println("Maior salario:  ${salarios.maxOrNull()}")
    println("Menor Salarios: ${salarios.minOrNull()}")
    println("Media Salarial: ${salarios.average()}")

    val salariosMenor2500 = salarios.filter { it > 2500.0 }
    println("-----------------------")
    salariosMenor2500.forEach{ println(it)}

}
