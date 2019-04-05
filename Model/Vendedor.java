import java.util.ArrayList;

public class Vendedor {

    String nome;
    String cpf;
    int idContaBancaria;
    ArrayList<Produto> produtos;

    public Vendedor(String nome, String cpf, int idContaBancaria){
        this.idContaBancaria = idContaBancaria;
        this.nome = nome;
        this.cpf = cpf;
        this.produtos = new ArrayList<>();
    }

    public String getNome(){
        return nome;
    }

    public String getCPF() {
        return cpf;
    }

    public int getContaBancaria() {
        return idContaBancaria;
    }

    public void addProdutos(Produto produto){
        produtos.add(produto);
        }
}