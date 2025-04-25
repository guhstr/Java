package br.com.fiap.test;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int op = 0;
        do{
            System.out.println("Digite a opção desejada" +
                    "\n1 - Alimentação" +
                    "\n2 - Transporte" +
                    "\n3 - Diária" +
                    "\n4 - Analise de despesas" +
                    "\n0 - Sair");
            op = leitor.nextInt();
            switch(op){

            }
        }while (op != 0);
    }
}
