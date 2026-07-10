package java.Java_Basics;
import java.util.Scanner;
public class mad_libs {
    public static void main(String[] args){
        Scanner scanner =new Scanner(System.in);
        String ad1;
        String ad2;
        String pn1;
        String prep;
        String v1;
        System.out.println("Today I went to the market. I bought          flowers of different colours. \r\n" + //
                        "They       so good. I will put them in the vase that I got from        . I will keep it in my\r\n" + //
                        "room         the table which is the best spot for        too.");
        System.out.print("Enter for 1st blank: ");
        ad1= scanner.nextLine();
        System.out.print("Enter for 2nd blank: ");
        ad2= scanner.nextLine();
        System.out.print("Enter for 3rd blank: ");
        pn1= scanner.nextLine();
        System.out.print("Enter for 4th blank: ");
        prep= scanner.nextLine();
        System.out.print("Enter for 5th blank: ");
        v1= scanner.nextLine();
        System.out.println("Today I went to the market. I bought "+ad1+" flowers of different colours. \r\n" + //
                        "They  "+ad2+" so good. I will put them in the vase that I got from "+pn1+" . I will keep it in my\r\n" + //
                        "room "+prep+" the table which is the best spot for "+v1+" too.");
        scanner.close();
    }
}
