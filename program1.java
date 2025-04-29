class Person {
    String name;
    int age;

    void introduce() {
        System.out.println("Hello, my name is " + name + " and I am " + age + " years old.");
    }
}

public class program1 {
    public static void main(String[] args) {
        Person myPerson = new Person(); // object creation
        myPerson.name = "Sayem";
        myPerson.age = 22;
        myPerson.introduce();
    }
}
