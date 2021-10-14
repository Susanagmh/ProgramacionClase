import javax.security.sasl.SaslClient;
import java.util.Scanner;

public class Ejecicio18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Temperatura en ºC: ");
        double centigrado = sc.nextInt();
        System.out.println("Reamur = " + (centigrado * 0.8));
        System.out.println("fahenheit = " + (centigrado * 9/5) + 32);
        System.out.println("Kelvin = " + (centigrado + 273));
    }
}
