package br.com.fiap.models;

import java.util.Scanner;

public class Diaria extends Despesa{
    private double qtdeDiaria;

    public void cadastrarDespesa(){
        super.cadastrarDespesa();
        Scanner leitor = new Scanner(System.in);
        System.out.println("Quantidade de diárias: ");
        qtdeDiaria = leitor.nextInt();
    }

    @Override
    public void calcularDespesa() {
        setValorTotal(qtdeDiaria * 50);
    }

    @Override
    public void listarDespesa() {
        System.out.println("Relatório de despesa");
        System.out.println("\n========================");
        System.out.println("\nDescricao: " + getDescricao());
        System.out.println("\nQuantidade de diarias: " + qtdeDiaria);
        System.out.println("\nValor total: R$" + getValorTotal());
    }
}
