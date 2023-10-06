public class Pessoa {

    private String nome;
    private int idade;

    public Pessoa(){
        nome = "Cauê";
        idade = 17;
    }

    public String getNome(){
        return nome;
    }

    public int getIdade(){
        return idade;
    }

    public void setNome(String newNome){
        this.nome = newNome;
    }

    public void setIdade(int newIdade){
        this.idade = newIdade;
    }

}
