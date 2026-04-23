import java.util.concurrent.Flow;

public class Ex8_2 {
    public static void main(String[] args) {
        Flower cauly = new CauliFlower("Boil before stir fry. Cook me well.", 30);
        Flower soapFlower = new CarvedFlower("For room decoration.", "Sope", 4);
        Flower carrie = new WallFlower();
        System.out.println(cauly);
        System.out.println(soapFlower);
        System.out.println(carrie);
    }
}
