package classes;

public class ClasseEx10 {

    private String nome;

    private String numero;

    private float saldo;

    public ClasseEx10(String nome, String numero, float saldo)
    {
        this.nome = nome;
        this.numero = numero;
        this.saldo = saldo;
    }

    public void Depositar(float valor)
    {
        saldo += valor;
    }

    public void Sacar(float valor)
    {
        saldo -= valor;
    }

    public String getNome() {
        return nome;
    }

    public String getNumero() {
        return numero;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public ClasseEx10() {
    }
}