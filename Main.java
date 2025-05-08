 class kendaran { //superclass
    String merk = "Toyota";
    kendaran(){
        System.out.println(" Ini constructor parent");
    }
    void jalan() {
        System.out.println("kendaran sedang berjalan");
    }
}

class Mobil extends kendaran { //subclass / child class
    Mobil() {
        super();
        System.out.println ("Ini constructor child");
    }
    
    void klakson (String merk) {
        System.out.println("Mobil "+ super.merk +" klakson ");
    }
}

public class Main{
    public static void main(String[] args){
        Mobil jazz = new Mobil ();
        jazz.jalan();
        jazz.klakson("bmw");
    }
}