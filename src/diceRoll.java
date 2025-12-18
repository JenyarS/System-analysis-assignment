import java.util.*;

public class diceRoll {
    static java.util.Random rng = new Random();
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args){

        int choice = 0;
        for(;;) {
            System.out.println("1. Roll dice\n" + "0. Exit");
            System.out.print("Your choice: ");
            if (input.hasNextInt() && (choice == 0 || choice == 1)){
                choice = input.nextInt();
            } else {
                System.out.println("Invalid entry");
                continue;
            }
            if (choice == 0) break;

            System.out.println();
            int die1 = rng.nextInt(1, 7);
            int die2 = rng.nextInt(1, 7);
            System.out.println("You rolled [" + die1 + "] [" + die2 + "]");
            System.out.println();
        }
    }
}
