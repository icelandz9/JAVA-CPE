public class Fish {
    private double weight; // เก็บน้ำหนักปลา เข้าถึงได้แค่ใน class นี้

    public Fish(double weight) { // constructor รับน้ำหนักมาเก็บ
        this.weight = weight; // เก็บค่าที่รับมาใส่ field
    }

    public double getWeight() { // method ดึงค่าน้ำหนักออกมา
        return weight;
    }

    public void swim() { // method ว่ายน้ำของปลาทั่วไป
        System.out.println("All fish swim.");
    }

    @Override
    public String toString() { // แปลง object เป็น String
        return "I am a " + getWeight() + " kg fish. "; // เวลา print จะแสดงข้อความนี้
    }
}