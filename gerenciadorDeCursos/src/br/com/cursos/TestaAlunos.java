package br.com.cursos;


import java.util.Collection;
import java.util.HashSet;


public class TestaAlunos {
	
	public static void main(String[] args) {
		Collection<String> alunos = new HashSet<>();
		alunos.add("Rodrigo Turini");
		alunos.add("Alberto Souza");
		alunos.add("Nico Steppat");
		alunos.add("Renan Saggio");
		alunos.add("Mauricio Aniche");
		
		
		
		boolean franEstaMatriculada = alunos.contains("Franciele Zanella");
		alunos.remove("Rodrigo Turini");
		
		System.out.println(franEstaMatriculada);
		
		
		System.out.println(alunos.size());
		for (String aluno : alunos) {
			System.out.println(aluno);
		}
		
		alunos.forEach(aluno ->{
			System.out.println(aluno);
		});
		
		System.out.println(alunos);
		
		
		
		//List<String> alunosEmLista = new ArrayList<>(alunos);
		
		
	}

}
