package bank;

class Account {        //more lines are in Inheritance.java file
    public String name;
    protected String email;
    private String password;

    //getters & setters
    public String getPassword() {
        return this.password;
    }

    public void setPassword(String pass) {
        this.password = pass;
    }
}
public class Packages {
    public static void main(String[] args) {
        Account account1 = new Account();
        account1.name = "Hackerrr";
        account1.email = "hacker001@gmail.com";
        account1.setPassword("abcd");
        System.out.println(account1.getPassword());
    }
}
