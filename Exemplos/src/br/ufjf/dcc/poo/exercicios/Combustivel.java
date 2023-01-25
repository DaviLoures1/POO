package br.ufjf.dcc.poo.exercicios;

import javax.swing.JOptionPane;

public class Combustivel {

	public static void main(String[] args) {
		float km, litros;
		km = Float.parseFloat(JOptionPane.showInputDialog(null, "Digite a quilometragem percorrida:", "Quilometragem", JOptionPane.INFORMATION_MESSAGE));
		litros = Float.parseFloat(JOptionPane.showInputDialog(null, "Digite a quantidade de combustivel gasto:", "Combustível utilizado", JOptionPane.INFORMATION_MESSAGE));
		
		JOptionPane.showMessageDialog(null,"Consumo em quilometros por litro:" + km/litros + "Km/L");
	}

}
