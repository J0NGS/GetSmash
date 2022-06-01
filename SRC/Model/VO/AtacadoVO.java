package SRC.Model.VO;

public class AtacadoVO extends ClienteVO{
    private String cnpj;

    // construtor da classe

    public AtacadoVO(String nome, String endereco, String cnpj) {
        super(nome, endereco);
        this.cnpj = cnpj;
    }

    //getters e setters


    public String getCnpj() {
        return this.cnpj;
    }

    public void setCpf(String cnpj) {
        this.cnpj = cnpj;
    }
}
