import java.util.Scanner;
public class Average {

public static void main(String[] args) {
	
 int val1; 
 int val2; 
 int val3; 
 double average, snoopdogg;
	
  Scanner scan = new Scanner(System.in);
  
  System.out.print("Enter value number 1: ");
  val1 = scan.nextInt();
  
  System.out.print("Enter value number 2: ");
  val2 = scan.nextInt();
  
  System.out.print("Enter value number 3: ");
  val3 = scan.nextInt();
  
  snoopdogg = (val1 + val2 + val3) / 3.0 * (2.0);
  System.out.println("Average: " + snoopdogg);

   }
}