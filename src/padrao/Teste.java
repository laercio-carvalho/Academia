package padrao;

public class Teste extends Loja{
    public static void main(String[] args) {
        Loja loja = new Loja();
        Aluno aluno = new Aluno();
        aluno.BeMVindo();
        aluno.Contrato();
        //aluno.getNome();
        System.out.println(aluno.getNome());
    }
}
