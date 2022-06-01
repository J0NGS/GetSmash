package SRC.Model.VO;

public class ManguitoVO extends AcessoriosVO {
    //classe sem atributos

    //construtor
    public ManguitoVO(String corP, String corS, String estampa, Float precoCompra, Float valor_venda_atacado, Float valor_venda_varejo, String tamanho){
        super(corP, corS, estampa, precoCompra, valor_venda_atacado, valor_venda_varejo, tamanho);
        setTipo(3);
    }
    
}
