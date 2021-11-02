import java.util.Scanner;

public class DemoException2 {
    public static void main(String[] args) {
        int i,j,k = 2;
        int a[] = new int[4];
        i = 8;
        j = 0;
        try{
            j = new Scanner(System.in).nextInt();
            k = i/j;
            for (int c = 0 ; c <= 4 ; c++){
                a[c] = c+1;
            }
            for (int value: a) {
                System.out.println(value);
            }
        }
        catch (ArrayIndexOutOfBoundsException ai){
            System.out.println(ai);
        }
        catch (ArithmeticException ae){
            System.out.println(ae);
        }
        //should be always written at the end
        catch (Exception e){
            System.out.println("unknown exception");
        }
    }
}
