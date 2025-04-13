import java.util.Scanner;
public class AnoNascimento {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.print("digite o ano de nascimento: ");
        int anoNasciment = leitor.nextInt();

        int idade = 2025 - anoNasciment;
        System.out.println("sua idade é de " + idade + " anos.");



    }
}
