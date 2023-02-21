package lambda;

public class LambdaDemo {
    public static void show(){
        greet(new ConsolePrinter());
    }

    private static void greet(Printer printer) {
        printer.print("Hello World!!");
    }
}
