package EjerciciosArreglo;

public class NumerosAleatorios {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//https://github.com/bytesx/EjerciciosJavaConArreglos

		
		int numeros[] = new int[10];
		for(int i = 0; i < numeros.length; i++) {
			int numAle = (int)(Math.random() * 100);
			numeros[i] = numAle;			
		}
		int mayor = 0;
		for(int valor: numeros) {
			System.out.println(valor);
			
		 mayor = (int)(Math.max(valor, valor));
		}
		System.out.println("El numero mayor es: " + mayor);

		
		
		
		

	}

}
