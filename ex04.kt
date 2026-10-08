fun main() {

    val transacoes = listOf(50.0, null, 120.5, null, 10.0)

    var total = 0.0

    for (transacao in transacoes) {

        if (transacao != null) {
            total += transacao
        } else {
            println("Transação ignorada")
        }
    }

    println("Valor total processado: $total")
}