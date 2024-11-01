package exercicios;

import java.util.Scanner;

public class NomeRepete {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		int i;
		String nome;
		
		System.out.print("Digite seu nome: ");
		nome = ler.next();
		
		for(i=0; i<10; i++){
			System.out.println(nome);
		}

	}

}
