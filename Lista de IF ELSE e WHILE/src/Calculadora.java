import java.util.Scanner;

public class Calculadora {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args){
        System.out.println("Escolha dois números:");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int soma, sub, multi, div;

        if (num2 > 0){
            soma = num1 + num2;
            sub = num1 - num2;
            multi = num1 * num2;
            div = num1 / num2;
            System.out.println(num1 + " + " + num2 + " = " + soma);
            System.out.println(num1 + " - " + num2 + " = " + sub);
            System.out.println(num1 + " * " + num2 + " = " + multi);
            System.out.println(num1 + " / " + num2 + " = " + div);
        } else {
            System.out.println("Operação inválida! O segundo número não pode ser zero.");
        }

    }
}