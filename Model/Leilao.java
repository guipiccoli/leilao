public class Leilao {

    String nome;
    int idLeilao;
    Produto produto;

    public Leilao(String nome, int idLeilao, Produto produto) {
        this.nome = nome;
        this.idLeilao = idLeilao;
        this.produto = produto;
    }

    public String getNome(){
        return nome;
    }

    public int getIdLeilao(){
        return idLeilao;
    }

    public Produto getProduto(){
        return produto;
    }
}