package br.ufjf.dcc.poo.exercicios;

import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
		float lterreno, pterreno;
		float lcasa, pcasa;
		float areaRestante;
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("Informe a largura do terreno");
		lterreno = teclado.nextFloat();
		System.out.println("Informe a profundidade do terreno");
		pterreno = teclado.nextFloat();
		
		System.out.println("Informe a largura da casa");
		lcasa = teclado.nextFloat();
		System.out.println("Informe a profundidade da casa");
		pcasa = teclado.nextFloat();
		
		areaRestante = (lterreno*pterreno)-(lcasa*pcasa);
		
		System.out.println("Percentual livre: " + areaRestante*100/(lterreno*pterreno));
		
		

	}

}
