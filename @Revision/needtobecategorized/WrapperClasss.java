public class WrapperClasss {
    public static void main(String[] args) {
        /**
         * The wrapper class in Java provides the mechanism to convert primitive into
         * object and object into primitive.
         */
        int num1 = 20;
        Integer num2 = new Integer(num1); // Boxing
        Integer num3 = num1; // Auto-Boxing
        int num4 = num3.valueOf(num1); // Un-Boxing
        int num5 = num3; // Auto-Unboxing

    }
}
