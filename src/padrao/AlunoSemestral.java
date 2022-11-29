package padrao;

public class AlunoSemestral extends Aluno{
    String NomeAlunoSemestral;
    AlunoSemestral(){
        Aluno aluno = new Aluno();
        aluno.setNome(NomeAlunoSemestral);
        System.out.println("Seja nem vindo "+aluno.getNome() );
        aluno.getNome();
        System.out.println("Ficamos felizes por ser um Aluno Semestral ");
        System.out.println("Deseja um Upgrade?");
    }
}
