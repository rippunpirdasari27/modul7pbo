package soal1;
class Bangunan {
    String nama = "Bangunan Umum";
}

class GedungSekolah extends Bangunan {
    String nama = "Gedung Sekolah ABC";

    void tampilkanInfo() {
        System.out.println("Nama pemilik subclass: " + nama);
        System.out.println("Nama pemilik  superclass: " + super.nama);
    }
}

public class Main {
    public static void main(String[] args) {
        GedungSekolah nina = new GedungSekolah();
        nina.tampilkanInfo();
    }
}
