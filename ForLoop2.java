public class ForLoop2 {
    public static void main(String[] args) {
        for(int i=0;i<=6;i++){
            for(int j=0;j<=6;j++){

                if(j%2!=0){
                    System.out.print("$");
                }
                else{
                    System.out.print("*");
                }
            }
            if(i%2==0){
                System.out.println("@");
            }
            else{
            System.out.println("*");
            }
        }
    }
}
