import java.util.*;
public class StudentCouncil extends Dance{

    private Dance dance;
    private Scanner scan;

    public StudentCouncil() {
        dance = new Dance();
        scan = new Scanner(System.in);
    }

    public void mainMenu() {
        int ans;
        do {

            System.out.println("\n====================");
            System.out.println("     Main Menu");
            System.out.println("====================");
            System.out.println("1. Buy a ticket");
            System.out.println("2. Print Summary Report");
            System.out.println("3. Exit");
            System.out.print("\nSelect: ");

            ans = scan.nextInt();

            if (ans == 1)
                buyTicket();
            else if (ans == 2)
                printSummary();


        }
        while (ans != 3);
    }

    public void buyTicket() {
        System.out.println("\n====================");
        System.out.println("      Tickets");
        System.out.println("====================");
        System.out.println("1. With Gold Pass - 0€");
        System.out.println("2. With Silver Pass - 2€");
        System.out.println("3. With Bronze Pass - 4€");
        System.out.println("4. With no pass - 6€");
        System.out.print("\nSelect: ");

        Scanner key = new Scanner(System.in);
        ticket(key.nextInt());
    }

    public void printSummary() {
        System.out.println("\n====================");
        System.out.println("   Summary Report");
        System.out.println("====================");
        System.out.println("Number of students attending: " + getAttendance());
        System.out.println("Ticket sales: " + getTicketSales() + "€");
    }



}
