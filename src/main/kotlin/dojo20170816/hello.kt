import maxindex.MaxOf
import sum.sum

fun main(args: Array<String>){
    println(jogaPraTela("1", "2", "3"))
    println(jogaPraTela(final="2", inicio = "1"))

    val assinante = Assinante(nome = "Leandro", documento = "12344")

    val valores = intArrayOf(1, 2, 9)

    println(sum(valores))

    val maximo = intArrayOf(1, 19, 2, 47)
    println(MaxOf.indexOfMax(maximo))
    val maximo1 = intArrayOf(Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE)
    println(MaxOf.indexOfMax(maximo1))

    println(runs(intArrayOf(0,1,1,3)))


}