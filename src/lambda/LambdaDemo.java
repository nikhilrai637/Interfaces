package lambda;

public class LambdaDemo {
    static String prefix = "-";

    public LambdaDemo(String message) {
        System.out.println(message + " from Constructor Method Reference");
    }

    public static void forMethodReference(String message){
        System.out.println(message+" from Static Method Reference");
    }
    public  void forObjectMethodReference(String message){
        System.out.println(message+" from Object Method Reference");
    }
    public static void show(){
         greet(System.out::println); // method reference of a static function
         greet(LambdaDemo::forMethodReference);

         var printer = new LambdaDemo("hmm");
         greet(printer::forObjectMethodReference);
         greet(LambdaDemo::new);
    }

    private static void greet(Printer printer) {
        printer.print("Hello World!!");
    }
}
