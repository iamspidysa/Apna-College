package Collection;

import java.util.ArrayList;
import java.util.Collections;

//String class and Wrapper classes implement the Comparable interface by default. So if you store the objects of string or wrapper classes in a list, set or map, it will be Comparable by default.
class Student implements Comparable<Student> {
    int roll;
    String name;

    public Student(int roll, String name) {
        this.roll = roll;
        this.name = name;
    }

    public int compareTo(Student that) {
        return this.roll > that.roll ? 1 : -1;
    }

    @Override
    public String toString() {
        return roll + " " + name;
    }

}

public class ComparableInterface {
    public static void main(String[] args) {
        ArrayList<Student> st = new ArrayList<>();
        st.add(new Student(12, "Saurabh"));
        st.add(new Student(10, "Anand"));
        st.add(new Student(2, "Kumar"));
        st.add(new Student(5, "Spidy"));
        System.out.println(st);
        Collections.sort(st);
        // After Sorting
        System.out.println(st);

        // Comparable is already implemented by String
        ArrayList<String> str = new ArrayList<>();
        str.add("Saurabh");
        str.add("Aannad");
        str.add("Baklol");
        str.add("CHirkut");
        str.add("Spidy");
        System.out.println(str);
        Collections.sort(str);
        System.out.println(str);

    }
}
