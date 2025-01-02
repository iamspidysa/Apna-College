package oops;

public class Inheritance {
    public static void main(String[] args) {
        Tuna t = new Tuna();
        t.eatable();

        Shark s = new Shark();
        s.eatable();

        Peacock p = new Peacock();
        p.sky();

        Human h = new Human();
        h.intelligence();
        h.ground();
        h.eat();
    }
}

class Animal {
    void eat() {
        System.out.println("Eats");
    }

    void color() {
        System.out.println("color");

    }
}

class Fish extends Animal {
    void water() {
        System.out.println("I am under water");
    }
}

class Tuna extends Fish {
void eatable(){
    System.out.println("I can we eaten");
}
}

class Shark extends Fish {
    void eatable(){
        System.out.println("I CANNOT we eaten");
    }
}

class Bird extends Animal {
void sky(){
    System.out.println("I can fly");
}
}
class Peacock extends Bird{
    void sky(){
        System.out.println("Fly little bit");
    }
}

class Mammal extends Animal {
void ground(){
    System.out.println("I stay on ground");
}
}
class Dog extends Mammal{
    void noice(){
        System.out.println("Bhoowww");
    }
}
class Cat extends Mammal{
void noice(){
    System.out.println("Meowww");
}
}
class Human extends Mammal{
    void intelligence(){
        System.out.println("+10000 auraaa");
    }
}