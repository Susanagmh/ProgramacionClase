import java.util.Scanner;

public class Ejercicio25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("introduce total de la compra");
        double compra = sc.nextDouble();
        double precio = compra * 15/100;
        double total = precio - compra;
        System.out.println("Precio con el descuento:" + total + "€");


    }
}
