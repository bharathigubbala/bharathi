
public class OPerators {

		public static void main(String[] args)
		{
		int a=10;  
		int b=5; 
		int c=20;
		System.out.println(a+b);//arithmetic operator
		c++;
		System.out.println(c);//increament operator
		System.out.println("b>=a = " +(b>=a));//reLational operator
       c+=a;
       System.out.println("c += :"+c);//Assignment operator
       c =  b ^ a;
    	   System.out.println("b^a=" +c);//bitwise operator
    	   a=(c==20)?25:30;
    	   System.out.println("value of a is =" +a);//conditional operator
    	   boolean x = true;
    	   boolean y = false;
    	   System.out.println("x&&y="+(x&&y) );// logical operator
    	   
       
       }  
		

}
