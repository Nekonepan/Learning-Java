package OOP1.src;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Mahasiswa mhs = new Mahasiswa(); //mhs adalah objek dari kelas Mahasiswa

        System.out.print("Masukkan nama: ");
        String nama = input.nextLine();
        mhs.setNama(nama);

        System.out.print("Masukkan NIM: ");
        String nim = input.nextLine();
        mhs.setNim(nim);

        System.out.print("Masukkan Nama Fakultas: ");
        String fakultas = input.nextLine();
        mhs.setFakultas(fakultas);

        System.out.print("Masukkan Nama Prodi: ");
        String prodi = input.nextLine();
        mhs.setProdi(prodi);


        //output
        System.out.println("\n\n====================");
        System.out.println("DATA MAHASISWA");
        System.out.println("====================");
        System.out.print("Nama: " + mhs.getNama());
        System.out.print("\nNIM: " + mhs.getNim());
        System.out.print("\nFakultas: " + mhs.getFakultas());
        System.out.print("\nProdi: " + mhs.getProdi());

        input.close();
    }
}
