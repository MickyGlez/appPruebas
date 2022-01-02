package EjerciciosCiclos;

public class TablaDelNueve {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for(int num = 9, x = 1; x < 11;) {
			int resultado = num * x;
			String mensaje = num + " * " + x + " = "+ resultado;
			
			System.out.println(mensaje);
			x++;
		}

	}

}
