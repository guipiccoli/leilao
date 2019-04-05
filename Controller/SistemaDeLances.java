public class SistemaDeLances {


    public void iniciaLance(Leilao leilao, double valor) {
        Comprador comprador = new Comprador("Piccoli", 123, 123);
        Lance lance = new Lance(1, valor, comprador, leilao.produto);
        leilao.addLance(lance);
    }

}