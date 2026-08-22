import java.util.Scanner;

public class IR {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Insira seu salário bruto:");
        double bruto = sc.nextDouble();

        double imposto;

        if (bruto <= 2428.80){
            System.out.println("Você está isento do Imposto de Renda");
        } else {
            if (bruto <= 2826.65) {
                imposto = (bruto * 0.075) - 182.16;
            } else if (bruto <= 3751.05) {
                imposto = (bruto * 0.15) - 394.16;
            } else if (bruto <= 4664.68){
                imposto = (bruto * 0.225) - 675.49;
            } else {
                imposto = (bruto * 0.275) - 908.73;
            }
            System.out.println("Sua contribução é: "+ imposto);
        }
    }
}
