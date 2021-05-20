package exercicio2

fun main(){
    var coca1 = Coca(1,1.0)
    var coca2 = Coca(2, 1.0)
    println(coca1.equals(coca2)) // RESULTADO: FALSE
    println(coca1.tamanho.equals(coca2)) // RESULTADO: FALSE
}