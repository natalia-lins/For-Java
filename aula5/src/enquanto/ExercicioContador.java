package enquanto;

import java.util.Scanner;

public class ExercicioContador {

	public static void main(String[] args) {
		Scanner leia = new Scanner (System.in);

		int cont, X, R;
		cont = 1;
		
		while(cont<=5){
			X = leia.nextInt();
			R = X*3; 
			System.out.println(R);
			cont++; // mesma coisa que cont=cont+1
		}//fim enquanto
	}

}
