package estruturaDeControl;

import java.util.Scanner;

public class Caso15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Que lenguaje estas estudiando? \n1. java\n2. kotlin\n3. Scala\n4. Python");
        int opcion = sc.nextInt();

        if ( opcion == 1) {
            System.out.println("SI");
        } else if (opcion >=2 && opcion <4 ) {
            System.out.println("NO");
        } else {
            System.out.println("opcion incorrecta");
        }
    }
}
