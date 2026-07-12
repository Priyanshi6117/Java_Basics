import java.util.Scanner;
public class Weight_converter {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the weight: ");
        double weight=sc.nextDouble();
        System.out.println("1-Convert grams into kg.\n\r" + //
        "2-Convert kg into grams.");
        System.out.print("Enter your choice: ");
        double result=0;
        double choice=sc.nextInt();
        if(choice==1){
            result=weight/1000;
            System.out.printf("The converted weight is %.2f kg.",result);
        }
        else if(choice==2){
            result=weight*1000;
            System.out.printf("The converted weight is %.2f g.",result);
        }
        else{
            System.out.print("Invalid.");
        }
        sc.close();
    }
}
