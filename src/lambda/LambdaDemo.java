package lambda;

import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

public class LambdaDemo {
    public static void show(){
        Function<String,Integer> map = str->str.length();
        var length = map.apply("Rider");
        System.out.println(length);
    }
}
