import java.util.Scanner;
public class Shopping_cart {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("What would you like to have?\r\n" + //
        "1=Pizza\r\n"+//
        "2-Burger\r\n"+//
        "3-Cheesecake\r\n"+//
        "4-Waffle\r\n"+//
        "Enter your choice: ");
        int choice=sc.nextInt();
        System.out.print("How many you want?: ");
        int quantity=sc.nextInt();
        double price=0;
        switch(choice){
        case 1:
            price=299;
            System.out.println("You want "+quantity+" Pizza.");
            break;
        case 2:
            price=99;
            System.out.println("You want "+quantity+" Burger.");
            break;
        case 3:
            price=149;
            System.out.println("You want "+quantity+" Cheesecake.");
            break;
        case 4:
            price=180;
            System.out.println("You want "+quantity+" Waffle.");
            break;
        default:
            System.out.println("Invalid.");
        }
        double total=quantity*price;
        System.out.println("Your total amout is "+total);
        sc.close();
    }
}
