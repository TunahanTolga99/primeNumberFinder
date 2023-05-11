import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Bir sayı girin: ");
        int sayi = scanner.nextInt();

        if (asalMi(sayi, sayi / 2)) {
            System.out.println(sayi + " bir asal sayıdır.");
        } else {
            System.out.println(sayi + " bir asal sayı değildir.");
        }
    }

    public static boolean asalMi(int sayi, int bolen) {
        if (bolen == 1) {
            return true;
        } else {
            if (sayi % bolen == 0) {
                return false;
            } else {
                return asalMi(sayi, bolen - 1);
            }
        }
    }
}