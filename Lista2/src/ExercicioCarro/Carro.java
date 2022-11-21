package ExercicioCarro;

import java.util.Scanner;

public class Carro {


    /* Exercicio 1 */
    public double getMotor() {
        return Motor;
    }

    public void setMotor(double Motor) {
        this.Motor = (float) Motor;
    }

    public String getMarca() {
        return Marca;
    }

    public void setMarca(String Marca) {
        this.Marca = Marca;
    }

    public int getAno() {
        return Ano;
    }

    public void setAno(int Ano) {
        this.Ano = Ano;
    }

    public String getCor() {
        return Cor;
    }

    public void setCor(String Cor) {
        this.Cor = Cor;
    }

    public double getKm_rodados() {
        return km_rodados;
    }

    public void setKm_rodados(double km_rodados) {
        this.km_rodados = (float) km_rodados;
    }

    public String getResp_atual() {
        return resp_atual;
    }

    public void setResp_atual(String resp_atual) {
        this.resp_atual = resp_atual;
    }

    public String getNovo() {
        return novo;
    }

    public void setNovo(String novo) {
        this.novo = novo;
    }

    private String Marca;
    private int Ano;
    private String Cor;
    private float km_rodados;
    private float Motor;
    public int resposta;
    public int opcao;
    private String resp_atual;
    private String novo;

    /* Exercicio 2*/
    public void crud() {
        do {
            Scanner operacao = new Scanner(System.in);
            System.out.println("1 - Criar / 2- Atualizar Dados / 3 -Excluir Dados /  4 - Acesso aos Dados");
            System.out.println("Insira a opção desejada");
            opcao = (operacao.nextInt());

            switch (opcao) {
                case 1:
                    Scanner criar = new Scanner(System.in);

                    System.out.println("Insira a marca do carro");
                    setMarca(criar.nextLine());   
                    
                    System.out.println("Insira a cor do carro");
                    setCor(criar.nextLine());
                    
                    System.out.println("Insira o ano do carro");
                    setAno(criar.nextInt()); 
                    
                    System.out.println("Insira quilometragem do carro");
                    setKm_rodados(criar.nextFloat());

                    System.out.println("Insira o motor do carro");
                    setMotor(criar.nextFloat());

                    break;

                case 2:
                    Scanner atualizar = new Scanner(System.in);
                    System.out.println("Marca / Ano / Cor / Quilometragem / Motor ");
                    System.out.println("Insira a informação que você deseja alterar: ");

                    setResp_atual(atualizar.nextLine());
                    System.out.println("Insira a nova informação: ");
                    setNovo(atualizar.nextLine());

                    if (resp_atual == "Marca") {
                        Marca = novo;

                    } else if (resp_atual == "Ano") {
                        Ano = Integer.parseInt(novo);

                    } else if (resp_atual == "Cor") {
                        Cor = novo;

                    } else if (resp_atual == "Quilometragem") {
                        km_rodados = Float.parseFloat(novo);

                    } else if (resp_atual == "Motor") {
                        Motor = Float.parseFloat(novo);

                    }
                    break;

                case 3:
                    Marca = "";
                    Ano = 0;
                    Cor = "";
                    km_rodados = 0;
                    Motor = 0;

                    System.out.println("Dados do Carro apagados");
                    break;

                case 4:
                    System.out.println("Marca: " + Marca);
                    System.out.println("Ano: " + Ano);
                    System.out.println("Cor: " + Cor);
                    System.out.println("Km_Rodados: " + km_rodados);
                    System.out.println("Tipo do Motor: " + Motor);
                    break;
            }

            Scanner pergunta = new Scanner(System.in);
            System.out.println("Deseja realizar uma nova operação ? ");
            System.out.println(" 1 - SIM / 2 - NÃO ");
            resposta = (pergunta.nextInt());

        } while (resposta == 1);
    }

    /* Exercicio 3 */
    public void gasolina() {

        double preco_gasolina = 4.259;
        double valor_gasto = preco_gasolina * this.Motor * this.km_rodados;
        System.out.println("Preco :" + valor_gasto);

    }
}
