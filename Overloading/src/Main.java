import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Sistem Kasir");

        System.out.println("Pilih Jenis Produk ");
        System.out.println("1. Pakaian");
        System.out.println("2. Buku");
        System.out.println("Pilihan : ");

        int pil = input.nextInt();
        input.nextLine();

        if (pil == 1 || pil == 2) {
            System.out.println("Nama Produk : ");
            String nama = input.nextLine();

            System.out.println("Harga Produk :");
            double harga = input.nextInt();

            Produk produk;
            if (pil == 1) {
                produk = new Pakaian(nama, harga);
            } else {
                produk = new Buku(nama, harga);
            }

            double hargaDiskon = produk.hitungDiskon();

            System.out.println("Detail Produk");

            System.out.println("Nama : " + produk.nama);
            System.out.println("Harga Asli : " + produk.harga);
            System.out.println("Harga Bayar : " + hargaDiskon);
        } else {
            System.out.println("Pilihan tidak valid");
        }

        input.close();
    }
}