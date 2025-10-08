// ==================== BANGUN DATAR ====================
class PersegiPanjang {
    private double panjang, lebar;

    public PersegiPanjang(double panjang, double lebar) {
        this.panjang = panjang;
        this.lebar = lebar;
    }

    public double getPanjang() { return panjang; }
    public double getLebar() { return lebar; }
    public void setPanjang(double p) { panjang = p; }
    public void setLebar(double l) { lebar = l; }

    public double hitungLuas() { return panjang * lebar; }
    public double hitungKeliling() { return 2 * (panjang + lebar); }
}

class Lingkaran {
    private double r;

    public Lingkaran(double r) { this.r = r; }

    public double getR() { return r; }
    public void setR(double r) { this.r = r; }

    public double hitungLuas() { return Math.PI * r * r; }
    public double hitungKeliling() { return 2 * Math.PI * r; }
}

class BujurSangkar {
    private double sisi;

    public BujurSangkar(double sisi) { this.sisi = sisi; }

    public double getSisi() { return sisi; }
    public void setSisi(double s) { sisi = s; }

    public double hitungLuas() { return sisi * sisi; }
    public double hitungKeliling() { return 4 * sisi; }
}

class BelahKetupat {
    private double d1, d2, sisi;

    public BelahKetupat(double d1, double d2, double sisi) {
        this.d1 = d1;
        this.d2 = d2;
        this.sisi = sisi;
    }

    public double hitungLuas() { return (d1 * d2) / 2; }
    public double hitungKeliling() { return 4 * sisi; }
}

class Segitiga {
    private double alas, tinggi, sisi1, sisi2, sisi3;

    public Segitiga(double alas, double tinggi, double s1, double s2, double s3) {
        this.alas = alas;
        this.tinggi = tinggi;
        this.sisi1 = s1;
        this.sisi2 = s2;
        this.sisi3 = s3;
    }

    public double hitungLuas() { return 0.5 * alas * tinggi; }
    public double hitungKeliling() { return sisi1 + sisi2 + sisi3; }
}

// ==================== BANGUN RUANG ====================
class Kubus {
    private double sisi;

    public Kubus(double sisi) { this.sisi = sisi; }

    public double hitungVolume() { return Math.pow(sisi, 3); }
    public double hitungLuasPermukaan() { return 6 * sisi * sisi; }
}

class Balok {
    private double panjang, lebar, tinggi;

    public Balok(double p, double l, double t) {
        panjang = p; lebar = l; tinggi = t;
    }

    public double hitungVolume() { return panjang * lebar * tinggi; }
    public double hitungLuasPermukaan() {
        return 2 * (panjang * lebar + panjang * tinggi + lebar * tinggi);
    }
}

class Kerucut {
    private double r, t, s;

    public Kerucut(double r, double t, double s) {
        this.r = r; this.t = t; this.s = s;
    }

    public double hitungVolume() { return (1.0/3) * Math.PI * r * r * t; }
    public double hitungLuasPermukaan() { return Math.PI * r * (r + s); }
}

class Bola {
    private double r;

    public Bola(double r) { this.r = r; }

    public double hitungVolume() { return (4.0/3) * Math.PI * Math.pow(r, 3); }
    public double hitungLuasPermukaan() { return 4 * Math.PI * r * r; }
}

class Silinder {
    private double r, t;

    public Silinder(double r, double t) { this.r = r; this.t = t; }

    public double hitungVolume() { return Math.PI * r * r * t; }
    public double hitungLuasPermukaan() { return 2 * Math.PI * r * (r + t); }
}

// ==================== CLASS TESTER ====================
public class Main {
    public static void main(String[] args) {
        // ====== Bangun Datar ======
        PersegiPanjang[] persegiPanjang = {
            new PersegiPanjang(5, 3),
            new PersegiPanjang(7, 2),
            new PersegiPanjang(10, 4)
        };
        Lingkaran[] lingkaran = {
            new Lingkaran(4),
            new Lingkaran(7),
            new Lingkaran(10)
        };
        BujurSangkar[] bujurSangkar = {
            new BujurSangkar(5),
            new BujurSangkar(8),
            new BujurSangkar(12)
        };
        BelahKetupat[] belahKetupat = {
            new BelahKetupat(6, 8, 5),
            new BelahKetupat(10, 12, 8),
            new BelahKetupat(14, 16, 10)
        };
        Segitiga[] segitiga = {
            new Segitiga(4, 6, 3, 4, 5),
            new Segitiga(5, 8, 6, 5, 7),
            new Segitiga(10, 12, 7, 9, 11)
        };

        // ====== Bangun Ruang ======
        Kubus[] kubus = {
            new Kubus(3),
            new Kubus(5),
            new Kubus(7)
        };
        Balok[] balok = {
            new Balok(5, 3, 4),
            new Balok(7, 2, 6),
            new Balok(10, 4, 8)
        };
        Kerucut[] kerucut = {
            new Kerucut(3, 5, 6),
            new Kerucut(5, 7, 8),
            new Kerucut(7, 10, 12)
        };
        Bola[] bola = {
            new Bola(4),
            new Bola(6),
            new Bola(8)
        };
        Silinder[] silinder = {
            new Silinder(3, 7),
            new Silinder(5, 10),
            new Silinder(7, 12)
        };

        // ====== OUTPUT ======
        System.out.println("=== BANGUN DATAR ===");
        for (int i = 0; i < 3; i++) {
            System.out.println("Persegi Panjang " + (i+1) + 
                " -> Luas: " + persegiPanjang[i].hitungLuas() + 
                ", Keliling: " + persegiPanjang[i].hitungKeliling());
        }
        for (int i = 0; i < 3; i++) {
            System.out.println("Lingkaran " + (i+1) + 
                " -> Luas: " + lingkaran[i].hitungLuas() + 
                ", Keliling: " + lingkaran[i].hitungKeliling());
        }
        for (int i = 0; i < 3; i++) {
            System.out.println("Bujur Sangkar " + (i+1) + 
                " -> Luas: " + bujurSangkar[i].hitungLuas() + 
                ", Keliling: " + bujurSangkar[i].hitungKeliling());
        }
        for (int i = 0; i < 3; i++) {
            System.out.println("Belah Ketupat " + (i+1) + 
                " -> Luas: " + belahKetupat[i].hitungLuas() + 
                ", Keliling: " + belahKetupat[i].hitungKeliling());
        }
        for (int i = 0; i < 3; i++) {
            System.out.println("Segitiga " + (i+1) + 
                " -> Luas: " + segitiga[i].hitungLuas() + 
                ", Keliling: " + segitiga[i].hitungKeliling());
        }

        System.out.println("\n=== BANGUN RUANG ===");
        for (int i = 0; i < 3; i++) {
            System.out.println("Kubus " + (i+1) + 
                " -> Volume: " + kubus[i].hitungVolume() + 
                ", Luas Permukaan: " + kubus[i].hitungLuasPermukaan());
        }
        for (int i = 0; i < 3; i++) {
            System.out.println("Balok " + (i+1) + 
                " -> Volume: " + balok[i].hitungVolume() + 
                ", Luas Permukaan: " + balok[i].hitungLuasPermukaan());
        }
        for (int i = 0; i < 3; i++) {
            System.out.println("Kerucut " + (i+1) + 
                " -> Volume: " + kerucut[i].hitungVolume() + 
                ", Luas Permukaan: " + kerucut[i].hitungLuasPermukaan());
        }
        for (int i = 0; i < 3; i++) {
            System.out.println("Bola " + (i+1) + 
                " -> Volume: " + bola[i].hitungVolume() + 
                ", Luas Permukaan: " + bola[i].hitungLuasPermukaan());
        }
        for (int i = 0; i < 3; i++) {
            System.out.println("Silinder " + (i+1) + 
                " -> Volume: " + silinder[i].hitungVolume() + 
                ", Luas Permukaan: " + silinder[i].hitungLuasPermukaan());
        }
    }
}
