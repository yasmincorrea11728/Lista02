package classes;

public class ClasseEx8 {

    //atributos
    private int valor;

    //construtores
    public ClasseEx8(){
        valor = 0;
    }

    //métodos
    public int Zerar(){
        this.valor = 0;
        return valor;
    }

    public int Incrementar() {
        this.valor++;
        return valor;
    }

    public int ObterValor() {
        return valor;
    }
}