package EjerciciosCiclos;

import java.util.Scanner;

public class AsteriscosMedio {

	public static void main(String[] args) {

		// https://github.com/bytesx/EjerciciosJavaCiclosCondiciones/tree/master/src
		/*
		 * int arbolRama = 0;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Ingresa el numero de ramas");
		arbolRama = sc.nextInt();
		*/
		
		//Empezamos en la posicion 0
		//hacemos una comparacion de i con el numero asignado
		//si aun no se cumple, hay que incrementar hasta que llegue al numero asignado
		for(int i = 0; i < 6; i++) {
			//iniciamos en j con 0
			//a j lo incrementamos de acuerdo al valor que tiene i, e incrementamos un uno a j
			for(int j = 0; j <= i; j++) {
				//imprimimos un asterisco sin salto de linea
				System.out.print("*");
			}
			//damos un salto de linea para que no se escriba todo en una sola linea
			System.out.println("");
		}
		
		for (int in = 0; in < 5; in++) {
			for(int se = 0; se <= in; se++) {
				System.out.print("´");
			}
			System.out.println("");
		}
	}

}

/*
 * 
Ejercicios ciclos y condicionales Java
Mostrar en consola el mensaje de "Aprobado" en caso la calificación de un alumno sea mayor igual a 70, en caso contrario mostrar el mensaje "Reprobado".

Dado 3 números enteros, mostrar en consola los números de forma ascendente, de menor a mayor. Ejemplo Números = 9, 50, 4 Salida = 4, 9, 50

Imprimir en consola la tabla de multiplicar del número 9.

Replicar la siguiente salida en consola.

*
**
***
****
*****
******
Replicar la siguiente salida en consola.
     *
    ***
   *****
  *******
 *********
Ayuda: Podrás apoyarte de ciclos anidados así como de los métodos println y print

Imprimir en consola los primero diez números de la serie Fibonacci.

Dado un número saber si este es primo o no.

Imprimir en consola todos los números múltiplos de 2. El ciclo finalizará cuando el último múltiplo sea menor a 4570

Dado un número entero obtener su factorial.

Crear un programa el cual nos permita conocer el valor de la constante e.

e =  1/0! + 1/1! + 1/2! + 1/3! + ... 
 * */
