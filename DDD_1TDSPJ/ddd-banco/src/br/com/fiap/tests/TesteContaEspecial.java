package br.com.fiap.tests;

import br.com.fiap.models.ContaEspecial;

public class TesteContaEspecial {
    public static void main(String[] args) {
        ContaEspecial ce = new ContaEspecial();
        ce.abrirConta(123,1000);
        ce.sacarValor(1000);
        System.out.println("Saldo: " + ce.getSaldo());
        System.out.println("Limite utilizado: " + ce.getLimite());
    }
}
