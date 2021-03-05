package com.testegft;

public class Investimento {
    private final double valorInicial;
    private final double jurosMensais;
    private int meses;


    public Investimento(Double valorInicial, Double jurosMensais) {
        this.valorInicial = valorInicial;
        this.jurosMensais = jurosMensais;
    }
    public double getJurosMensais() {
        return jurosMensais;
    }

    public double getValorInicial() {
        return valorInicial;
    }

    public int getMeses() {
        return this.meses;
    }

    public double calcularLucro(int meses){

        double feeCalc = Math.pow(( 1 + this.jurosMensais), meses);

        return (this.valorInicial * feeCalc - this.valorInicial);
    }


    public void setMeses(int meses) {
        this.meses = meses;
    }
}

