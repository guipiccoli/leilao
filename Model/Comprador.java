public class Comprador {

    String nome;
    String cpf;

    public Comprador(String nome, String cpf, int idContaBancaria ){
        this.nome = nome;
        this.cpf = cpf;
        this.idContaBancaria = idContaBancaria;
    }

    public String getNome(){
        return nome;
    }

    public String getCPF() {
        return cpf;
    }
}