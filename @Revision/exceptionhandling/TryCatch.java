package exceptionhandling;

public class TryCatch {
    public static void main(String[] args) {
        int i = 0;
        int j;
        System.out.println("In Initialization Phase");
        try {
            j = 10/1;
            System.out.println("In Try Block");
        }catch (Exception e) {
            // TODO: handle exception
            System.out.println(e);
            System.out.println("In catch Block");
        }
        finally{
            System.out.println("always works");
        }
    }
}
