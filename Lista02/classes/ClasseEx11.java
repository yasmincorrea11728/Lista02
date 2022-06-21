package classes;

public class ClasseEx11 {

    private int pessoa = 0;
    private int totalPessoas;
    private int andarAtual = 0;
    private int totalAndar;

    //método construtor
    public ClasseEx11(int totalPessoas, int totalAndar){
        this.totalPessoas = totalPessoas;
        this.totalAndar = totalAndar;
    }

    public void entrar(){
        if(pessoa < totalPessoas){
            pessoa++;
            System.out.println("Há " + pessoa + " pessoas");
        }else{
            System.out.println("O elevador está cheio!");
        }
    }

    public void sair(){
        if(pessoa > 0){
            pessoa--;
            System.out.println("Há " + pessoa + " pessoas");
        }else{
            System.out.println("O elevador está vazio!");
        }
    }

    public void subir(){
        if(andarAtual < totalAndar){
            andarAtual++;
            System.out.println("O elevador está no " + andarAtual + " andar");
        }else{
            System.out.println("O elevador está no último andar!");
        }
    }

    public void descer(){
        if(andarAtual > 0){
            andarAtual--;
            System.out.println("O elevador está no " + andarAtual + " andar");
        }else{
            System.out.println("O elevador está no térreo!");
        }
    }

}