import java.util.Scanner;

public class Caso8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Eres culpable? (si/no)");
        String culpable = sc.next();

        if (culpable.equals("si")) {
            System.out.println("a la carcel");
        } else if (culpable.equals("no")) {
            System.out.println("A casa");
        } else {
            System.out.println("Respuesta incorrecta");

        }
    }
}
