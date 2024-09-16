public class Functions {
    public static void printJava(){   //method/function
        System.out.println("Hacker or what!");
    }
    public static void printName(String name){
        System.out.println(name);
    }
    public static void printSum(int a, int b){
        int sum = a + b;
        System.out.println(sum);
    }
    public static void main(String[] args) {
        printJava(); //method/function called
        printJava();

        printName("Rock it Yo!");
        printName("Itachi Uchiha");

        printSum(4, 8);
        printSum(6, 9);
    }
}
