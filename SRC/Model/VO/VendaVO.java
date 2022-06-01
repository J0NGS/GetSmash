package SRC.Model.VO;

public class VendaVO {
    private Long vendaId;
    public Float valor;
    public Long cliente, vendedor;
    private Long pedido;

    //construtor

    public VendaVO(Long vendaId, Float valor, Long cliente, Long vendedor, Long pedido) {
        this.vendaId = vendaId;
        this.valor = valor;
        this.cliente = cliente;
        this.vendedor = vendedor;
        this.pedido = pedido;
    }

    //getters e setters

    public Long getVendaId() {
        return this.vendaId;
    }

    public void setVendaId(Long vendaId) {
        this.vendaId = vendaId;
    }

    public Float getValor() {
        return this.valor;
    }

    public void setValor(Float valor) {
        this.valor = valor;
    }

    public Long getCliente() {
        return this.cliente;
    }

    public void setCliente(Long cliente) {
        this.cliente = cliente;
    }

    public Long getVendedor() {
        return this.vendedor;
    }

    public void setVendedor(Long vendedor) {
        this.vendedor = vendedor;
    }

    public Long getPedido() {
        return this.pedido;
    }

    public void setPedido(Long pedido) {
        this.pedido = pedido;
    }

}
