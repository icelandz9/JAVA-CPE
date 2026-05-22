package Final_Exam.Final_CODE.Final_6;

public class OffRoad extends Car {
    /**
     * คอนสตรัคเตอร์สำหรับรถ OffRoad (สืบทอดจาก Car)
     */
    public OffRoad(String model, String make, int year, int seat, int door) {
        super(model, make, year, seat, door);
    }

    // ─── ส่วนที่ 1: การแสดงผลข้อมูลเฉพาะของ OffRoad ────────────────────────
    @Override
    public String toString() {
        return "[OffRoad] " + getMake() + ", " + getModel() + ", " + getYear() + ", seating: " + getSeat() + ", "
                + getDoor() + " door.";
    }
}
