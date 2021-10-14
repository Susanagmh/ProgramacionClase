import java.util.Scanner;

public class Ejercicio27 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nota Parcial1 ");
        double p1= sc.nextDouble();
        System.out.println("Nota Parcial2 ");
        double p2= sc.nextDouble();
        System.out.println("Nota Parcial 3");
        double p3= sc.nextDouble();
        double mediap = (  p1 + p2 +p3 );
        double proporcion = mediap * 55 / 100;
        System.out.println("nota final");
        double ef = sc.nextDouble();
        double proprcionef = ef * 30 / 100;
        double tf = sc.nextDouble();
        double proporciomtf = tf * 15 / 100;
        double notaf= proporciomtf;

    }
}
