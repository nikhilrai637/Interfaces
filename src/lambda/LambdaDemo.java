package lambda;

import java.util.List;

public class LambdaDemo {

    public static void show(){
       List<Integer> list = List.of(1,2,3);
       list.forEach(number -> System.out.println(number*5));
    }


}
