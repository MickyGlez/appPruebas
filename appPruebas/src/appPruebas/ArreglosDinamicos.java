package appPruebas;

public class ArreglosDinamicos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int calificaciones[][] = new int[5][];
		
		calificaciones[0] = new int [1]; //E
		calificaciones[1] = new int [2]; //A
		calificaciones[2] = new int [3]; //D
		calificaciones[3] = new int [4]; //B
		calificaciones[4] = new int [5]; //C
		
		calificaciones[0][0] = 8;
		
		calificaciones[1][0] = 9;
		calificaciones[1][1] = 9;
		
		calificaciones[2][0] = 8;
		calificaciones[2][1] = 10;
		calificaciones[2][2] = 8;
		
		calificaciones[3][0] = 7;
		calificaciones[3][1] = 10;
		calificaciones[3][2] = 9;
		calificaciones[3][3] = 8;

		calificaciones[4][0] = 9;
		calificaciones[4][1] = 10;
		calificaciones[4][2] = 10;
		calificaciones[4][3] = 10;
		calificaciones[4][4] = 9;
		
		for(int []calificacionesPorAlumno : calificaciones) {
			for(int calificacion : calificacionesPorAlumno) {
				System.out.print(calificacion + " ");
			}
			System.out.println("");
		}
		
		
	}

}
