//Classe de valores (VO) pessoa.

//Declaração do pacote
package SRC.Model.VO;

//atributos da classe
public class PessoaVO {
    String nome;
    Long id_pessoa;

    // construtor de PessoaVO

    public PessoaVO(String nome, Long id_pessoa) {
        this.nome = nome;
        this.id_pessoa = id_pessoa;
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

}
