package exercicios;

import java.util.Scanner;

public class NomeNvezes {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		int i,N;
		String nome;
		
		System.out.print("Digite seu nome: ");
		nome = ler.next();
		
		System.out.print("Digite o número de repetições: ");
		N = ler.nextInt();
		
		for(i=0; i<N; i++){
			System.out.println(nome);
		}


	}

}
