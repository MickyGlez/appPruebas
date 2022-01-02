package EjerciciosCiclos;

import java.util.Scanner;

public class AscendenteNumeros {

	public static void main(String[] args) {


		int num1, num2, num3;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Escribe un numero");
		num1 = sc.nextInt();
		Scanner sc2 = new Scanner(System.in);
		System.out.println("Escribe el segundo numero");
		num2 = sc2.nextInt();
		Scanner sc3 = new Scanner(System.in);
		System.out.println("Escribe el tercer numero");
		num3 = sc3.nextInt();
		
		System.out.println("Los numeros entrados son: " + num1 +" "+ num2 + " " + num3);
		
		if (num1 <= num2 && num1 <= num3 || num2 <= num3) {
			System.out.println(num1);
			System.out.println(num2);
			System.out.println(num3);
		}
		else if(num2 <= num1 && num2 <= num3 || num1 <=num3) {
			System.out.println(num2);
			System.out.println(num1);
			System.out.println(num3);
		}else if(num3 <= num1 && num3 <= num2 || num1 <=num2) {
			System.out.println(num3);
			System.out.println(num2);
			System.out.println(num1);
		}
		
	}

}
