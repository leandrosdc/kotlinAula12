package exercicio3

fun main(){
    var listaDeAlunos = mutableListOf<Aluno>()
    listaDeAlunos.add(Aluno("Leandro", 1))
    listaDeAlunos.add(Aluno("Kimberly", 2))
    listaDeAlunos.add(Aluno("Helo", 3))
    listaDeAlunos.add(Aluno("NovoAluno", 3))

    listaDeAlunos.forEach(){
        if(it.numeroDeAluno == listaDeAlunos[3].numeroDeAluno){
            println("Numero ja utilizado")
        }else println("Numero não utilizado")
    }
}


