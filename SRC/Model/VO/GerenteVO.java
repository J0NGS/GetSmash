package SRC.Model.VO;

public class GerenteVO extends UserVO {
    Long id_adm;
    
    //construtor de adm

    public GerenteVO(String nome, String login, String senha, Long id_adm, String endereco) {
        super(nome, login, senha, endereco);
        this.id_adm = id_adm;
    }

    public GerenteVO(String nome, String login, String senha, String endereco) {
        super(nome, login, senha, endereco);
    }
    //GETTERS E SETTERS DE ADM
    public Long getId_adm() {
        return this.id_adm;
    }

    public void setId_adm(Long id_adm) {
        this.id_adm = id_adm;
    }

}
