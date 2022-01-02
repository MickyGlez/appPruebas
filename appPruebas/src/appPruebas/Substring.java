package appPruebas;

public class Substring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		///Contar cuantas letras tiene la frase
		String mensaje = "Hola Mundo";
		System.out.println(mensaje.length());
		
		///Obtener la letra de la posicion que se indique
		char letraH = mensaje.charAt(0);
		System.out.println(letraH);
		
		//Encontrar la letra indicada
		int indice = mensaje.indexOf("M");
		System.out.println(indice);
		
		///Encontrar la posicion de la letra indicada
		//Encontrar la segunda y tercera posicion de la letra indicada
		String mensaje2 = "Este mensaje posee muchas letras a";
		int indicePrimeraA = mensaje2.indexOf("a");
		int indiceSegundaA = mensaje2.indexOf("a", indicePrimeraA + 1);
		int indiceTerceraA = mensaje2.indexOf("a",indiceSegundaA + 1);
		
		System.out.println(indicePrimeraA);
		System.out.println(indiceSegundaA);
		System.out.println(indiceTerceraA);

		//Retorna un sub string a partir dek indice indicado hasta el ultimo caracter del String
		int indiceLetraM = mensaje.indexOf("M");
		
		String substring = mensaje.substring(indiceLetraM);
		System.out.println(substring);
		
		///Retornar un subString a partir del indice indicado hasta el indiceFinal
		int indiceM = mensaje.indexOf("H");
		
		String subString = mensaje.substring(indiceM, indiceM + 4);
		System.out.println(subString);
		
		
		
	}

}


