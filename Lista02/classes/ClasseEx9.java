package classes;

public class ClasseEx9 {

    private boolean acesa;

    // construtor
    public ClasseEx9()
    {
        acesa = false;
    }

    // métodos
    public void Acender()
    {
        acesa = true;
    }

    public void Apagar()
    {
        acesa = false;
    }

    public boolean EstaAcesa()
    {
        return acesa;
    }

    public void Estadol(){
        if(acesa){
            System.out.println("A lâmpada está ligada💡");
        }else{
            System.out.println("A lâmpada está desligada");
        }
    }

    public int opcao() {
        return 0;
    }

    }