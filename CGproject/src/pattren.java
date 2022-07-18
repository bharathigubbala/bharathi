import java.util.Scanner;

public class pattren {

	public static void main(String[] args) {
                  Scanner s = new Scanner(System.in);
                  System.out.println("ENTER THE NUMBER OF ROWS:");
                  int r = s.nextInt();
                  {
                  for(int i = 1 ; i<= r; i++)
                  {
                	  for(int j = 1; j<=i ; j++)
                	  {
                		  System.out.print(i+" "); 
                	  }
                	  System.out.println();
                	  
                	  }
                  s.close();
                                         }
	}

}
