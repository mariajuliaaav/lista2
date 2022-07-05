public class metodoelevador {

    private int pessoa = 0;
    private int totalpessoas;
    private int andaratual = 0;
    private int totalandar;

    // método construtor
    public metodoelevador(int totalpessoas, int totalandar) {
        this.totalpessoas = totalpessoas;
        this.totalandar = totalandar;
    }

    public void entrar() {
        if (pessoa < totalpessoas) {
            pessoa++;
            System.out.println("Há " + pessoa + " pessoas");
        } else {
            System.out.println("O elevador está cheio!");
        }
    }

    public void sair() {
        if (pessoa > 0) {
            pessoa--;
            System.out.println("Há " + pessoa + " pessoas");
        } else {
            System.out.println("O elevador está vazio!");
        }
    }

    public void subir() {
        if (andaratual < totalandar) {
            andaratual++;
            System.out.println("O elevador está no " + andaratual + " andar");
        } else {
            System.out.println("O elevador está no último andar!");
        }
    }

    public void descer() {
        if (andaratual > 0) {
            andaratual--;
            System.out.println("O elevador está no " + andaratual + " andar");
        } else {
            System.out.println("O elevador está no térreo!");
        }
    }
}