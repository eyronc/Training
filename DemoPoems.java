import java.util.*;

public class DemoPoems {
   public static void main (String[]args) {
      Scanner scan = new Scanner (System.in);
      
      System.out.print("Enter poem name for couplet: ");
      String coupletTitle = scan.nextLine();
      System.out.print("Enter poem name for limerick: ");
      String limerickTitle = scan.nextLine();
      System.out.print("Enter poem name for haiku: ");
      String haikuTitle = scan.nextLine();
      
      //instantiate
      Couplet c = new Couplet (coupletTitle);
      Limerick l = new Limerick (limerickTitle);
      Haiku h = new Haiku (haikuTitle);
      
      //display details
      System.out.println();
      c.display();
      System.out.println();
      
      l.display();
      System.out.println();
      
      h.display();
      System.out.println();
   }
}