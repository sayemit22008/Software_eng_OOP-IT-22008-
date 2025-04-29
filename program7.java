interface Drinkable {
    void drink();
}

interface Chewable {
    void chew();
}

class Eat implements Drinkable, Chewable {
    public void drink() {
        System.out.println("Drinking milk is good for health........");
    }

    public void chew() {
        System.out.println("I can chew hard meals well..........");
    }
}

public class program7 {
    public static void main(String[] args) {
        Eat d = new Eat();
        d.drink();
        d.chew();
    }
}
