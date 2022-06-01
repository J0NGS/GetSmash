package SRC.Model.VO;

public class RoupasVO extends ProdutosVO {
    private Long roupaId;
    public String tecido;
    //construtor
    public RoupasVO(Long roupaId, String tecido, String corP, String corS, String estampa, Float precoCompra, Float valor_venda_atacado, Float valor_venda_varejo, String tamanho) {
        super(corP, corS, estampa, precoCompra, valor_venda_atacado, valor_venda_varejo, tamanho);
        this.roupaId = roupaId;
        this.tecido = tecido;
        
    }

    //getters e setters

    public Long getRoupaId() {
        return this.roupaId;
    }

    public void setRoupaId(Long roupaId) {
        this.roupaId = roupaId;
    }

    public String getTecido() {
        return this.tecido;
    }

    public void setTecido(String tecido) {
        this.tecido = tecido;
    }

    
}
