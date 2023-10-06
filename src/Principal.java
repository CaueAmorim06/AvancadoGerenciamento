public class Principal {
    public static void main(String[]args){
        Pessoa minhaPessoa = new Pessoa("Caue", 17, "Homem", "solteiro", "jogos", true, true);
        minhaPessoa.getNome();
        minhaPessoa.getIdade();
        minhaPessoa.getGenero();
        minhaPessoa.getEstadoCivil();
        minhaPessoa.getHobby();
        minhaPessoa.getEstuda();
        minhaPessoa.getTrabalha();
        System.out.println(minhaPessoa.getNome() + " tem " + minhaPessoa.getIdade() + " anos, é " + minhaPessoa.getGenero() + ", está " +  minhaPessoa.getEstadoCivil() + ", gosta de " +
        minhaPessoa.getHobby() +  ". Respectivamente, estuda e trabalha? " + minhaPessoa.getEstuda() + " " +  minhaPessoa.getTrabalha() );
        minhaPessoa.setNome("Nana");
        minhaPessoa.setIdade(20);
        minhaPessoa.setGenero("Mulher");
        minhaPessoa.setEstadoCivil("Solteira");
        minhaPessoa.setHobby("academia");
        minhaPessoa.setEstuda(false);
        minhaPessoa.setTrabalha(false);
        System.out.println(minhaPessoa.getNome() + " tem " + minhaPessoa.getIdade() + " anos, é " + minhaPessoa.getGenero() + ", está " +  minhaPessoa.getEstadoCivil() + ", gosta de " +
                minhaPessoa.getHobby() +  ". Respectivamente, estuda e trabalha? " + minhaPessoa.getEstuda() + " " +  minhaPessoa.getTrabalha() );

    }
}
