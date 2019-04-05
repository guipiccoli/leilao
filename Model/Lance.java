public class Lance {
    
    int idLance;
    double valorLance;
    Comprador comprador;
    Produto produto;

    public Lance(int idLance, double valorLance, Comprador comprador, Produto produto){
        this.idLance = idLance;
        this.valorLance = valorLance;
        this.comprador = comprador;
        this.produto = produto;
    }

    public int getIdLance(){
        return idLance;
    }

    public double getValorLance(){
        return valorLance;
    }

    public Comprador getComprador(){
        return comprador;
    }

    public Produto getProduto(){
        return produto;
    }
}

