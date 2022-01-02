package appPruebas;

public class DoWhile {
	//https://github.com/bytesx/EjerciciosJavaCiclosCondiciones/tree/master/src

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int contador = 10;
		//while-> se evalua y despues se ejecuta
		//do while primero ejecuta el bloque, despues se evalua
		
		while(contador < 10) {
			System.out.println(contador);
			contador++;
		}
		
		do {
			System.out.println(contador);
			contador++;
		}while(contador < 10);

	}

}
