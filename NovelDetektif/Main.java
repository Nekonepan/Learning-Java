package NovelDetektif;

public class Main {
    public static void main(String[] args) {
        NovelDetektif n1 = new NovelDetektif("Detektif Conan", "Gosho Aoyama", 1994, 85000);
        NovelDetektif n2 = new NovelDetektif("Sherlock Holmes", "Arthur Conan Doyle", 1892, 95000);
        NovelDetektif n3 = new NovelDetektif("Kindaichi Case Files", "Yozaburo Kanari", 1992, 78000);

        n1.tampilkanInfo();
        n2.tampilkanInfo();
        n3.tampilkanInfo();

        double totalBeli = n1.getHargaBeli() + n2.getHargaBeli() + n3.getHargaBeli();
        double totalJual = n1.getHargaJual() + n2.getHargaJual() + n3.getHargaJual();

        System.out.println("Total Harga Beli Semua Buku: Rp" + totalBeli);
        System.out.println("Total Harga Jual Semua Buku: Rp" + totalJual);
    }
}
