import java.util.*;
public class StudentCouncil {

    private Dance dance;
    private Scanner scan;

    public StudentCouncil() {
        dance = new Dance();
        scan = new Scanner(System.in);
    }

    public void mainMenu() {
        int ans;

        do {

            System.out.println("====================");
            System.out.println("     Main Menu");
            System.out.println("====================");
            System.out.println("1. Buy a ticket");
            System.out.println("2. Print Summary Report");
            System.out.println("3. Exit");
            System.out.println("\nSelect: ");

            ans = scan.nextInt();

            if (ans == 1)
                buyTicket();
            else if (ans == 2)
                printSummary();


        }
        while (ans != 3);
    }

    public void buyTicket() {}

    public void printSummary() {}



}
