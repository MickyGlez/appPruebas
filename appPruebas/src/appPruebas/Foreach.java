package appPruebas;

public class Foreach {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int calificaciones[] = {9,8,7,8,9,8,7,8,9,10};

		int suma = 0;
		
		for(int valorPorIndice : calificaciones ) {
		
			suma += valorPorIndice;
			//System.out.println(suma);
		}
		float promedio = suma / calificaciones.length;
		System.out.println(promedio);
	}

}
