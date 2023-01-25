package br.ufjf.dcc.poo.exercicios;

import javax.swing.JOptionPane;

public class Sorteio {

	public static void main(String[] args) {
		int num = (int)(Math.random()*100);
		int palpite;
		palpite = Integer.parseInt(JOptionPane.showInputDialog("Digite o seu palpite: "));
		while(palpite != num)
		{
		if (palpite > num) {
			JOptionPane.showMessageDialog(null, "O número sorteado é menor que o seu palpite");
			palpite = Integer.parseInt(JOptionPane.showInputDialog("Digite o seu palpite novamente: "));
		}
		else if (palpite < num) {
			JOptionPane.showMessageDialog(null, "O número sorteado é maior que o seu palpite");
			palpite = Integer.parseInt(JOptionPane.showInputDialog("Digite o seu palpite novamente: "));
		}
		}
		if (palpite == num)
			JOptionPane.showMessageDialog(null, "O número esta correto! Parabéns!!");

	}

}
