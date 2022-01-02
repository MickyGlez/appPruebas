package appPruebas;

public class Matrices {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Matrices
		
		int matriz[][] = new int[4][4];
		
		matriz[0][0] = 1;
		matriz[0][1] = 2;
		matriz[0][2] = 3;
		matriz[0][3] = 4;
		
		matriz[1][0] = 1;
		matriz[1][1] = 2;
		matriz[1][2] = 3;
		matriz[1][3] = 4;
		
		matriz[2][0] = 1;
		matriz[2][1] = 2;
		matriz[2][2] = 3;
		matriz[2][3] = 4;
		
		matriz[3][0] = 1;
		matriz[3][1] = 2;
		matriz[3][2] = 3;
		matriz[3][3] = 4;
		
		//System.out.println(matriz[1][1]);
		
		for(int posX = 0; posX < matriz.length; posX++) {
			for(int posY = 0; posY < matriz[posX].length; posY++) {
				matriz[posX][posY] = posY + 1;
			}
		}
		/*
		for(int posX=0; posX < matriz.length;posX++) {
			for(int posY = 0; posY < matriz[posX].length; posY++) {
			System.out.print(matriz[posX][posY]+" ");	
			}
			System.out.println("");
		}*/
		
		
		for(int[] fila : matriz) {
			for(int celda : fila) {
				System.out.print(celda + " ");
			}
			System.out.println(" ");
		}

	}

}
