package OOP3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Tabungan tabungan = new Tabungan();
        int pilihan;
        System.out.print("Masukkan nama tabungan anda : ");
        String namaTabungan = input.nextLine();
        tabungan.setNama(namaTabungan);

        do{

            System.out.println();
            System.out.println("Program Menabung Buat Masa Depan " + tabungan.getNama());
            System.out.println("Pilih Opsi ");
            System.out.println("1. Tabung");
            System.out.println("2. Tarik");
            System.out.println("3. Cekkkkkk");
            System.out.println("4. Keluar");
            System.out.print("SAYA MEMILIHHHHHH : ");
            pilihan = input.nextInt();

            if(pilihan == 1){
                System.out.print("Masukkan Jumlah Uang Yang Ingin Kamu Tabung : ");
                double UangMasuk = input.nextDouble();
                tabungan.setMasukkanUang(UangMasuk);
                System.out.println("Tabungan Berhasil Masuk Sebesar : "+tabungan.getMasukkanUang());
                tabungan.menabungBuatMasaDepan(UangMasuk);
                input.nextLine();

            }else if(pilihan == 2){
                System.out.print("Mau Narik Berapa Sihhhhh : ");
                double TarikUang = input.nextDouble();
                tabungan.setTarikUang(TarikUang);
                System.out.println("Anda Menarik Uang Sebesar : " + tabungan.getTarikUang());
                tabungan.NarikUangBuatJajan(TarikUang);

                input.nextLine();

            }else  if(pilihan == 3){
                System.out.println("Uanng Di Tabungan Kamu Sisaaaa : " + tabungan.getJmlUang());
            }else {
                System.out.println("NONEE");
            }

        }while(pilihan != 4);

    }
}
