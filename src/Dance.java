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

    public void ticket(int a) {
        if (a == 2)
            ticketSales = ticketSales + 2;
        else if (a == 3)
            ticketSales = ticketSales + 4;
        else if (a == 0)
            ticketSales = ticketSales + 6;

        attendance = attendance + 1;
    }

    public double getTicketSales() {
        return ticketSales;
    }

    public int getAttendance() {
        return attendance;
    }


}
