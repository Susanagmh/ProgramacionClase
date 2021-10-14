import java.util.Scanner;

public class Ejercicio21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double evalu1 = sc.nextDouble();
        double evalu2 = sc.nextDouble();
        double evalu3 = sc.nextDouble();
        double suma = evalu1 + evalu2 + evalu3;
        double media = suma/3;
        System.out.println("Suma: " + suma);
        System.out.println("Media: " + media);
    }
}
