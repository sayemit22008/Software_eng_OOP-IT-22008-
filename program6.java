interface Creature {
    void sound();
}

class Cow implements Creature {
    public void sound() {
        System.out.println("Hamba");
    }
}

public class program6 {
    public static void main(String[] args) {
        Cow d = new Cow();
        d.sound();
    }
}