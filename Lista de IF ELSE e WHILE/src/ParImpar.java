import java.util.Scanner;

public class ParImpar {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Escolha dois números inteiros:");
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();

        if (n1 > n2) {
            int troca = n1;
            n1 = n2;
            n2 = troca;
        }

        int cont = n1+1;
        System.out.println("Pares:");
        while (cont < n2) {
            if (cont % 2 == 0) {
                System.out.print(cont + " ");
            }
            cont++;
        }
        cont = n1 + 1;
        System.out.println(" ");
        System.out.println("Impares:");
        while (cont < n2) {
            if (cont % 2 == 1) {
                System.out.print(cont + " ");
            }
            cont++;
        }
    }
}
