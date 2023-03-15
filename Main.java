import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        //Değişkenler
        int mat, kimya, fizik, biyoloji, edebiyat, java, turkce;

        //Scanner sınıfı
        Scanner inp =new Scanner(System.in);

        //Kullanıcıdan değerlli al
        System.out.print("Matemetik notunuz: ");
        mat = inp.nextInt();

        System.out.print("Kimya notunuz: ");
        kimya = inp.nextInt();

        System.out.print("fizik notunuz: ");
        fizik = inp.nextInt();

        System.out.print("turkce notunuz: ");
        turkce = inp.nextInt();

        System.out.print("edebiyat notunuz: ");
        edebiyat = inp.nextInt();

        System.out.print("java101 notunuz: ");
        java = inp.nextInt();

        int toplam =  (mat + kimya + fizik + turkce + edebiyat + java);
        double ortalama = toplam / 6.0;
        System.out.println(ortalama < 50 ? "Sınıfta Kaldınız " : "Tebrikler Sınıfı Geçtiniz");
        System.out.println("Ortalamız: " + ortalama);
    }
}