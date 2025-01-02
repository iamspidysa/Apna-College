// Expression for Lambda Expression Normal
@FunctionalInterface
interface InnerLambdaExp {
    void disp();
}

// Lambda Expression for parameterized Method
@FunctionalInterface
interface InnerLambdaExp2 {
    void disp(int i);
}

// Lambda Expression for Return type parameterized Method
@FunctionalInterface
interface InnerLambdaExp3 {
    int add(int i, int j);
}

public class LambdaExp {
    public static void main(String[] args) {
        // Expression for Lambda Expression Normal
        InnerLambdaExp obj = () -> System.out.println("I am normal anonymous Class");
        obj.disp();

        // Lambda Expression for parameterized Method
        InnerLambdaExp2 obj2 = (int i) -> System.out.println("I am parameterized method " + i);
        obj2.disp(22);

        // Lambda Expression for Return type parameterized Method
        //If there is single expression, no need of return type
        InnerLambdaExp3 obj3 = (int i, int j) ->  i + j;    
        int result = obj3.add(3,5);
        System.err.println(result);
    }
}
