// Membuat class sebagai template
jJclass Mahasiswa {
  String nama;
  String NIM;
  String jurusan;
  double IPK;
}

public class Main {
  public static void main(String[] args) {

    // Instansiasi / membuat object
    Mahasiswa mahasiswa1 = new Mahasiswa();
    mahasiswa1.nama = "Lutfan";
    mahasiswa1.IPK = 4.00;

    System.out.println(mahasiswa1.nama);
    System.out.println(mahasiswa1.NIM = "2400018032");
    System.out.println(mahasiswa1.jurusan);
    System.out.println(mahasiswa1.IPK);

    Mahasiswa mahasiswa2 = new Mahasiswa();
    mahasiswa2.nama = "Naja";

    System.out.println(mahasiswa2.nama);
    System.out.println(mahasiswa2.NIM = "2400018033");
  }
}
