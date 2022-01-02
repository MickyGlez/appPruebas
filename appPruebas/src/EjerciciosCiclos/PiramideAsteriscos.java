package EjerciciosCiclos;

public class PiramideAsteriscos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for (int i = 0; i <6; i++) {
			for(int j = 0; j < 6-i; j++) {
				System.out.print(" ");
			}
			for(int l = 0; l <(2*i+1); l++) {
				System.out.print("*");
			}
			System.out.println("");
		}
		
		for(int d = 0; d <=4; d++) {
			System.out.println("     ****");
		}
		
		/*
		for(int q = 0; q<7; q++) {
			for(int w = 0; w < 7-q; w++) {
				System.out.print(" ");
			}
			
			for(int e = 0; e <(2*q + 1); e++) {
				System.out.print("*");
			}
			
			System.out.println();
			
		}*/
		

	}

}
