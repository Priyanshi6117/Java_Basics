import java.util.*;
public class Method{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num=sc.nextInt();
        System.out.println(sq(num));
        System.out.println(cube(num));

        System.out.print("Enter the age:");
        int age=sc.nextInt();
        if(agecheck(age)){
            System.out.println("You are eligible.");
        }
        else{
            System.out.println("You are not eligible.");
        }
        sc.close();
    }
    static double sq(double num){ return num*num; }
    static double cube(double num){ return num*num*num; }
    static boolean agecheck(int age){
        if(age>=18){
            return true;
        }
        else{
            return false;
        }
    }

}