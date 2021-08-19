package oo.composicao;

public class AlunoTeste {
    public static void main(String[] args) {

        Aluno aluno1 = new Aluno("Murillo");
        Aluno aluno2 = new Aluno("Maria");
        Aluno aluno3 = new Aluno("Pedro");

        Curso curso1 = new Curso("Java completo");
        Curso curso2 = new Curso("Web dev");
        Curso curso3 = new Curso("React native");

        curso1.adicionarAluno(aluno1);
        curso1.adicionarAluno(aluno2);

        curso2.adicionarAluno(aluno1);
        curso2.adicionarAluno(aluno3);

        aluno1.adicionarCurso(curso3);
        aluno2.adicionarCurso(curso3);
        aluno3.adicionarCurso(curso3);

        for(Aluno aluno: curso1.alunos) {
            System.out.println("Estou matriculado no curso 1...");
            System.out.println("Meu nome é: " + aluno.nome);
            System.out.println();
        }

        for(Aluno aluno: curso2.alunos) {
            System.out.println("Estou matriculado no curso " + curso2.nome);
            System.out.println("Meu nome é: " + aluno.nome);
            System.out.println();
        }

        for(Aluno aluno: curso3.alunos) {
            System.out.println("Estou matriculado no curso 3...");
            System.out.println("Meu nome é: " + aluno.nome);
            System.out.println();
        }
    } }
