package estruturaDeControl;

import java.util.Scanner;

public class Caso1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Numero");
        int num = sc.nextInt();
        if( num % 2 == 0 )
            System.out.println("Es par");

        else
            System.out.println("es impar");
    }

}
