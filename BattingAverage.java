import java.util.Scanner;


class Batsman1
{
	private
	
	int bcode;
	int batavg;
	String bname;
	int inn;
	int no;
	int runs;
	
	public
	
	float calcavg()
	{
		return batavg = runs / (inn - no);
	}
	
	void readdata()
	{
		System.out.println("\n");
		Scanner in = new Scanner (System.in);
		System.out.println("Enter Batsman's BarCode Number [4- Digit]: ");
		bcode = in.nextInt();
		System.out.println("Enter Batsman's Name: ");
		bname = in.next();
		System.out.println("\n");
		System.out.println("Enter Batsman's Innings Played: ");
		inn = in.nextInt();
		System.out.println("Enter Batsman's NotOut Innings Played: ");
		no = in.nextInt();
		System.out.println("Enter Batsman's Runs Scored: ");
		runs = in.nextInt();
		System.out.println("\n");
		
	}
	
	void displaydata()
	{
		System.out.println("\n");
		System.out.println("Batsman's BarCode Number: " + bcode);
		System.out.println("Batsman's Name: " + bname);
	    System.out.println("\n");
		System.out.println("Batsman's Innings Played: " + inn);
		System.out.println("Batsman's NotOut Innings Played: " + no);
		System.out.println("Batsman's Runs Scored: " + runs);
	    System.out.println("\n");
	    System.out.println("Batsman's Batting Average: " + calcavg());
	}
	
}

public class BattingAverage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Batsman1 obj = new Batsman1();
		obj.readdata();
		obj.displaydata();
	}

}
