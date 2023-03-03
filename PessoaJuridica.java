import java.util.Scanner;

public class PessoaJuridica extends Pessoa {
    // código a ser executado

    private Long cnpj;

    private String atividade;

    public Long cnpjj() {
        Scanner s = new Scanner(System.in);
        System.out.print("Digite o CNPJ: ");
        return s.nextLong();
    }

    public String atvv() {
        Scanner s = new Scanner(System.in);
        System.out.print("Digite a atividade: ");
        return s.nextLine();
    }

    public Long getCnpj() {
        return cnpj = cnpjj();
    }

    public void setCnpj(Long cnpj) {
        this.cnpj = cnpj;
    }

    public String getAtividade() {
        return atividade = atvv();
    }

    public void setAtividade(String atividade) {
        this.atividade = atividade;
    }

    @Override
    public Long codigo() {
        return cdg();
    }

    @Override
    public String nome() {
        return nm();
    }

    @Override
    public String logradouro() {
        return lgd();
    }

    @Override
    public String bairro() {
        return br();
    }

    @Override
    public String cidade() {
        return cdd();
    }

    @Override
    public String estado() {
        return uf();
    }

    @Override
    public String observacao() {
        return obs();
    }

    @Override
    public String toString() {
        return "PessoaJuridica {" +
                "cnpj =" + getCnpj() +
                ", atividade ='" + getAtividade() + '\'' +
                ", codigo =" + codigo() +
                ", nome ='" + nome() + '\'' +
                ", logradouro ='" + logradouro() + '\'' +
                ", bairro ='" + bairro() + '\'' +
                ", cidade ='" + cidade() + '\'' +
                ", estado ='" + estado() + '\'' +
                ", observacao ='" + observacao() + '\'' +
                '}';
    }

}
