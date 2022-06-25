public class Insta 
{
   public String name;

  
   public Insta(String empName) 
   {
      name = empName;
   
   }

   public void printEmp()
   {
      System.out.println("name  : " + name );
   }

   public static void main(String args[])
   {
     Insta empOne = new Insta("Bharathi");
      empOne.printEmp();
   }
}


	