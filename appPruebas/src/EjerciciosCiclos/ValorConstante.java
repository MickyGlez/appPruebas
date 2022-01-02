package EjerciciosCiclos;

public class ValorConstante {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		float funcionN = 1, resultado = 1, e = 10 ;
		
		for(int i = 1; i<=e; i++) {
			funcionN =(1*i) * funcionN;
			resultado = 1/funcionN + resultado;
			System.out.println(i +" - " +resultado);
		}
		System.out.println("La constante es de: " + resultado);

	}

}
