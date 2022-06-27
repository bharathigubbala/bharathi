
public class Whiledo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  // for loop
		int i=1;
		int j=1;
		  for( i=1,j=1; i<10||j<10;i++,j++)
		  { 
			  j++;
			  System.out.println("i="+i+" and j="+j); 
		  }


		  // while loop 
	
			  while(i<6 || j<6)
			  { 
				  i++; j++;
			      System.out.println("i="+i+" and j="+j); 
			  }	
			
		// Do while loop
	
			do {
				i++;
				j++;
				System.out.println("i=" + i + " and j=" + j);
			    } while (i < 6|| j < 6);
		}

	}
