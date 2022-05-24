package com.company.exercicio25_05;

public class ContaReceber extends Conta {

    public ContaReceber () {

    }

    public ContaReceber(Cliente cliente, String descricao, double valor, String dataVencimento) {
        this.cliente = cliente;
        this.descricao = descricao;
        this.valor = valor;
        this.dataVencimento = dataVencimento;
    }

    void cancelar() {
        if (SituacaoConta.PAGA.equals(this.getSituacaoConta()) || SituacaoConta.CANCELADA.equals(this.getSituacaoConta())
                || valor >=50000) {
            System.err.println("Conta não pode ser cancelada: " + this.getDescricao() + ".");
        } else {
            this.situacaoConta = SituacaoConta.CANCELADA;
            System.err.println("Cancelando Conta Do Mes.");
        }
    }

    public void receber() {
        if (SituacaoConta.PAGA.equals(getSituacaoConta()) || SituacaoConta.CANCELADA.equals(getSituacaoConta())) {
            System.out.println("Conta não pode ser recebida.");
        } else {
            System.out.println("Recebendo conta " + this.getDescricao() + "no valor de " + getValor() +
                    "e vencimento: " + this.getDataVencimento() + ".");

        }
    }
}

