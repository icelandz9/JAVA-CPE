public class Flower {
    private String useInstruction;

    public Flower(String instruction) {
        this.useInstruction = instruction;
        // Constructor รับ parameter ชื่อ instruction มา
        // useInstruction คือ field ของ class
        // ต้องการเก็บค่าที่รับมาไว้ใน field → ใช้ this.field = parameter
    }

    public String getInstruction() {
        return useInstruction;
        // method ชื่อ getInstruction → หน้าที่คือ ดึงค่า instruction ออกมา
        // useInstruction คือ field ที่เก็บค่าไว้
        // ก็แค่ return field นั้นออกไป
    }

    @Override
    public String toString() {
        return getInstruction();

        // toString() ต้องคืนค่า String เพื่อแสดงผล
        // มี method getInstruction() ที่คืน String อยู่แล้ว
        // ไม่ต้องเขียนใหม่ เรียกใช้ของที่มีอยู่แล้ว
    }
}

// this.x = y เราจะเก็บอะไร ไว้ที่ไหน?
// return x เราจะส่งอะไรออกไป?return method()มี
// method ไหนทำสิ่งที่ต้องการอยู่แล้ว?