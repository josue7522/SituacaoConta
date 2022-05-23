package com.company.exercicio25_05;

public class Principal {
    public static void main(String[] args) {
        Fornecedor imobiliaria = new Fornecedor();
        imobiliaria.setNome("Casa & Cia Negócios Imobiliários");
        Fornecedor mercado = new Fornecedor();
        mercado.setNome("Mercado do João");

        Cliente atacadista = new Cliente();
        atacadista.setNome("Triângulo Quadrado Atacadista");
        Cliente telecom = new Cliente();
        telecom.setNome("FoneNet Telecomunicações");


        ContaPagar conta1 = new ContaPagar();
        conta1.setDescricao("Aluguel da matriz");
        conta1.setValor(1230d);
        conta1.setDataVencimento("10/05/2012");
        conta1.setFornecedor(imobiliaria);

        ContaPagar conta2 = new ContaPagar( , "Compras do mês ", 390d, " 19/05/2012");
        ContaPagar conta3 = new ContaPagar(mercado, "Aluguel da filial ", 700d, " 11/05/2012");

        ContaReceber contaReceber1 = new ContaReceber();
        contaReceber1.setDescricao("Desenvolvimento de projeto de logística em Java");
        contaReceber1.setValor(89500d);
        contaReceber1.setDataVencimento("23/05/2012");
        contaReceber1.setCliente(atacadista);

        ContaReceber contaReceber2 = new ContaReceber(telecom, " Manutenção em sistema de conta online",
                53200d, "13/05/2012");
        conta1.pagar();
        conta2.cancelar();

        contaReceber1.receber();
        contaReceber2.cancelar();

    }
}
