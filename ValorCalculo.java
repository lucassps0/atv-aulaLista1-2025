import java.beans.DefaultPersistenceDelegate;
import java.util.Scanner;

public class ValorCalculo {
    public static void main(String[] args) {
        Scanner cauculoIpi = new Scanner(System.in);

        System.out.print("porcentagem do IPI: ");
        double ipi = cauculoIpi.nextDouble();

        System.out.print("Digite o código da peça 1: ");
        String cod1 = cauculoIpi.next();
        System.out.print("valor da peça 1:" );
        double pc1 = cauculoIpi.nextDouble();
        System.out.print("total de peças 1 compradas: ");
        int qtdPc1 = cauculoIpi.nextInt();

        System.out.print("Digite o código da peça 2: ");
        String cod2 = cauculoIpi.next();
        System.out.print("valor peça 2: ");
        double pc2 = cauculoIpi.nextDouble();
        System.out.print("total de peças 2 compradas: ");
        int qtdPc2 = cauculoIpi.nextInt();

        double sTotal  = (pc1 * qtdPc1 + pc2 * qtdPc2 );
        double total = sTotal * (1 + ipi/100);

        System.out.printf("\n total a pagar vai ser de R$ %.2f", total);



    }
}
