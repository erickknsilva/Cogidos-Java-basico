/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package OO.Composicao1.MuitosPraMuitos;

/**
 *
 * @author eric
 */
public class CursoTeste {

    public static void main(String[] args) {
        Aluno a1 = new Aluno("Erick");
        Aluno a2 = new Aluno("Amauri");
        Aluno a3 = new Aluno("Lucas");

        Curso c1 = new Curso("Java Completo");
        Curso c2 = new Curso("Banco de Dados");
        Curso c3 = new Curso("React Native");

        c1.adicionarAluno(a1);  //passando o aluno1  para o curso 1
        c1.adicionarAluno(a2);  //passando o aluno2  para o curso 1

        c2.adicionarAluno(a1); //passando o aluno1  para o curso 2
        c2.adicionarAluno(a3); //passando o aluno3  para o curso 2

        a1.adicionarCurso(c3); //passando o aluno1  para o curso 3
        a2.adicionarCurso(c3); //passando o aluno2  para o curso 3
        a3.adicionarCurso(c3); //passando o aluno2  para o curso 3

        for (Aluno aluno : c3.alunos) { //pasa os nome dos alunos matriculado no curso 3 para aluni
            System.out.println("Estou matriculado no curso " + c3.nome); //imprimir o nome do curso 3
            System.out.println("... e meu nome é " + aluno);//imprimir o nome dos alunos matriculados no curso3
            System.out.println();
        }

        System.out.println(a1.cursos.get(2).alunos);
        System.out.println(c3.alunos.get(0).cursos);
        System.out.println();

        Curso cursoEncontrado = a3.getNomeDoCurso("React Native"); //procurar o nome do curso
        if (cursoEncontrado != null) {// se o curso dentro do parametro for encontrado
            System.out.println(cursoEncontrado.nome); //retornar o nome do curso
            System.out.println(cursoEncontrado.alunos); // e os alunos que fazem o curso
        }
        
        
    }
}
