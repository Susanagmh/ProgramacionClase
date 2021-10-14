import java.util.Scanner;

public class Caso9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String usuarioCorrector = "user";
        String contraseñacorrecta = "1234";
        System.out.println("USUARIO:");
        String usuario = sc.next();
        System.out.println("CONTRASEÑA:");
        String contraseña = sc.next();
        if ( usuario.equals("user") && contraseña.equals("1234")) {
                System.out.println("tienes acceso");
            }else {
                System.out.println("contraseña incorrecta");}


    }
}
