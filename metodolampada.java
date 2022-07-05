public class metodolampada {

    private boolean acesa;

    // construtor
    public metodolampada() {
        acesa = false;
    }

    // métodos
    public void acender() {
        acesa = true;
    }

    public void apagar() {
        acesa = false;
    }

    public boolean acesa() {
        return acesa;
    }

    public void estadol() {
        if (acesa) {
            System.out.println("A lâmpada está ligada!");
        } else {
            System.out.println("A lâmpada está desligad!");
        }
    }

    public int opcao() {
        return 0;
    }
}