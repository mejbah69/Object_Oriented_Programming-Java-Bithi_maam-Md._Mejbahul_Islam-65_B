import java.util.Scanner;
public class Employee{
    String name;
    int age;
    double salary;
    public void myPublicMethod(){
        System.out.println("Public method");
    }
    static void displayID(){
        System.out.println("ID: 1234");
    }
    public static void main(String[] args){
        // myPublicMethod();
        Scanner in = new Scanner(System.in);
        Employee mejbah = new Employee();
        System.out.print("Enter employee name: ");
        mejbah.name = in.nextLine();
        System.out.print("Enter employee age: ");
        mejbah.age = in.nextInt();
        System.out.print("Enter employee salary: ");
        mejbah.salary = in.nextDouble();
        // mejbah.x=25;
        mejbah.myPublicMethod();
        // System.out.println(mejbah.id);
        displayID();
        System.out.println("Employee name: " + mejbah.name);
        System.out.println("Employee age: " + mejbah.age);
        System.out.println("Employee salary: " + mejbah.salary);
    }
}