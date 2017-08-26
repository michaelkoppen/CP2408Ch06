import java.util.Scanner;
public class EvenEntryLoop {
    public static void main(String[] args) {
        int userInput;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter an even number, or 999 to exit program");
        userInput = input.nextInt();
        while(userInput != 999) {
            if(userInput % 2 != 0) {
                System.out.println("Number not even, try again");
                userInput = input.nextInt();
            }
            else {
                System.out.println("Good Job!");
                System.out.println("Enter an even number, or 999 to exit program");
                userInput = input.nextInt();
            }
        }
    }
}
