class Student{
    String name;
    int age;

    public void printInfo(){
        System.out.println(this.name);
        System.out.println(this.age);
    }

}
public class ClassObject2 {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "Itachi Uchiha";
        s1.age = 24;
        Student s2 = new Student();
        s2.name = "Obito Uchiha";
        s2.age = 23;

        s1.printInfo();
        s2.printInfo();
    }
}
