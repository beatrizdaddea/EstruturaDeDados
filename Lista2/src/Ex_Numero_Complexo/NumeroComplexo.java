package Ex_Numero_Complexo;


public class NumeroComplexo {


    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

   
    public double getB() {
        return b;
    }

  
    public void setB(double b) {
        this.b = b;
    }
    
        private double a; // num real
	private double b; // num imaginario
        
	//  construtor que permite o objeto ser inicializado quando é declarado na main
	public NumeroComplexo (double a, double b) {
	    this.a = a; this.b = b;
	}
        
	// metodo para somar 2 numeros 
	public static NumeroComplexo soma (NumeroComplexo x, NumeroComplexo y) {
            // x equivale a primeira equação
            // y equivale a segunda equação
	    return new NumeroComplexo (x.getA() + y.getA(), x.getB() + y.getB());
	}
        
        
        
        // método para calcular o valor absoluto
        public void valor_absoluto(){
            double valor_a = Math.pow(getA(), 2);
            double valor_b = Math.pow(getB(), 2);
            double resultado = Math.sqrt(valor_a + valor_b); // raiz quadrada
            System.out.println("Valor Absoluto: "+ resultado);
        }

        // método para inverter os valores da equação 
        public void inversao(){
         double a_invertido = -getA();
         double b_invertido = -getB();
         System.out.println("Valor invertido: "+ a_invertido+ " + " + b_invertido+"i");
        }
        
        // método para multiplicacao
        public static NumeroComplexo multiplicacao(NumeroComplexo x, NumeroComplexo y){
            
         double multi_imaginaria = (x.getA() * y.getB() + y.getA() * x.getB());
         double multi_real = (x.getA() * y.getA() - x.getB() * y.getB());
         return new NumeroComplexo (multi_real, multi_imaginaria);
            //System.out.println("Resultado: "+ multi_real+ " + " +  multi_imaginaria+"i");
        }
        
        
        // vai imprimir em formato de equação: a + bi
        @Override
        public String toString() {
	    return (this.getA() + " + " + this.getB() + "i");
	}
        
        public void equacao (){
            System.out.println("Parte real a = " + getA());
            System.out.println("Parte imaginária b = " + getB() +"i");
        }
    
    
}
