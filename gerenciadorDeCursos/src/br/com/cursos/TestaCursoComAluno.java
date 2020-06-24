package br.com.cursos;

public class TestaCursoComAluno {
	
	public static void main(String[] args) {
		Curso javaColecoes = new Curso("Dominando as coleções Java", "Franciele Zanella");
		
		javaColecoes.adiciona(new Aula("Trabalhando com ArrayList", 21));
		javaColecoes.adiciona(new Aula("Criando uma aula", 20));
		javaColecoes.adiciona(new Aula("Modelando com coleções", 22));
		
		Aluno a1 = new Aluno("Bruno Ataulo", 34672);
		Aluno a2 = new Aluno("Polly Zanella", 56874);
		Aluno a3 = new Aluno("Branco", 45789);
		
		
		javaColecoes.matricula(a1);
		javaColecoes.matricula(a2);
		javaColecoes.matricula(a3);
		
		System.out.println("Todos os alunos matriculados: ");
		
		javaColecoes.getAlunos().forEach(a -> {
			System.out.println(a);
		});
		
		System.out.println("O aluno " + a1 + " esta matriculado?");
		System.out.println(javaColecoes.estaMatriculado(a1));
		
		
		Aluno ataulo = new Aluno("Bruno Ataulo", 34672);
		System.out.println(" E esse ataulo, esta matriculado?");
		System.out.println(javaColecoes.estaMatriculado(ataulo));
		
		
		System.out.println("O a1 é equals ao ataulo?");
		System.out.println(a1.equals (ataulo));
		
		//obrigatoriamente o seguinte eh true:
		System.out.println(a1.hashCode() == ataulo.hashCode());
		
		
	}

}
