import java.util.*;
public class Search {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("How many numbers in the array: ");
        int num=sc.nextInt();

        int array[];
        array=new int[num];
        int target;
        System.out.print("Enter the number you want to find: ");
        target=sc.nextInt();

        System.out.println("Enter the numbers:");
        for(int i=0;i<num;i++){
            array[i]=sc.nextInt();
        }
        boolean isfound=false;
        for(int i=0;i<array.length;i++){
            if(array[i]==target){
                System.out.printf("Found at index %d",i);
                isfound=true;
                break;
            }
        }
        if (!isfound){
            System.out.println("Element not found.");
        }
    }
}
