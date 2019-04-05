import Model.*;

public class SistemaDeLances {


    public void iniciaLance(Leilao leilao) {
        Comprador comprador = new Comprador("Piccoli", 123, 123);
        Lance lance = new Lance(1, 133, comprador, leilao.produto);
        leilao.addLance(lance);
    }

}