package SRC.ED.Pilha;

import SRC.ED.*;;

public class Pilha<T> extends EstruturaEstatica {
    public Pilha(){
        super();
    }

    public Pilha(int capacidade){
        super(capacidade);
    }

    public void empilhar(T elemento){
        super.adiciona(elemento);
    }

    public Object topo(){
        if (this.estaVazia()){
            return null;
        }

        return this.elementos[tamanho - 1];
    }

    public Object desempilha(){
		
		if (this.estaVazia()){
			return null;
		}
		
		return this.elementos[--tamanho];
	}
}
