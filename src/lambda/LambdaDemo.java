package lambda;

import java.util.List;
import java.util.function.Consumer;

public class LambdaDemo {
    public static void show(){
       List<String> list = List.of("a","b","c");
       Consumer<String> print = item -> System.out.println(item);
       Consumer<String> printUpperCase  = item->System.out.println(item.toUpperCase());
       list.forEach(print.andThen(printUpperCase));
    }
}
