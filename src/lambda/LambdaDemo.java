package lambda;

public class LambdaDemo {
    static String prefix = "-";
    public static void show(){
         greet(System.out::println); // method reference of a static function
    }

    private static void greet(Printer printer) {
        printer.print("Hello World!!");
    }
}
