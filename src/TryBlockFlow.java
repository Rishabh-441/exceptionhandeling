public class TryBlockFlow {
    public static void main(String[] args) {
        int a = 20;
        try{
            a = 34;
            int x = 33/0;
        }
        catch (ArithmeticException e){
            System.out.println(a);
            System.out.println(e.getMessage());
        }
    }
}
