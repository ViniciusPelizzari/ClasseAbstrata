import java.util.Scanner;

public class Execucao {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("PF ou PJ: ");
        String pfpj = s.nextLine();
        System.out.println(" ");

        if (pfpj.equals("PF")) {

            PessoaFisica pf = new PessoaFisica();
            System.out.println(" ");
            System.out.println(pf);

        } else if (pfpj.equals("PJ")) {

            PessoaJuridica pj = new PessoaJuridica();
            System.out.println(" ");
            System.out.println(pj);

        }
    }
}
