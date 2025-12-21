import java.io.FileWriter;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double panjang = 0, lebar = 0, tinggi = 0;
        boolean valid = false;

        while (!valid) {
            try {
                System.out.print("Masukkan panjang balok : ");
                panjang = input.nextDouble();

                System.out.print("Masukkan lebar balok : ");
                lebar = input.nextDouble();

                System.out.print("Masukkan tinggi balok : ");
                tinggi = input.nextDouble();

                if (panjang <= lebar) {
                    throw new IllegalArgumentException(
                            "Panjang harus lebih besar dari lebar!"
                    );
                }

                if (lebar <= tinggi) {
                    throw new IllegalArgumentException(
                            "Lebar harus lebih besar dari tinggi"
                    );
                }

                valid = true;

            } catch (InputMismatchException e) {
                System.out.println("Error: Input harus berupa angka!");
                input.nextLine();
            } catch (IllegalArgumentException e) {
                System.out.println("Error: " + e.getMessage());
            }
        }

        double volume = panjang + lebar + tinggi;

        System.out.println("Hasil perhitungan");
        System.out.println("Panjang : " + panjang);
        System.out.println("Lebar : " + lebar);
        System.out.println("Tinggi : " + tinggi);
        System.out.println("Volume : " + volume);

//        try catch(exception handling) untuk menyimpan output ke dalam file txt
        try {
            FileWriter writer = new FileWriter("volume_balok.txt");
            writer.write("HASIL PERHITUNGAN VOLUME BALOK");
            writer.write("Panjang : " + panjang + "\n");
            writer.write("Lebar : " + lebar + "\n");
            writer.write("Tinggi : " + tinggi + "\n");
            writer.write("Volume : " + volume + "\n");

            writer.close();

            System.out.println("\n Hasil perhitungan balok berhasil disimpan ke file");
        } catch (IOException e) {
            System.out.println("Gagal menyimpan ke file!");
        }
        input.close();
    }
}