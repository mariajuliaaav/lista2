public class metodocontador {

    // atributos
    private int valor;

    // construtores
    public metodocontador() {
        valor = 0;
    }

    // métodos
    public int zerar() {
        this.valor = 0;
        return valor;
    }

    // incrementar
    public int incrementar() {
        this.valor++;
        return valor;
    }

    // valor
    public int obtervalor() {
        return valor;
    }
}