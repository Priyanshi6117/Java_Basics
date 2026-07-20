import java.util.*;
public class Arrays {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String[] foods;

        System.out.print("What number of food do you want: ");
        int size=sc.nextInt();
        sc.nextLine();
        foods=new String[size];

        for(int i=0;i<foods.length;i++){
            System.out.print("Enter a food: ");
            foods[i]=sc.nextLine();
        }
        for(String food:foods){
            System.out.println(food);
        }
        sc.close();
    }
}
