public class Tabungan {
    public String Nama;
    private  double JmlUang;
    private  double TarikUangTabungan;
    private double MasukkanUangDiTabungan;

    public String getNama() {
        return Nama;
    }

    public void setNama(String nama) {
        Nama = nama;
    }

    public double getJmlUang() {
        return JmlUang;
    }

    public void setJmlUang(double jmlUang) {
        JmlUang = jmlUang;
    }

    public double getTarikUang() {
        return TarikUangTabungan;
    }

    public void setTarikUang(double tarikUang) {
        TarikUangTabungan = tarikUang;
    }

    public double getMasukkanUang() {
        return MasukkanUangDiTabungan;
    }

    public void setMasukkanUang(double masukkanUang) {
        MasukkanUangDiTabungan = masukkanUang;
    }

    public void NarikUangBuatJajan(double narikUang){
        if(narikUang > JmlUang ){
            System.out.println("Uang Kamu Nggak Cukup Kocakkkkkkkkkkkk");
        }else{
            JmlUang -= narikUang;
            System.out.println("Selamat Berbalanja KAWANNNNNN");
        }

    }

    public  void menabungBuatMasaDepan(double uangTabungan){
        JmlUang += uangTabungan;
        System.out.println("Makasih Sudah Menabung Untuk Masa Depan kamuu");
    }
}