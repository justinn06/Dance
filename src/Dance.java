public class Dance {

    public final int goldPass = 1;
    public final int silverPass = 2;
    public final int bronzePass = 3;
    public final int noPass = 0;

    private int attendance;
    private double ticketSales;

    public Dance() {
        this.attendance = 0;
        this.ticketSales = 0;
    }

    public void buyTicket(int a) {
        if (a == 1)
            ticketSales = ticketSales + 1;
        else if (a == 2)
            ticketSales = ticketSales + 2;
        else if (a == 3)
            ticketSales = ticketSales + 3;
        else if (a == 4)
            ticketSales = ticketSales + 4;
        else
            System.out.println("Not an option");

        attendance = attendance + 1;
    }

    public double getTicketSales() {
        return ticketSales;
    }

    public int getAttendance() {
        return attendance;
    }


}
