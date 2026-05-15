package Quiz.Quiz_monkey.Quiz8.Q08_Monster;

/**
 * อินเทอร์เฟซ Monster (Quiz #08 Interface)
 */
public interface Monster {
    void menace();
}

/**
 * อินเทอร์เฟซ Lethal
 */
interface Lethal {
    void kill();
}

/**
 * อินเทอร์เฟซ DangerousMonster สืบทอดจาก Monster
 */
interface DangerousMonster extends Monster {
    void destroy();
}

/**
 * อินเทอร์เฟซ Vampire สืบทอดจาก DangerousMonster และ Lethal
 */
interface Vampire extends DangerousMonster, Lethal {
    void drinkBlood();
}

/**
 * คลาส DragonZilla นำอินเทอร์เฟซ DangerousMonster มาใช้งาน (implements)
 */
class DragonZilla implements DangerousMonster {
    @Override
    public void menace() {
        System.out.println("DragonZilla is menacing!");
    }

    @Override
    public void destroy() {
        System.out.println("DragonZilla destroys everything!");
    }
}

/**
 * โปรแกรมทดสอบ (Quiz08 Test Program)
 */
public class Quiz08 {
    public static void main(String[] args) {
        // อ็อบเจกต์ของ DragonZilla (ตามโจทย์ระบุ new DangerousMonster() แต่เนื่องจากเป็น Interface จึงต้องเป็นคลาสลูก)
        // เพื่อให้ตรงตามที่เขียนในกระดาษจะกำหนดให้ D เป็น DangerousMonster 
        // แต่จริงๆ ต้อง new จากคลาสที่ implement เช่น DragonZilla
        DangerousMonster D = new DragonZilla(); 
        
        // สำหรับ Vampire ในโจทย์เขียน new Vampire() ซึ่ง Interface สร้าง object ไม่ได้ 
        // ผู้สอนอาจจะจงใจให้ผู้เรียนเขียนคลาสเพิ่ม หรือต้องการให้เขียนโครงสร้างแบบจำลอง
        // ขออภัยที่ไม่สามารถ new Interface ได้โดยตรง จึงทำเป็น anonymous class เพื่อให้รันได้
        Vampire V = new Vampire() {
            @Override
            public void menace() {}
            @Override
            public void destroy() {}
            @Override
            public void kill() {}
            @Override
            public void drinkBlood() {
                System.out.println("Vampire is drinking blood!");
            }
        };

        DragonZilla Dr = new DragonZilla();

        // ทดสอบการเรียกใช้ method
        D.menace();
        D.destroy();
        V.drinkBlood();
        Dr.menace();
        Dr.destroy();
    }
}
