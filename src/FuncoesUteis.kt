/**
 * Created by dehemart on 16/08/17.
 */

fun jogaPraTela(inicio: String, final: String, meio: String = "Meio"): String {
  return "Inicio ${inicio} => ${meio} => Fim ${final}"
}

data class Assinante(val nome: String, val documento: String, val ativo: Boolean = true)
