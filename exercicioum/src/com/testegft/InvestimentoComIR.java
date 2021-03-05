package com.testegft;

public class InvestimentoComIR extends Investimento{
    public InvestimentoComIR(Double valorInicial, Double jurosMensais) {
        super(valorInicial, jurosMensais);
    }

    @Override
    public double calcularLucro(int meses) {
        double desconto = calculaDesconto(meses);

        return (super.calcularLucro(meses)) * desconto;
    }
    private double calculaDesconto(int meses){
        double percentualdesconto = 0.0;

        if(meses >= 6 && meses < 12){
            percentualdesconto = 0.2;
        }else if (meses >= 12 && meses < 24){
            percentualdesconto = 0.175;
        }else if(meses >= 24){
            percentualdesconto = 15.0;
        }else{
            percentualdesconto = 0.225;
        }

        return 1 - percentualdesconto;
    }
    @Override
    public String toString() {
        return "InvestimentoSemIR: R$" + getValorInicial() + " Juros Mensais: " + getJurosMensais()*100 + "% Meses: "+ getMeses();
    }
}
