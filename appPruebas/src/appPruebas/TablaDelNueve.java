package appPruebas;

public class TablaDelNueve {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for(int numero = 9, x = 1; x < 11;) {
			int resultado = numero * x;
			String mensaje = numero + " * " + resultado;
			
			System.out.println(mensaje);
			x++;
		}

	}

}
