package one.digitalinnovation.collections

fun main(){
    val henrique = Funcionario("Henrique", 2000.0,"CEO")
    val robertinho = Funcionario("Roberto", 1200.0, "CFO")
    val claudia = Funcionario("Claudia", 1500.0, "CMO")

    val funcionarios1 = setOf(henrique,robertinho)
    val funcionarios2 = setOf(claudia)

    val resultUnion = funcionarios1.union(funcionarios2)
    resultUnion.forEach{ println(it) }

    println("-----------------------")
    val funcionarios3 = setOf(henrique, robertinho, claudia)
    val resulSubtract = funcionarios3.subtract(funcionarios2)
    resulSubtract.forEach { println(it) }

    println("-----------------------")
    val resultIntersect = funcionarios3.intersect(funcionarios2)
    resultIntersect.forEach { println(it) }

}