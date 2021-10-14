package estruturaDeControl;

import java.util.Scanner;

public class Caso4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("edad");
        int edad = sc.nextInt();
        System.out.println("nivel de estudios");
        int ns = sc.nextInt();
        System.out.println("ingrsos");
        int ingresos = sc.nextInt();
        boolean jasp;
        if ( edad<= 28 && ns > 3 || edad < 30 && ingresos > 28_000 ) {
            jasp = true;
        }else{
            jasp = false; }

    }
}
