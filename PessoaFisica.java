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
        return 1l;
    }

    @Override
    public String nome() {
        return "Vinícius";
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
        return "Estudante de programação";
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
