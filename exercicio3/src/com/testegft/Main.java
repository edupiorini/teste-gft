
package com.testegft;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	Scanner ler = new Scanner(System.in);

	System.out.println("Multiplicando: ");
	int multiplicando = ler.nextInt();

	System.out.println("Inicio do Intervalo: ");
	int inicioIntervalo = ler.nextInt();

	System.out.println("Fim do Intervalo: ");
	int fimIntervalo = ler.nextInt();

	int intervalo = inicioIntervalo - fimIntervalo;

	for(int i = inicioIntervalo; i <= fimIntervalo; i++){
		int resultado = multiplicando * i;
		System.out.println(multiplicando + " x " + i + " = "+ resultado);

		}
    }
}
