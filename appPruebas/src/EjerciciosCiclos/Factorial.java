package EjerciciosCiclos;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*Scanner sc = new Scanner(System.in);
		System.out.println("Escribe un numero para calcular");
		
		int num1 = sc.nextInt();
		int resFactorial = 0;
		
		for(int num = num1, x = 1; x < num1; x++) {
			resFactorial = num *= x;
			
		}
		System.out.println(resFactorial);*/
		
		int num = 5;
		int fac =0;
		
		for(int n = num, i = 1; i<num; i++) {
		 fac = n *= i;
			System.out.println("\t"+i + " -> " +fac);
		}
		System.out.println("\nResultado final: " +fac);
		
	}
	
	

}
