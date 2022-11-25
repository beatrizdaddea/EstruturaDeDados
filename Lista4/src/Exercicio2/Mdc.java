package Exercicio2;

public class Mdc {

    private int x;
    private int y;
    private int resultado;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getResultado() {
        return resultado;
    }

    public void setResultado(int resultado) {
        this.resultado = resultado;
    }

    public int calculo(int x, int y) {
        if (x == y) {
            setResultado(x);
            return x;
        } else if (x < y) {
            return calculo(y, x);
        } else {
            return calculo(x - y, y);
        }
    }

}
