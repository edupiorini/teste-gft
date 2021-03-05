
package com.testegft;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	Scanner ler = new Scanner(System.in);

	System.out.println("Valor inicial:");
	double valorInicial = ler.nextDouble();

	System.out.println("Juros mensais (em decimal): ");
	double jurosMensais = ler.nextDouble();

	Investimento investimento = new InvestimentoSemIr(valorInicial, jurosMensais);
	Investimento investimentoComIr = new InvestimentoComIR(valorInicial, jurosMensais);

	//faltou imprimir dados organizdos e tratar exception
  }
}
