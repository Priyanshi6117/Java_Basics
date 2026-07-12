import java.util.Scanner;
public class Basics{
    public static void main(String []args){
        Scanner scanner= new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name=scanner.nextLine();

        System.out.print("Enter your age: ");
        int age=scanner.nextInt();

        System.out.print("Enter your cgpa: ");
        double cgpa=scanner.nextDouble();
        scanner.nextLine();

        System.out.print("Enter your fav food: ");
        String food=scanner.nextLine();

        System.out.println("Your name is "+name);
        System.out.println("Your age is "+age);
        System.out.println("Your cgpa is "+cgpa);
        System.out.println("Your fav food is "+food);
        scanner.close();
    }
}