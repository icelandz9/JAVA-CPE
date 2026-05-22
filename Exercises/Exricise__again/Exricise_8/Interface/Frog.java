public class Frog extends Animal implements Swimmable{
   public String sound(){
    return "Frog: Ribbit-Ribbit";
   }

   public String howToSleep(){
    return "Forg: May rest more throughout the day when the sun is hot";
   }

   public String  howToSwim(){
    return "Forg: Swim with their powerful hind legs, and flattened, streamlinede body";
   }
}

// ต้องใช้ String เพราะ Animal ประกาศ data type เป็น String ต้องใช้ return
