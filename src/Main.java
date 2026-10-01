
public class Main {
    public static void main(String[] args) {

//task1
        Student student =new Student();
        student.setName("Nicat");
        student.setGrade("20");
        student.setAge(-5);
        System.out.println(student);

//task2
        User user = new User();
        System.out.println(user.checkPassword("1234569"));
        user.changePassword("123456","98755");
        user.mustChange("adminn","38988778");

//task3
        Account account= new Account();
        System.out.println(account.getBalance());
        account.deposit(1000L);
        account.withDraw(23990L);

//task4
        A a = new A();
        A a1 = new A();
        A a2 = new A();
        A a3 = new A();
        System.out.println(A.count);


    }
}
