class Animal {
    void eat() {
        System.out.println("Animals can eat.");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("Dog barks.");
    }
}

class Puppy extends Dog {
    void weep() {
        System.out.println("Puppy weeps.");
    }
}
class Cat extends Animal {
    void meow() {
        System.out.println("Cat meows.");
    }
}

interface Pet {
    void friendly();
}

class Parrot extends Animal implements Pet {
    public void friendly() {
        System.out.println("Parrot is friendly and can talk!");
    }
}

public class Inheritance {
    public static void main(String[] args) {

        System.out.println("=== Single Inheritance ===");
        Dog d = new Dog();
        d.eat();
        d.bark();

        System.out.println("\n=== Multilevel Inheritance ===");
        Puppy p = new Puppy();
        p.eat();
        p.bark();
        p.weep();

        System.out.println("\n=== Hierarchical Inheritance ===");
        Cat c = new Cat();
        c.eat();
        c.meow();

        System.out.println("\n=== Multiple Inheritance (Using Interface) ===");
        Parrot pr = new Parrot();
        pr.eat();
        pr.friendly();
    }
}
