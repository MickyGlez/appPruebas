package EjerciciosArreglo;

public class EjerciciosMatrizJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int matriz[][] = new int[5][5];
		double sumaPromedio = 0;
		int numMayor = matriz[0][0];
		int numPrimo, sumUltimaFila = 0;
		int a, b = 0, c , d, x, w, y = 0, z;
		boolean esPrimo = false;
		
		
		for(x = 0; x < matriz.length; x++) {
			for(y = 0; y < matriz.length; y++) {
				matriz[x][y] = (int)(Math.random()*100);
				System.out.print(matriz[x][y] + " ");
				sumaPromedio = (sumaPromedio + matriz[x][y])/10;
			}
			System.out.println();
		}

		for(w = 0; w < matriz.length; w++) {
			for(z = 0; z < matriz.length; z++) {
				if (matriz[w][z] >= numMayor) {
					numMayor = matriz[w][z];
					sumUltimaFila = (matriz[4][4] + matriz[4][4]);
				}
			}
		}
		
		System.out.println("\nEl numero mayor es: " + numMayor);
		System.out.println("El promedio es: " + String.format("%2f", sumaPromedio));
		System.out.println("Ultimos numeros: " + matriz[4][4]);
		System.out.println("Suma de los ultimos numeros: " + sumUltimaFila + "\n");
		
		
		for(a = 0; a < matriz.length; a++) {
			for(b = 0; b < matriz.length; b++) {
				esPrimo = true;
				for(numPrimo = 2; numPrimo < a; numPrimo++) {
					for(numPrimo = 2; numPrimo < b; numPrimo++) {
						if (a % numPrimo == 0) {
							if (b % numPrimo == 0) {
								esPrimo = false;
							}
						}
					}
				}
				
				if (esPrimo) {
					System.out.println("Los numeros Primos son: " + matriz[a][b]);
				}
			}
		
			for(c = 0; c < matriz.length; c++) {
				for(d = 0; d < matriz[c].length; d++) {
					if (matriz[c][d] % 2 == 0) {
						System.out.println("Los numeros pares son: " + matriz[c][d]);
					}
				}
			}
			
		}
		
	}

}
