package java.Java_Basics;
import java.util.Scanner;
public class Compound_int {
    public static void main(){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the principal amount: ");
        double p=sc.nextDouble();
        System.out.print("Enter the rate: ");
        double r=sc.nextDouble()/100;
        System.out.print("Enter the time period: ");
        double t=sc.nextDouble();
        System.out.print("Enter the number of times compound is calculated per year: ");
        double n=sc.nextDouble();
        double a=p*(Math.pow((1+r/n),(n*t)));
        System.out.println("The compound interest is: "+a);
        sc.close();
    }
}
