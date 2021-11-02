public class DemoException {
    public static void main(String[] args) {
        int i,j,k = 0;
        i = 8;
//        j = 2;
        j = 0;

        //unchecked exception:
        try{
            k = i/j;        //critical statement
        }
//        catch (Exception e){
//            System.out.println(e);
//            System.out.println("cannot divide by zero");
//        }
        catch (ArithmeticException ae){
            System.out.println(ae);
        }
        System.out.println(k);
    }
}
