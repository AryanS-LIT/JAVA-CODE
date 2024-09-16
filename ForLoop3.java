public class ForLoop3 {
   public static void main(String[] args) {
    for(int i = 9; i>0; i--){
        for(int j = 0; j<=i; j++){
            System.out.print("*");
        }
        System.out.println("$");
        if(i>=0 && i<=9){
            System.out.println(i);
        }
    }
   }
}
