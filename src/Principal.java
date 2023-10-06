public class Principal {
    public static void main(String[]args){
        Pessoa minhaPessoa = new Pessoa();
        minhaPessoa.getNome();
        minhaPessoa.getIdade();
        System.out.println(minhaPessoa.getNome() + " tem " + minhaPessoa.getIdade() + " anos.");
        minhaPessoa.setNome("Nana");
        minhaPessoa.setIdade(20);
        System.out.println(minhaPessoa.getNome() + " tem " + minhaPessoa.getIdade() + " anos.");

    }
}
