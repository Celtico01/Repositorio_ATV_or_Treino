package ex4;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		/*
		 * Calcule o consumo em reais, 
		 * da gasolina consumida em uma viagem de ida e volta para uma cidade vizinha. 
		 * Obs.: Informações a serem consideradas: 
		 * Km percorrido na viagem de ida e de volta; 
		 * valor do litro de gasolina; 
		 * km/l que o automóvel faz.
		 */
		
		Scanner sc = new Scanner(System.in);
		double autonomia, precoGaso, distancia, consumoEmReal = 0;
		
		System.out.print("Distancia ida e volta(Km): ");
		distancia = sc.nextDouble();
		System.out.print("Preço gasolina: ");
		precoGaso = sc.nextDouble();
		System.out.print("Autonomia(Km/l): ");
		autonomia = sc.nextDouble();
		
		int gasolina = (int) (distancia / autonomia);
		double gasolinafrac = distancia % autonomia;
		
		consumoEmReal += gasolina * precoGaso + gasolinafrac * precoGaso;
		
		System.out.println("Consumo em Real: " + consumoEmReal);
		
		sc.close();
	}
}
