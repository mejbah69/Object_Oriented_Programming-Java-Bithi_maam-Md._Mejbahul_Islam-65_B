import java.util.Scanner;
public class Evalution_2{
    int length;
    int height;
    void area(){
        System.out.println("Area: " + length*height);
    }
    void display(){
        System.out.println("Length: " + length);
        System.out.println("Height: " + height);
    }
    void insertValue(int l, int h){
        length = l;
        height = h;
        System.out.println("Length insertValue: " + length);
        System.out.println("Height insertValue: " + height);
    }
    public static void main(String[] args) {
        // Without Using Scanner
        Evalution_2 obj1 = new Evalution_2();
        obj1.length = 10;
        obj1.height = 20;
        obj1.display();
        obj1.area();
        obj1.insertValue(20, 30);
        //using Scanner
        System.out.println("");
        Evalution_2 obj2 = new Evalution_2();
        Scanner input = new Scanner(System.in);
        System.out.print("Enter length: ");
        obj2.length = input.nextInt();
        System.out.print("Enter height: ");
        obj2.height = input.nextInt();
        obj2.display();
        obj2.area();
        System.out.print("Insert Length: ");
        int l = input.nextInt();
        System.out.print("Insert Height: ");
        int h = input.nextInt();
        obj2.insertValue(l, h);
        input.close();
    }
}