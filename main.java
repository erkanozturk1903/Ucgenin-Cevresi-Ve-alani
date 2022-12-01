package ucgencevrevealan;
import java.util.Scanner;

public class Ucgen {
    public static void main(String[] args) {
        int a, b,c;
        double u,s;

        Scanner veri = new Scanner(System.in);
        System.out.println("1. Kenar Uzunluğunu Giriniz : ");
        a = veri.nextInt();

        System.out.println("2. Kenar Uzunluğunu Giriniz : ");
        b = veri.nextInt();

        System.out.println("3. Kenar Uzunluğunu Giriniz : ");
        c = veri.nextInt();

        u = (a + b + c)/2;
        s = Math.sqrt(u*(u-a)*(u-b)*(u-c));

        System.out.println("Üçgenin alanı : " + s);

        System.out.println("Üçgenin Çevresi : " + u);


    }
}
