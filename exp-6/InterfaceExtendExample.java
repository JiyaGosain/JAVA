import java.util.Scanner;

interface Animal {
    void eat();
}

interface Pet extends Animal {
    void play();
}

class Cat implements Pet {
    public void eat() {
        System.out.println("Cat eats fish.");
    }

    public void play() {
        System.out.println("Cat plays with yarn.");
    }
}

public class InterfaceExtendExample {
    public static void main(String[] args) {
        System.out.println("Jiya Gosain, 24csu313");
        Cat c = new Cat();
        c.eat();
        c.play();
    }
}

