package teste;

public class ArvoreBinaria {
	
	private No raiz;
	
	// vamos construir uma árvore
	public ArvoreBinaria() {
		this.raiz = null;
	}
	
	// metodo para inserir na raiz
	public boolean insereRaiz (int valor) {
		if(raiz != null) {
			return false;
		}
		
		No novoNo = new No();
		novoNo.setConteudo(valor);
		novoNo.setEsq(null);
		novoNo.setDir(null);
		
		raiz = novoNo;
		return true;
	}
	
	// metodos de busca
	public boolean vazia() {
		return (raiz == null);
	}
	
	//vamos implementar a pior busca da arvore
	private No busca(No T, int valor) {
		if(T == null) {
			return null;
		}
		//condição de parada
		if(T.getConteudo() == valor) {
			return T;
		}
		
		//recursividade
		No aux = busca(T.getEsq(), valor);
		if(aux == null)
			aux = busca(T.getDir(), valor);
		
		return aux;
	}
	
	// Vou precisar de uma busca com o valor que foi 
	// passado para chamar um método recursivo
	public No busca(int valor) {
		if(vazia())
			return null;
		return busca(raiz, valor);
	}
	
	//insere na esquerda
	//vamos começar a brincadeira...
	public boolean insereEsquerda(int vPai, int vFilho) {
		// Será que o nó já existe?
		No filho = busca(vFilho);
		if(filho != null) {
			return false;
		}
		// Será que o pai existe?
		No pai = busca(vPai);
		if(pai == null)
			return false;
		if(pai.getEsq() != null)
			return false;
		
		No novoNo = new No();
		novoNo.setConteudo(vFilho);
		novoNo.setEsq(null);
		novoNo.setDir(null);
		
		pai.setEsq(novoNo);
		return true;
	}
	public boolean insereDireita(int vPai, int vFilho) {
		// Será que o nó já existe?
		No filho = busca(vFilho);
		if(filho != null) {
			return false;
		}
		// Será que o pai existe?
		No pai = busca(vPai);
		if(pai == null)
			return false;
		if(pai.getDir() != null)
			return false;
		
		No novoNo = new No();
		novoNo.setConteudo(vFilho);
		novoNo.setDir(null);
		novoNo.setEsq(null);
		
		pai.setDir(novoNo);
		return true;
	}
	
	// vamos para o caminhamento
	private void exibePreOrdem(No T) {
		if(T == null) {
			return;
		}
		//System.out.println("" + T.getConteudo()); // preordem
		
		if(T.getEsq() != null) {
			exibePreOrdem(T.getEsq());
		}
		
		System.out.println("" + T.getConteudo()); // central

		
		if(T.getDir() != null) {
			exibePreOrdem(T.getDir());
		}
		
		//System.out.println("" + T.getConteudo()); // posordem

	}
	
	public void exibePreOrdem() {
		if(raiz == null)
			System.out.println("Sua árvore não possui elementos");
		else
			exibePreOrdem(raiz);
	}
}
