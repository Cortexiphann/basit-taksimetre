import java.util.Scanner;

public class Taksimetre {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Km Bilgisi Giriniz: ");
        double km = scan.nextDouble();
        double acilis = 10.0;
        double fiyat = (km * 2.20) + acilis;
        if (fiyat < 20) {
            fiyat = 20;
        }
        System.out.println("Tutarınız: " + fiyat);   
    }
}
