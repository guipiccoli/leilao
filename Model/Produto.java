public class Produto {

    int idProduto;
    String nomeProduto;
    double preco;
    Vendedor vendedor;

    public Produto(int idProduto, String nomeProduto, double preco, Vendedor vendedor){
        this.idProduto = idProduto;
        this.nomeProduto = nomeProduto;
        this.preco = preco;
        this.vendedor = vendedor;
    }

    public int getIdProduto(){
        return idProduto;
    }

    public String getNomeProduto(){
        return nomeProduto;
    }

    public double getPreco(){
        return preco;
    }

}