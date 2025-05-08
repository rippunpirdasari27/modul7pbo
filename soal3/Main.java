package soal3;

    class Produk {
        int harga = 10000;
    }
    
    class Buku extends Produk {
        int harga = 25000;
    
        void bandingkanHarga() {
            System.out.println("Harga di subclass Buku: " + harga);
            System.out.println("Harga di superclass Produk: " + super.harga);
        }
    }
    
    public class Main {
        public static void main(String[] args) {
            Buku buku = new Buku();
            buku.bandingkanHarga();
        }
    }
    

