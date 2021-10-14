public class Ejercicio36 {
    public static void main(String[] args) {
        byte b =1;
        short s = 2;
        int i = 3;
        long l = 4L;
        float f = 5f;
        double d =  6;
        char c = 7;
        boolean bool = true;
        s = b;
        i =b;
        l = b;
        d = b;
        //c = b;NO
       // bool = b ; NO
        b = (byte) s;
        i = s;
        l = s;
        d = s;
        c = (char) s ;// NO
       // bool = s; NO





    }
}
