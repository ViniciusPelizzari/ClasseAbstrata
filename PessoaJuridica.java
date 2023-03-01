public class PessoaJuridica extends Pessoa {

    private Long cnpj;

    private String atividade;

    public Long getCnpj() {
        return cnpj;
    }

    public void setCnpj(Long cnpj) {
        this.cnpj = cnpj;
    }

    public String getAtividade() {
        return atividade;
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
        return "PessoaFisica {" +
                "cnpj =" + cnpj +
                ", atividade ='" + atividade + '\'' +
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
