package exercicio1

fun main(){
    var pessoa1 = Pessoa("Leandro",1234567890)
    var pessoa2 = Pessoa("Kimberly", 1234567890)
    println(pessoa1.equals(pessoa2)) // RESULTADO: FALSE
    println(pessoa1.rg.equals(pessoa2.rg)) // RESULTADO: TRUE
}