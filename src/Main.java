import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int armutKg, elmaKg, domatesKg, muzKg, patlicanKg;
        System.out.print("Armut Kaç kg : ");
        armutKg = inp.nextInt();
        System.out.print("Elma Kaç kg : ");
        elmaKg = inp.nextInt();
        System.out.print("Domates Kaç kg : ");
        domatesKg = inp.nextInt();
        System.out.print("Muz Kaç kg : ");
        muzKg = inp.nextInt();
        System.out.print("Patlıcan Kaç kg : ");
        patlicanKg = inp.nextInt();
        double tutar=(armutKg*2.14) + (elmaKg*3.67) + (domatesKg * 1.11) + (muzKg*0.95) + (patlicanKg*5.00);
        System.out.println("Toplam tutar : "+ tutar);
    }
}