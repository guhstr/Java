package br.com.fiap.models;

import java.util.Scanner;

public abstract class Despesa {
    private Scanner leitor;
    private String descricao;
    private double valorTotal;

    protected Despesa(){
        Scanner leitor = new Scanner(System.in);
    }

    public Scanner getLeitor() {
        return leitor;
    }

    public void setLeitor(Scanner leitor) {
        this.leitor = leitor;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }

    public void cadastrarDespesa(){
        valorTotal = 0;
        Scanner leitor = new Scanner(System.in);
        System.out.println("Descreva a despesa realizada:");
        descricao = leitor.nextLine();
    }

    public abstract void calcularDespesa();
    public abstract void listarDespesa();
}
