package Quiz.Quiz_Graymatter.Exam9_5_UML;

// Main
public class Main {
    public static void main(String[] args) {
        // จากกระดาษ
        Bicycle b = new Bicycle();
        b.changeGear(3);
        b.speedUp(3);
        b.applyBrakes(3);
        b.printStats();

        Bike g = new Bike();
        g.changeGear(4);
        g.speedUp(5);
        g.applyBrakes(6);

        // Taxi พร้อม Passenger
        Taxi t = new Taxi();
        t.changeGear(2); // จากในภาพ t.changeGear(3)
        t.applyBrakes(3); // t.applyBreak(3)
        System.out.println(t.frontPayMoney());
    }
}