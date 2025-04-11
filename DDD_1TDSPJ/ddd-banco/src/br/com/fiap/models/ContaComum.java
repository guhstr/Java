package br.com.fiap.models;

import br.com.fiap.enums.SituacaoEnum;

import java.time.LocalDate;
import java.util.Random;

import static java.lang.System.out;

public class ContaComum{
    protected Long nroConta;
    protected LocalDate dtAbertura;
    protected LocalDate dtEncerramento;
    protected SituacaoEnum situacao;
    protected int senha;
    protected double saldo;
    protected Cliente cliente;

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public Long abrirConta(int senha){
        Random random = new Random();
        this.nroConta = random.nextLong(1000);
        this.senha = senha;
        this.dtAbertura = LocalDate.now();
        this.situacao = SituacaoEnum.ATIVA;
        this.saldo = 100;
        return nroConta;
    }

    public boolean validarSenha(int senha) {
        if(senha == senha){
            return true;
        }
        else{
            return false;
        }
    }

    public String sacarValor(double valor){
        if(this.saldo >= valor){
            this.saldo -= saldo - valor;
            return "Saque efetuado com sucesso. Saldo atual da conta: " + saldo;
        }
        else{
            return "Saque não efetuado, saldo insuficiente.";
        }
    }

    public void depositarValor(double valor, Long nroConta){
       if(this.nroConta == nroConta){
           this.saldo += valor;
       }
    }

    public String encerrarConta(Long nroConta){
        if(nroConta == this.nroConta){
            this.saldo = 0;
            this.situacao = SituacaoEnum.INATIVA;
            return "Conta encerrada.";
        }
        else
            return "Conta inválida.";
    }
}
