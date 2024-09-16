class Student{
    String name;
    int age;

    public void printInfo(){
        System.out.println(this.name);
        System.out.println(this.age);
    }

    Student(String name, int age){
        this.name = name; //Parameterized constructor
        this.age = age;
    }

    Student(){
        System.out.println("Constructor Called"); //Non-Parameterized constructor
    }

    Student(Student s2){
        this.name = s2.name; //Copy constructor
        this.age = s2.age;
    }
}
public class Constructors {
    public static void main(String[] args) {
        
        Student s1 = new Student();
        s1.name = "Itachi Uchiha";
        s1.age = 24;

        Student s2 = new Student(s1);

        s1.printInfo();
        s2.printInfo();
    }
}
