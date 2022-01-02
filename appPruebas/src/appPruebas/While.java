package appPruebas;

public class While {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		int contador = 1;
		
		while(contador <= 11) {
			System.out.println(contador + "Hola mundo");
			contador++;
		}
		*/
		
		int contador = 0;
		int numero = 2121212121;
		
		while (numero > 0) {
			numero = numero / 10;
			contador++;
			
		}
		
		System.out.println("El numero posee " + contador + " digitos");

	}

}
