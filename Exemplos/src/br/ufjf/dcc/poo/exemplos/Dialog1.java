package br.ufjf.dcc.poo.exemplos;

import javax.swing.JOptionPane;

public class Dialog1 {

	public static void main(String[] args) {
		String nomeUsuario;
		nomeUsuario = JOptionPane.showInputDialog(null, "Digite o seu nome:");
		JOptionPane.showMessageDialog(null, nomeUsuario);

	}

}
