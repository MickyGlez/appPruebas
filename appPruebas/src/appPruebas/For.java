package appPruebas;

public class For {
	//https://github.com/bytesx/EjerciciosJavaCiclosCondiciones/tree/master/src

	public static void main(String[] args) {

//for(inicializacion; condicion; iteracion){}
	/*	for(int numero = 9, x = 1 ; x < 11 ; System.out.println(numero + " * " + x + " = " + numero * x), x++ ) {
			
		}*/
		/*int numero = 9, x = 1; 
	for(  ; x < 11 ;) {
		
		long resultado = numero * x;
		String mensaje = numero + " * " + x + " = " + resultado;
		System.out.println(mensaje);
		x++;
	}*/
	
	for(int num = 1; num < 101; num++) {
		if (num % 2 == 0) {
			System.out.println(num+ "-> Es par");
		}else {
			System.out.println(num+ "-> Es impar");
		}
		//num++;
	}
		
	}
}
