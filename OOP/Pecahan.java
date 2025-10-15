package OOP;

public class Pecahan {
    private int pembilang;
    private int penyebut;

    // Konstruktor
    public Pecahan(int pembilang, int penyebut) {
        if (penyebut == 0) {
            throw new IllegalArgumentException("Penyebut tidak boleh 0!");
        }
        this.pembilang = pembilang;
        this.penyebut = penyebut;
        this.sederhanakan();
    }

    // Getter
    public int getPembilang() {
        return pembilang;
    }

    public int getPenyebut() {
        return penyebut;
    }

    // Method untuk menjumlahkan dua pecahan
    public Pecahan tambah(Pecahan p) {
        int pembilangBaru = (this.pembilang * p.penyebut) + (p.pembilang * this.penyebut);
        int penyebutBaru = this.penyebut * p.penyebut;
        return new Pecahan(pembilangBaru, penyebutBaru);
    }

    // Method untuk mengurangkan dua pecahan
    public Pecahan kurang(Pecahan p) {
        int pembilangBaru = (this.pembilang * p.penyebut) - (p.pembilang * this.penyebut);
        int penyebutBaru = this.penyebut * p.penyebut;
        return new Pecahan(pembilangBaru, penyebutBaru);
    }

    // Method untuk mengalikan dua pecahan
    public Pecahan kali(Pecahan p) {
        int pembilangBaru = this.pembilang * p.pembilang;
        int penyebutBaru = this.penyebut * p.penyebut;
        return new Pecahan(pembilangBaru, penyebutBaru);
    }

    // Method untuk membagi dua pecahan
    public Pecahan bagi(Pecahan p) {
        int pembilangBaru = this.pembilang * p.penyebut;
        int penyebutBaru = this.penyebut * p.pembilang;
        return new Pecahan(pembilangBaru, penyebutBaru);
    }

    // Method untuk menyederhanakan pecahan
    private void sederhanakan() {
        int gcd = gcd(Math.abs(pembilang), Math.abs(penyebut));
        pembilang /= gcd;
        penyebut /= gcd;
    }

    // Fungsi pembantu: mencari FPB (Faktor Persekutuan Terbesar)
    private int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    // Tampilkan dalam format a/b
    public String toString() {
        if (penyebut == 1)
            return Integer.toString(pembilang);
        else
            return pembilang + "/" + penyebut;
    }

    // Main program untuk uji coba
    public static void main(String[] args) {
        Pecahan p1 = new Pecahan(2, 3);  // 2/3
        Pecahan p2 = new Pecahan(3, 4);  // 3/4

        System.out.println("Pecahan 1 = " + p1);
        System.out.println("Pecahan 2 = " + p2);

        System.out.println("\nHasil Penjumlahan = " + p1.tambah(p2));
        System.out.println("Hasil Pengurangan = " + p1.kurang(p2));
        System.out.println("Hasil Perkalian   = " + p1.kali(p2));
        System.out.println("Hasil Pembagian   = " + p1.bagi(p2));
    }
}
