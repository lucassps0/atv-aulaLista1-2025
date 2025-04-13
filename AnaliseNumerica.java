import java.util.Scanner;
public class AnaliseNumerica {
    public static void main(String[] args) {
        Scanner leitorNumerico = new Scanner(System.in);

        System.out.print("digite um numero inteiro: ");
        int nm1 = leitorNumerico.nextInt();

        int antes = (nm1 - 1);
        int depois = (nm1 + 1);

        System.out.println("Antecessor: " + antes);
        System.out.println("Sucessor: " + depois);

        if (nm1 % 2 == 0) {
            System.out.print("seu numero é par");
        } else {
            System.out.print("seu numero é impar");

        }
    }
}
