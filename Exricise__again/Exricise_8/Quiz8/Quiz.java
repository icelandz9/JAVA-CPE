public class Quiz {
    public static void main(String[] args) {
        DangerousMonster D = new DragonZilla();
        
        D.menace();
        D.destroy();
    }

}

// สือทอดใช้ extends → เอาของเดิมมาใช้ต่อได้เลย
// implements ใช้ implements → รับแค่รายการที่ต้องทำ แล้วทำเองครับ
// iterface ไม่สามรถ print ได้ ประกาศได้แค่ method ได้อย่างเดียว