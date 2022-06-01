package SRC.Model.VO;

public class PulseiraVO extends AcessoriosVO {    //classe sem atributos

    //construtor
    public PulseiraVO(String corP, String corS, String estampa, Float precoCompra, Float valor_venda_atacado, Float valor_venda_varejo, String tamanho){
        super(corP, corS, estampa, precoCompra, valor_venda_atacado, valor_venda_varejo, tamanho);
        setTipo(4);
    }
    
}
