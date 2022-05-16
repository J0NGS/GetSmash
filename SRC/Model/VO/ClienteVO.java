//classe de valores de cliente

//declaração do pacote
package SRC.Model.VO;

//atributos da classe
public class ClienteVO extends PessoaVO {
    private String telefone;
    private String endereco;
    private Long id_cliente;

    
    // construtor da classe

    public ClienteVO(String nome, String telefone, String endereco, Long id_cliente) {
        super(nome);
        this.telefone = telefone;
        this.endereco = endereco;
        this.id_cliente = id_cliente;
    }



    // getters e setters

    public String getTelefone() {
        return this.telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

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
