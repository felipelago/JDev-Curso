package cursojava.executavel;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import com.sun.jdi.IntegerValue;

import cursojava.classes.Aluno;
import cursojava.classes.Disciplina;

public class PrimeiraClasse {

	public static void main(String[] args) {

		List<Aluno> alunos = new ArrayList<Aluno>()
				
		for(int qtd = 0; qtd<2; qtd++) {
				
		/* new Aluno() é uma instancia (criação de objeto)*/
		/*aluno1 é uma referencia para o objeto aluno*/		
		String nome = JOptionPane.showInputDialog("Qual o nome do primeiro aluno ?");
		/*
		 * String idade =
		 * JOptionPane.showInputDialog("Qual a idade do primeiro aluno ?"); String
		 * dataNascimento =
		 * JOptionPane.showInputDialog("Qual a data de nascimento do primeiro aluno ?");
		 * String rg = JOptionPane.showInputDialog("Qual o rg do primeiro aluno ?");
		 */

		Aluno aluno1 = new Aluno();

		aluno1.setNome(nome);
		/*
		 * aluno1.setIdade(Integer.valueOf(idade));
		 * aluno1.setDataNascimento(dataNascimento); aluno1.setRg(rg);
		 */

		for (int pos = 1; pos <= 4; pos++) {
			String nomeDisciplina = JOptionPane.showInputDialog("Nome da disciplina" + pos + "?");
			String notaDisciplina = JOptionPane.showInputDialog("Nota da disciplina" + pos + " ?");

			Disciplina disciplina = new Disciplina();
			disciplina.setDisciplina(nomeDisciplina);
			disciplina.setNota(Double.valueOf(notaDisciplina));

			aluno1.getDisciplinas().add(disciplina);
		}
		int escolha = JOptionPane.showConfirmDialog(null, "Deseja Remover alguma disciplina ?");

		if (escolha == 0) {
			String disciplinaRemover = JOptionPane.showInputDialog("Qual Disciplina deseja remover ? 1, 2,3 ou 4 ?");
			aluno1.getDisciplinas().remove(Integer.valueOf(disciplinaRemover).intValue() - 1);
		}

		// Double.parseDouble é para converter as informações obtidas em JOptionPane
		// (String) para Double

		
		
		System.out.println("A média do aluno: " + aluno1.getNome() + " é: " + aluno1.getMediaNotas());
		System.out.println(
				"O Aluno " + aluno1.getNome() + " foi " + (aluno1.getAlunoAprovado() ? "Aprovado" : "Reprovado"));
	}

}
