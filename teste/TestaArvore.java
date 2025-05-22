package teste;

public class TestaArvore {
	public static void main(String[] args) {
		ArvoreBinaria arvoreBinaria = new ArvoreBinaria();
		arvoreBinaria.insereRaiz(12);
		arvoreBinaria.insereEsquerda(12, 10);
		arvoreBinaria.insereDireita(12, 14);
		
		System.out.println("Vamos ver se imprime");
		arvoreBinaria.exibePreOrdem();
	}
}
