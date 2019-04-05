public class SistemaDeLeilao {

    Leilao leilaoAndamento;

    public Leilao iniciaLeilao() {
        Vendedor vendedor = new Vendedor("Paulo", 123123, 12);
        Produto produtoLeiloado = new Produto(1, "Moto", 1000, vendedor);
        leilaoAndamento = new Leilao("Jogos", 1, produtoLeiloado);
        return leilao;
    }

    public Leilao encerrarLeilao() {
        leilaoAndamento = null;
    }

}