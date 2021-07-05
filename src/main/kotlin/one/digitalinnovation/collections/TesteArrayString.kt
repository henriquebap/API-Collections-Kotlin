package one.digitalinnovation.collections

fun main(){
    val nomes = Array(4){""}

    nomes[0] = "zicao"
    nomes[1] = "xicao"
    nomes[2] = "bicao"
    nomes[3] = "anao"

    for (nome in nomes) {
        println(nome)
    }
    println("-----------------------")
    nomes.sort()
    nomes.forEach {println(it)}

    println("-----------------------")
    val nomes2 = arrayOf("Bicao", "Ana", "xicao")

    nomes2.sort()
    nomes2.forEach { println(it) }
}