package enquanto;

import java.util.Scanner;

public class LoopingDoWhile {

	public static void main(String[] args) {
		Scanner leia = new Scanner (System.in);

		int cont, X, R;
		String decisao;
		decisao="Sim";
		cont = 0;
		
		do{
			System.out.println("Digite um número: ");
			X = leia.nextInt();
			R = X*3; 
			System.out.println("Resultado: "+ R);
			System.out.println("Deseja continuar? (Sim/Não)");
			decisao = leia.next();
			cont++;  //mesma coisa que cont=cont+1
		}while(decisao.equalsIgnoreCase("Sim"));
		System.out.println("Total de vezes que o programa foi repetido: "+ cont);

	}

}
