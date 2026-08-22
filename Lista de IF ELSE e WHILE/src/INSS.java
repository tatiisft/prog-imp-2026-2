import java.util.Scanner;

public class INSS {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Insira seu salário bruto:");
        double bruto = sc.nextDouble();
        double contribuicao;
        double liquido = 0;

        if (bruto <= 1621){
            contribuicao = bruto * 0.075;
            liquido = bruto - contribuicao;
        } else if (bruto <= 2902.84) {
            contribuicao = (bruto * 0.09) - 24.32;
            liquido = bruto - contribuicao;
        } else if (bruto <= 4354.27) {
            contribuicao = (bruto * 0.12) - 111.40;
            liquido = bruto - contribuicao;
        } else if (bruto <= 8475.55){
            contribuicao = (bruto * 0.14) - 198.49;
            liquido = bruto - contribuicao;
        } else {
            contribuicao = 988.09;
            liquido = bruto - contribuicao;
        }
        System.out.println("Sua contribução é: "+ contribuicao);
        System.out.println("Seu salário líquido é: "+ liquido);
    }
}
