import java.util.Scanner;
public class DoWhileLoop2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 0;

        do{
            System.out.println("Input a Number");
            n = sc.nextInt();
            System.out.print("here is the number");
            System.out.println(n);
        }while(n>=0);

        System.out.println("End of Code");
    }
}
