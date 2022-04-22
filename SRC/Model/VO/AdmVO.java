package SRC.Model.VO;

public class AdmVO extends UserVO {
    Long id_adm;
    
    //construtor de adm

    public AdmVO(String nome, String login, String senha, Integer tipo, Long id_adm) {
        super(nome, login, senha, tipo);
        this.id_adm = id_adm;
    }


    //GETTERS E SETTERS DE ADM
    public Long getId_adm() {
        return this.id_adm;
    }

    public void setId_adm(Long id_adm) {
        this.id_adm = id_adm;
    }

}
