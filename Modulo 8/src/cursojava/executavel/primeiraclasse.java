package cursojava.executavel;

import javax.swing.JOptionPane;

import com.sun.jdi.IntegerValue;

import cursojava.classes.aluno;

public class primeiraclasse {

	public static void main(String[] args) {
		
		String nome = JOptionPane.showInputDialog("Qual o nome do primeiro aluno ?");
		String idade = JOptionPane.showInputDialog("Qual a idade do primeiro aluno ?");
		String dataNascimento = JOptionPane.showInputDialog("Qual a data de nascimento do primeiro aluno ?");
		String rg = JOptionPane.showInputDialog("Qual o rg do primeiro aluno ?");
		String note1 = JOptionPane.showInputDialog("Qual a primeira nota do primeiro aluno ? (de 0 a 10)");
		String note2 = JOptionPane.showInputDialog("Qual a segunda nota do primeiro aluno ? (de 0 a 10)");
		String note3 = JOptionPane.showInputDialog("Qual a terceira nota do primeiro aluno ? (de 0 a 10)");
		String note4 = JOptionPane.showInputDialog("Qual a quarta nota do primeiro aluno ? (de 0 a 10)");
		
		aluno aluno1 = new aluno();

		aluno1.setNome(nome);
		aluno1.setIdade(Integer.valueOf(idade));
		aluno1.setDataNascimento(dataNascimento);
		aluno1.setRg(rg);
		aluno1.setNota1(Double.parseDouble(note1));
		aluno1.setNota2(Double.parseDouble(note2));
		aluno1.setNota3(Double.parseDouble(note3));
		aluno1.setNota4(Double.parseDouble(note4));

		
		System.out.println(aluno1);
		System.out.println("A m�dia do aluno: " + aluno1.getNome() + " �: " + aluno1.getMediaNotas());
		System.out.println("O Aluno " + aluno1.getNome()+ " foi " + (aluno1.getAlunoAprovado() ? "Aprovado" : "Reprovado"));
	}

}