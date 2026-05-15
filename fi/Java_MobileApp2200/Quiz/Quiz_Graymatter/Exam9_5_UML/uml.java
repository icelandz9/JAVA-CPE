// Interface
interface Passenger {
    String frontPayMoney();
}

// Abstract Class
abstract class Vehicle {
    abstract void changeGear(int a);

    abstract void speedUp(int a);

    abstract void applyBrakes(int a);
}

// Bicycle
class Bicycle extends Vehicle {
    public void changeGear(int a) {
        System.out.println("Bicycle changeGear: " + a);
    }

    public void speedUp(int a) {
        System.out.println("Bicycle speedUp: " + a);
    }

    public void applyBrakes(int a) {
        System.out.println("Bicycle applyBrakes: " + a);
    }

    public void printStats() {
        System.out.println("Bicycle stats");
    }
}

// Bike extends Bicycle
class Bike extends Bicycle {
    public void changeGear(int a) {
        System.out.println("Bike changeGear: " + a);
    }

    public void speedUp(int a) {
        System.out.println("Bike speedUp: " + a);
    }

    public void applyBrakes(int a) {
        System.out.println("Bike applyBrakes: " + a);
    }
}

// Taxi extends Bike, implements Passenger
class Taxi extends Bike implements Passenger {
    public String frontPayMoney() {
        return "Please pay fare";
    }
}

// จากภาพในกระดาษ ตัวเลข 3, 4, 5, 6 ที่ใส่ไปเป็นแค่ ตัวอย่างค่า ครับ
// ไม่มีความหมายพิเศษอะไร
// ดังนั้นจะใส่ตัวเลขอะไรก็ได้ เช่น 1, 10, 100 ก็ compile ผ่านเหมือนกัน
// โจทย์แค่ต้องการให้เห็นว่า เรียก method ได้ถูกต้องและส่ง int เข้าไป
// เท่านั้นเอง ไม่ได้กำหนดค่าที่ถูกต้องไว้ครับ