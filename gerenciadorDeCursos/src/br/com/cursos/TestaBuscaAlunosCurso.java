package br.com.cursos;

import java.util.Map;
import java.util.Set;

public class TestaBuscaAlunosCurso {
	public static void main(String[] args) {
		Curso javaColecoes = new Curso("Dominando as coleções Java", "Franciele Zanella");
		
		javaColecoes.adiciona(new Aula("Trabalhando com ArrayList", 21));
		javaColecoes.adiciona(new Aula("Criando uma aula", 20));
		javaColecoes.adiciona(new Aula("Modelando com coleções", 22));
		
		Aluno a1 = new Aluno("Bruno Ataulo", 34672);
		Aluno a2 = new Aluno("Polly Zanella", 56874);
		Aluno a3 = new Aluno("Branco", 45789);
		Aluno a4 = new Aluno("Franciele Zanella", 33333);
		
		
		javaColecoes.matricula(a1);
		javaColecoes.matricula(a2);
		javaColecoes.matricula(a3);
		javaColecoes.matricula(a4);
		
		System.out.println(javaColecoes.getAlunos());
		System.out.println("Quem é o aluno com matricula 33333?");
		Aluno aluno = javaColecoes.buscaMatriculado(33333);
		System.out.println("Aluno: " + aluno);
		
		Map<Integer, Set<Aluno>> matriculaParaAlunos;
		
		
	}
}


