package fp.daw.examen;

import java.util.Scanner;

public class Ejercicio5 {

	/* 
	 * 2,5 puntos
	 * 
	 * Escribe en el método 'main' un programa que obtenga el desglose en billetes
	 * y monedas de una cantidad exacta de euros que el usuario introducirá por teclado.
	 * Hay billetes de 500, 200, 100, 50, 20, 10 y 5 euros y monedas de 1 y 2 euros.
	 * Por ejemplo, si deseamos conocer el desglose de 434 euros, el programa mostrará
	 * por pantalla el siguiente resultado:
	 * 
	 * 		2 billetes de 200 euros.
	 * 		1 billete de 20 euros.
	 * 		1 billete de 10 euros.
	 * 		2 monedas de 2 euros.
	 * 
	 * Una vez ejecutado el programa, el usuario podrá realizar tantos desgloses como
	 * desee hasta que decida finalizar su ejecución. 
	 * El programa comprobará que la cantidad introducida sea una cantidad positiva
	 * mayor que 0. En caso contrario mostrará un mensaje de error y volverá a pedirla.
	 */
	
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int euros;
		int d;
		int contQuinientos = 0, contDoscientos = 0, contCien = 0, contCincuenta = 0,contVeinte = 0, contDiez = 0, contCinco = 0, contDos = 0, contUno = 0;

		System.out.println("Introduce la cantidad de euros: ");
		euros = teclado.nextInt();
		
		do {
			if (euros % 500 == 0 || euros > 500) {
				euros = euros - 500;
				contQuinientos++;
			}
			else if (euros % 200 == 0 || euros > 200) {
				euros = euros - 200;
				contDoscientos++;
			}
			else if (euros % 100 == 0 || euros > 100) {
				euros = euros - 100;
				contCien++;
			}
			else if (euros % 50 == 0 || euros >50) {
				euros = euros - 50;
				contCincuenta++;
			}
			else if (euros % 20 == 0 || euros >20) {
				euros = euros - 20;
				contVeinte++;
			}
			else if (euros % 10 == 0 || euros >10) {
				euros = euros - 10;
				contDiez++;
			}
			else if (euros % 5 == 0 || euros >5) {
				euros = euros - 5;
				contCinco++;
			}
			else if (euros % 1 == 0 || euros >1) {
				euros = euros - 1;
				contUno++;
			}
			
		}while (euros > 0);
		System.out.println(euros);
		System.out.println(contQuinientos + " billetes de 500");
		System.out.println(contDoscientos + " billetes de 200");
		System.out.println(contCien + " billetes de 100");
		System.out.println(contCincuenta + " billetes de 50");
		System.out.println(contVeinte + " billetes de 20");
		System.out.println(contDiez + " billetes de 10");
		System.out.println(contCinco + " billetes de 5");
		System.out.println(contDos + " billetes de 2");
		System.out.println(contUno + " billetes de 1");
		teclado.close();
	}
}
