package one.digitalinnovation.collections

fun main(){
    val henrique = Funcionario("Henrique", 2800.0, tipoDeContratacao = "Junior")
    val maristela = Funcionario("Maristela", 1000.0, "Estagio")
    val wilson = Funcionario("Wilson", 12000.0, "CEO")

    val funcionarios = listOf(henrique,maristela,wilson)

    funcionarios.forEach{ println(it)}

    println("-------------------")
    println(funcionarios.find{it.nome == "Maristela"})

    println("-------------------")
    funcionarios
        .sortedBy { it.salario }
        .forEach{ println(it)}
}

data class Funcionario(
    val nome: String,
    val salario: Double,
    val tipoDeContratacao: String
){
    override fun toString(): String =
        """
            Nome :   $nome
            Salario: $salario
            Tipo De Contratacao : $tipoDeContratacao
        """.trimIndent()

}