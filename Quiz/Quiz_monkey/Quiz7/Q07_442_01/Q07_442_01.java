package Quiz.Quiz_monkey.Quiz7.Q07_442_01;

public class Q07_442_01 {
  public static void main(String[] args) {
    SuperHero sh = new SuperHero();
    Superman sm = new Superman();
    Batman bm1 = new Batman();
    Batman bm2 = new Batman("Batman", "I am Rich.");
    Spiderman sd = new Spiderman("Spiderman", 20, "I can shoot spider web");

    System.out.println(sh);
    System.out.println(sm);
    System.out.println(bm1);
    System.out.println(bm2);
    System.out.println(sd);
  }
}
