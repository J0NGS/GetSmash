package SRC.Model.VO;

public class CamisaVO extends RoupasVO{
    //classe sem atributosd

    //construtor
    public CamisaVO(Long roupaId, String tecido, String corP, String corS, String estampa, Float precoCompra, Float valor_venda_atacado, Float valor_venda_varejo, String tamanho){
        super(roupaId, tecido, corP, corS, estampa, precoCompra, valor_venda_atacado, valor_venda_varejo, tamanho);
        setTipo(1);
    }
    
}
