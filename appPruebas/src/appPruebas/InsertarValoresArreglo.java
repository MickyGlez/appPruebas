package appPruebas;

public class InsertarValoresArreglo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int valores[] = new int[10];
		
		for(int indice = 0; indice < valores.length; indice++) {
			valores[indice] = indice;
			
		}
		for(int valor : valores) {
			System.out.println(valor);
		}
	}

}
