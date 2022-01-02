package appPruebas;

public class promedioif {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*int promedio = 7;
		
		if(promedio == 10){
			System.out.println("Muchas felicidades");
		}else if(promedio <=10 && promedio >= 7) {
			System.out.println("Felicidades");
		}else if(promedio <= 7 && promedio >= 0) {
			System.out.println("Es necesario repasar bloques");
		}else if(promedio <= 0 || promedio >=11){
			System.out.println("Escribe una calificacion valida");
		}
		
		if (promedio >= 7) {
			if(promedio == 10) {
				System.out.println("Muchas felicidades");
			}else {
				System.out.println("Felicidades");
			}
		}else {
			System.out.println("Es necesario repasar bloques");
		}*/
		
		
		//Escope = Determina alcance que posee una variable, variable donde puede ser localizada
		
		int promedio = 10;
		
		if (promedio > 7) {
			String mensaje = "Felicidades, tu promedio es de " + promedio;
			if (promedio == 10) {
				System.out.println(mensaje);
				String mensajeDos;
				if (true) {
					mensajeDos = "De esta nueva variable";
				}
			}
		}
		
		
		//System.out.println(mensaje);

	}

}
