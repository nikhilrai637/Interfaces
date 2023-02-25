package lambda;

import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class LambdaDemo {
    public static void show(){
        //Predicate
        Predicate<String>hasLeftBrace  = str -> str.startsWith("{");
        Predicate<String>hasRightBrace = str -> str.endsWith("}");
        Predicate<String> hasLeftAndRightBrace = hasLeftBrace.and(hasRightBrace);
        var result = hasLeftAndRightBrace.test("{key : value}");
        System.out.println(result);
        System.out.println(hasLeftBrace.or(hasRightBrace).test("{key : pair}"));
    }
}
