import java.util.Scanner;

public class IMC {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args){
        System.out.println("Insira seu peso(kg):");
        double peso = sc.nextDouble();
        System.out.println("Insira sua altura(metros):");
        double alt = sc.nextDouble();

        double imc = peso / (alt*alt);
        String imcM = String.format("%.1f",imc);
        System.out.println("IMC:" + imcM);

         if (imc < 18.5){
             System.out.println("Abaixo do peso.");
         } else if (imc < 25) {
             System.out.println("Peso normal.");
         } else if (imc < 30) {
             System.out.println("Sobrepeso.");
         } else {
             System.out.println("Obesidade.");
         }
    }
}
