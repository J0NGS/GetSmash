package SRC.ED.Fila;

import SRC.ED.EstruturaEstatica;

public class Fila<T> extends EstruturaEstatica {
    public Fila(){
        super();
    }

    public Fila(int capacidade){
        super(capacidade);
    }

    public void enfileirar(T elemento){ // metodo para adicionar ao final da fila
        this.adiciona(elemento);
    }

    public T espiar(){ // metodo para ver se fila está vazia
		
		if (this.estaVazia()){
			return null;
		}
		
		return (T) this.elementos[0];
	}
	
	public T desenfileira(){ // metodo para desinfilerar(tirar o primeiro elemento)
		
		final int POS = 0;
		
		if (this.estaVazia()){
			return null;
		}
		
		T elementoASerRemovido = (T) this.elementos[POS];
		
		this.remove(POS);
		
		return elementoASerRemovido;
	}
}
