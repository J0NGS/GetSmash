//Classe de valores (VO) pessoa.

//Declaração do pacote
package SRC.Model.VO;

//atributos da classe
public class PessoaVO {
    public String nome;
    private Long id_pessoa;
    public String endereco;
    public Integer tipo; // 1 cliente varejo, 2 cliente atacado, 3 vendedor, 4 gerente
    // construtor de PessoaVO


    public PessoaVO(String nome, Long id_pessoa, String endereco) {
        this.nome = nome;
        this.id_pessoa = id_pessoa;
        this.endereco = endereco;
    }

    public PessoaVO(String nome, String endereco){
        this.nome = nome;
        this.endereco = endereco;
    }

    public PessoaVO(String nome) {
        this.nome = nome;
    }

    // getters e setters
    

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Long getId_pessoa() {
        return this.id_pessoa;
    }

    public void setId_pessoa(Long id_pessoa) {
        this.id_pessoa = id_pessoa;
    }

    public String getEndereco() {
        return this.endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

}
