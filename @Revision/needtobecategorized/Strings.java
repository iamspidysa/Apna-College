import java.util.ArrayList;

public class Strings {
    public static void main(String[] args) {
        // System.out.println('a');
        // int num = 'a'+'b';
        // System.out.println("a"+"b");
        // System.out.println();
        //System.out.println(new Integer(22) + new ArrayList<>() + "");
        Integer num = 10;
        StringBuilder name = new StringBuilder("Kumar Saurabh Anand");
        StringBuilder name2 = new StringBuilder("Leo");

        System.out.println(name2.reverse());
        Integer name3 = 100;
        System.out.println(String.valueOf(name3)+10);
        System.out.println();

        char a = 'a';
        System.out.println(String.valueOf(a)+1);
        System.out.println((char)(a+1));

        char[] ch={'j','a','v','a','t','p','o','i','n','t'};  
        String s=new String(ch);  
        System.out.println(s);

        

    }
}
