package exercicios;

import java.util.Scanner;

public class NumSoma {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		int i, soma=0, num;
		
		for(i=0; i<10; i++) {
			System.out.println("Digite um número:");
			num = ler.nextInt();
			soma = soma + num;
		}
		System.out.println("soma: " + soma);
	}

}
