package com.company.exercicio25_05;

public class ContaReceber extends Conta {

    protected String descricao;
    protected Double valor;
    protected String dataVencimento;
    protected Cliente cliente;
    protected Fornecedor fornecedor;

    @Override
    public Fornecedor getFornecedor() {
        return fornecedor;
    }

    @Override
    public void setFornecedor(Fornecedor fornecedor) {
        this.fornecedor = fornecedor;
    }

    public ContaReceber(Cliente cliente, String descricao, double valor, String dataVencimento) {
    }

    public ContaReceber() {

    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public String getDataVencimento() {
        return dataVencimento;
    }

    public void setDataVencimento(String dataVencimento) {
        this.dataVencimento = dataVencimento;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    void cancelar() {
        if (SituacaoConta.PAGA.equals(this.getSituacaoConta()) || SituacaoConta.CANCELADA.equals(this.getSituacaoConta())
                || valor < 50000) {
            System.err.println("Conta não pode ser cancelada.");
        } else {
            this.situacaoConta = SituacaoConta.CANCELADA;
            System.err.println("Conta foi cancelada com sucesso!!");
        }
    }

    public void receber() {
        if (SituacaoConta.PAGA.equals(getSituacaoConta()) || SituacaoConta.CANCELADA.equals(getSituacaoConta())) {
            System.out.println("Conta não pode ser recebida.");
        } else {
            System.out.println("Pagando conta " + this.getDescricao() +
                    "no valor de " + this.getValor() +
                    "e vencimento em " + this.getDataVencimento() +
                    "do fornecedor " + this.getFornecedor().getNome() + ".");
            this.situacaoConta = SituacaoConta.PAGA;

        }
    }
}

