package SRC.ED;

public class EstruturaEstatica<T>{
    protected T[] elementos;
    protected int tamanho;

    @SuppressWarnings("unchecked") // notação para retirar a warning sobre o tipo do objeto
	public EstruturaEstatica(int capacidade){
		this.elementos = (T[]) new Object[capacidade]; // solução vista no livro effective java
		this.tamanho = 0;
	}

    public EstruturaEstatica(){
        this(30); //capacidade original do vetor é 30
    }

    public boolean estaVazia(){ //metodo para retornar se vetor está vazio
        return this.tamanho == 0;
    }


    @SuppressWarnings("unchecked")
	private void aumentaCapacidade(){ // metodo para aumentar a capacidade do vetor
		if (this.tamanho == this.elementos.length){
			T[] elementosNovos = (T[]) new Object[this.elementos.length * 2];
			for (int i=0; i<this.elementos.length; i++){
				elementosNovos[i] = this.elementos[i];
			}
			this.elementos = elementosNovos;
		}
	}

    protected boolean adiciona(T elemento){ //metodo para adicionar elemento no vetor estatico
        this.aumentaCapacidade();
        if (this.tamanho < this.elementos.length){
            this.elementos[this.tamanho] = elemento;
            this.tamanho++;
        }
        return false;
    }

    protected boolean adiciona(int posicao, T elemento){ // metodo para adicionar elemento no vetor, indicado a posição
        if (posicao < 0 || posicao > tamanho){ // caso a posição informada não exista
            throw new IllegalArgumentException("posição invalida");
        }

        this.aumentaCapacidade();

        //mover todos os elementos
        for (int i = this.tamanho-1; i>=posicao; i--){
            this.elementos[i+1] = this.elementos[i];
        }
        this.elementos[posicao] = elemento;
        this.tamanho++;
        return true;
    }


    protected void remove(int posicao){
        if(!(posicao >= 0 && posicao < tamanho)){// caso a posição informada não exista
            throw new IllegalArgumentException("posicao invalida");
        }
        for(int i = posicao; i<tamanho - 1; i++){
            elementos[i] = elementos[i + 1]; // fazendo a troca de valor para poder excluir uma posição
        }
        tamanho--;
    }

    public int tamanho(){
		return this.tamanho;
	}

	@Override
	public String toString() {
		
		StringBuilder s = new StringBuilder();
		s.append("[");
		
		for (int i=0; i<this.tamanho-1; i++){
			s.append(this.elementos[i]);
			s.append(", ");
		}
		
		if (this.tamanho>0){
			s.append(this.elementos[this.tamanho-1]);
		}
		
		s.append("]");
		
		return s.toString();
	}
}