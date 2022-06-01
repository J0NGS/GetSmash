//Classe de valores (VO) user.

//Declaração do pacote
package SRC.Model.VO;

//Declaração de variáveis.
public class UserVO extends PessoaVO {
    private String login;
    private String senha;
    private Integer tipo;
    private Long IdUser;
    

    //CONSTRUTORES DE USER
    public UserVO(String Nome,String login, String senha, Long idUser, String endereco){ // construtor de usuário
        super(Nome, endereco);
        this.login = login;
        this.senha = senha;
        this.IdUser = idUser;
    }

    public UserVO(String nome, String login, String senha, Integer tipo) {
        super(nome);
        this.login = login;
        this.senha = senha;
        this.tipo = tipo;
    }

    
    public UserVO(String nome, String login, String senha, String endereco) {
        super(nome, endereco);
        this.login = login;
        this.senha = senha;
    }



    
    //getters e setters de user
    public String getLogin() {
        return this.login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return this.senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public Long getIdUser() {
        return this.IdUser;
    }

    public void setIdUser(Long IdUser) {
        this.IdUser = IdUser;
    }

    public Integer getTipo() {
        return this.tipo;
    }

    public void setTipo(Integer tipo) {
        this.tipo = tipo;
    }

    
}

