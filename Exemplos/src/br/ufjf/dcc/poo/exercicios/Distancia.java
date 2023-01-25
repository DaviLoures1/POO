package br.ufjf.dcc.poo.exercicios;

import javax.swing.JOptionPane;

public class Distancia {

	public static void main(String[] args) {
		float x1, x2;
		float y1, y2;
		float dist;
		x1 = Float.parseFloat(JOptionPane.showInputDialog(null, "Digite o valor de x da primeira coordenada", "Coordenadas", JOptionPane.INFORMATION_MESSAGE));
		y1 = Float.parseFloat(JOptionPane.showInputDialog(null, "Digite o valor de y da primeira coordenada", "Coordenadas", JOptionPane.INFORMATION_MESSAGE));
		x2 = Float.parseFloat(JOptionPane.showInputDialog(null, "Digite o valor de x da segunda coordenada", "Coordenadas", JOptionPane.INFORMATION_MESSAGE));
		y2 = Float.parseFloat(JOptionPane.showInputDialog(null, "Digite o valor de y da segunda coordenada", "Coordenadas", JOptionPane.INFORMATION_MESSAGE));
		dist = (float)Math.sqrt(Math.pow(x2-x1, 2) + Math.pow(y2-y1, 2));
		JOptionPane.showMessageDialog(null, dist, "Distancia entre as coordenadas:", JOptionPane.INFORMATION_MESSAGE);
		
	}

}
