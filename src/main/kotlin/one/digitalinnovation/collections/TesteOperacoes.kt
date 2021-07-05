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

    val salariosMenor2500 = salarios.filter { it < 2500.0 }
    println("-----------------------")
    salariosMenor2500.forEach{ println("Esses sao os salarios maiores do que 2500 : " + it)}

    println("-----------------------")
    println("Existem " + salarios.count{ it in 200.0..10000.0} + " Salarios entre 200 - 10000")

    println("-----------------------")
    println(salarios.find { it == 2000.0 })
    println(salarios.find { it == 5000.0 })

    println("-----------------------")
    println(salarios.any{ it == 100.0})
    println(salarios.any{ it == 10055.0})
}
