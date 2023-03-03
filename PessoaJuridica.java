import java.util.Scanner;

public class PessoaJuridica extends Pessoa {
    // código a ser executado

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

    private Long cnpj;

    private String atividade;

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
        return 2l;
    }

    @Override
    public String nome() {
        return "Pelizzari Developers";
    }

    @Override
    public String logradouro() {
        return "Av. Tancredo Neves";
    }

    @Override
    public String bairro() {
        return "Centro";
    }

    @Override
    public String cidade() {
        return "Capitão L. Marques";
    }

    @Override
    public String estado() {
        return "PR";
    }

    @Override
    public String observacao() {
        return "Empresa de desenvolvimento de Software";
    }

    @Override
    public String toString() {
        return "PessoaJuridica{" +
                "cnpj=" + getCnpj() +
                ", atividade='" + getAtividade() + '\'' +
                ", codigo=" + codigo() +
                ", nome='" + nome() + '\'' +
                ", logradouro='" + logradouro() + '\'' +
                ", bairro='" + bairro() + '\'' +
                ", cidade='" + cidade() + '\'' +
                ", estado='" + estado() + '\'' +
                ", observacao='" + observacao() + '\'' +
                '}';
    }

}
