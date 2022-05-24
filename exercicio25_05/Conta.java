package com.company.exercicio25_05;

public class Conta {
        String descricao;
        Double valor;
        String dataVencimento;

        protected SituacaoConta situacaoConta;
        protected Cliente cliente;

        public Cliente getCliente() {
            return cliente;
        }

        public void setCliente(Cliente cliente) {
            this.cliente = cliente;
        }

        public SituacaoConta getSituacaoConta() {
            return situacaoConta;
        }

        Fornecedor fornecedor = new Fornecedor();

        String getDescricao() {

            return descricao;
        }

        public void setDescricao(String descricao) {

            this.descricao = descricao;
        }

        double getValor() {

            return valor;
        }

        public void setValor(Double valor) {

            this.valor = valor;
        }

        String getDataVencimento() {

            return dataVencimento;
        }

        public void setDataVencimento(String dataDeVencimento) {

            this.dataVencimento = dataDeVencimento;
        }

        public void setFornecedor(Fornecedor fornecedor) {
            this.fornecedor.nome = fornecedor.nome;
        }

        public Fornecedor getFornecedor() {

            return fornecedor;
        }

        public Conta() {
            this.situacaoConta = SituacaoConta.PENDENTE;
        }

        void cancelar() {
            if (SituacaoConta.PAGA.equals(this.getSituacaoConta()) || SituacaoConta.CANCELADA.equals(this.getSituacaoConta())) {
                System.err.println("Conta não pode ser cancelada.");
            } else {
                this.situacaoConta = SituacaoConta.CANCELADA;
                System.err.println("Conta foi cancelada com sucesso!!");
            }
        }
    }


