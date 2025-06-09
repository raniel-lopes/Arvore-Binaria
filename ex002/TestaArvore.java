package ex002;

public class TestaArvore {
	public static void main(String[] args) {
		ArvoreBinaria arvore = new ArvoreBinaria();
		
		// Inserindo os elementos na árvore
		int[] valores = {5, 3, 4, 9, 7, 11};
		for(int valor : valores) {
			arvore.inserir(valor);
		}
		
		arvore.exibeEmOrdem();
		arvore.exibePreOrdem();
		arvore.exibePosOrdem();
		arvore.exibeFolhas();
		arvore.exibeRaizFilhos();
	}
}
