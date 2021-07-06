package one.digitalinnovation.collections

fun main (){
    val henrique = Funcionario("Henrique", 2000.0,"CEO")
    val robertinho = Funcionario("Roberto", 1200.0, "CFO")
    val claudia = Funcionario("Claudia", 1500.0, "CMO")

    val repositorio = Repositorio<Funcionario>()

    repositorio.create(henrique.nome, henrique)
    repositorio.create(robertinho.nome, robertinho)
    repositorio.create(claudia.nome, claudia)

    println(repositorio.findById(henrique.nome))

    println("-----------------------")
    repositorio.findAll().forEach{println(it)}

    println("-----------------------")
    println(repositorio.remove(robertinho.nome))
    repositorio.findAll().forEach{println(it)}

}