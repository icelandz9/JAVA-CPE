class Dog extends Animal {
    public void move() {      // Override method แม่
        super.move();         // เรียก move() ของแม่ก่อน
        System.out.println("Dogs can walk and run");
    }
}