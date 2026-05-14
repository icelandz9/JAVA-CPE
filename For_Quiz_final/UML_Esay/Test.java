public class Test {
    public static void main(String[] args) {
        Motorcycle wave = new Motorcycle("Wave110i", "honda", 2020, 2, "Single Cylinder and 110cc");
        OffRoad raptor = new OffRoad("Raptor", "Ford", 2019, 4, 4);
        Car almerra = new Car("almera","Nissan",2018,4,4);

        System.out.println(raptor);
        System.out.println(almerra);
        System.out.println(wave);
    }
}
