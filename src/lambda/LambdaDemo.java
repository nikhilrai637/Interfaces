package lambda;

import java.util.List;
import java.util.function.*;

public class LambdaDemo {
    public static void show(){
        UnaryOperator<Integer> square = n -> n*n;
        UnaryOperator<Integer> increment = n -> n+1;
        var result = increment.andThen(square).apply(1);
        System.out.println(result);
    }
}
