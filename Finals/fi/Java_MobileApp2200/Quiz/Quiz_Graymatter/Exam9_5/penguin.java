package Quiz.Quiz_Graymatter.Exam9_5;

class Penguin extends Animal implements swimmable {
    public String sound() {
        return "Squawk";
    }

    public String howToSwim() {
        return "Uses their flippers to propel themselves through the water";
    }

    public String howToSleep() {
        return "Sleep while floating on the water or standing on ice";
    }
}
