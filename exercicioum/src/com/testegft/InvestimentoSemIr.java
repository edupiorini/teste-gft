package com.testegft;

public class InvestimentoSemIr extends Investimento {

    public InvestimentoSemIr(Double valorInicial, Double jurosMensais) throws Exception {
        super(valorInicial, jurosMensais);

        if(valorInicial < 1000){
            throw new Exception("O valor inicial não pode ser menor que R$1000,00");
        }
    }

    @Override
    public double calcularLucro(int meses) {
        double valorInicialTestado = getValorInicial();
        if(valorInicialTestado < 1000){
            return 0.0;
        }
        return super.calcularLucro(meses);
    }

    @Override
    public String toString() {
        return "InvestimentoComIR: R$" + getValorInicial() + " Juros Mensais: " + getJurosMensais()*100 + "% Meses: "+ getMeses();
    }
}


