package exercicio071016;

import java.util.Random;
import java.util.Scanner;

public class Treino {
	public Treino() {
		exercicio3();
		
	}
	
	private void exercicio1() {
		int num1 = (new Scanner(System.in)).nextInt();
		int num2 = (new Scanner(System.in)).nextInt();
		
		if (num1 > num2) {
			System.out.println("Numero 1 e o maior");
			
		} else { 
			System.out.println("Numero 2 e o maior");
		}
		
	}
	
	
	private void exercicio2() {
		System.out.println("Introduza o numero 1");
		int num1 = (new Scanner(System.in)).nextInt();
		System.out.println("Introduza o numero 2");
		int num2 = (new Scanner(System.in)).nextInt();
		System.out.println("Introduza o numero 3");
		int num3 = (new Scanner(System.in)).nextInt();
		
			
		if (num1 > num2 && num1 > num3) {
			System.out.println("O numero 1 e o maior");
			
		} else if ( num2 > num1 && num2 > num3)
			System.out.println("O numero 2 e o maior");
		
		else 
			System.out.println("Numero 3 e o maior");
		
	}
	
	
	private void exercicio3() {	
		int rand = (new Random()).nextInt(5) + 1;
		for (int i=0; i < 5; i++) {
			System.out.println("Introduza a "+ (i+1) + " tentativa");
			int tent = ((new Scanner(System.in)).nextInt());
			
			if(tent == rand) {				
				System.out.println("Acertou a "+ (i+1) + " tentativa");
				return;
			} else 
				System.out.println("Tente de novo");
		}
		
		System.out.println("Tens 5 para acertar  ");
	}
	
}
