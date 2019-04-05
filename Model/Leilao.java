import java.util.ArrayList;


public class Leilao {

    String nome;
    int idLeilao;
    Produto produto;
    ArrayList<Lance> lances;

    public Leilao(String nome, int idLeilao, Produto produto) {
        this.nome = nome;
        this.idLeilao = idLeilao;
        this.produto = produto;
        lances = new ArrayList<>();
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

    public void addLance(Lance lance){
        lances.add(lance);
    }
}