package br.ufjf.dcc.poo.exercicios;

import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
		
		float a, b, c;
		float delta;
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Digite o coeficiente a: ");
		a = teclado.nextFloat();
		
		System.out.println("Digite o coeficiente b: ");
		b = teclado.nextFloat();
		
		System.out.println("Digite o coeficiente c: ");
		c = teclado.nextFloat();
		
		delta = (b*b)-(4*a*c);
		
		System.out.println("Raiz 1: " + (float)(-b + Math.sqrt(delta))/(2*a));
		System.out.println("Raiz 2: " + (float)(-b - Math.sqrt(delta))/(2*a));
		
	}
}