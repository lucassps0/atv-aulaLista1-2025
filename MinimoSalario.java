import java.util.Scanner;
public class MinimoSalario {
    public static void main(String[] args) {
        Scanner leitorSalario = new Scanner(System.in);

        System.out.print("valor dos salario minimo: ");
        double minimo = leitorSalario.nextDouble();

        System.out.println("seu salario: ");
        double salario = leitorSalario.nextDouble();

        double quantidade = salario/minimo;
        System.out.printf("você ganha %.1f salarios minimos.\n", quantidade);

    }
}
