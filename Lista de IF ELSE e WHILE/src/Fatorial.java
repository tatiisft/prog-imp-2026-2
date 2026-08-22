import java.util.Scanner;

public class Fatorial {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite um número inteiro positivo: ");
        int n = entrada.nextInt();

        int fatorial = 1;
        int i = n;

        while (i >= 1) {
            fatorial = fatorial * i;
            i--;
        }

        System.out.println("Fatorial de " + n + " = " + fatorial);
    }
}
