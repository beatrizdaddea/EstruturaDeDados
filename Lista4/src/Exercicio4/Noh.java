package Exercicio4;

public class Noh {

    private long valor;
    private Noh dir;
    private Noh esq;

    public Noh(int valor) {
        setValor(valor);
    }

    public long getValor() {
        return valor;
    }

    public void setValor(long valor) {
        this.valor = valor;
    }

    public Noh getDir() {
        return dir;
    }

    public void setDir(Noh dir) {
        this.dir = dir;
    }

    public Noh getEsq() {
        return esq;
    }

    public void setEsq(Noh esq) {
        this.esq = esq;
    }
}
