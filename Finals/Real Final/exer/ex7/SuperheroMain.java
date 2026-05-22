public class SuperheroMain {
    public static void main(String[] args) {
        SuperHero sh = new SuperHero ();
        Spiderman sd1 = new Spiderman ("Spiderman", 18, "I can shoot spider web. ") ;
        Superman sm1 = new Superman(); Superman sm2 = new Superman ("Superman", "I can fly.");
        Batman bm1 = new Batman(); Batman bm2 = new Batman ("Batman", "I am Rich.");
        System.out.println(sh); System.out.println(sd1);
        System.out.println(sm1); System.out.println(sm2);
        System.out.println(bm1); System.out.println(bm2);
    }
}
