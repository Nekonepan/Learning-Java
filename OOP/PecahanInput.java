package OOP;
import java.util.Scanner;

public class PecahanInput {
    private int pembilang;
    private int penyebut;

    // Konstruktor
    public PecahanInput(int pembilang, int penyebut) {
        if (penyebut == 0) {
            throw new IllegalArgumentException("Penyebut tidak boleh 0!");
        }
        this.pembilang = pembilang;
        this.penyebut = penyebut;
        this.sederhanakan();
    }

    // Method operasi dasar
    public PecahanInput tambah(PecahanInput p) {
        int pembilangBaru = (this.pembilang * p.penyebut) + (p.pembilang * this.penyebut);
        int penyebutBaru = this.penyebut * p.penyebut;
        return new PecahanInput(pembilangBaru, penyebutBaru);
    }

    public PecahanInput kurang(PecahanInput p) {
        int pembilangBaru = (this.pembilang * p.penyebut) - (p.pembilang * this.penyebut);
        int penyebutBaru = this.penyebut * p.penyebut;
        return new PecahanInput(pembilangBaru, penyebutBaru);
    }

    public PecahanInput kali(PecahanInput p) {
        int pembilangBaru = this.pembilang * p.pembilang;
        int penyebutBaru = this.penyebut * p.penyebut;
        return new PecahanInput(pembilangBaru, penyebutBaru);
    }

    public PecahanInput bagi(PecahanInput p) {
        int pembilangBaru = this.pembilang * p.penyebut;
        int penyebutBaru = this.penyebut * p.pembilang;
        return new PecahanInput(pembilangBaru, penyebutBaru);
    }

    // Menyederhanakan pecahan (pakai FPB)
    private void sederhanakan() {
        int gcd = gcd(Math.abs(pembilang), Math.abs(penyebut));
        pembilang /= gcd;
        penyebut /= gcd;
    }

    private int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    // Menampilkan dalam format a/b
    public String toString() {
        if (penyebut == 1)
            return Integer.toString(pembilang);
        else
            return pembilang + "/" + penyebut;
    }

    // Program utama
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan pembilang pecahan pertama : ");
        int a1 = input.nextInt();
        System.out.print("Masukkan penyebut pecahan pertama  : ");
        int b1 = input.nextInt();

        System.out.print("Masukkan pembilang pecahan kedua   : ");
        int a2 = input.nextInt();
        System.out.print("Masukkan penyebut pecahan kedua    : ");
        int b2 = input.nextInt();

        PecahanInput p1 = new PecahanInput(a1, b1);
        PecahanInput p2 = new PecahanInput(a2, b2);

        System.out.println("\nPecahan 1 = " + p1);
        System.out.println("Pecahan 2 = " + p2);

        System.out.println("\n=== HASIL OPERASI ===");
        System.out.println("Penjumlahan : " + p1.tambah(p2));
        System.out.println("Pengurangan : " + p1.kurang(p2));
        System.out.println("Perkalian   : " + p1.kali(p2));
        System.out.println("Pembagian   : " + p1.bagi(p2));

        input.close();
    }
}
