package appPruebas;

public class Switch {

	public static void main(String[] args) {
	/*	String colorLuz = "Amarillo";
		
		switch(colorLuz) {
		case "Rojo":
			System.out.println("Alto");
			
			break;
		case "Verde":
			System.out.println("Continue");
			
			break;
			
		case "Amarillo":
			System.out.println("Detengase");
			
			break;
			
		 default:
			 System.out.println("No valido");
			break;
		
		}
		
		char a = 98;
		
		System.out.println(a);
*/
		/*int i = 2;

		switch(i) {
		  case 0:
		    System.out.println("i es cero.");
		    break;
		  case 1:
		    System.out.println("i es uno.");
		    break;
		  case 2:
		    System.out.println("i es dos.");
		    break;
		  case 3:
		    System.out.println("i es tres.");
		    break;
		  default:
		    System.out.println("i es mayor a tres.");
		}*/
		
	/*	int i = 2;

		switch(i) {
		  case 0:
		  case 1:
		  case 2:
		  case 3:
		  case 4:
		    System.out.println("i es menor que cinco");
		    break;
		  case 5:
		    System.out.println("i es cinco");
		    break;
		  case 6:
		  case 7:
		  case 8:
		  case 9:
		    System.out.println("i es menor que diez y mayor a cinco");
		    break;
		  default:
		    System.out.println("i es diez o mayor a diez");
		}*/
		/*
		int numeroMes = 4;
		String estacion = "", mes = "";

		switch (numeroMes) {
		  case 12:
		    mes = "Diciembre";
		  case 1:
		    mes = "Enero";
		  case 2:
		    mes = "Febrero";
		    estacion = "Invierno";
		    break;
		  case 3:
		    mes = "Marzo";
		  case 4:
		    mes = "Abril";
		  case 5:
		    mes = "Mayo";
		    estacion = "Primavera";
		    break;
		  case 6:
		    mes = "Junio";
		  case 7:
		    mes = "Julio";
		  case 8:
		    mes = "Agosto";
		    estacion = "Verano";
		    break;
		  case 9:
		    mes = "Septiembre";
		  case 10:
		    mes = "Octubre";
		  case 11:
		    mes = "Noviembre";
		    estacion = "Otoño";
		    break;
		}

		System.out.println("El mes de " + mes + " se encuentra en la estación " + estacion);
		*/
		
		String tipoDia = "";
		String diaSemana = "Viernes";

		switch (diaSemana.toLowerCase()) {
		     case "lunes":
		         tipoDia = "Inicio de semana";
		         break;
		     case "martes":
		     case "míercoles":
		     case "jueves":
		       tipoDia = "Mediados de semana";
		         break;
		     case "viernes":
		       tipoDia = "Inicio de fin se semana";
		         break;
		     case "sábado":
		     case "domingo":
		       tipoDia = "Fin de seman";
		         break;
		 }

		System.out.println(diaSemana + " es " + tipoDia);
		
		
		
	}

}
