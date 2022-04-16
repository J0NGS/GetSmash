//Classe de valores (VO) user.

//Declaração do pacote
package SRC.Model.VO;

//Declaração de variáveis.
public class UserVO extends PessoaVO {
    private String login;
    private String senha;

    private enum tipo {
        adm, vendedor     // enumeração para o tipo de usuário.
    }; 

    private Long IdUser;


    public UserVO(String Nome,String login, String senha, int tipo, Long idUser){ // construtor de usuário
        super(Nome);
        this.login = login;
        this.senha = senha;
        this.IdUser = idUser;
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

}

