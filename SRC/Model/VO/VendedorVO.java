//classe de valores para vendedor

//declaração do pacote
package SRC.Model.VO;

//declaração dos atributos
public class VendedorVO extends UserVO {
    Long id_vendedor;
        
    //construtor de vendedor
    public VendedorVO(String Nome, String login, String senha, Long idUser, Long idVendedor, String endereco) {
        super(Nome, login, senha, idUser, endereco);
        this.id_vendedor = idVendedor;
        this.setTipo(3);
    }

    //getters e setters vendedor
    public Long getId_vendedor() {
        return this.id_vendedor;
    }

    public void setId_vendedor(Long id_vendedor) {
        this.id_vendedor = id_vendedor;
    }    
}
