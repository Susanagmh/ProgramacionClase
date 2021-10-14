import java.util.Scanner;

public class Ejercicio17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Base : ");
        int base1 = sc.nextInt();
        System.out.println("Altura: ");
        int altura1 = sc.nextInt();
        int area = (base1 * altura1) / 2;
        System.out.println("Area: " + area);

        System.out.println("Base : ");
        float base2 = sc.nextFloat();
        System.out.println("Altura: ");
        float altura2 = sc.nextFloat();
        float area2 = (base2 * altura2) / 2;
        System.out.println("Area: " + area);


    }

}
