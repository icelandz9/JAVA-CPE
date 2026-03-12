package Quiz.Quiz_Graymatter.Exam9;

class Exam9_1 {
    public static void main(String[] args) {
        CloseFigure c1 = new circle(2.0);
        CloseFigure c2 = new circle();
        CloseFigure c3 = new circle(3.0, "Red");
        CloseFigure r3 = new Rectangle();
        CloseFigure r1 = new Rectangle(3.0, 3.3, "blue");
        CloseFigure r2 = new Rectangle(2.0, 2.2);

        System.out.println(r3);
        System.out.println(r1);
        System.out.println(r2);
        System.out.println(c2);
        System.out.println(c3);
        System.out.println(c1);
    }
}
