package soal2;
    class Kendaraan {
        Kendaraan() {
            System.out.println("construktor Kendaraan dipanggil");
        }
    }
    
    class Mobil extends Kendaraan {
        Mobil() {
            super(); 
            System.out.println("construktor Mobil dipanggil");
        }
    }
    
    public class Main {
        public static void main(String[] args) {
            Mobil mm = new Mobil();
        }
    }
    

