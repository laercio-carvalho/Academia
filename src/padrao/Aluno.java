package padrao;

import java.util.Scanner;

public class Aluno{
    private String nome;
    private String cpf;
    private int tipo = 0;
    Scanner teclado = new Scanner(System.in);



    Aluno(){
        //System.out.println("Qual é o seu nome completo");
        //nome = teclado.nextLine();
        //setNome(nome);

        //System.out.println("Qual é o seu tipo de contrato? \n0 - Mensal\n1 - Semestral\n2 - Anual");
        //if (tipo == 0){
        //    AlunoMensal alunoMensal = new AlunoMensal();
        //} else if (tipo == 1) {
        //    AlunoSemestral alunoSemestral = new AlunoSemestral();
        //} else if (tipo == 2) {
        //    AlunoAnual alunoAnual = new AlunoAnual();

        //}else {
        //    System.out.println("Opção errada! Tente novamente!");
        //}
    }
    public void BeMVindo(){
        System.out.println("Qual é o seu nome completo");
        //nome = teclado.nextLine();
        setNome(nome);
        //setNome(.nextLine()nome) = teclado;
    }
    public void Contrato(){
        System.out.println("Qual é o seu tipo de contrato? \n0 - Mensal\n1 - Semestral\n2 - Anual");
        tipo = teclado.nextInt();
        //setTipo(tipo);
        if (tipo == 0){
            AlunoMensal alunoMensal = new AlunoMensal();
        } else if (tipo == 1) {
            AlunoSemestral alunoSemestral = new AlunoSemestral();
        } else if (tipo == 2) {
            AlunoAnual alunoAnual = new AlunoAnual();

        }else {
            System.out.println("Opção errada! Tente novamente!");
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        nome = teclado.nextLine();
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }
}
