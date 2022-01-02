package appPruebas;

public class cadenas {
	//https://github.com/bytesx/EjerciciosJavaCiclosCondiciones/tree/master/src

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String mensaje = "Hola, soy jose";
		
		//cuenta los caracteres del mensaje
		int num = mensaje.length();
		System.out.println(num);
		
		boolean contiene = mensaje.contains("o");	

		boolean comienzacon  = mensaje.startsWith("H");
		boolean terminacon  = mensaje.endsWith("e");
		
		
		System.out.println(contiene);
		System.out.println(comienzacon);
		System.out.println(terminacon);
		
		String segundo = mensaje.concat(", estamos en el curso de java");

		System.out.println(segundo);

	}

}
