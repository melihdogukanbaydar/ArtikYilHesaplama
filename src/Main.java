import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int yil,artik;

        Scanner inp = new Scanner(System.in);
        System.out.println("Yıl Giriniz");
        yil = inp.nextInt();

        artik = yil % 4;
        if (artik == 0){
            System.out.println("ARTIk YIL");

        }else {
            System.out.println("ARTIK YIL DEĞİL");
        }

    }
}