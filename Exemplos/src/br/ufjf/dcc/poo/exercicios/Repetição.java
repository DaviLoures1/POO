package br.ufjf.dcc.poo.exercicios;

import javax.swing.JOptionPane;

public class Repetição {

	public static void main(String[] args) {
		int quantidade;
		quantidade = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de repetições"));
		
		for (int i = 0; i<quantidade; i++)
			JOptionPane.showMessageDialog(null, "Faça os exercícios novamente");
	}
}
