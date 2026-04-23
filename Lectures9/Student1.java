public class Student1 extends People {
    public static void main(String[] args) {
        Student1 s = new Student1();
        s.setName("CPE 121");
        System.out.println("Name : " + s.getName());
        s.printData();
    }

    double grade;

    public Student1() {
        grade = 3.06;
        age = 6;
    }

    public void printData() {
        System.out.println("Age : " + age);
        System.out.println("Grade : " + grade);
    }
}

