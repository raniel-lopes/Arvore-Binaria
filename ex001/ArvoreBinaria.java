package ex001;

public class ArvoreBinaria {

	private No raiz;

	public ArvoreBinaria() {
		this.raiz = null;
	}

	// Inserção em árvore binária de busca
	public void inserir(int valor) {
		raiz = inserirRec(raiz, valor);
	}

	private No inserirRec(No atual, int valor) {
		if (atual == null) {
			return new No(valor);
		}
		if (valor < atual.getConteudo()) {
			atual.setEsq(inserirRec(atual.getEsq(), valor));
		} else if (valor > atual.getConteudo()) {
			atual.setDir(inserirRec(atual.getDir(), valor));
		}
		return atual;
	}

	public boolean vazia() {
		return (raiz == null);
	}

	// Caminhamento Pré-Ordem
	public void exibePreOrdem() {
		System.out.print("Pré-Ordem: ");
		preOrdem(raiz);
		System.out.println();
	}

	private void preOrdem(No no) {
		if (no != null) {
			System.out.print(no.getConteudo() + " ");
			preOrdem(no.getEsq());
			preOrdem(no.getDir());
		}
	}

	// Caminhamento Em-Ordem
	public void exibeEmOrdem() {
		System.out.print("Em-Ordem: ");
		emOrdem(raiz);
		System.out.println();
	}

	private void emOrdem(No no) {
		if (no != null) {
			emOrdem(no.getEsq());
			System.out.print(no.getConteudo() + " ");
			emOrdem(no.getDir());
		}
	}

	// Caminhamento Pós-Ordem
	public void exibePosOrdem() {
		System.out.print("Pós-Ordem: ");
		posOrdem(raiz);
		System.out.println();
	}

	private void posOrdem(No no) {
		if (no != null) {
			posOrdem(no.getEsq());
			posOrdem(no.getDir());
			System.out.print(no.getConteudo() + " ");
		}
	}
}
