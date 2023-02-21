package lambda;

public class LambdaDemo {
    static String prefix = "-";
    public static void show(){
         greet(message -> System.out.println(prefix+message));

         Printer printer = message -> System.out.println(message);
         greet(printer);//Essentially objects representing anonymous functions
    }

    private static void greet(Printer printer) {
        printer.print("Hello World!!");
    }
}
