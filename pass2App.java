import java.util.Scanner;
public class pass2App{
	
	public static void main(String args[]){
		
	Scanner sc = new Scanner(System.in);
	
	
	pass2 myPass = new pass2();
	
	
	//input
	String forename;
	String surname;
	
	System.out.println("Enter forename");
	forename = sc.next();
	System.out.println("enter surname");
	surname = sc.next();
	
	myPass.setFName(forename);
	myPass.setSName(surname);
	
	//process
	myPass.genLog();
	
	
	
	//output
	String myLog = myPass.getLogin();
	System.out.println("Your login is " + myLog);
		
		
		
	}//close main
	
}//close class