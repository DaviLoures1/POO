package br.ufjf.dcc.poo.exemplos;

import javax.swing.JOptionPane;

public class ValorAbsoluto {

	public static void main(String[] args) {
		double numero;
		numero = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o numero", "VALOR", JOptionPane.INFORMATION_MESSAGE));
			if(numero < 0)
				numero = -numero;
			JOptionPane.showMessageDialog(null, "O valor absoluto do número indicado é: " + numero);
			
	}
}