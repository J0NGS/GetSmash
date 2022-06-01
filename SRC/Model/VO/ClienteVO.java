//classe de valores de cliente

//declaração do pacote
package SRC.Model.VO;

//atributos da classe
public class ClienteVO extends PessoaVO {
    private Long id_cliente;

    
    // construtor da classe

    public ClienteVO(String nome, String endereco, Long id_cliente) {
        super(nome);
        this.id_cliente = id_cliente;
    }


    public ClienteVO(String nome, String endereco) {
        super(nome, endereco);
    }


    // getters e setters

    public String getEndereco() {
        return this.endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public Long getId_cliente() {
        return this.id_cliente;
    }

    public void setId_cliente(Long id_cliente) {
        this.id_cliente = id_cliente;
    }

    
}
