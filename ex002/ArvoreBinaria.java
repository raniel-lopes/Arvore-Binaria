package ex002;

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

	public void exibeEmOrdem() {
		System.out.println("Em ordem: ");
		emOrdem(raiz);
		System.out.println();
	}

	private void emOrdem(No no) {
		if (no != null) {
			emOrdem(no.getEsq());
			System.out.println(no.getConteudo() + " ");
			emOrdem(no.getDir());
			;
		}
	}

	// Caminhamento pré-fixado à direita (Pré-Ordem invertida)
	public void exibePreOrdem() {
		System.out.println("Pré ordem à direita: ");
		preOrdemADireita(raiz);
		System.out.println();
	}

	private void preOrdemADireita(No no) {
		if (no != null) {
			System.out.println(no.getConteudo() + " ");
			preOrdemADireita(no.getDir());
			preOrdemADireita(no.getEsq());
		}
	}

	// Caminhamento pós-fixado à esquerda (Pós-Ordem)
	public void exibePosOrdem() {
		System.out.println("Pós-Ordem à esquerda: ");
		posOrdem(raiz);
		System.out.println();
	}

	private void posOrdem(No no) {
		if (no != null) {
			posOrdem(no.getDir());
			posOrdem(no.getEsq());
			System.out.println(no.getConteudo() + " ");
		}
	}

	// Apresenta todos os nós folhas
	public void exibeFolhas() {
		System.out.println("Folhas: ");
		folhas(raiz);
		System.out.println();
	}

	private void folhas(No no) {
		if (no != null) {
			if (no.getEsq() == null && no.getDir() == null) {
				System.out.println(no.getConteudo() + " ");
			}
			folhas(no.getEsq());
			folhas(no.getDir());
		}
	}

	// Lista o pai (raiz) e seus filhos
	public void exibeRaizFilhos() {
		if (raiz != null) {
			System.out.println("Raiz: " + raiz.getConteudo());
			if (raiz.getEsq() != null)
				System.out.println(" Filhos Esq: " + raiz.getEsq().getConteudo());
			if (raiz.getDir() != null)
				System.out.println(" Filhos Dir: " + raiz.getDir().getConteudo());
			System.out.println();
		} else {
			System.out.println("Árvore vazia");
		}
	}

}
