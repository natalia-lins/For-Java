package enquanto;

import java.util.Scanner;

public class ExAreas {

	public static void main(String[] args) {
	Scanner ler = new Scanner(System.in);
	
	String nome; 
	String decisao;
	double larg, comp, area;
	double areaT = 0;
	System.out.println("Deseja iniciar? (Sim/Não)");
	decisao = ler.next();
	
	while(decisao.equalsIgnoreCase("Sim")) {
		
		System.out.println("Digite o cômodo: ");
		nome = ler.next();
		
		System.out.println("Digite a largura: ");
		larg = ler.nextDouble();
		
		System.out.println("Digite o comprimento: ");
		comp = ler.nextDouble();
		
		area = larg*comp;
		System.out.print("A área do "+nome);
		System.out.printf(" é: %.2f%n", area);
		System.out.println("Deseja continuar? (Sim/Não)");
		decisao = ler.next();
		areaT= areaT + area;
		
	}
		System.out.printf("O total acumulado da área residencial é: %.2f", areaT);

	}

}
