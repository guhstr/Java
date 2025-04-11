package br.com.fiap.models;

import br.com.fiap.enums.SituacaoEnum;

import java.time.LocalDate;

public class ContaComum {
    protected Long nroConta;
    protected LocalDate dtAbertura;
    protected LocalDate dtEncerramento;
    protected SituacaoEnum situacao;
    protected int senha;
    protected double saldo;
    protected Cliente cliente;

    public Long abrirConta(int senha){
        this.senha = senha;
        this.dtAbertura = LocalDate.now();
        this.dtEncerramento = null;
        this.situacao = SituacaoEnum.ATIVA;
        this.saldo = 100;
    }

    public boolean validarSenha(int senha){
        if(this.senha.equals()){
            return 1;
        }
        else{
            return 0;
        }
    }

    public String sacarValor(double valor){}

    public void depositarValor(double valor, Long nroConta){}

    public String encerrarConta(double valor){}
}
