package appPruebas;

public class SwitchBreakContinue {

	public static void main(String[] args) {


		/*int valor = 10;
		
		switch(valor) {
		case 10:
		System.out.println("Es 10");
		break;
		
		default:
			System.out.println("No es 10");
		}
		
		for(int x = 1; x <101; x++) {
			if(x == 50) {
				break;
			}
			
			System.out.println(x);
		}
		System.out.println("Ciclo completado");*/
		
		//////////////////break
		/*
		for(int i = 0; i < 5; i++) {
			System.out.print("Siguiente " + i + ": ");
			
			for(int j = 0; j < 100; j++) {
				if (j == 20) {
					break;
				}
				
				System.out.print(j + " ");
			}
			System.out.println();
		}
		System.out.println("Ciclo completado!");*/
		
		////////continue
		
		for(int x = 0; x < 10; x++) {
			if(x == 5) {
				continue;
			}
			
			System.out.println(x);
		}
		
	}
		
		
		
}

	
	
	