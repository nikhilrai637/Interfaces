package lambda;

import java.util.List;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class LambdaDemo {
    public static void show(){
        Supplier<Double> random = ()->Math.random();
        var number = random.get();
        System.out.println(number);
    }
}
