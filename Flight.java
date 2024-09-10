import java.util.ArrayList;
import java.util.Scanner;

public class Flight {
	
    String no;
    String dest;
    int dtime;
    String status;
    int count;
    ArrayList<Flight> flightList = new ArrayList<>();

    Flight(String no, String dest, int dtime, String status, int count) {
        this.no = no;
        this.dest = dest;
        this.dtime = dtime;
        this.status = status;
        this.count = count;
    }

    void flightDetails() {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter Flight Number: ");
        no = in.nextLine();
        System.out.println("Enter Flight Destination: ");
        dest = in.nextLine();
        System.out.println("Enter Flight Time: ");
        dtime = in.nextInt();
        in.nextLine();  // consume newline
        flightList.add(new Flight(no, dest, dtime, getStatus(dtime), 1));
    }

    void add() {
        count++;
        System.out.println("Flight Details Added Successfully.");
    }

    void remove() {
        if (count > 0) {
            count--;
            System.out.println("Flight Cancelled Successfully.");
        } else {
            System.out.println("No Flights Available.");
        }
    }

    void check() {
        for (Flight flight : flightList) {
            System.out.println("Flight Number: " + flight.no);
            System.out.println("Flight Destination: " + flight.dest);
            System.out.println("Flight Time: " + flight.dtime);
            System.out.println("Status: " + flight.status);
            System.out.println("Count: " + flight.count);
            System.out.println();
        }
    }

    String getStatus(int time) {
        if (time < 800) {
            return "Flight Delayed";
        } else {
            return "On Time";
        }
    }

    void fstatus() {
        for (Flight flight : flightList) {
            System.out.println("Flight Number: " + flight.no + " Status: " + flight.status);
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int choice;
        Flight obj = new Flight("", "", 0, "", 0);

        while (true) {
            System.out.println("FLIGHT DETAILS: ");
            System.out.println("1: Press One For Add A Flight.");
            System.out.println("2: Press Two For Cancel A Flight.");
            System.out.println("3: Press Three To Check Flights.");
            System.out.println("4: Press Four To Check Flight Status");
            System.out.println("5: Press Five For EXIT.");
            System.out.println("ENTER YOUR CHOICE: ");
            choice = in.nextInt();
            in.nextLine();

            switch (choice) {
                case 1:
                    obj.flightDetails();
                    obj.add();
                    break;
                case 2:
                    obj.remove();
                    break;
                case 3:
                    obj.check();
                    break;
                case 4:
                    obj.fstatus();
                    break;
                case 5:
                    System.out.println("Exiting the program.");
                    in.close();
                    System.exit(0);
                    break;
                default:
                    System.out.println("Incorrect Choice.");
                    break;
            }
        }
    }
}
