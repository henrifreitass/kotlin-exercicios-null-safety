fun validarBioInfantil(bio: String?) {

    val tamanho = bio?.length ?: 0

    if (tamanho <= 50) {
        println("Bio aceita")
    } else {
        println("Bio muito longa")
    }
}

fun main() {

    validarBioInfantil("Eu gosto de jogar videogame!")
    validarBioInfantil(null)
    validarBioInfantil("Eu gosto de brincar, estudar, assistir filmes e jogar videogame com meus amigos.")
}