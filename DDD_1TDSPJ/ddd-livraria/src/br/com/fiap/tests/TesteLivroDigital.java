package br.com.fiap.tests;

import br.com.fiap.models.Editora;
import br.com.fiap.models.LivroDigital;

public class TesteLivroDigital {
    public static void main(String[] args) {
        Editora novatec = new Editora();
        novatec.setNome("Novatec");
        novatec.setSite("www.novatec.com");
        novatec.setTelefone("11568958995");

        LivroDigital livroDigital = new LivroDigital();
        livroDigital.setTitulo("Gugu");
        livroDigital.setAutor("Sartori");
        livroDigital.setPreco(100);
        livroDigital.exibirLivro();
        System.out.println("Preco com desconto R$ " + livroDigital.aplicarDesconto(15));
    }
}
