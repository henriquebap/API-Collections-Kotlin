package one.digitalinnovation.collections

fun main(){
    val henrique = Funcionario("Henrique",2000.0,"CEO")
    val maria = Funcionario("Maria Eduarda", 2999.9,"CFO")
    val joaozinho = Funcionario("Joao", 2000.0,"SLA")

    println("------------ List ---------------")
    val funcionarios = mutableListOf(henrique,maria)
    funcionarios.forEach{ println(it) }

    println("---------------------------")
    funcionarios.add(joaozinho)
    funcionarios.forEach{println(it)}

    println("---------------------------")
    funcionarios.remove(maria)
    funcionarios.forEach{println(it)}

    println("------------- SET --------------")
    val funcionariosSet = mutableSetOf(henrique)
    funcionariosSet.forEach{println(it)}

    println("---------------------------")
    funcionariosSet.add(maria)
    funcionariosSet.forEach{println(it)}

    println("---------------------------")

    funcionariosSet.remove(maria)
    funcionariosSet.forEach{println(it)}
}