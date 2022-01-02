package EjerciciosArreglo;

public class ArregloUnoAlCien {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int numeros [] = new int[100];
		
		for(int i = 1; i< numeros.length; i++) {
			numeros[i] = i;
		}
		for(int valor : numeros) {
			System.out.println(valor);
		}
		

	}

}
