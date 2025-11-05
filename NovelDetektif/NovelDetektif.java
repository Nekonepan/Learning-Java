package NovelDetektif;

public class NovelDetektif {
    private String judul;
    private String namaPengarang;
    private int tahunTerbit;
    private double hargaBeli;

    // Constructor
    public NovelDetektif(String judul, String namaPengarang, int tahunTerbit, double hargaBeli) {
        this.judul = judul;
        this.namaPengarang = namaPengarang;
        this.tahunTerbit = tahunTerbit;
        this.hargaBeli = hargaBeli;
    }

    // Getter dan Setter
    public String getJudul() { return judul; }
    public void setJudul(String judul) { this.judul = judul; }

    public String getNamaPengarang() { return namaPengarang; }
    public void setNamaPengarang(String namaPengarang) { this.namaPengarang = namaPengarang; }

    public int getTahunTerbit() { return tahunTerbit; }
    public void setTahunTerbit(int tahunTerbit) { this.tahunTerbit = tahunTerbit; }

    public double getHargaBeli() { return hargaBeli; }
    public void setHargaBeli(double hargaBeli) { this.hargaBeli = hargaBeli; }

    // Method hitung harga jual
    public double getHargaJual() {
        return hargaBeli - (0.2 * hargaBeli);
    }

    // Tampilkan info novel
    public void tampilkanInfo() {
        System.out.println("Judul: " + judul);
        System.out.println("Pengarang: " + namaPengarang);
        System.out.println("Tahun Terbit: " + tahunTerbit);
        System.out.println("Harga Beli: Rp" + hargaBeli);
        System.out.println("Harga Jual: Rp" + getHargaJual());
        System.out.println("-----------------------------");
    }
}
