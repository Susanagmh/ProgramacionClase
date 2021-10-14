package estruturaDeControl;

import java.util.Scanner;

public class Caso2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sueldo = sc.nextInt();
        if (9000 > sueldo)
            System.out.println("debe pagar impuestos");
    }
}
