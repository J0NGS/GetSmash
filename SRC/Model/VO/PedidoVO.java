package SRC.Model.VO;

import SRC.ED.Fila.Fila;

public class PedidoVO {
    public Fila produtos;
    public Float valorTotal;
    public Long codPedido;
    //construtor

    public PedidoVO(Fila produtos, Float valorTotal, Long codPedido) {
        this.produtos = produtos;
        this.valorTotal = valorTotal;
        this.codPedido = codPedido;
    }


    public PedidoVO(Fila produtos, Float valorTotal) {
        this.produtos = produtos;
        this.valorTotal = valorTotal;
    }

    //getters e setters

    public Fila getProdutos() {
        return this.produtos;
    }

    public void setProdutos(Fila produtos) {
        this.produtos = produtos;
    }

    public Float getValorTotal() {
        return this.valorTotal;
    }

    public void setValorTotal(Float valorTotal) {
        this.valorTotal = valorTotal;
    }

    public Long getCodPedido() {
        return this.codPedido;
    }

    public void setCodPedido(Long codPedido) {
        this.codPedido = codPedido;
    }


}
