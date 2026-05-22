public class ex4_2 {
    public static void main(String[] args) {
        int n = 5; // จำนวนด้านเส้นตรง
        double s = 5.0; // ความยาวของด้านเส้นตรงที่รับค่า
        double areaResult = area(n, s); // เรียกใช้เมทอด area() เพื่อคำนวณหาพื้นที่

        // แสดงผลลัพธ์
        System.out.println("The area of the polygon is: " + areaResult);
    }

    // เมทอดสำหรับคำนวณหาพื้นที่ของรูปหลายเหลี่ยม
    public static double area(int n, double side) {
        return (n * Math.pow(side, 2)) / (4 * Math.tan(Math.PI / n));
    }
}
