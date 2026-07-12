import java.util.*;
public class Number_guessing_game {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        Random ran=new Random();
        int attempts=0;
        int guess;
        int random=ran.nextInt(11);
        do{
            System.out.print("Enter your guess between 1-10: ");
            guess=sc.nextInt();
            attempts++;
        }while(random!=guess);
        System.out.println("Congratulations, You guessed it right!!!");
        System.out.printf("The number was %d.\n",random);
        System.out.printf("You took %d attempts.",attempts);
        sc.close();
    }
}
