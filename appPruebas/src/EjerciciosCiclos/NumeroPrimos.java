package EjerciciosCiclos;

import java.util.Scanner;

public class NumeroPrimos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Escribe un numero");
		boolean esPrimo = false;
		int numPrimo = sc.nextInt();
		
		for(int i=2; i<numPrimo / 2; i++) {
			if (numPrimo % i == 0) {
				esPrimo = false;
				System.out.println("No es primo");
			}else {
				System.out.println("Es primo");
			}
			break;
		}
		

	}

}
