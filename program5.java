abstract class Animal {
    abstract void makeSound();

    void make () {
        System.out.println("Today we will eat chicken.........");
    }
}

class Hen extends Animal {
    void makeSound() {
        System.out.println("Kokodo-koo");
    }
}

public class program5
{
    public static void main(String[] args) {
        Hen h= new Hen();
        h.makeSound();
        h.make();
    }
}