package HerancaEModificadorProtected;

public class Pessoa {

    protected String nome;
    protected int idade;

    public void seApresentar(){
        System.out.println("Ola eu sou o " + nome + ", e tenho " + idade + " anos.");
    }
}
