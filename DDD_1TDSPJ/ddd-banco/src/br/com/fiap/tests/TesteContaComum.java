package br.com.fiap.tests;

import br.com.fiap.models.ContaComum;

public class TesteContaComum {
    public static void main(String[] args) {
        ContaComum conta = new ContaComum();
        conta.abrirConta(1234);
        conta.sacarValor(90);
        System.out.println();
    }
}
