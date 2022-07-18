import java.util.Scanner;

public class Pnumber {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("ENTER THE NUMBER:");
		int input = in.nextInt();
		
		if(input > 0)
		{
			System.out.println("GIVEN NUMBER IS POSITIVe");
		}
		else if(input < 0)
		{
			System.out.println("GIVEN NUMBER IS NEGATIVE");
			
		}
		else 
		{
			System.out.println("GIVEN NUMBER IS 0");
		}

	}

}
