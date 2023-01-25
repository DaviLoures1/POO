package br.ufjf.dcc.poo.exemplos;

import javax.swing.JOptionPane;

public class Dialog2 {

	public static void main(String[] args) {
		int a,b,c;
		a = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o primeiro valor"));
		b = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o segundo valor"));
		
		c = a+b;
		JOptionPane.showMessageDialog(null, c);

	}

}
