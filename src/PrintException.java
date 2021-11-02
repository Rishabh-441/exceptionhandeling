public class PrintException {
    public static void main(String[] args) {
        int a=12,b=0,c;
        try {
            c = a/b;
        }
        catch (ArithmeticException e){
            e.printStackTrace();  //prints -->exception_name -->description  -->stacktrace
            System.out.println("**********************");
            System.out.println(e);  // prints -->exception_name  -->description
            System.out.println(e.toString());
            System.out.println("***********************");
            System.out.println(e.getMessage());        // prints  -->description
        }
    }
}
