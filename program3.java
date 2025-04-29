class Student1 {
    protected String type = "Student";

    void display() {
        System.out.println("This is an student.");
    }
}

class Teacher extends Student1 {
    void speech() {
        System.out.println(type + " is a topper");
    }
}

public class program3 {
    public static void main(String[] args) {
        Teacher s=new Teacher();
        s.display();
        s.speech();
    }
}