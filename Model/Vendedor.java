public class Vendedor {

    String nome;
    String cpf;
    int idContaBancaria;
    Produtos[] produtos;

    public Vendedor(String nome, String cpf, int idContaBancaria, Produtos[] produtos){
        this.nome = nome;
        this.cpf = cpf;
        this.idContaBancaria = idContaBancaria;
        this.produtos = produtos
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
}