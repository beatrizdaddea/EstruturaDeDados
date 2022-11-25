package Exercicio4;

public class Arvore {
	private Noh inicio;

	public Arvore() {
		inicio = null;
	}

	public Noh getInicio() {
		return inicio;
	}

	public void setInicio(Noh inicio) {
		this.inicio = inicio;
	}


	public void emOrdem(Noh atual) {
		
		if (atual != null) {
			emOrdem(atual.getEsq());
			System.out.print(atual.getValor() + " ");
			emOrdem(atual.getDir());
		}
	}

	public void preOrdem(Noh atual) {
		
		if (atual != null) {
			System.out.print(atual.getValor() + " ");
			preOrdem(atual.getEsq());
			preOrdem(atual.getDir());
		}
	}

	public void posOrdem(Noh atual) {
		
		if (atual != null) {
			posOrdem(atual.getEsq());
			posOrdem(atual.getDir());
			System.out.print(atual.getValor() + " ");
		}
	}
}
