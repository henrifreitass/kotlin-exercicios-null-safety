fun calcularDesconto(valor: Double, cupom: String?): Double {
    return when (cupom) {
        "PROMO10" -> valor - 10
        "PROMO20" -> valor - 20
        else -> valor
    }
}

fun main() {
    val valorProduto = 100.0

    println(calcularDesconto(valorProduto, "PROMO10"))
    println(calcularDesconto(valorProduto, "PROMO20"))
    println(calcularDesconto(valorProduto, null))
    println(calcularDesconto(valorProduto, "OUTRO"))
}