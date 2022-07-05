public class metodoconta {

    private String nome;

    private String numero;

    private float saldo;

    public metodoconta(String nome, String numero, float saldo) {
        this.nome = nome;
        this.numero = numero;
        this.saldo = saldo;
    }

    public void depositar(float valor) {
        saldo += valor;
    }

    public void sacar(float valor) {
        saldo -= valor;
    }

    public String getnome() {
        return nome;
    }

    public String getnumero() {
        return numero;
    }

    public float getsaldo() {
        return saldo;
    }

    public void setnome(String nome) {
        this.nome = nome;
    }

    public void setnumero(String numero) {
        this.numero = numero;
    }

    public void setsaldo(float saldo) {
        this.saldo = saldo;
    }

    public metodoconta() {
    }
}