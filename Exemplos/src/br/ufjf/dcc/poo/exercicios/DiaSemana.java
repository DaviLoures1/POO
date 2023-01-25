package br.ufjf.dcc.poo.exercicios;

import javax.swing.JOptionPane;

public class DiaSemana {

	public static void main(String[] args) {
		int dia;
		dia = Integer.parseInt(JOptionPane.showInputDialog("Digite o numero equivalente ao dia da semana"));
		
		if (dia == 1)
			JOptionPane.showMessageDialog(null, "Domingo");
		else if (dia == 2)
			JOptionPane.showMessageDialog(null, "Segunda-feira");
		else if (dia == 3)
			JOptionPane.showMessageDialog(null, "Terça-feira");
		else if (dia == 4)
			JOptionPane.showMessageDialog(null, "Quarta-feira");
		else if (dia == 5)
			JOptionPane.showMessageDialog(null, "Quinta-feira");
		else if (dia == 6)
			JOptionPane.showMessageDialog(null, "Sexta-feira");
		else if (dia == 7)
			JOptionPane.showMessageDialog(null, "Sábado");
	}

}
