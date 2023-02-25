package lambda;

import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

public class LambdaDemo {
    public static void show(){
         //key : value
        //first : "key = value"
        // second : "{key = value}"

        Function<String,String>replaceColon = str->str.replace(':','=');
        Function<String,String>braces       = str-> "{" + str + "}";
        var result = replaceColon
                    .andThen(braces)
                    .apply("key:value");

        result = braces.compose(replaceColon).apply("key:value");
        System.out.println(result);


    }
}
