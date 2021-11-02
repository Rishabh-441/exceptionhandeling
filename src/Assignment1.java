import java.util.Scanner;

public class Assignment1 {
    public static void main(String[] args) {
        int s ;
        Scanner sc = new Scanner(System.in);
        try{
            s = Integer.parseInt(sc.next());
            System.out.println(s*s);
        }
        catch (Exception e){
            System.out.println("entered input is not a valid format for an integer");
        }
        finally{
            System.out.println("the work has been done successfully");
        }
    }
}
