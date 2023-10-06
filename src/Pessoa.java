public class Pessoa {

    private String nome;
    private int idade;
    private String genero;
    private String estadoCivil;
    private String hobby;
    private Boolean estuda;
    private Boolean trabalha;


    public Pessoa(String nome, int idade, String genero, String estadoCivil, String hobby, Boolean estuda, Boolean trabalha) {
        this.nome = nome;
        this.idade = idade;
        this.genero = genero;
        this.estadoCivil = estadoCivil;
        this.hobby = hobby;
        this.estuda = estuda;
        this.trabalha = trabalha;
    }

    public String getNome(){
        return nome;
    }

    public int getIdade(){
        return idade;
    }

    public String getGenero(){ return genero; }
    public String getEstadoCivil(){ return estadoCivil; }
    public String getHobby(){ return hobby; }
    public Boolean getEstuda(){ return estuda; }
    public Boolean getTrabalha(){ return trabalha; }

    public void setNome(String newNome){
        this.nome = newNome;
    }

    public void setIdade(int newIdade){
        this.idade = newIdade;
    }
    public void setGenero(String newGenero){ this.genero = newGenero;}
    public void setEstadoCivil(String newEstadoCivil){ this.estadoCivil = newEstadoCivil;}
    public void setHobby (String newHobby){ this.hobby = newHobby;}
    public void setEstuda (Boolean newEstuda){ this.estuda = newEstuda;}
    public void setTrabalha(Boolean newTrabalha){ this.trabalha = newTrabalha;}

}
