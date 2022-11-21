package Exercicio6;

public class ContaBancaria {

    private String NumereoConta;
    private int digitoVerificador;
    private float saldoConta;
    private String nome;

    public boolean verificar() {
        float valor = 0;

        for (int num = 5; num >= 0; num--) {
            valor = valor + (Integer.parseInt(String.valueOf(this.NumereoConta.charAt(num))) * (7 - num));
        }
        float resto = 11 - (valor % 11);
        if (resto == 10 || resto == 11) {
            resto = 0;
        }
        if (this.digitoVerificador == (int) resto) {
            return true;
        } else {
            return false;
        }
    }

    public String getNumereoConta() {
        return NumereoConta;
    }

    public void setNumereoConta(String numereoConta) {
        NumereoConta = numereoConta;
    }

    public int getDigitoVerificador() {
        return digitoVerificador;
    }

    public void setDigitoVerificador(int digitoVerificador) {
        this.digitoVerificador = digitoVerificador;
    }

    public float getSaldoConta() {
        return saldoConta;
    }

    public void setSaldoConta(float saldoConta) {
        this.saldoConta = saldoConta;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public ContaBancaria(String numereoConta, int digitoVerificador, float saldoConta, String nome) {
        this.NumereoConta = numereoConta;
        this.digitoVerificador = digitoVerificador;
        this.saldoConta = saldoConta;
        this.nome = nome;
    }

    @Override
    public String toString() {
        return NumereoConta + '-' + digitoVerificador
                + " " + saldoConta
                + " " + nome;
    }
}
