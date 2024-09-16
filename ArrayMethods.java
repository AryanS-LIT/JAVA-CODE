import java.util.Arrays;

public class ArrayMethods {
    public static void main(String[] args){
        //int[] marks = {92, 96, 94, 98, 90};
        int[] marks = new int[5];

        marks[0] = 92;
        marks[1] = 96;
        marks[2] = 94;
        marks[3] = 98;
        marks[4] = 90;
        //length
        System.out.println(marks.length); //in arrays we don't need to put () after a function/method we can directly call it
        
        //sort 
        Arrays.sort(marks);
        System.out.println(marks[0]);
    }
    
}
