import java.util.Scanner;

public class Ejercicio22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Asignatura1: " );
        double asigna1 = sc.nextDouble();
        System.out.println("Asignatura2:  ");
        double asigna2 = sc.nextDouble();
        System.out.println("Asignatura3");
        double asigna3 = sc.nextDouble();
        System.out.println("Asignatura4");
        double asigna4 = sc.nextDouble();

        double suma = asigna1 + asigna2 + asigna3 + asigna4;

        double media = suma /4;

        System.out.println("nota final:" + Math.round(suma));



    }
}
