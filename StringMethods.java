public class StringMethods {
    public static void main(String[] args){
        //substring
        String name = "Hacker or What!";
        String name1 = "GrimReaper";
        //String replace
        String name2 = name1.replace('r', 'v');

        System.out.println(name.substring(0, 6));

        System.out.println(name1.length());

        System.out.println(name2);
    }
}
