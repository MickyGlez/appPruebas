package EjerciciosCiclos;

public class Fibonacci {

	public static void main(String[] args) {


		/*int fib, num1 = 0, num2 = 1, num3, count = 10;
		
		for(fib = 0; fib < count; ++fib) {
			num3 = num1 + num2;
			System.out.println(" " + num3);
			num1= num2;
			num2 = num3;
		}*/
		
		int num1 = 0, num2 = 1, num3;
		for(int i = 1; i <= 10; i++) {
			num3 = num1 + num2;
			System.out.println(i +" " +num3);
			num1 = num2;
			num2 = num3;
		}
	}

}
