package appPruebas;

public class condiciones {
	//https://github.com/bytesx/EjerciciosJavaCiclosCondiciones/tree/master/src

	public static void main(String [] args) {
		
		String colorLuz = "Rojo";
		if (colorLuz.equals("Verde")) {
			System.out.println("Puede continuar");
		}else if(colorLuz.equals("Amarillo")){
			System.out.println("Alto parcial");
		}
		else {
			System.out.println("Alto total");
		}
	}

}
