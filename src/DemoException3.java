import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class DemoException3 {
    public static void main(String[] args) {
        int i,j = 1,k =0;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        i = 8;
        try{
            j = Integer.parseInt(br.readLine());
            System.out.println(j*2);
            System.out.println("bye");
        }
        catch (IOException x){
            System.out.println(x);
        }
        catch (NumberFormatException io){
            System.out.println("wrong input");
            System.out.println("bye");
        }
        finally {
            System.out.println("bye");
        }
    }
}
