import java.util.Scanner;

public class PessoaFisica extends Pessoa {
    // código a ser executado

    public Long cpff() {
        Scanner s = new Scanner(System.in);
        System.out.print("Digite o CPF: ");
        return s.nextLong();
    }

    public String ocp() {
        Scanner s = new Scanner(System.in);
        System.out.print("Digite a ocupação: ");
        return s.nextLine();
    }

    private Long cpf;

    private String ocupacao;

    public Long getCpf() {
        return cpf = cpff();
    }

    public void setCpf(Long cpf) {
        this.cpf = cpf;
    }

    public String getOcupacao() {
        return ocupacao = ocp();
    }

    public void setOcupacao(String ocupacao) {
        this.ocupacao = ocupacao;
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
        return "PessoaFisica {" +
                "cpf =" + getCpf() +
                ", ocupacao ='" + getOcupacao() + '\'' +
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
