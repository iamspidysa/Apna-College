public class Exceptionhandling1 {
    public static void main(String[] args) {
        int i=0;
        int j;
        try {
            j=10/i;
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println(e);
            System.out.println(e.getMessage());
        }
        finally{
            System.out.println("Always Executed");
        }
    }
}
