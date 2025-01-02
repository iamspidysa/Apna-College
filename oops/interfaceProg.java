package oops;

public class interfaceProg {
    public static void main(String[] args) {
    Bear b = new Bear();
    b.carni();
    b.herb();        
    }
}

interface Herbivore {
    void herb();
}

interface Carnivore {
    void carni();
}

class Bear implements Herbivore,Carnivore{
    public void herb(){
        System.out.println("I eat Grass");
    }
    public void carni(){
        System.out.println("I eat Meat");
    }
}