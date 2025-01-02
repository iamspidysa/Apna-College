public class ObjectClass implements Cloneable {
    int price;
    String model;

    void display(){
        System.out.println(model+" "+price);
    }

    public Object clone() throws CloneNotSupportedException{
        return super.clone();
    }

    public static void main(String[] args) throws Exception {
        //ObjectClass obj1 = new ObjectClass();
        // System.out.println(obj1.toString());
        // obj1.price=90000;
        // obj1.model = "Lenovo";
        // obj1.display();
        // ObjectClass obj2 = (ObjectClass)obj1.clone();
        // obj1.price=90100;
        // obj1.display();
        // obj2.display();

        //for Clone Check
        CloneCheck obj2 = new CloneCheck(25, "Saurabh");
        obj2.display();
        // CloneCheck obj3 = new CloneCheck(obj2);
        CloneCheck obj3 = obj2;
        obj3.name = "Shobha";
        obj2.display();
        // obj3.display();

    }
}

class CloneCheck{
    int age;
    String name;
    
    CloneCheck(int age, String name){
        this.age = age;
        this.name = name;
    }

    void display(){
        System.out.println("Yout age "+age+"\nYour Name "+name);
    }

    CloneCheck(CloneCheck copy){
        this.age = copy.age;
        this.name = copy.name;
    }
}
