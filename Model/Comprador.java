public class Comprador {

    String nome;
    String cpf;

    public Comprador(String nome, String cpf){
        this.nome = nome;
        this.cpf = cpf;
    }

    public String getNome(){
        return nome;
    }

    public String getCPF() {
        return cpf;
    }
}