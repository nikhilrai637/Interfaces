package lambda;

public class LambdaDemo {
    public static void show(){
        greet(new Printer() {
            @Override
            public void print(String message) {
                System.out.println(message);
            }
        });
    }

    private static void greet(Printer printer) {
        printer.print("Hello World!!");
    }
}
