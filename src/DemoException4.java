import java.util.Scanner;

public class DemoException4 {
    public static void main(String[] args) {
        int a[] = null;
        try {
            int x = new Scanner(System.in).nextInt();
            a[x] = 22;
            int j = new Scanner(System.in).nextInt();
            int k = 234/j;
            System.out.println(k);
        }
        catch (ArrayIndexOutOfBoundsException | ArithmeticException e){
            System.out.println(e);
        }
        catch (Exception e){
            System.out.println(e);
            System.out.println("something wrong");
        }
        finally {
            System.out.println("task completed");
        }
    }
}
