package com.company.exercicio25_05;

public class ContaPagar extends Conta {



    public ContaPagar() {

    }

    public ContaPagar (Fornecedor fornecedor, String descricao, Double valor, String dataDeVencimento) {
        this();
        this.descricao = descricao;
        this.valor = valor;
        this.dataVencimento = dataDeVencimento;
        this.fornecedor.nome = fornecedor.nome;
    }


    void pagar() {

        if (SituacaoConta.PAGA.equals(this.getSituacaoConta())) {
            System.err.println("Não pode pagar uma conta que já esta paga: " + this.getSituacaoConta() + ".");
        } else if (SituacaoConta.CANCELADA.equals(this.getSituacaoConta())) {
            System.err.println("Não pode pagar uma conta cancelada: " + this.getSituacaoConta() + ".");
        } else {
            System.out.println("Pagando conta " + this.getDescricao() +
                    "no valor de " + this.getValor() +
                    "e vencimento em " + this.getDataVencimento() +
                    "do fornecedor " + this.getFornecedor().getNome() + ".");
            this.situacaoConta = SituacaoConta.PAGA;
        }
    }
}