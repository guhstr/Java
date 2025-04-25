package br.com.fiap.models;

import java.util.Scanner;

public class Alimentacao extends Despesa{
    private String nomeRestaurante;
    private int quantidadeRefeicao;

    public void cadastrarDespesa(){
        super.cadastrarDespesa();
        Scanner leitor = new Scanner(System.in);
        System.out.println("Nome do restaurante: ");
        nomeRestaurante = leitor.nextLine();
        System.out.println("Quantidade de refeições: ");
        quantidadeRefeicao = leitor.nextInt();
    }

    @Override
    public void calcularDespesa() {
        setValorTotal(quantidadeRefeicao * 18);
    }

    @Override
    public void listarDespesa() {

    }

}
