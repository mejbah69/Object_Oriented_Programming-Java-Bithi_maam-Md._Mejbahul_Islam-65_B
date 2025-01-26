import java.util.Scanner;
public class Insert_Data{
    String name;
    int age;
    double salary;
    void insertData(String name, int age, double salary){
        this.name = name;
        this.age = age;
        this.salary = salary;
    }
    public static void main(String[] args){
        // Direct Value Assign
        Insert_Data mejbah = new Insert_Data();
        mejbah.insertData("Mejbah", 25, 25000.0);
        System.out.println("Employee name: " + mejbah.name);
        System.out.println("Employee age: " + mejbah.age);
        System.out.println("Employee salary: " + mejbah.salary);
        Scanner input = new Scanner(System.in);
        // Using Scanner
        Insert_Data bithi = new Insert_Data();
        System.out.print("Enter employee name: ");
        bithi.name = input.nextLine();
        System.out.print("Enter employee age: ");
        bithi.age = input.nextInt();
        System.out.print("Enter employee salary: ");
        bithi.salary = input.nextDouble();
        System.out.println("Employee name: " + bithi.name);
        System.out.println("Employee age: " + bithi.age);
        System.out.println("Employee salary: " + bithi.salary);
        input.close();
    }
}