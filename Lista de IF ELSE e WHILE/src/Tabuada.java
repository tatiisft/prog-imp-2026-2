import java.util.Scanner;

public class Tabuada {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Insira um número para ver sua tabuada de 10:");
        int n = sc.nextInt();
        int cont = 1;

        while (cont <= 10){
            int multi = n * cont;
            System.out.println(n + "x" + cont + "=" + multi);
            cont++;
        }

    }
}
