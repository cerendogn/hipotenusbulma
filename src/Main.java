import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int a , b;
        double c,d, f ;
        Scanner girdi = new Scanner(System.in);
        System.out.print("Birinci kenarı giriniz: ");
        a = girdi.nextInt();
        System.out.print("İkinci değeri giriniz: ");
        b = girdi.nextInt();
        c= Math.sqrt((a * a) + (b * b ));   
        System.out.println("Hipotenüs: " +c);
        d = a + b +c ;
        System.out.println("Üçgenin çevresi: " +d);
        f = d * (d - a) * (d - b ) * (d - c);
        System.out.println("Üçgenin alanı:" +d);

    }

}


