package one.digitalinnovation.collections

fun main(){
    val henrique = Funcionario("Henrique", 800.0)
    val maristela = Funcionario("Maristela", 1000.0)
    val wilson = Funcionario("Wilson", 1200.0)

    val funcionarios = listOf(henrique,maristela,wilson)

    funcionarios.forEach{ println(it)}

    println("-------------------")
    println(funcionarios.find{it.nome == "Maristela"})
}

data class Funcionario(
    val nome: String,
    val salario: Double
){
    override fun toString(): String =
        """
            Nome : $nome
            Salario: $salario
            
        """.trimIndent()

}