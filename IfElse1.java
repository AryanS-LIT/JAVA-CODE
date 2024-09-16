import java.util.Scanner;
public class IfElse1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Age : ");
        int age = sc.nextInt();

        if(age > 18){
            System.out.println("Eligible for Voting and Driving License");
        }
        else{
            System.out.println("Not Eligible");
        }
        sc.close();
    }
}
