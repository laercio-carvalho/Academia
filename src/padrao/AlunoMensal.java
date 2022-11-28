package padrao;

public class AlunoMensal extends Aluno{
    String NomeAlunoMensal;
    AlunoMensal(){
        Aluno aluno = new Aluno();
        //NomeAlunoMensal = aluno.getNome();
        setNome(NomeAlunoMensal);
        //NomeAlunoMensal = aluno.getNome();
        System.out.print("Seja nem vindo "+aluno.getNome() );

        System.out.println("Ficamos felizes por ser um Aluno Mensal ");
        System.out.println("Deseja um Upgrade?");


        //if ()
    }
}
