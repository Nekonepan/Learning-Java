// Class Mahasiswa
class Mahasiswa{
  String nama;
  String nim;

  // Constructor
  public Mahasiswa(String data_nama, String data_nim) {
    nama = data_nama;
    nim = data_nim;

    System.out.println("Nama : " + nama);
    System.out.println("NIM : " + nim);
  }
}

public class Main {
  public static void main(String[] args) {
    new Mahasiswa("Lutfan", "2400018032");
    new Mahasiswa("Naja", "2400018033");
  }
}
