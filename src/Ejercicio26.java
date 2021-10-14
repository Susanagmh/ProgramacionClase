import java.util.Scanner;

public class Ejercicio26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("sueldo base");
        double base = sc.nextDouble();
        System.out.println("venta1");
        double venta1 = sc.nextDouble();
        System.out.println("venta2");
        double venta2 = sc.nextDouble();
        System.out.println("venta3");
        double venta3 = sc.nextDouble();
        double ventas = venta1 + venta2 + venta3;
        double comision = ventas * 10/100;
        System.out.println("comision:" + comision);
        System.out.println("sueldo total" + comision);
    }
}
