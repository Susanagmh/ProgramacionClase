package estruturaDeControl;

import java.util.Scanner;

public class caso14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int alumnos = sc.nextInt();
        int coste;

        if ( alumnos >= 100) {
            coste = alumnos * 65;
        } else if ( alumnos >= 50 && alumnos < 100) {
            coste = alumnos * 70;
        } if ( alumnos >= 30 && alumnos < 50) {
            coste = alumnos * 95;
        } else {
            coste = 4000;
        }
        System.out.println("Hay que abonar a la compañias de autobuses" + coste);

        double preciopora;

        preciopora = (double) coste  / (double) alumnos;
        System.out.println("precio a pagar por alumno %.2f €" +  preciopora);
        }

    }
