package SRC.Model.VO;

import SRC.ED.Pilha.Pilha;

public class EstoqueVO {
    private Pilha produtosEstoque;

    //construtor
    public EstoqueVO(Pilha produtosEstoque) {
        this.produtosEstoque = produtosEstoque;
    }

    //getters e setters
    public Pilha getProdutosEstoque() {
        return this.produtosEstoque;
    }

    public void setProdutosEstoque(Pilha produtosEstoque) {
        this.produtosEstoque = produtosEstoque;
    }
}
