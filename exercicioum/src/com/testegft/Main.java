
package com.testegft;

public class Main {

    public static void main(String[] args) throws Exception {
	InvestimentoComIR investimento = new InvestimentoComIR(1000.00, 0.04);

	System.out.println(investimento.toString());
  }
}
