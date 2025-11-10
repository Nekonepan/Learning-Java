// Class  Mahasiswa
class Mahasiswa{
  String nama;

  // Constructor
  Mahasiswa(String data_nama) {
    nama = data_nama;
  }
}

public class Main {
  public static void main(String[] args) {
    Mahasiswa mahasiswa1 = new Mahasiswa("Lutfan");
    Mahasiswa mahasiswa2 = new Mahasiswa("Naja");

    System.out.println(mahasiswa1.nama);
    System.out.println(mahasiswa2.nama);
  }
}
