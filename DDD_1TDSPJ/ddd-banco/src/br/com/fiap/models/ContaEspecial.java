package br.com.fiap.models;

public class ContaEspecial {
    private double limiteConta;

    public double getLimiteConta() {
        return limiteConta;
    }

    public void setLimiteConta(double limiteConta) {
        this.limiteConta = limiteConta;
    }

    public Long abrirConta(int senha, double limiteConta){
        super.abrirConta();
        System.out.println("Endereço: " + endereco);
        System.out.println("Taxa de entrega: " + taxaEntrega);
    }
}
