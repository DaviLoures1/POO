package br.ufjf.dcc.poo.exercicios;

import javax.swing.JOptionPane;

public class ExistenciaTriangulo {

	public static void main(String[] args) {
		float a,b,c;
		a = Float.parseFloat(JOptionPane.showInputDialog("Digite o comprimento de um dos lados"));
		b = Float.parseFloat(JOptionPane.showInputDialog("Digite o comprimento de outro lado"));
		c = Float.parseFloat(JOptionPane.showInputDialog("Digite o comprimento do último lado"));
		
		if((Math.abs(b-c)< a && a < b+c)&&(Math.abs(a-c)< b && b < a+c)&&(Math.abs(b-a)< c && c <b+a))
			JOptionPane.showMessageDialog(null, "O triângulo existe");
		else
			JOptionPane.showMessageDialog(null, "O triângulo não existe");
	}

}
