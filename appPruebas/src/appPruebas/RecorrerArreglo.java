package appPruebas;

public class RecorrerArreglo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int calificaciones[] = {9,8,7,10,9,8,8,10,9,9};
		int suma = 0;
		//sum / cantidad
		//System.out.println(calificaciones.length);
		
		for(int indice = 0; indice <calificaciones.length; indice++) {
		
		suma += calificaciones[indice];
			
		
					
			
		}
		float promedio = suma / calificaciones.length;
		System.out.println("La suma es: "+suma);
		System.out.println("El promedio es: " + promedio);
	}

}
