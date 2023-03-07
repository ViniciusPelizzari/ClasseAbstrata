import java.util.Scanner;

public class PessoaFisica extends Pessoa {

    Scanner s = new Scanner(System.in);

    public Long cpff() {
        System.out.print("Digite o CPF: ");
        return s.nextLong();
    }

    public String ocp() {
        System.out.print("Digite a ocupação: ");
        return s.nextLine();
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
                "cpf =" + cpff() +
                ", ocupacao ='" + ocp() + '\'' +
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
