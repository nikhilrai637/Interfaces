package lambda;

import java.util.List;
import java.util.function.*;

public class LambdaDemo {
    public static void show(){
        BinaryOperator<Integer>add = (a,b)->a+b;
        BinaryOperator<Integer>mul = (a,b)->a*b;
        Function<Integer,Integer>square = (a)->a*a;
        var result = add.andThen(square).apply(1,2);
        var result2 = mul.andThen(square).apply(3,4);
        System.out.println(result2);
        System.out.println(result);

    }
}
