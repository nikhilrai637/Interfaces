package lambda;

import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class LambdaDemo {
    public static void show(){
        //Predicate
        Predicate<String> isLongerThan5 = str -> str.length() > 5;
        var result = isLongerThan5.test("A string");
        System.out.println(result);
    }
}
