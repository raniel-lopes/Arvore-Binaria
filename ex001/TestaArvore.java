package ex001;

public class TestaArvore {
	public static void main(String[] args) {
		ArvoreBinaria arvore = new ArvoreBinaria();

		int[] valores = {50, 30, 20, 40, 70, 60, 80};
		for (int valor : valores) {
			arvore.inserir(valor);
		}

		arvore.exibePreOrdem();
		arvore.exibeEmOrdem();
		arvore.exibePosOrdem();
	}
}
