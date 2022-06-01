package SRC.Model.VO;

public class VarejoVO extends ClienteVO {
    private String cpf;

    // construtor da classe

    public VarejoVO(String nome, String endereco, String cpf) {
        super(nome, endereco);
        this.cpf = cpf;
    }

    //getters e setters


    public String getCpf() {
        return this.cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }


}

