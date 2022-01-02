package appPruebas;

public class format {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String mensaje = "";
		String curso = "Java";
		
		mensaje = String.format("Bienvenido al curso de %s",curso);
		
		System.out.println(mensaje);
		
		float valor = 10.872040f;
		
		//nuevo String
		//se le indica que solo se requieren 3 decimales despues del punto
		///////////////////////////////////entero ///////////float%f //String%s
		mensaje = String.format("El total de %d articulos es %.3f %s",3, valor , "MX");
		
		System.out.println(mensaje);
		 
		//es igual que el de arriba
		System.out.printf("El total de %d articulos es %.3f %s", 3, valor, "MX");
		System.out.println("");
		
		
		
		/////Spring
		String nombre = "Codi";
		String apellido = "Facilito";
		
		String nombreCompleto = String.format("%s %s", nombre, apellido);
		System.out.println(nombreCompleto);
		
		
		////Enteros
		String resultado = String.format("%d - %d - %d", 10,20,30);
		System.out.println(resultado);
		
		////Float
		float pi = 3.14159265359f;
		
		resultado = String.format("%f - Decimales: %.2f",  pi ,pi);
		System.out.println(resultado);
		
		/////Boolean
		int cantidad = 10;
		boolean mayor = cantidad > 5;
		
		resultado = String.format("La cantidad es mayor a %d : %b", cantidad, mayor);
		System.out.println(resultado);
		
		
		///// orden
		String uno = "Uno";
		String dos = "Dos";
		String tres = "Tres";
		
		resultado = String.format("%3$s - %2$s - %1$s", uno, dos, tres);
		System.out.println(resultado);
		
		
		//float pi = 3.14159264359f;
		
		resultado = String.format("%1f - Decimales: %1$.2f", pi, pi);
		System.out.println(resultado);
	}

}
