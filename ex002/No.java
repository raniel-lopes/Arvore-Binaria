package ex002;

public class No {
	private int conteudo;
	private No esq;
	private No dir;
	
	public No() {
		this.conteudo = 0;
		this.esq = null;
		this.dir = null;
	}
	
	public No(int conteudo) {
		this.conteudo = conteudo;
		this.esq = null;
		this.dir = null;
	}
	
	public int getConteudo() {
		return conteudo;
	}
	
	public void setConteudo(int conteudo) {
		this.conteudo = conteudo;
	}
	
	public No getEsq() {
		return esq;
	}
	
	public void setEsq(No esq) {
		this.esq = esq;
	}
	
	public No getDir() {
		return dir;
	}
	
	public void setDir(No dir) {
		this.dir = dir;
	}
	
}
